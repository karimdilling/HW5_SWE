import java.util.ArrayList;

public class Exam {
    public int max_value;
    public Course course;
    public ArrayList<Question> questions;
    public ArrayList<Student> student;

    public boolean register(Student student) {
        return this.student.contains(student);
    }
    public void addQuestion(Integer id, String task, int value) {
        Question q = new Question(id, task, value);
        this.questions.add(q);
    }
    public ArrayList<Student> getRegisteredStudents() {
        return this.student;
    }
    public void setMaxValue(int max) {
        this.max_value = max;
    }

    public Exam(int max_value, Course course, ArrayList<Question> questions, ArrayList<Student> student) {
        if (questions.isEmpty()) {
            System.out.println("Exam must have at least 1 question");
        } else {
            this.max_value = max_value;
            this.course = course;
            this.questions = questions;
            this.student = student;
        }
    }

    class Question {
        public String task;
        public int maxValue;
        public int qId;

        public Question(int id, String task, int value) {
            this.qId = id;
            this.task = task;
            this.maxValue = value;
        }
    }

}
