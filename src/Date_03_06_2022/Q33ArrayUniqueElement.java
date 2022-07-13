package Date_03_06_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Q33ArrayUniqueElement {
    public static void main(String[] args) {
        int len,count;
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
            count=0;
            for(int j=0;j<i;j++)    {
                if(array[i]==array[j]) {
                    count++;
                    break;
                }
            }
            if(count==0)
                Array.add(array[i]);

        }
        System.out.println(Array);
    }
}
