package Date_03_06_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Q32duplicateElement {
    public static void main(String[] args) {
        int len;
        ArrayList<Integer> Array=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        len=scanner.nextInt();
        int[] array=new int[len];
        System.out.println("Enter the element in Array");
        for(int i=0;i<len;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)    {
                if(array[i]==array[j])
                    Array.add(array[i]);
            }
        }
        System.out.println("Number of duplicate element are: "+Array.size());
    }
}
