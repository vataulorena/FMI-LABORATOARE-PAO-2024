package Lab1.task1;

import Lab1.task2.Course;
import Lab1.task2.Student;
import Lab1.task2.StudentAllocator;
import Lab1.task4.DummyCalculator;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Student[] students = StudentAllocator.createStudents();
        Course course = new Course("OOP Fundamentals", 5.0, students);
        Student randomStudent = course.chooseStudentRandomly();
        PrintStream var10000 = System.out;
        String var10001 = randomStudent.getName();
        var10000.println("Student ales aleatoriu: " + var10001 + " cu nota " + randomStudent.getGrade());
        System.out.println("\nStudenții care au promovat:");
        Student[] passingStudents = course.showAllPassingStudents();
        Student[] var5 = passingStudents;
        int var6 = passingStudents.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Student student = var5[var7];
            var10000 = System.out;
            var10001 = student.getName();
            var10000.println(var10001 + " cu nota " + student.getGrade());
        }

        boolean isPassing = course.isStudentPassing(students[0]);
        var10000 = System.out;
        var10001 = students[0].getName();
        var10000.println("\n" + var10001 + " a promovat? " + (isPassing ? "Da" : "Nu"));
        DummyCalculator calculator = new DummyCalculator();
        calculator.calculate(new String[]{"1 + 2", "1.0 + 1.2"});
    }
}
