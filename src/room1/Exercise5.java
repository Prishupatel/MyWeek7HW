package room1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        long EmployeeID;
        String Name;
        int Salary;
        int HRA,TA,DA,PF;

        System.out.println("----------------------------");
        System.out.println("       Salary slip"          );
        System.out.println("----------------------------");
        Scanner scan=new Scanner(System.in);
        System.out.println("|EmloyeedID :                |");
        EmployeeID=scan.nextLong();
        System.out.println("|Name :                     ");
        Name=scan.next();
        System.out.println("----------------------------");
        System.out.println("|Salary:                    ");
        Salary=scan.nextInt();
        System.out.println("| HRA 10% :                  | ");
        HRA=(Salary*10/100);
        System.out.println(HRA);
        System.out.println("| TA 8% :                    | ");
        TA=(Salary*8/100);
       System.out.println(TA);
        System.out.println("| DA 9% :                    | ");
        DA= (Salary*9/100);
        System.out.println(DA);

        System.out.println("| PF-20:                     | ");
        PF=(Salary*-20/100);
        System.out.println(PF);

        System.out.println("------------------------------");
        System.out.println("|          Gross Wage:       |");
        int Gross =(Salary+HRA+TA+DA-(-PF));
        System.out.println(Gross);

        System.out.println("|=============================|");

    }
}
