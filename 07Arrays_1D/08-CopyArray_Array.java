import java.util.Arrays;

public class ArrayCopy_shallow {
  
  public static void main(String[] args) {
    int[] list1 = {1,2};
    int[] list2 = new int[list1.length];
    
    System.out.println("Dumduz println ile dizi yazdirmak");
    System.out.println(list1);
    System.out.println(list2);
    
    System.out.println("list1:" + Arrays.toString(list1));
    System.out.println("list2:" + Arrays.toString(list2));
    
    System.arraycopy(list1, 0, list2, 0, list1.length); //hazır java.Arrays copy metodu ile
    
    System.out.println("---Kopyalama Sonrasi---");
    
    System.out.println("Dumduz println ile dizi yazdirmak");
    System.out.println(list1);
    System.out.println(list2);
    
    System.out.println("list1:" + Arrays.toString(list1));
    System.out.println("list2:" + Arrays.toString(list2));
    
    list2[0] = 5; //list2 ilk elemanını değiştik, list1'e karışmadık
    
    System.out.println("---list2 Manipulasyonu Sonrasi---");
    System.out.println("list2:" + Arrays.toString(list2));
    
    System.out.println("---list1 Kontrolu---");
    System.out.println("list1:" + Arrays.toString(list1));
  }
}

