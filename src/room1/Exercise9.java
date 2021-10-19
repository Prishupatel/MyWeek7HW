package room1;

import java.util.Scanner;

/**
 *  Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 *  if any other alphabet should be invalid entry
 */
public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabet between A to F : ");
        char city= scanner.next().charAt(0);

        switch (city){
            case 'A': System.out.println("Auburn");break;
            case 'B': System.out.println("Boston");break;
            case 'C': System.out.println("Chicago");break;
            case 'D': System.out.println("Dallas");break;
            case 'E': System.out.println("England");break;
            case 'F': System.out.println("Foxboro");break;
            default:
                System.out.println("Invalid entry");



        }


    }
}
