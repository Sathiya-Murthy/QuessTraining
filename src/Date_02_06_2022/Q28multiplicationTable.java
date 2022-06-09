package Date_02_06_2022;

import java.util.Scanner;

public class Q28multiplicationTable {
    public static void main(String[] args) {
        int number, num=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        Table(number, num);
    }

    static void Table(int number, int num) {
        if(num>10)
            return;
        System.out.println(number + " * "+ num + " = " + number*num);
        Table(number,num+1);

    }
}





