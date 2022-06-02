package Date_01_06_2022;

import java.util.Scanner;

public class Q17PalindromeNumber {
    public static void main(String[] args) {
        int Number,RNumber;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter tha number: ");
        Number=scanner.nextInt();
        String string=Integer.toString(Number);
        StringBuffer Rstring=new StringBuffer(string);
        Rstring.reverse();
        String str= Rstring.toString();
        RNumber=Integer.parseInt(str);
        if(Number==RNumber)
            System.out.println("The number is a Palindrome number.");
        else {
            System.out.println("The number is not a Palindrome number.");
        }

    }
}
