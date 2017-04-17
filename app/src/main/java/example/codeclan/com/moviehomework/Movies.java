package example.codeclan.com.moviehomework;

/**
 * Created by user on 17/04/2017.
 */

public class Movies {
        private String title;
        private String genre;
        private double ranking;
}
    public Movie(String title, String genre, double ranking){
        this.title = title;
        this.genre = genre;

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRanking() {
        return ranking;
    }