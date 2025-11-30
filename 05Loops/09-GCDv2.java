public class GCD {
    public static void main(String[] args) {
        int sayi1 = 48;
        int sayi2 = 18;

        int sonuc = ebobBul(sayi1, sayi2);

        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EBOB'u: " + sonuc);
    }

    // Öklid algoritması ile EBOB hesaplama (İteratif Versiyon)
    public static int ebobBul(int a, int b) {
        while (b != 0) {
            int gecici = b;
            b = a % b;
            a = gecici;
        }
        return a;
    }
}
