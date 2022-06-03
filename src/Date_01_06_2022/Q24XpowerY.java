package Date_01_06_2022;

import java.util.Scanner;

public class Q24XpowerY {
    public static void main(String[] args) {
        int X,Y;
        long pow=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        X= scanner.nextInt();
        System.out.print("Enter the power: ");
        Y= scanner.nextInt();
        for(int i=1;i<=Y;i++){
            pow*=X;
        }
        System.out.println(pow);

    }
}
