package Lab1.task2;

import java.util.Random;

public class Course {
    private String name;
    private double minimumGrade;
    private Student[] students;

    public Course(String name, double minimumGrade, Student[] students) {
        this.name = name;
        this.minimumGrade = minimumGrade;
        this.students = students;
    }

    public Student chooseStudentRandomly() {
        Random random = new Random();
        int index = random.nextInt(this.students.length);
        return this.students[index];
    }

    public Student[] showAllPassingStudents() {
        int count = 0;
        Student[] passingStudents = this.students;
        int index = passingStudents.length;

        for(int var4 = 0; var4 < index; ++var4) {
            Student student = passingStudents[var4];
            if (student.getGrade() >= this.minimumGrade) {
                ++count;
            }
        }

        passingStudents = new Student[count];
        index = 0;
        Student[] var8 = this.students;
        int var9 = var8.length;

        for(int var6 = 0; var6 < var9; ++var6) {
            Student student = var8[var6];
            if (student.getGrade() >= this.minimumGrade) {
                passingStudents[index++] = student;
            }
        }

        return passingStudents;
    }

    public boolean isStudentPassing(Student student) {
        Student[] var2 = this.students;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Student s = var2[var4];
            if (s.equals(student)) {
                return s.getGrade() >= this.minimumGrade;
            }
        }

        return false;
    }

    public boolean isStudentPassing(int index) {
        if (index >= 0 && index < this.students.length) {
            return this.students[index].getGrade() >= this.minimumGrade;
        } else {
            return false;
        }
    }
}
