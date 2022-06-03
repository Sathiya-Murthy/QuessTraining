package Date_01_06_2022;

import java.util.Scanner;

public class Q26FibonacciSeries {
    public static void main(String[] args) {
        int Sum=0,First=1,Second=0;
        int range;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the n term: ");
        range= scanner.nextInt();
        for(int i=1;i<=range;i++) {
            Sum=First+Second;
            First=Second;
            Second=Sum;
            System.out.print(Sum + " ");
        }

    }
}
