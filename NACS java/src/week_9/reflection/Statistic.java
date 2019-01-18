package week_9.reflection;


import java.util.List;
import java.util.stream.Collectors;

public class Statistic {

    private StudentReader studentReader = new StudentReader();
    public List<Student> studentsList = studentReader.getStudentList();

    public long getFemaleStudent() {
        return studentsList.stream()
                .filter(e -> e.getGender().equals("female"))
                .count();
    }
    public long getMaleStudent() {
        return studentsList.stream()
                .filter(e -> e.getGender().equals("male"))
                .count();
    }

    public List<String> getLevelsEducationSorted() {
        return studentsList.stream()
                .map(e->e.getEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public long getScoredHigherThan90() {
        return studentsList.stream()
                .filter(e -> e.getMathScore() > 90)
                .filter(e -> e.getReadingScore() > 90)
                .filter(e -> e.getWritingScore() > 90)
                .count();
    }

    public List<Student> getScored100() {
        return studentsList.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .filter(e -> e.getWritingScore() == 100)
                .collect(Collectors.toList());
    }


//    How many boys and girls are there?
//    Which are the distinct parental levels of education sorted alphabetically?
//    How many students scored higher than a 90 on every topic?
//    How many students scored exactly 100 on every topic? Which ones are their genders?

}
