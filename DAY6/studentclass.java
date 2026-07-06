public class Student {

    int id = 101;
    String name = "Ravi";
    String department = "CSE";

    void display() {
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Department : " + department);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}