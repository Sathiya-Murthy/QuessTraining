package Date_08_06_2022;

import java.util.Scanner;

class UserNameError extends Exception{
    UserNameError(String string){
        super(string);
    }
}
class PassWordError extends Exception{
    PassWordError(String string){
        super(string);
    }
}

public class Q41PasswordVerifier    {
    public static void main(String[] args)  {
        String userName,passWord;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the username: ");
            userName = scanner.next();
            if(!(Character.isUpperCase(userName.charAt(0)))) {
                throw new UserNameError("A username must start with an uppercase English alphabet A to Z.");
            }
            else if (!((userName.length()>=6)&&(userName.length()<=15))) {
                throw new UserNameError("A username must be of length 6-15 characters.");
            }
            else {
                try {
                    System.out.print("Enter the password: ");
                    passWord = scanner.next();
                    if (passWord.length() < 7 && passWord.length() > 256)
                        throw new PassWordError("A password must not be shorter than 8 characters but must not exceed 256");
                    else if(passWord.contains(" ") && passWord.contains("(") && passWord.contains(")") && passWord.contains("{") && passWord.contains("}"))
                        throw new PassWordError("There cannot be any types of parentheses or whitespaces in a valid username or password");
                    else if (passWord==userName) {
                        throw new PassWordError("A password cannot contain or be the same as its associated username");
                    }

                } catch (PassWordError e) {
                    throw new RuntimeException(e);
                }
            }
        }
        catch (UserNameError e) {
            throw new RuntimeException(e);
        }
        System.out.println("Username and Password was set successfully...");

    }
}
