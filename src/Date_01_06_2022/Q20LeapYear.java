package Date_01_06_2022;

import java.util.Scanner;

public class Q20LeapYear {
    public static void main(String[] args) {
        int Year;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the year: ");
        Year= scanner.nextInt();
        if(Year%400==0)
            System.out.println("The year is leap year.");
        else if(Year%100==0)
            System.out.println("The year is not leap year.");
        else if(Year%4==0)
            System.out.println("The year is leap year.");
        else
            System.out.println("The year is leap year.");
    }
}
