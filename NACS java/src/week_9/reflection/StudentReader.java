package week_9.reflection;

import ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    private FileReader reader = new FileReader();


    public List<Student> getStudentList() {
        return reader.asStream("week_9/reflection/students-performance.csv")
                .skip(1)
                .map(e -> Arrays.asList(e.split(";")))
                .map(e -> new Student(e.get(0), e.get(1), Integer.valueOf(e.get(2)), Integer.valueOf(e.get(3)), Integer.valueOf(e.get(4))))
                .collect(Collectors.toList());
    }
}

