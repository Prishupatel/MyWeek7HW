package room1;

import java.util.Arrays;

/**
 *Write a Java program to sort a numeric array and a string array.
 */
public class Exercise17 {
    public static void main(String[] args) {
        int[] list1 ={2532,1230,8564,4510,3200,1268,2222,6521};

        String[] list2={"Kishan","Kavan","Rajesh","Ankita","Deena","Hemal"};


        System.out.println("Existing numeric array : " + Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.println("Sorted numeric array :  " + Arrays.toString(list1));

        System.out.println("Original string array : " + Arrays.toString(list2));
        Arrays.sort(list2);
        System.out.println("Sorted string array : " + Arrays.toString(list2));

    }
}
