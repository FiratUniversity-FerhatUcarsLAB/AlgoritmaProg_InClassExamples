public class GCD {
    public static void main(String[] args) {
        int sayi1 = 48;
        int sayi2 = 18;

        int sonuc = ebobBul(sayi1, sayi2);

        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EBOB'u: " + sonuc);
    }

    // Öklid algoritması ile EBOB hesaplama
    public static int ebobBul(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ebobBul(b, a % b);
    }
}
