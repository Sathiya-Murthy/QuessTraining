package Date_08_06_2022;

import java.util.Scanner;

public class Q43LikeCounter {
    public static void main(String[] args) {
        int length;
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many person are liked to the post: ");
        length=scanner.nextInt();
        String[] strings=new String[length];

        if(length==0){
            System.out.println("no one likes this");
        }
        else{
            System.out.println("Enter the person name:");
            for(int i=0;i<length;i++)   {
                strings[i]=scanner.next();
            }
            if(length==1) {
                System.out.println(strings[0]+" likes this");
            }
            if(length==2) {
                System.out.println(strings[0]+" and "+strings[1]+" like this");
            }
            if(length==3) {
                System.out.println(strings[0]+", "+strings[1]+" and "+strings[2] +" like this");
            }
            if(length>3) {
                System.out.println(strings[0]+", "+strings[1]+" and "+(length-2)+" others like this");
            }
        }


    }
}
