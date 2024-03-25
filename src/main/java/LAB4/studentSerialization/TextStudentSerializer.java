package LAB4.studentSerialization;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class TextStudentSerializer implements StudentSerializer {
    @Override
    public void serialize(OutputStream outputStream, Student student) throws IOException {
        String data = student.getFullName() + "\n";
        data += student.getCourseInformation().size() + "\n";
        for (Map.Entry<String, Double> entry : student.getCourseInformation().entrySet()) {
            data += entry.getKey() + " -> " + entry.getValue() + "\n";
        }
        outputStream.write(data.getBytes());
    }
}
