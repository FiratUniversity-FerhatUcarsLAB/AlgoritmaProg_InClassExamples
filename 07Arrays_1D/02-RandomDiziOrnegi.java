import java.util.Random;
import java.util.Arrays; // Diziyi tek satırda yazdırmak için

public class RandomDiziOrnegi {
    public static void main(String[] args) {
        
        // 1. Dizinin boyutunu belirliyoruz (Örn: 10 elemanlı)
        int size = 10; 
        int[] myList = new int[size];
        
        // Rastgele sayı üreteci oluşturuyoruz
        Random randomUreteci = new Random();

        // 2. Döngü ile diziyi "girişimsiz" olarak dolduruyoruz
        for (int i = 0; i < myList.length; i++) {
            // 0 ile 100 arasında rastgele bir tam sayı üretip diziye atar
            myList[i] = randomUreteci.nextInt(100); 
        }

        // 3. Oluşan diziyi ekrana yazdıralım
        System.out.println("Otomatik Olusturulan Dizi:");
        System.out.println(Arrays.toString(myList));
    }
}
