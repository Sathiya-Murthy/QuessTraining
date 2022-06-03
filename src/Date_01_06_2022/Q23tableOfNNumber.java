package Date_01_06_2022;

import java.util.Scanner;

public class Q23tableOfNNumber {
    public static void main(String[] args) {
        int Number,i=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of table to print: ");
        Number= scanner.nextInt();
        do {
            for(int j=1;j<=10;j++)  {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
            i++;
        }while (i<=Number);
    }
}
