package Project;

public class Movie {
    private String title, director, genre;
    private int release_year, duration;
    public Movie(String movie_title,String movie_director,String movie_genre,int movie_release_year,int movie_duration){
        this.title = movie_title;
        this.director = movie_director;
        this.genre = movie_genre;
        this.release_year = movie_release_year;
        this.duration = movie_duration;
    }

}
