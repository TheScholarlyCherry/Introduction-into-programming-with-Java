package mp6_bcherry;

public class Student extends Person {
    private String major;
    private double gpa;

    public Student(String name, int age, String email, String major, double gpa) {
        super(name, age, email);
        this.major = major;
        this.gpa = gpa;
    }

    // Getters and Setters

    public boolean equals(Object obj) {
        // Call the superclass implementation first
        if (!super.equals(obj)) {
            return false;
        }
        // Then compare subclass-specific attributes
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return major.equals(student.major) &&
                   Double.compare(gpa, student.gpa) == 0;
        }
        return false;
    }

    public String toString() {
        return super.toString() + ", Major: " + major + ", GPA: " + gpa;
    }

    public void registerForCourse(Course course) {
        if (!course.isFull() && !course.isStudentEnrolled(this)) {
            course.addStudent(this);
        } else {
            System.out.println("Registration failed: Course is full or student is already enrolled.");
        }
    }
}
