import java.util.Scanner;

public class Q7InsurancePolicy {
    public static void main(String[] args) {
        int age; char ch1,ch2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Are you married [y/n]: ");
        ch1=scanner.next().charAt(0);
        if(ch1=='y')
            System.out.println("Your are eligible for insurance policy.");
        else if(ch1=='n') {
            System.out.print("Are you Male or Female [m/f]: ");
            ch2=scanner.next().charAt(0);
            if(ch2=='m') {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                if (age > 30)
                    System.out.println("You not eligible for insurance policy");
                else
                    System.out.println("Your are eligible for insurance policy.");
            }
            else if(ch2=='f') {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                if (age > 25)
                    System.out.println("You not eligible for insurance policy");
                else
                    System.out.println("Your are eligible for insurance policy.");
            }
            else
                System.out.println("Wrong input.");
        }
        else
            System.out.println("Wrong input.");

    }
}
