package Date_01_06_2022;

import java.util.Scanner;

public class Q15FactorialOfaNumber {
    public static void main(String[] args) {
        int Number;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        Number=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=Number;i++)
        {
            fact*=i;
        }
        System.out.println("The factorial is "+fact);
    }
}
