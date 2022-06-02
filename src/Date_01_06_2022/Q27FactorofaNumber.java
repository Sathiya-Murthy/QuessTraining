package Date_01_06_2022;

import java.util.Scanner;

class Factor {
    public Factor(int i) {
        for(int j=1;j<=i;j++) {
            if(i%j==0)
                System.out.print(j+" ");
        }
    }
}


public class Q27FactorofaNumber {
    public static void main(String[] args) {
        int i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter tha number: ");
        i=scanner.nextInt();
        Factor Fact=new Factor(i);

    }
}
