package JavaGroomingCodeChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        int length,target;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        length=scanner.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the Element of Array:");
        for (int i=0;i<length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.print("Enter the target element index to rotate: ");
        target=scanner.nextInt();
        int[] array1= new int[array.length-target];
        int[] array2=new int[array.length-array1.length];
        for(int i=(array.length-array1.length);i<array.length;i++){
            arrayList.add(array[i]);
        }
        for(int i=0;i<array2.length;i++){
            arrayList.add(array[i]);
        }
        if(array[target]==arrayList.get(target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
