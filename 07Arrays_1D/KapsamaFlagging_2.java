import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class KapsamaFlagging_2 {
    // Dosya işlemleri "FileNotFoundException" fırlatabilir, bunu main'e ekliyoruz.
    public static void main(String[] args) throws FileNotFoundException {
        
        // 1. Dosyayı Tanıtma
        File file = new File("biletler.txt");
        
        // Scanner artık klavyeyi değil, dosyayı dinliyor
        Scanner input = new Scanner(file);

        // 2. Takip Dizisi (0-99 arası dediğiniz için 100 eleman lazım)
        // İndeks 0 -> 0 sayısını, İndeks 99 -> 99 sayısını temsil eder.
        boolean[] isCovered = new boolean[100]; 

        // 3. Dosyadaki Tüm Sayıları Okuma Döngüsü
        // "input.hasNextInt()" -> Dosyada okunacak tam sayı kaldığı sürece döner.
        while (input.hasNextInt()) {
            int number = input.nextInt();
            
            // Hata önleme: Sadece 0-99 arası sayıları işaretle
            if (number >= 0 && number < 100) {
                isCovered[number] = true;
            }
        }

        // 4. Kontrol (Eksik var mı?)
        boolean allCovered = true;
        for (int i = 0; i < 100; i++) {
            if (!isCovered[i]) {
                allCovered = false;
                // İlk eksiği bulunca döngüyü kırmak performansı artırır
                break; 
            }
        }

        // 5. Sonuç
        if (allCovered)
            System.out.println("Dosyadaki biletler 0-99 arası TÜM sayıları kapsıyor.");
        else
            System.out.println("Maalesef, kapsanmayan sayılar var.");
            
            System.out.println("Listede HİÇ geçmeyen sayılar: ");
            
            int count = 0; // Görsellik için satır başı sayacı

            for (int i = 0; i < isCovered.length; i++) {
                // Eğer o indeks false ise, sayı yok demektir
                if (!isCovered[i]) { 
                    System.out.print(i + " ");
            
                // İsteğe bağlı: Her 10 sayıda bir alt satıra geç (okunabilirlik için)
                    count++;
                    if (count % 10 == 0) 
                        System.out.println();
                }
            }
            System.out.println();
        
            

            
        input.close(); // Dosyayı kapatmak önemlidir.
    }
}