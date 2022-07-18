package JavaGroomingCodeChallenge;

import java.util.Scanner;

public class ProductOfTwoNumber {

    public static void main(String[] args) {
        String num1;
        String num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        num1= scanner.next();
        System.out.print("Enter the number 2: ");
        num2=scanner.next();
        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product += result[i + j + 1];

                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (sb.length() == 0 && r == 0) {
                continue;
            }
            sb.append(r);
        }
        System.out.println(sb.toString());
        //return sb.toString();
    }


}
