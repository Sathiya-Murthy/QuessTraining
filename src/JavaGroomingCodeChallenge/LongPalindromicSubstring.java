package JavaGroomingCodeChallenge;

import java.util.Scanner;

public class LongPalindromicSubstring {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        string=scanner.next();
        if(string!=null|| string.length()>1){
            int start=0;
            int end=0;
            for(int i=0;i<string.length();i++){
                int len1= expand(string,i,i);
                int len2= expand(string,i,i+1);
                int len=Math.max(len1,len2);
                if(len>end-start){
                    start=i-((len-1)/2);
                    end=i+(len/2);
                }
            }
            System.out.println(string.substring(start,end+1));
        }else System.out.println("");

    }
    public static int expand(String string, int left, int right){
        if(string==null || left>right)
            return 0;
        while (left>=0 && right<string.length() && string.charAt(left)==string.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

}
