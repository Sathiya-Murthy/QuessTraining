package Date_01_06_2022;

import java.util.Scanner;

public class Q12PrimeNumberInIntervals {
    public static void main(String[] args) {
        int number1,number2,count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the the numbers: " );
        number1=scanner.nextInt();
        number2= scanner.nextInt();
        for(int i=number1;i<=number2;i++)    {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    count+=1;
            }
            if(count==0) {
              System.out.println(i);
            }
            count=0;
        }
    }
}
