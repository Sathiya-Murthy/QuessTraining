package JavaGroomingCodeChallenge;

import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int len;
        HashSet<Integer> hashSet=new HashSet<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        len=scanner.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the element of array:");
        for(int i=0; i<len;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<len;i++){
            if(hashSet.contains(arr[i])){
                System.out.println("The first duplicate element is: "+arr[i]);
                break;
            }
            else hashSet.add(arr[i]);
        }
    }
}
