public class Test {
    public static void main(String[] args) {
        int x = 1; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values

        m(x, y); // Invoke m with arguments x and y

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }

    public static void m(int sayi, int[] dizi) {
        sayi = 1001; // Assign a new value to number
        dizi[0] = 5555; // Assign a new value to numbers[0]
    }
}
