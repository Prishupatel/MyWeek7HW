package room1;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol
 * (+, -, /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

public class Exercise10 {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num2=sc.nextInt();

        System.out.println("Enter the operator(+,-,*,/) : ");
        ch=sc.next().charAt(0);

        if(ch=='-'){
            System.out.println("Subtraction of the given number is : " +(num1-num2));
        }
        else if (ch=='+'){
            System.out.println("Addition of the given number is : " +(num1+num2));
        }
        else if(ch=='/'){
            System.out.println("Division of given number is : " +(num1/num2));
        }
        else if (ch=='*'){
            System.out.println("Multiplication of given number is : " +(num1*num2) );
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
