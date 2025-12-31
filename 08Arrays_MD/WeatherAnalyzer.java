import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * WeatherAnalyzer: Çok boyutlu dizilerle hava durumu analizi yapar.
 * Verileri dosyadan okur ve günlük ortalamaları hesaplar.
 */
public class WeatherAnalyzer {

    public static void main(String[] args) {
        final int GUN_SAYISI = 10;
        final int SAAT_SAYISI = 24;
        final int VERI_TIPI = 2; // 0: Sıcaklık, 1: Nem

        // 3D Array: [Gün][Saat][0: Sıcaklık, 1: Nem]
        double[][][] havaVerisi = new double[GUN_SAYISI][SAAT_SAYISI][VERI_TIPI];

        File dosya = new File("hava_durumu.txt");

        try (Scanner dosyaOkuyucu = new Scanner(dosya)) {
            System.out.println("Dosya okunuyor...");

            while (dosyaOkuyucu.hasNext()) {
                int gun = dosyaOkuyucu.nextInt();
                int saat = dosyaOkuyucu.nextInt();
                double sicaklik = dosyaOkuyucu.nextDouble();
                double nem = dosyaOkuyucu.nextDouble();

                // İndisler 0'dan başladığı için (gun - 1) ve (saat - 1) kullanıyoruz.
                havaVerisi[gun - 1][saat - 1][0] = sicaklik;
                havaVerisi[gun - 1][saat - 1][1] = nem;
            }

            analizSonuclariniYazdir(havaVerisi, GUN_SAYISI, SAAT_SAYISI);

        } catch (FileNotFoundException e) {
            System.err.println("Hata: 'hava_durumu.txt' dosyası bulunamadı! Lütfen dosyayı oluşturun.");
        }
    }

    private static void analizSonuclariniYazdir(double[][][] veri, int gunSayisi, int saatSayisi) {
        System.out.println("\n--- GÜNLÜK HAVA DURUMU ANALİZİ ---");
        for (int i = 0; i < gunSayisi; i++) {
            double toplamSicaklik = 0;
            double toplamNem = 0;

            for (int j = 0; j < saatSayisi; j++) {
                toplamSicaklik += veri[i][j][0];
                toplamNem += veri[i][j][1];
            }

            System.out.printf("Gün %d -> Ortalama Sıcaklık: %.2f°C | Ortalama Nem: %%%.2f%n", 
                               (i + 1), (toplamSicaklik / saatSayisi), (toplamNem / saatSayisi));
        }
    }
}
