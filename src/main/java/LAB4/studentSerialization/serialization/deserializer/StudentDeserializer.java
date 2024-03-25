package LAB4.studentSerialization.serialization.deserializer;


import LAB4.studentSerialization.domain.Student;

import java.io.InputStream;

public interface StudentDeserializer {
    Student deserializer(InputStream inputStream);
}