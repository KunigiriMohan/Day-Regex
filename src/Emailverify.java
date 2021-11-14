import java.util.Scanner;
import java.util.regex.Pattern;

public class Emailverify {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Email your address ");
        String email = scanner.next();
        System.out.println("Entered email is : "+(emailValidation((String) email)));

    }
    /*
    * emailValidation() method for validating email entered by user is according to condition or not
    * */
    public static String emailValidation(String email){
        if(email==null || email.isEmpty()){
            return "Enter a valid email ";
        }
        String emailRegex="^(abc)[\\.]{1}[a-z,A-Z]{3}[\\@]{1}(bl)[\\.]{1}(co)[\\.][a-z]{2}$";//Regex code for email
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches())            //Checking regex code is matching with user input using if condition.
        {
            return "valid";
        }
        else
        {
            return "Not valid";
        }
    }
}
