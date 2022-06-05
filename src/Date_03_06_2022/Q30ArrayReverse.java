package Date_03_06_2022;

import java.util.Scanner;

public class Q30ArrayReverse {
    public static void main(String[] args) {
        int len;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        len=scanner.nextInt();
        int[] array=new int[len];
        System.out.println("Enter the element in Array");
        for(int i=0;i<len;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("The reverse of element");
        for(int i=len;i>0;i--)
        {
            System.out.print(array[i-1] + " ");
        }
    }
}
