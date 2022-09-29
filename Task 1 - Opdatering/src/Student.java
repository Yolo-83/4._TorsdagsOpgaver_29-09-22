import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student name: " + getName() + " / Courses: " + getCourses();
    }
}