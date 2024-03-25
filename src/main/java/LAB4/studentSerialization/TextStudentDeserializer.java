package LAB4.studentSerialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TextStudentDeserializer implements StudentDeserializer {
    @Override
    public Student deserialize(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String fullName = reader.readLine();
            int numCourses = Integer.parseInt(reader.readLine());
            Map<String, Double> courseInformation = new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                String line = reader.readLine();
                StringTokenizer tokenizer = new StringTokenizer(line, "->");
                String courseName = tokenizer.nextToken().trim();
                double grade = Double.parseDouble(tokenizer.nextToken().trim());
                courseInformation.put(courseName, grade);
            }
            return new Student(fullName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
