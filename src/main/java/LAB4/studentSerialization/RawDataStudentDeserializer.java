package LAB4.studentSerialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RawDataStudentDeserializer implements StudentDeserializer {
    @Override
    public Student deserialize(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String fullName;
        Map<String, Double> courseInformation = new HashMap<>();
        try {
            fullName = reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String courseName = parts[0];
                double grade = Double.parseDouble(parts[1]);
                courseInformation.put(courseName, grade);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return new Student(fullName);
    }
}
