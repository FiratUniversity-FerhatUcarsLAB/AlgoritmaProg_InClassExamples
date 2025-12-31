import java.util.Scanner;

/**
 * GuessBirthday: İkilik sayı sistemini kullanarak doğum günü tahmini yapar.
 * Refactor Edilerek Modüler Hale Getirildi.
 */
public class GuessBirthday {

    public static void main(String[] args) {
        // Sayı setlerini bir dizi içinde toplayarak kod tekrarını önledik
        String[] setler = {
            " 1  3  5  7\n 9 11 13 15\n17 19 21 23\n25 27 29 31", // Set 1 (2^0 = 1)
            " 2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31", // Set 2 (2^1 = 2)
            " 4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31", // Set 3 (2^2 = 4)
            " 8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31", // Set 4 (2^3 = 8)
            "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31"  // Set 5 (2^4 = 16)
        };

        int tahminEdilenGun = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("--- Dogum Gunu Tahmin Sihirbazi ---");

        for (int i = 0; i < setler.length; i++) {
            System.out.println("\nDogum gununuz bu sette var mi?");
            System.out.println(setler[i]);
            System.out.print("Hayir icin 0, Evet icin 1 giriniz: ");
            
            int cevap = input.nextInt();

            if (cevap == 1) {
                // Her setin ilk sayısı aslında 2'nin kuvvetidir: 1, 2, 4, 8, 16
                // Math.pow yerine bit kaydırma (1 << i) da kullanılabilir ama yeni başlayanlar için bu daha net:
                tahminEdilenGun += Math.pow(2, i);
            }
        }

        System.out.println("\nSihir Tamamlandi! Dogum gununuz: " + tahminEdilenGun);
        input.close();
    }
}
