import java.util.ArrayList;

public class Course {
    public int id;
    public String name;
    public int maxCapacity;
    public boolean isFull = false;
    public Professor prof;
    public ArrayList<Student> student;
    public ArrayList<Exam> exam;

    public Course(int id, String name, int maxCapacity, Professor prof, ArrayList<Exam> exam) {
        if(exam.isEmpty()) {
            System.out.println("Course must have at least one exam!");
        } else {
            this.id = id;
            this.name = name;
            this.maxCapacity = maxCapacity;
            this.prof = prof;
            this.exam = exam;
        }
    }

    public void enroll(Student student) {
        this.student.add(student);
    }

    public void setMaxCap(int max) {
        this.maxCapacity = max;
    }
}
