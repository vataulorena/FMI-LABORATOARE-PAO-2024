package LAB4.studentSerialization.serialization.serializer;


import LAB4.studentSerialization.domain.Student;

import java.io.OutputStream;

public interface StudentSerializer {
    void serialize(OutputStream outputStream, Student student);
}