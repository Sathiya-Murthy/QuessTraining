package Date_31_05_2022;

import java.util.Scanner;

public class Q8greatestOfThree {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();
        int Greatest=(number1>=number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
        System.out.println("The Greatest number: "+Greatest);

    }
}
