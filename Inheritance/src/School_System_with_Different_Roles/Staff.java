package School_System_with_Different_Roles;

public class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Staff member working in " + department + " department.");
    }
}