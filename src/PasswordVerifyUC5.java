package src;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerifyUC5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Password ");
        String password = scanner.next();
        PasswordVerifyUC5 obj =new PasswordVerifyUC5();

        System.out.println("Your Email is "+obj.passwordVerify(password));
    }
    /*
    * passwordVerify() method to verify password entered by user is same according to regex
    * */
    public String passwordVerify(String password){
        if (password==null&& password.isEmpty()){
            return " Not Valid ";
        }
        String passwordRegex ="^[a-z,A-Z]{8,}";         //Regex for checking Password
        Pattern pattern= Pattern.compile(passwordRegex);
        if(pattern.matcher(password).matches()){        //Checking input password matching regex or not
            return "Valid";
        }
        else
        {
            return " Not valid";
        }
    }
}
