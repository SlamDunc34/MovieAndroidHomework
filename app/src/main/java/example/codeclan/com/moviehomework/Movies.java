package example.codeclan.com.moviehomework;

/**
 * Created by user on 17/04/2017.
 */

public class Movies {
        private String title;
        private String genre;
        private double ranking;
}
    public Movies(String title, String genre, double ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;


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

    private void setupGenresArray() {
        String[] genresToAdd = {
                "Comedy",
                "Horror",
                "Action",
                "Drama",
                "Animation",
                "Crime",
                "Musical",
                "Thriller",
                "Historical Drama",
                "Family"
        };

    private void setupRankingsArray() {
        int[] rankingsToAdd = {
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10
        };
    }
}

