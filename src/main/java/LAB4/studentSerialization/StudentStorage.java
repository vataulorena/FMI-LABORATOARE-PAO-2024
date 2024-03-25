package LAB4.studentSerialization;

import java.io.*;
import java.util.List;

public final class StudentStorage {
    private final StudentSerializer serializer;
    private final StudentDeserializer deserializer;

    public StudentStorage(StudentSerializer serializer, StudentDeserializer deserializer) {
        this.serializer = serializer;
        this.deserializer = deserializer;
    }

    public List<Student> readAllStudents(InputStream inputStream) throws IOException {
        return (List<Student>) deserializer.deserialize(inputStream);
    }

    public void writeAllStudents(OutputStream outputStream, List<Student> students) throws IOException {
        for (Student student : students) {
            serializer.serialize(outputStream, student);
        }
    }
}
