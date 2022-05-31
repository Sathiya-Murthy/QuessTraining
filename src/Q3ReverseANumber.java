import java.util.Scanner;

public class Q3ReverseANumber {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an three digit number: ");
        number=sc.nextInt();
        if(number>99 && number<1000) {
            System.out.print("The reverse of the number: ");
            String str = Integer.toString(number);
            for (int i = str.length(); 0 < i; --i) {
                System.out.print(str.charAt(i-1));
            }
        }
        else
            System.out.println("Enter three digit number.");


        }
    }

