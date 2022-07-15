package JavaGroomingCodeChallenge;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        String number1;
        String number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        number1= scanner.next();
        System.out.print("Enter the number 2: ");
        number2=scanner.next();
        int num1=0,num2=0,num1Length=number1.length()-1,num2Length=number2.length()-1,tempNumber=0;

        for(int i=0;i<number1.length();i++) {
            num2 += (int) (Character.getNumericValue(number1.charAt(i)) * (Math.pow(10, num1Length)));
            --num1Length;
        }
        for(int i=0;i<number2.length();i++) {
            num2 += (int) (Character.getNumericValue(number2.charAt(i)) * (Math.pow(10, num2Length)));
            --num2Length;
        }
        String Answer= String.valueOf(num1*num2);
        System.out.println(Answer);

    }
}
