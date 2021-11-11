import java.util.ArrayList;

public class TA {
    public ArrayList<Course> courses;
    public String name;

    public ArrayList<Course> getCourse() {
        return this.courses;
    }
    public String getName() {
        return this.name;
    }
    public void extendContract(Course course) {
        this.courses.add(course);
    }
    public void setName(String name) {
        this.name = name;
    }

    public TA(String name, ArrayList<Course> courses) {
        if(courses.isEmpty()) {
            System.out.println("TA must have at least one course!");
        } else {
            this.name = name;
            this.courses = courses;
        }
    }
}
