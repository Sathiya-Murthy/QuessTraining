package Date_01_06_2022;

import java.util.Scanner;

public class Q22tableOfNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of table: ");
        number= scanner.nextInt();
        for(int i=1;i<=10;i++)  {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
