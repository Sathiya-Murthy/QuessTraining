package Date_01_06_2022;

import java.util.Scanner;

public class Q21ArmstrongNumberInInterval {
    public static void main(String[] args) {
        int Start,End,ANumber,Sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the start and end value: ");
        Start=scanner.nextInt();
        End=scanner.nextInt();
        for(int i=Start;i<=End;i++){
            String SNumber=Integer.toString(i);
            for(int j=0;j<SNumber.length();j++) {
                ANumber=Character.getNumericValue(SNumber.charAt(j));
                Sum+=(Math.pow(ANumber,SNumber.length()));
            }
            if(i==Sum)
            {
                System.out.print(i + " ");
            }
            Sum=0;
        }
    }
}
