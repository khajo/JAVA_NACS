package week_10.ex_2;

import week_9.reflection.Student;
import week_9.reflection.StudentReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticStudentPerformance {
    StudentReader studentReader = new StudentReader();
    List<Student> students = studentReader.getStudentList();

    public List<String> educationLevel() {
        return students.stream()
                .map(e -> e.getEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getKey() + "|" + e.getValue())
                .collect(Collectors.toList());
    }

    public List<String> educationLevelSorted() {
        return students.stream()
                .map(e -> e.getEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
    }


    public long educationScoresLowerThan60() {
        return students.stream()
                .filter(e -> e.getEducation().equalsIgnoreCase("master's degree"))
                .filter(e -> e.getWritingScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getMathScore() < 60)
                .count();
    }

    public List<String> genderAndAvereageScore() {
        return students.stream()
                .map(e -> (e.getMathScore() + e.getReadingScore() + e.getWritingScore()) / 3 + " | " + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .collect(Collectors.toList());
    }

    public boolean highSchoolTopicleast97() {
        return students.stream()
                .anyMatch(e -> e.getEducation().equalsIgnoreCase("some high school") && e.getWritingScore() > 95
                        && e.getReadingScore() > 95 && e.getMathScore() > 95);
    }


}
