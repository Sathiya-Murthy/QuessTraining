package JavaGroomingCodeChallenge;

import java.util.Scanner;

public class ArrayJump {
    public static void main(String[] args) {
        int length;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of array");
        length=scanner.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the array element:");
        for(int i=0;i<length;i++){
            array[i]= scanner.nextInt();
        }
        int jump=array[0];
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                System.out.println("true");
                break;
            }
            if(array[i]==0 && jump==0){
                System.out.println("false");
                break;
            }
            if(jump<array[i]){
                jump=array[i];
            }
            jump--;
        }
    }
}
