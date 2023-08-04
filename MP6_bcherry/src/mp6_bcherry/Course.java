package mp6_bcherry;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String department;
    private String courseName;
    private int maxClassSize;
    private List<Student> roster;
    private Faculty instructor;

    public Course(String department, String courseName, int maxClassSize) {
        this.department = department;
        this.courseName = courseName;
        this.maxClassSize = maxClassSize;
        this.roster = new ArrayList<>();
    }

    // Getters and Setters

    public String toString() {
        String instructorInfo = (instructor != null) ? ", Instructor: " + instructor.getName() : "";
        return "Course Name: " + courseName + ", Department: " + department +
               ", Max Class Size: " + maxClassSize + ", Current Enrollment: " + roster.size() + instructorInfo;
    }

    public boolean isFull() {
        return roster.size() >= maxClassSize;
    }

    public boolean isStudentEnrolled(Student student) {
        return roster.contains(student);
    }

    public void addStudent(Student student) {
        if (!isFull() && !isStudentEnrolled(student)) {
            roster.add(student);
            System.out.println("Student " + student.getName() + " has been enrolled in the course.");
        } else {
            System.out.println("Enrollment failed: Course is full or student is already enrolled.");
        }
    }

    public void assignInstructor(Faculty faculty) {
        if (faculty.getDepartment().equals(department)) {
            this.instructor = faculty;
            System.out.println("Instructor " + faculty.getName() + " has been assigned to the course.");
        } else {
            System.out.println("Assignment failed: Only faculty from the same department can be assigned to the course.");
        }
    }

    public void displayRoster() {
        if (roster.isEmpty()) {
            System.out.println("Roster is empty.");
        } else {
            System.out.println("Course Roster:");
            for (Student student : roster) {
                System.out.println(student.toString());
            }
        }
    }
}
