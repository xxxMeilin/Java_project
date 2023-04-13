package Project;
import java.util.List;
import Exercise7.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Theater {
    List<Movie> movies = new ArrayList<>();
    List<Showtime> showtimes = new ArrayList<>();
    void addMovie(Scanner sc){
        System.out.println("Enter the movie title:");
        String title = sc.nextLine();
        System.out.println("Enter the director: ");
        String director = sc.nextLine();
        System.out.println("Enter the duration: ");
        Integer duration = sc.nextInt();
        movies.add(new Movie(title,director,));
    }
    void removeMovie(Scanner sc){

    }
}
