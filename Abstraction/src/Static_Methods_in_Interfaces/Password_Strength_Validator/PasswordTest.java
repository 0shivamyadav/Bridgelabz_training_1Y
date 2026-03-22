package Static_Methods_in_Interfaces.Password_Strength_Validator;

public class PasswordTest {
    public static void main(String[] args) {

        String password = "Java1234";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password ");
        } else {
            System.out.println("Weak Password ");
        }
    }
}
