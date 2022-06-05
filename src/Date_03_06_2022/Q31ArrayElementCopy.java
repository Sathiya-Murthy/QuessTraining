package Date_03_06_2022;

import java.util.Scanner;

public class Q31ArrayElementCopy {
    public static void main(String[] args) {
        int len;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        len=scanner.nextInt();
        int[] array1=new int[len];
        int[] array2=new int[len];
        System.out.println("Enter the element in Array");
        for(int i=0;i<len;i++)
        {
            array1[i]=scanner.nextInt();
        }
        array2=array1;
        System.out.println("The element in array 1:");
        for (int i:array1){
            System.out.print(i +" ");
        }
        System.out.println("\nThe element in array 2:");
        for (int i:array2){
            System.out.print(i +" ");
        }
    }
}
