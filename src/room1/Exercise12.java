package room1;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number, alphabet, symbol :");
        char ch=scanner.next().charAt(0);

        if(ch>='0' && ch<='9'){
            System.out.println("This is Number");

        } else if(ch>='a' && ch<='z'){
            System.out.println("This is Alphabet");
        } else {
            System.out.println("This is Symbol");
        }
    }
}
