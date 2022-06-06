package Date_03_06_2022;

import java.util.Scanner;

public class Q34SecondLargestNumber  {
    public static void main(String[] args){
        int temp, len;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        len=scanner.nextInt();
        int[] array=new int[len];
        System.out.println("Enter the element in Array");
        for(int i=0;i<len;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(int i = 0; i<len; i++ ){
            for(int j = i+1; j<len; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The second largest number is: "+array[len-2]);
    }
}
