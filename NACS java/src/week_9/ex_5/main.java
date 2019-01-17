package week_9.ex_5;


import java.util.List;

public class main {
    public static void main(String[] args) {
        FilmReader filmReader = new FilmReader();
        List<Film> films = filmReader.getFilms();
        FilmSummarizer filmSummarizer = new FilmSummarizer();
        System.out.println("Top 3 with highest rating, sorted by rating: "+filmSummarizer.getHighestRating());
        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating: "+filmSummarizer.getHighestRatingAndLongerThanThreeHours());
        System.out.println("Top 4 most expensive, sorted by budget: "+filmSummarizer.getMostExpensiveBudget());
        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget: "+ filmSummarizer.getMostExpensiveBudgetLongerThan90Min());
        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget: "+filmSummarizer.getratedOver7BudgetBetween());


    }
}
