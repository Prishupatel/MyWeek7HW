package room1;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Exercise3 {
    public static void main(String[] args) {

        //declare variables
        String StudentName;
        int rollnum;
        int Math, Science, English;
        int total;
        double Percentage;

        //scanner to get input
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________|");
        System.out.println("|Mark Sheet                   |");
        System.out.println("______________________________|");
        System.out.print("|Enter Name:");   //for name
        sc.nextLine();
        System.out.print("|Enter Roll No:");       //for roll number
        sc.nextInt();
        System.out.println("______________________________|");
        System.out.println("|Subjects: Marks ");
        System.out.println("______________________________|");
        System.out.print("|Math:  ");         // math
        Math = sc.nextInt();               //assign math
        System.out.print("|Science: ");     //science
        Science = sc.nextInt();                    //assign sci
        System.out.print("|English: ");      //english
        English = sc.nextInt();                       //assign english
        System.out.println("______________________________|");

        total = Math + Science + English;                    //total
        System.out.println("Total: |" + total + "|");             //print total
        System.out.println("|_____________________________|");

        System.out.println("|_____________________________|");
        Percentage = total / 3; //get percentage
        System.out.println("|Percentage: " + Percentage + "|");

        if (Percentage >= 80) {
            System.out.println("|Grade: A+                |");
            System.out.println("|Result: Pass             |");
            System.out.println("|_________________________|");
        } else if (Percentage >= 60) {
            System.out.println("|Grade: A                 |");
            System.out.println("|Result: Pass             |");
            System.out.println("|_________________________|");
        } else if (Percentage >= 50) {
            System.out.println("|Grade: B                 |");
            System.out.println("|Result: Pass             |");
            System.out.println("|_________________________|");
        } else if (Percentage >= 35) {
            System.out.println("|Grade: C                 |");
            System.out.println("|Result: Pass             |");
            System.out.println("|_________________________|");
        } else {
            System.out.println("|Grade: D                 |");
            System.out.println("|Result: Fail             |");
            System.out.println("|_________________________|");
        }
    }
}
                