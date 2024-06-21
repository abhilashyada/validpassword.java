import java.util.Scanner;
public class validpassword {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String Password = input.nextLine();
        input.close();
        
        if (isvalidpassword(Password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean isvalidpassword(String Password) {
        boolean hasuppercase = false;
        boolean haslowercase = false;
        boolean hasdigit = false;
        for (int  i = 0;i <Password.length();i++) {
            char ch = Password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasuppercase = true;
            } else if (Character.isLowerCase(ch)) {
                haslowercase = true;
            } else if (Character.isDigit(ch)) {
                hasdigit = true;
            }
            if (hasuppercase && haslowercase && hasdigit) {
                return true;
            } 
        } 
        return false;
}
}