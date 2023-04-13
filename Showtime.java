package Project;
import java.time.LocalDateTime;
public class Showtime {
    private Movie movie;
    private LocalDateTime timeAndDate;
    private double ticketPrice;
    public Showtime(Movie movie, LocalDateTime timeAndDate, double ticketPrice) {
        this.movie = movie;
        this.timeAndDate = timeAndDate;
        this.ticketPrice = ticketPrice;
    }
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(LocalDateTime timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
