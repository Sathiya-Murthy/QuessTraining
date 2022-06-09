package Date_07_06_2022;
import java.util.Scanner;

public class Q40ExceptionsHandleing {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x and y:");
        try{
        x=scanner.nextInt();
        y=scanner.nextInt();
        int result=x/y;
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
         catch (Exception e) {
             System.out.println(e+" Enter any 32bit signed Integer.");
        }
    }
}
