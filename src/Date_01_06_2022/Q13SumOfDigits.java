package Date_01_06_2022;

import java.util.Scanner;

public class Q13SumOfDigits {
    public static void main(String[] args) {
        String Number;
        int sum=0,num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        Number=scanner.nextLine();
        for(int i=0;i<Number.length();i++)
        {
            num=Character.getNumericValue(Number.charAt(i));
            sum+=num;
        }
        System.out.println(sum);
    }
}
