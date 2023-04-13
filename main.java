package Project;

import java.util.Scanner;

public class main {
    private static Theater theater = new Theater();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the LUT Kino at Yliopistonkatu!");
        meun();
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                theater.addMovie(sc);
                break;
            case 2:
                theater.removeMovie(sc);
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;

        }

    }
    static void meun() {
        System.out.println("1. Add a movie\n2. Remove a movie\n3. View a movie\n4. View all movies\n5. Add a showtime\n6. Remove a showtime\n7. View a showtime\n8. View all showtimes\n9. Buy a ticket\n10. View seating\n0. Exit\n");
    }
}


