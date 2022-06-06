package Date_03_06_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Q36nthPrimeNumber {
    public static void main(String[] args) {
        int number,number2,count=0;
        ArrayList<Integer> array=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the nth number: " );
        number= scanner.nextInt();
        for(int i=2;i<=5000;i++)    {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    count+=1;
            }
            if(count==0) {
                array.add(i);
            }
            count=0;
        }
        System.out.println("The "+ number + "th prime number is: "+ array.get(number-1));
    }
}
