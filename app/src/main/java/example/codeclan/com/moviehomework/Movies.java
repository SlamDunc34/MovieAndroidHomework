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

    private void setupTitlesArray(){
        String[] titlesToAdd = {
                "Four Lions",
                "City of God",
                "Home Alone 2",
                "Step Brothers",
                "Restless Natives",
                "Jurassic Park",
                "The Room",
                "Whiplash",
                "Fargo",
                "Belleville Rendezvous"
        };


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