package LAB4.studentSerialization;

import java.io.InputStream;

public interface StudentDeserializer {
    Student deserialize(InputStream inputStream);
}
