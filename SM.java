import java.util.Scanner;

class Student {
    String name;
    float roll;
    float[] marks = new float[3];

    void input(Scanner sc) {
        System.out.print("Enter name: ");
        
        name = sc.next();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        System.out.print("Enter marks in 3 subjects: ");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextFloat();
        }
    }

    float getAverage() {
        float sum = 0;
        for (float mark : marks) {
            sum += mark;
        }
        return sum / 3;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Average Marks: " + getAverage());
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            students[i] = new Student();
            students[i].input(sc);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
            System.out.println("------------------------");
        }

        sc.close();
    }
}
