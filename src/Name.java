import java.util.Scanner;
import java.util.regex.Pattern;

public class Name {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = scanner.next();
        System.out.println("Name is : "+validateName(name));
    }
    public static String validateName(String name ){
        if ( name == null || name.isEmpty()){
            return "Enter a valid Email.";
        }
        String nameRegex = "^[A-Z]{1}[A-Z a-z]{2}";
        Pattern pattern = Pattern.compile(nameRegex);
        if (pattern.matcher(name).matches()){
            return "Valid";
        }
        else{
            return "invalid";
        }
    }
}
