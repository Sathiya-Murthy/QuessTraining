package JavaGroomingCodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        String string;
        ArrayList<Character> sortedString = new ArrayList<>();
        System.out.print("Enter the string for sort: ");
        Scanner scanner=new Scanner(System.in);
        string=scanner.next();
        char[] Cstring=string.toCharArray();
        Arrays.sort(Cstring);
        for(char ch : Cstring){
            if(ch>='a'&& ch<='z' || ch>='A'&&ch<='Z' ){
                sortedString.add(ch);
            }
        }
        for(char ch:Cstring){
            if((int)ch>=48&&(int)ch<=57){
                sortedString.add(ch);
            }
        }
        StringBuffer answer=new StringBuffer();
        for(char ch:sortedString){
            answer.append(ch);
        }
        System.out.println(answer);
    }
}
