
import college.Student.Student;
import college.Faculty.Faculty;

import com.university.department.cse.Course;

import library.books.Books;
import library.members.Member;
import library.transactions.Transaction;

import com.bank.util.InterestCalculator;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudent("Shivam", 55);
        Faculty f = new Faculty();
        f.displayFaculty("Mr. Tanmay ", "OOPs");

        Course c = new Course();
        c.showCourse();

        Books b = new Books();
        b.addBook("Java Programming", "James Gosling");
        Member m = new Member();
        m.registerMember("Shivam", 55);
        Transaction t = new Transaction();
        t.issueBook("Java Programming", "Shivam");


        InterestCalculator calc = new InterestCalculator();
        double P = 1000;
        double R = 5;
        double T = 2;
        double SI = calc.SimpleInterest(P, R, T);
        double CI = calc.CompoundInterest(P, R, T);
        System.out.println("Principal: " + P);
        System.out.println("Rate: " + R);
        System.out.println("Time: " + T);
        System.out.println("Simple Interest: " + SI);
        System.out.println("Compound Interest: " + CI);

    }
}
