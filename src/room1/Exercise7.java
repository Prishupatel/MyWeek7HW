package room1;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */

import java.util.Scanner;

public class Exercise7 {


    public static void main(String[] args) {
        int id;
        String name;
        int saleAmount;
        int salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sale id :");
        id = sc.nextInt();
        System.out.println("Enter Name :");
        name = sc.next();
        System.out.println("Enter Sale amount :");
        saleAmount = sc.nextInt();
        System.out.println("Enter salary");
        salary = sc.nextInt();

        sc.close();


        if (saleAmount >= 50000) {
            System.out.println(saleAmount * 35 / 100);
        } else if (saleAmount >= 30000 && saleAmount < 50000)
            System.out.println(saleAmount * 20 / 100);
        else if (saleAmount >= 10000 && saleAmount < 30000)
            System.out.println(saleAmount * 5 / 100);
        else {
            System.out.println(saleAmount * 2 / 100);
        }


    }


}
