package ClassandObject.Level2;
import java.util.Scanner;

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }
    void displayTicket() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();
        System.out.print("Enter Movie Name: ");
        String movie = input.nextLine();
        System.out.print("Enter Seat Number: ");
        String seat = input.nextLine();
        System.out.print("Enter Ticket Price: ");
        double price = input.nextDouble();
        ticket.bookTicket(movie, seat, price);
        System.out.println();
        ticket.displayTicket();
        input.close();
    }
}
