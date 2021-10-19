package room1;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */
public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Alphabet from A TO F : ");
        char ch= scanner.next().charAt(0);
        if (ch=='A'){
            System.out.println("Auburn");
        }
        else if (ch=='B'){
            System.out.println("Boston");
        }
        else if (ch=='C'){
            System.out.println("Chicago");
        }
        else if (ch=='D'){
            System.out.println("Dover");
        }
        else if(ch=='E'){
            System.out.println("Ellington");
        }
        else if(ch=='F'){
            System.out.println("Framingham");
        }
        else{
            System.out.println("Invalid Alphabet");

        }

    }
}
