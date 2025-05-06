// import java.time.LocalDate;
// import java.time.Period;
// import java.util.Scanner;

class Student {
    String name;
    // LocalDate dob;

    Student(String name) {
        this.name = name;
// this.dob = dob;
    }

    // int getAge() {
    //     // LocalDate today = LocalDate.now();
    //     // return Period.between(dob, today).getYears();
    // }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: "  + " years");
        System.out.println("This is lab");
        System.out.println("This is 2nd lab");
    }
}

public class Program1 {
    public static void main(String[] args) {
    

        Student s = new Student("Prajwal");
        s.display();

    }
}
