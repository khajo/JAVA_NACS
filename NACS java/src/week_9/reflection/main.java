package week_9.reflection;

import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Statistic statistic = new Statistic();
        System.out.println("Total number of student performance entries: "+statistic.studentsList.size());
        System.out.println("Number of female students: "+statistic.getFemaleStudent());
        System.out.println("Number of male students: " + statistic.getMaleStudent());
        System.out.println("Parental education levels sorted alphabetically: "+statistic.getLevelsEducationSorted());
        System.out.println("Number of students with scores higher than 90: "+statistic.getScoredHigherThan90());
        System.out.println("Number of students with scores equal to 100: "+ statistic.getScored100().size());
        System.out.println("Genders of these students are: "+statistic.getScored100().stream().map(e->e.getGender()).collect(Collectors.toList()));
    }
}
