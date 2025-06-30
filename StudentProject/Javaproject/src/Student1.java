
public class Student1 {
    String name;
    int rollNo;

    // Constructor to initialize name and roll number
    public Student1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating a Student object
        Student1 s1 = new Student1("Lokesh", 101);

        // Calling the display method
        s1.display();
    }
}
