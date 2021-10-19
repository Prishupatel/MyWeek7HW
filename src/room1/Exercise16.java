package room1;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            System.out.println("Enter any number : ");
        int num=scanner.nextInt();

        if(num>0)
        {
            System.out.println(num + " is a positive number");
        }
        else if(num<0){
            System.out.println(num + " is a negative number");
        }
        else if (num==0){
            System.out.println(num + " is a zero number");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
