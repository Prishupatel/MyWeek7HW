package room1;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a number : " );
        int number=sc.nextInt();

        String st=(number%2==0)?"even" : "odd";
        System.out.println(number + " is " + st);
        sc.close();
    }
}
