package Date_01_06_2022;

import java.util.Scanner;

public class Q19PerfectNumber {
        public static void main(String[] args) {
            int Number,sum=0;
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter a number: ");
            Number=scanner.nextInt();
            for(int j=1;j<Number;j++) {
                if(Number%j==0){
                    sum+=j;
                }
            }
            if(Number==sum)
                System.out.println("The number is an perfect number.");
            else
                System.out.println("The number is not an perfect number.");
    }
}
