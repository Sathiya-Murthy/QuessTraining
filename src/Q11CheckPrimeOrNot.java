import java.util.Scanner;

public class Q11CheckPrimeOrNot {
    public static void main(String[] args) {
        int number,count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        number=scanner.nextInt();
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
                count+=1;
        }
        if(count==0)
            System.out.println("The number is Prime.");
        else
            System.out.println("The number is not a prime number");

    }
}
