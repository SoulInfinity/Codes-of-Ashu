class BookTheatreSeat 
{
    int total_seats=10;
     synchronized void BookSeat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println(seats+"seats booked successfully");
            total_seats=total_seats-seats;
            System.out.println(seats+"seats left"+total_seats);
        }
        else
        {
           System.out.println("Sorry seats cannot be booked");
           System.out.println("Seats left"+total_seats);
        }     
    }
}

public class MovieBookApp extends Thread{
     static BookTheatreSeat b;
     int seats;
    public void run()
    {
        b.BookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookTheatreSeat();
        MovieBookApp d = new MovieBookApp();
        d.seats=7;
        d.start();
        MovieBookApp s = new MovieBookApp();
        s.seats=6;
        s.start();
    }
}
