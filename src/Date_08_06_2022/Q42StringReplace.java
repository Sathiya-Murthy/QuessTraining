package Date_08_06_2022;

import java.util.Scanner;

public class Q42StringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString;
        inputString= scanner.nextLine();
        for(int i=0;i<inputString.length();i++) {
            if(Character.getNumericValue(inputString.charAt(i))<5)
                inputString=inputString.replace(inputString.charAt(i),'0');
            if(Character.getNumericValue(inputString.charAt(i))>=5)
                inputString=inputString.replace(inputString.charAt(i),'1');
        }
        System.out.println(inputString);
    }
}
