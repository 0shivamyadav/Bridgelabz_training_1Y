package School_System_with_Different_Roles;

public class Main {
    public static void main(String[] args) {

        Person teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person student = new Student("Shivam", 16, "10th");
        Person staff = new Staff("Yadav G", 35, "Administration");

        System.out.println("=== Teacher ===");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println("\n=== Student ===");
        student.displayDetails();
        student.displayRole();

        System.out.println("\n=== Staff ===");
        staff.displayDetails();
        staff.displayRole();
    }
}