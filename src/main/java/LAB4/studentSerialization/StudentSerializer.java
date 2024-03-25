package LAB4.studentSerialization;

import java.io.IOException;
import java.io.OutputStream;

public interface StudentSerializer {
    void serialize(OutputStream outputStream, Student student) throws IOException;
}
