import java.util.ArrayList;

public class Professor extends Employee {
    public ArrayList<Course> courses;
    public ArrayList<Exam> exam;
    public String name;
    public TA assistant;

    public void publishCourse() {
        System.out.print(this.courses.toString());
    }
    public void assignTA(TA assistant) {
        this.assistant = assistant;
    }
    public void addNewCourse(Course course) {
        this.courses.add(course);
    }

    public Professor(String name, ArrayList<Course> courses, ArrayList<Exam> exam) {
        this.name = name;
        this.courses = courses;
        this.exam = exam;
    }
}
