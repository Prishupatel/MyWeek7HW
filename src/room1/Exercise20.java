package room1;
/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Exercise20 {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6};
        int toFind=1;
        boolean found=false;

        for(int n:num){
            if(n==toFind){
                found=true;
                break;
            }
        }
        if(found)
            System.out.println(toFind + " is found");
        else
            System.out.println(toFind  + " is not found");
    }

}
