package LAB4.task3;

import java.util.HashMap;
import java.util.Map;

public class Student implements Cloneable {
    private String fullName;
    private Map<String, Double> courseInformation;

    public Student(String fullName, Map<String, Double> courseInformation) {
        this.fullName = fullName;
        this.courseInformation = courseInformation;
    }

    @Override
    public Student clone() {
        try {
            Student clonedStudent = (Student) super.clone();

            clonedStudent.courseInformation = new HashMap<>(this.courseInformation);

            return clonedStudent;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{ Name = ").append(fullName);
        sb.append(", Course Information = ").append(courseInformation);
        sb.append("}");
        return sb.toString();
    }

    public void addCourseGrade(String courseName, double grade) {
        courseInformation.put(courseName, grade);
    }

    public Double getCourseGrade(String courseName) {
        return courseInformation.get(courseName);
    }

    public static void main(String[] args) {
        Map<String, Double> courseInfo = new HashMap<>();
        courseInfo.put("Math", 9.5);
        courseInfo.put("Physics", 8.7);

        Student student1 = new Student("John Doe", courseInfo);
        Student student2 = student1.clone();

        student1.addCourseGrade("Chemistry", 7.8);

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}
