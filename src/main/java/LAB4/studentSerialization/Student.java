package LAB4.studentSerialization;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private final String fullName;
    private Map<String, Double> courseInformation = null;

    public Student(String fullName) {
        this.fullName = fullName;
        this.courseInformation = new HashMap<>(courseInformation);
    }

    public void addCourseInformation(String courseName, double grade) {
        courseInformation.put(courseName, grade);
    }

    public String getFullName() {
        return fullName;
    }

    public Map<String, Double> getCourseInformation() {
        return new HashMap<>(courseInformation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fullName, student.fullName) && Objects.equals(courseInformation, student.courseInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, courseInformation);
    }
}
