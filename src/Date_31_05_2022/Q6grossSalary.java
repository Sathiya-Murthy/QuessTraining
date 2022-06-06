package Date_31_05_2022;

import java.util.Scanner;

public class Q6grossSalary {
    public static void main(String[] args) {
        int Basic,TA,DA,HRA,PF,Bonus,GrossSalary;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        Basic=scanner.nextInt();
        TA=(Basic/100)*10;
        DA=(Basic/100)*15;
        HRA=(Basic/100)*20;
        PF=(Basic/100)*12;
        if(Basic>=20000)
        {
            Bonus=(Basic/100)*10;
            GrossSalary=Basic+DA+TA+HRA+Bonus-PF;
            System.out.println("Gross Salary= "+GrossSalary);
        }
        else
        {
            Bonus=(Basic/100)*20;
            GrossSalary=Basic+DA+TA+HRA+Bonus-PF;
            System.out.println("Gross Salary= "+GrossSalary);
        }
    }
}
