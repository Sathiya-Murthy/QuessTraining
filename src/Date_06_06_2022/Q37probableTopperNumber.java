package Date_06_06_2022;

import java.util.Scanner;

public class Q37probableTopperNumber {
    public static void main(String[] args) {
        int number,oddNumber=0,evenNumber=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        number=scanner.nextInt();
        String Number=Integer.toString(number);
        for(int i=0;i<Number.length();i++)  {
            if(((Character.getNumericValue(Number.charAt(i))) % 2) == 0) {
                evenNumber+=Character.getNumericValue(Number.charAt(i));
            }
            if(((Character.getNumericValue(Number.charAt(i))) % 2) != 0) {
                oddNumber+=Character.getNumericValue(Number.charAt(i));
            }

        }
        if(oddNumber==evenNumber)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
