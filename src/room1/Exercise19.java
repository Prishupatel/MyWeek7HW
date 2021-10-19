package room1;
/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Exercise19 {

    public static void main(String[] args) {
        int[] num=new int[]{20,50,100,150,350,500};
        int sum = 0;

        for(int i=0;i<num.length; i++ )
            sum= sum + num[i];

        double average=sum/num.length;
        System.out.println("Average of the array is " + average);

    }
}


