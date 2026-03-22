package Static_Methods_in_Interfaces.Password_Strength_Validator;

public class SecurityUtils {
    static boolean isStrongPassword(String password) {


        if (password.length() < 8) return false;

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isUpperCase(ch)) hasUpper = true;
        }

        return hasDigit && hasUpper;
    }
}
