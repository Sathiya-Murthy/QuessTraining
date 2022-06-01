package Date_31_05_2022;

import java.util.Scanner;

public class Q4AdditionOfFirstAndLast {
    public static void main(String[] args) {
        int number,firstNumber,lastNumber;
        System.out.print("Enter an four digit number: ");
        Scanner scanner=new Scanner(System.in);
        number= scanner.nextInt();;
        firstNumber=number/1000;
        lastNumber=number%10;
        System.out.println("The addition of first and last number is: "+(firstNumber+lastNumber));

    }
}
