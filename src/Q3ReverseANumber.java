import java.util.Scanner;

public class Q3ReverseANumber {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an three digit number: ");
        str=sc.nextLine();
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append(str);
        System.out.println("Reverse number: "+stringBuffer.reverse());

        }
    }

