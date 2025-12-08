import java.util.Arrays;

public class ArrayCopy_deep {
  
  public static void main(String[] args) {
    int[] list1 = {1,2};                 // source array
    int[] list2 = new int[list1.length]; // target array
    
    System.out.println("list1:" + Arrays.toString(list1));
    System.out.println("list2:" + Arrays.toString(list2));
    
    /** shallow copy
     list2 = list1;
     */
    
    //Deep Copy
    for (int i = 0; i < list2.length; i++)
        list2[i] = list1[i];
    
    System.out.println("---Kopyalama Sonrasi---");
    System.out.println("list1:" + Arrays.toString(list1));
    System.out.println("list2:" + Arrays.toString(list2));
    
    list2[0] = 5; //list2 ilk elemanını değiştik, list1'e karışmadık
    
    System.out.println("---list2 Manipulasyonu Sonrasi---");
    System.out.println("list2:" + Arrays.toString(list2));
    
    System.out.println("---list1 Kontrolu---");
    System.out.println("list1:" + Arrays.toString(list1));
  }
}
