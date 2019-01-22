package week_10.ex_2;

public class StudentsPerformanceApplication {
    public static void main(String[] args) {
        StatisticStudentPerformance statisticStudentPerformance = new StatisticStudentPerformance();

//


//        How many students have parents with a master’s degree and lower grades than 60 on each topic?
//        Which genders and average scores do the three students with the highest average score have?
//        Is there any student with a parent education level of some high school that has at least 95 in every topic?


        //  To Do..  How many times does each parent level of education appear?
        System.out.println("Parent education level appearances: ");
       statisticStudentPerformance.educationLevel().stream()
        .forEach(e-> System.out.println(e));

        System.out.println("*******************************");


        // To Do...  Which are the different parent level of educations sorted from most appearing to least appearing?
        System.out.println("Parent education level appearances sorted top bottom: ");
        statisticStudentPerformance.educationLevelSorted().stream()
                .forEach(e-> System.out.println(e));


        System.out.println("Number of students with high parent education and lower scores than 60: "+statisticStudentPerformance.educationScoresLowerThan60());

// To Do ... How many students have parents with a master’s degree and lower grades than 60 on each topic?

        System.out.println("Genders and average scores of the top four average score students: ");
       statisticStudentPerformance.genderAndAvereageScore().stream()
        .forEach(e-> System.out.println(e));


        System.out.println("Is there any student with a parent education level of some high school that has at least 97 in every topic? "+ statisticStudentPerformance.highSchoolTopicleast97());
    }
}
