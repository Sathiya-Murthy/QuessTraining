package NumberSystemConversion;

import java.util.Scanner;

class BinaryNumberConversion {
    public String getDecimalNumber(String BinaryNumber){
        return Integer.toString(Integer.parseInt(BinaryNumber,2));
    }
    public String getOctalNumber(String BinaryNumber){

        return Integer.toOctalString(Integer.parseInt(BinaryNumber,2));
    }
    public String getHexadecimalNumber(String BinaryNumber){

        return Integer.toHexString(Integer.parseInt(BinaryNumber,2));
    }

}

class DecimalNumberConversion {
    public String getBinaryNumber(String DecimalNumber){
        return Integer.toBinaryString(Integer.parseInt(DecimalNumber));
    }
    public String getOctalNumber(String DecimalNumber){

        return Integer.toOctalString(Integer.parseInt(DecimalNumber));
    }
    public String getHexadecimalNumber(String DecimalNumber){

        return Integer.toHexString(Integer.parseInt(DecimalNumber));
    }
}

class OctalNumberConversion {
    public String getBinaryNumber(String OctalNumber){
        return Integer.toBinaryString(Integer.parseInt(OctalNumber,8));
    }
    public String getDecimalNumber(String OctalNumber){
        return Integer.toString(Integer.parseInt(OctalNumber,8));
    }
    public String getHexadecimalNumber(String OctalNumber){

        return Integer.toHexString(Integer.parseInt(OctalNumber,8));
    }

}

class HexadecimalNumberConversion {
    public String getBinaryNumber(String Hexadecimal){
        return Integer.toBinaryString(Integer.parseInt(Hexadecimal,16));
    }
    public String getDecimalNumber(String Hexadecimal){
        return Integer.toString(Integer.parseInt(Hexadecimal,16));
    }
    public String getOctalNumber(String Hexadecimal){

        return Integer.toOctalString(Integer.parseInt(Hexadecimal,16));
    }
}

public class NumberConversion {
    public static void main(String[] args) throws Exception {
        String conversionNumber;
        int Choice;
        Scanner scanner = new Scanner(System.in);
        BinaryNumberConversion binaryNumberConversion=new BinaryNumberConversion();
        DecimalNumberConversion decimalNumberConversion = new DecimalNumberConversion();
        OctalNumberConversion octalNumberConversion=new OctalNumberConversion();
        HexadecimalNumberConversion hexadecimalNumberConversion = new HexadecimalNumberConversion();
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        x: do{
            System.out.println(ANSI_BLUE+"------------WELCOME TO NUMBER SYSTEM CONVERSION CALCULATOR------------"+ANSI_RESET);
            System.out.println("""
                    Enter 1 for convert binary number to other number
                    Enter 2 for convert decimal number to other number
                    Enter 3 for convert octal number to other number
                    Enter 4 for convert hexadecimal to other number
                    Enter 5 for quit""");
            System.out.print("Enter your choice: ");
            Choice= scanner.nextInt();
            switch (Choice){
                case 1:{
                    System.out.print("Enter the binary number :");
                    conversionNumber=scanner.next();
                    int count=0;
                    int choice;
                    for(int i=0;i<conversionNumber.length();i++){
                        if(Character.getNumericValue(conversionNumber.charAt(i))!=1 && Character.getNumericValue(conversionNumber.charAt(i))!=0){
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("""
                                Enter 1 for convert into decimal number
                                Enter 2 for convert into octal number
                                Enter 3 for convert into hexadecimal number""");
                        System.out.print("Enter your choice :");
                        choice= scanner.nextInt();
                        switch (choice){
                            case 1:{
                                System.out.println(ANSI_GREEN+"The decimal conversion of "+conversionNumber+ " is "+binaryNumberConversion.getDecimalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 2:{
                                System.out.print(ANSI_GREEN+"The octal conversion of "+conversionNumber+ " is ");
                                System.out.println(binaryNumberConversion.getOctalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 3:{
                                System.out.print(ANSI_GREEN+"The Hexadecimal conversion of "+conversionNumber+ " is ");
                                System.out.println(binaryNumberConversion.getHexadecimalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            default:{
                                System.out.println(ANSI_RED+"Wrong Input:"+ANSI_RESET);
                            }
                        }
                    }
                    else{
                        System.out.println(ANSI_RED+"Enter an valid binary number..."+ANSI_RESET);
                    }
                    break;
                }
                case 2:{
                    int count=0;
                    System.out.print("Enter the decimal number :");
                    conversionNumber=scanner.next();
                    for(int i=0;i<conversionNumber.length();i++){
                        if(!((int)conversionNumber.charAt(i)>=48&&(int)conversionNumber.charAt(i)<=57)){
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("""
                                Enter 1 for convert into binary number
                                Enter 2 for convert into octal number
                                Enter 3 for convert into hexadecimal number""");
                        System.out.print("Enter your choice :");
                        int choice= scanner.nextInt();
                        switch (choice){
                            case 1:{
                                System.out.println(ANSI_GREEN+"The decimal conversion of "+conversionNumber+ " is "+decimalNumberConversion.getBinaryNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 2:{
                                System.out.print(ANSI_GREEN+"The octal conversion of "+conversionNumber+ " is ");
                                System.out.println(decimalNumberConversion.getOctalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 3:{
                                System.out.print(ANSI_GREEN+"The Hexadecimal conversion of "+conversionNumber+ " is ");
                                System.out.println(decimalNumberConversion.getHexadecimalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            default:{
                                System.out.println(ANSI_RED+"Wrong Input:"+ANSI_RESET);
                            }
                        }

                    }
                    else {
                        System.out.println(ANSI_RED+"Enter an valid decimal number..."+ANSI_RESET);
                    }
                    break;
                }
                case 3:{
                    System.out.print("Enter the octal number :");
                    conversionNumber=scanner.next();
                    int count=0;
                    int choice;
                    for(int i=0;i<conversionNumber.length();i++){
                        if(!((int)conversionNumber.charAt(i)>=48&&(int)conversionNumber.charAt(i)<=55)){
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("""
                                Enter 1 for convert into binary number
                                Enter 2 for convert into decimal number
                                Enter 3 for convert into hexadecimal number""");
                        System.out.print("Enter your choice :");
                        choice= scanner.nextInt();
                        switch (choice){
                            case 1:{
                                System.out.println(ANSI_GREEN+"The binary conversion of "+conversionNumber+ " is "+octalNumberConversion.getBinaryNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 2:{
                                System.out.print(ANSI_GREEN+"The decimal conversion of "+conversionNumber+ " is ");
                                System.out.println(octalNumberConversion.getDecimalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 3:{
                                System.out.print(ANSI_GREEN+"The Hexadecimal conversion of "+conversionNumber+ " is ");
                                System.out.println(octalNumberConversion.getHexadecimalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            default:{
                                System.out.println(ANSI_RED+"Wrong Input:"+ANSI_RESET);
                            }
                        }

                    }
                    else{
                        System.out.println(ANSI_RED+"Enter an valid octal number..."+ANSI_RESET);
                    }
                    break;
                }
                case 4:{
                    System.out.print("Enter the hexadecimal number :");
                    conversionNumber=scanner.next();
                    int count=0;
                    int choice;
                    for(int i=0;i<conversionNumber.length();i++){
                        if((!((int)conversionNumber.charAt(i)>=48&&(int)conversionNumber.charAt(i)<=55)) && (!((int)conversionNumber.charAt(i)>=97&&(int)conversionNumber.charAt(i)<=102))  && (!((int)conversionNumber.charAt(i)>=65&&(int)conversionNumber.charAt(i)<=70))  ){
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("""
                                Enter 1 for convert into binary number
                                Enter 2 for convert into decimal number
                                Enter 3 for convert into octal number""");
                        System.out.print("Enter your choice :");
                        choice= scanner.nextInt();
                        switch (choice){
                            case 1:{
                                System.out.println(ANSI_GREEN+"The binary conversion of "+conversionNumber+ " is "+hexadecimalNumberConversion.getBinaryNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 2:{
                                System.out.print(ANSI_GREEN+"The decimal conversion of "+conversionNumber+ " is ");
                                System.out.println(hexadecimalNumberConversion.getDecimalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            case 3:{
                                System.out.print(ANSI_GREEN+"The octal conversion of "+conversionNumber+ " is ");
                                System.out.println(hexadecimalNumberConversion.getOctalNumber(conversionNumber)+ANSI_RESET);
                                break;
                            }
                            default:{
                                System.out.println(ANSI_RED+"Wrong Input:"+ANSI_RESET);
                            }
                        }

                    }
                    else{
                        System.out.println(ANSI_RED+"Enter an valid hexadecimal number..."+ANSI_RESET);
                    }
                    break;
                }
                case 5:
                    break x;
                default:{
                    System.out.println(ANSI_RED+"Wrong Input:"+ANSI_RESET);
                    break;
                }

            }

        }while (true);
    }
}

