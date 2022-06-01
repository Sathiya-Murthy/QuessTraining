package Date_01_06_2022;

import java.util.Scanner;

public class Q14ReverseANumber {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an number: ");
        str=sc.nextLine();
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append(str);
        System.out.println("Reverse number: "+stringBuffer.reverse());

    }
}
