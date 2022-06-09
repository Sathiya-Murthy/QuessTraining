package Date_08_06_2022;

import java.util.Scanner;

public class Q44highestScoringWord {
    public static void main(String[] args) {
        int max=0,total;
        String inputString,highScoreWord = null;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an line to find a highest scoring word..");
        inputString=scanner.nextLine();
        String[] splitWord=inputString.split(" ");
        for(String strings:splitWord){
            total=0;
            for (int i=0;i<strings.length();i++)
            {
                total+=(int)strings.charAt(i);
            }
            if(total>max){
                highScoreWord=strings;
                max=total;
            }
        }
        System.out.println(highScoreWord);
    }
}
