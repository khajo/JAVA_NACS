package week_9.reflection;

public class Student {
    private String gender;
    private String education;
    private Integer MathScore;
    private Integer readingScore;
    private Integer writingScore;


    public Student(String gender, String education, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.education = education;
        MathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getEducation() {
        return education;
    }

    public Integer getMathScore() {
        return MathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", education='" + education + '\'' +
                ", MathScore=" + MathScore +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                '}';
    }
}
