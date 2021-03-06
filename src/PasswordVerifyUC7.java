package src;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerifyUC7 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Password ");
        String password = scanner.next();
        PasswordVerifyUC7 obj =new PasswordVerifyUC7();
        System.out.println("Your Password is "+obj.passwordVerify(password));
    }
    /*
     * passwordVerify() method to verify password entered by user is same according to regex
     * */
    public String passwordVerify(String password){
        if (password==null&& password.isEmpty()){           //Checking input Password is empty or not
            return "Not valid ";
        }
        String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*d)[a-zA-Zd]{8,}$";    //Regex code for verifying Password
        Pattern pattern=Pattern.compile(regex);
        if (pattern.matcher(password).matches()){       //Checking entered password matches with regex code or not.
            return " Valid ";
        }
        else
        {
            return " Not Valid ";
        }
    }
}
