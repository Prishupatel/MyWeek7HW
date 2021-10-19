package room1;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);

        System.out.println("Enter a year");
        int year= s1.nextInt();

        boolean x=(year % 4) ==0;
        boolean y=(year%100) !=0;
        boolean z=((year%100 == 0) && (year%400 ==0));

        if (x && (y || z)){
            System.out.println(year + " is a Leap Year");
        }

        else {
            System.out.println(year + " is not Leap Year");
        }
        s1.close();

    }
}
