package Date_31_05_2022;

import java.util.Scanner;

public class Q2SimpleInterest {
    public static void main(String[] args) {
        int Principle,Years;
        double Interest=7.5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principle Amount: ");
        Principle=sc.nextInt();
        System.out.print("Enter the time period in years :");
        Years=sc.nextInt();
        double Simple_Interest=((Double.valueOf(Principle))*(Double.valueOf(Years))*Interest)/100;
        System.out.println("Simple Interest= "+Simple_Interest);
        double Final_Amount=Principle+Simple_Interest;
        System.out.println("Final Amount to be paid= "+Final_Amount);


    }
}
