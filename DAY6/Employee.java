public class Employee {

    int empId = 1001;
    String name = "Kumar";
    double salary = 35000;

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();
        e.display();

    }
}