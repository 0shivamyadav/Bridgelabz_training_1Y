package School_System_with_Different_Roles;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Teacher. I teach " + subject + ".");
    }
}