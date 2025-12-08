public class DiziOlustur_basic {
    public static void main(String[] args) {
    
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // --- Kullanıcıdan öncelikle dizi boyutu istenebilir ---
        System.out.println("Dizi boyutu gir: ");
        int size = input.nextInt();
        
        // --- Dizi öncelikle girilen boyut değeri ile tanımlanır ---
        int[] myList = new int[size];
        
        // --- Dizi oluşturma ---
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("%d. sayiyi gir:\n",i+1);
            myList[i] = input.nextInt();
        }
     
        // Sonuçları görebilmek için ekrana yazdıralım
        System.out.println("Girdiginiz degerler:");
        for (int i=0; i<myList.length;i++)
            System.out.print(myList[i] + " ");
        
        // Scanner'ı kapatmak iyi bir alışkanlıktır
        input.close();
    }
}
