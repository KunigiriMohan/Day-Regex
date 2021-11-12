import java.util.Scanner;
import java.util.regex.Pattern;

public class LastName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Last Name : ");
        String name = scanner.next();
        System.out.println("Last Name is : "+validateLastName(name));
    }
    /*
    * validateLastname() method checking given last name is valid or not
    * */
    public static String validateLastName(String name ){
        if ( name == null || name.isEmpty()){
            return "Enter a valid Email.";
        }
        String nameRegex = "^[A-Z]{1}[A-Z a-z]{2}";         //Specifying format of last name
        Pattern pattern = Pattern.compile(nameRegex);
        if (pattern.matcher(name).matches()){           //Checking name given by user with regex format
            return "Valid";
        }
        else{
            return "invalid";
        }
    }
}
