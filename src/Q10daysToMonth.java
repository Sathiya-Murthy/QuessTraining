import java.util.Scanner;

public class Q10daysToMonth {
    public static void main(String[] args) {
        int days,month,remdays;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the days: ");
        days=scanner.nextInt();
        month=days/30;
        remdays=days%30;
        System.out.println(month+" month and "+remdays+" days");
    }
}
