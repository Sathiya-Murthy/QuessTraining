package Date_08_06_2022;

import java.util.Scanner;

public class Q44highestScoringWord {
    public static void main(String[] args) {
        int max=0,total,charValue;
        String inputString,highScoreWord = null;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an line to find a highest scoring word the word should be in small letters:");
        inputString=scanner.nextLine();
        String[] splitWord=inputString.split(" ");
        for(String strings:splitWord){
            total=0;
            charValue=0;
            for (int i=0;i<strings.length();i++)
            {
                if(strings.charAt(i)=='a') {
                    charValue=1;
                }
                if(strings.charAt(i)=='b') {
                    charValue=2;
                }
                if(strings.charAt(i)=='c') {
                    charValue=3;
                }
                if(strings.charAt(i)=='d') {
                    charValue=4;
                }
                if(strings.charAt(i)=='e') {
                    charValue=5;
                }
                if(strings.charAt(i)=='f') {
                    charValue=6;
                }
                if(strings.charAt(i)=='g') {
                    charValue=7;
                }
                if(strings.charAt(i)=='h') {
                    charValue=8;
                }
                if(strings.charAt(i)=='i') {
                    charValue=9;
                }
                if(strings.charAt(i)=='j') {
                    charValue=10;
                }
                if(strings.charAt(i)=='k') {
                    charValue=11;
                }
                if(strings.charAt(i)=='l') {
                    charValue=12;
                }
                if(strings.charAt(i)=='m') {
                    charValue=13;
                }
                if(strings.charAt(i)=='n') {
                    charValue=14;
                }
                if(strings.charAt(i)=='o') {
                    charValue=15;
                }
                if(strings.charAt(i)=='p') {
                    charValue=16;
                }
                if(strings.charAt(i)=='q') {
                    charValue=17;
                }
                if(strings.charAt(i)=='r') {
                    charValue=18;
                }
                if(strings.charAt(i)=='s') {
                    charValue=19;
                }
                if(strings.charAt(i)=='t') {
                    charValue=20;
                }
                if(strings.charAt(i)=='u') {
                    charValue=21;
                }
                if(strings.charAt(i)=='v') {
                    charValue=22;
                }
                if(strings.charAt(i)=='w') {
                    charValue=23;
                }
                if(strings.charAt(i)=='x') {
                    charValue=24;
                }
                if(strings.charAt(i)=='y') {
                    charValue=25;
                }
                if(strings.charAt(i)=='z') {
                    charValue=26;
                }
                total+=charValue;
            }
            if(total>max){
                highScoreWord=strings;
                max=total;
            }
        }
        System.out.println(highScoreWord);
    }
}
