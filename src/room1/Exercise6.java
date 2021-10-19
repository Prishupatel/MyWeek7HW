package room1;
/*
Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        /*
        if number is devided by 2 then it is an even number else it is odd number
         */
        if( num % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");



    }
}
