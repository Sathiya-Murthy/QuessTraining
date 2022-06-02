package Date_01_06_2022;

import java.util.Scanner;

public class Q16ArmstrongNumber {
    public static void main(String[] args) {
        int Number,ANumber,Sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        Number=scanner.nextInt();
        String SNumber=Integer.toString(Number);
        for(int i=0;i<SNumber.length();i++) {
            ANumber=Character.getNumericValue(SNumber.charAt(i));
            Sum+=(Math.pow(ANumber,SNumber.length()));
        }
        if(Number==Sum)
        {
            System.out.println("The Number is an armstrong number.");
        }
        else
            System.out.println("The Number is not an armstrong number.");

    }
}
