import java.util.ArrayList;

public class Department {
    public String name;
    public ArrayList<Employee> employee;
    public Professor chair;
    public ArrayList<Course> courses;

    public Department(String name, ArrayList<Employee> employee, Professor chair, ArrayList<Course> courses) {
        this.name = name;
        this.employee = employee;
        this.chair = chair;
        this.courses = courses;
    }
}

class Employee {
    public String name;
    public int eId;
}