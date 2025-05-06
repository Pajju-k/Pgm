import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Student {
    String name;
    LocalDate dob;

    Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + getAge() + " years");
        System.out.println("This is lab");
        System.out.println("This is 2nd lab");
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dobInput = sc.nextLine();
        LocalDate dob = LocalDate.parse(dobInput); // assumes correct format

        Student s = new Student(name, dob);
        s.display();

        sc.close();
    }
}