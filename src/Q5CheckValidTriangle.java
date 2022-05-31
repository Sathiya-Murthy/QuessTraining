import java.util.Scanner;

public class Q5CheckValidTriangle {
    public static void main(String[] args) {
        int Angle1,Angle2,Angle3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the angles:");
        Angle1=scanner.nextInt();
        Angle2=scanner.nextInt();
        Angle3=scanner.nextInt();
        if((Angle1+Angle2 > Angle3) && (Angle1+Angle3 > Angle2) && (Angle2+Angle3 > Angle1))
            System.out.println("The triangle is valid.");
        else
            System.out.println("The triangle is invalid.");
    }
}
