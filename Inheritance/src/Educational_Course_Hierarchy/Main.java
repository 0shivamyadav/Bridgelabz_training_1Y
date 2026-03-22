package Educational_Course_Hierarchy;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Java Basics", 40);
        System.out.println("=== Basic Course ===");
        course.displayDetails();

        System.out.println("\n=== Online Course ===");
        OnlineCourse online = new OnlineCourse("Python Course", 30, "Udemy", true);
        online.displayDetails();

        System.out.println("\n=== Paid Online Course ===");
        PaidOnlineCourse paid = new PaidOnlineCourse(
                "Full Stack Development", 60, "Coursera", true, 5000, 20
        );
        paid.displayDetails();
    }
}