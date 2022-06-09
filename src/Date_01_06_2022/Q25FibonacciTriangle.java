package Date_01_06_2022;

import java.util.Scanner;

public class Q25FibonacciTriangle {
    public static void main(String[] args) {
        int start, end, count, number;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number= scanner.nextInt();
        for(int i = 1; i <= number; i++) {
            start = 0;
            end = 1;
            System.out.print(end + " ");
            for(int j = 1; j < i; j++) {
                count = start + end;
                System.out.print(count + " ");
                start = end;
                end = count;
            }
            System.out.println();
        }
    }
}
