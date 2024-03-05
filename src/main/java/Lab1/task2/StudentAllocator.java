package Lab1.task2;

public class StudentAllocator {
    public StudentAllocator() {
    }

    public static Student[] createStudents() {
        return new Student[]{new Student("Alice", 9.1), new Student("Bob", 7.5), new Student("Charlie", 6.4), new Student("Diana", 8.2)};
    }
}
