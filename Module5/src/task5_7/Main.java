package task5_7;


import task5_4.BookingComAPI;
import task5_4.GoogleAPI;
import task5_4.TripAdvisorAPI;
import task5_6.Controller;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.requestRooms(1200, 1, "Kiyv", "Fifth hotel");
        controller.requestRooms(3000, 4, "Kyiv", "Old Hotel");
        controller.requestRooms(3000, 4, "Kyiv", "Old Hotel");

        controller.check(new GoogleAPI(), new TripAdvisorAPI());
        controller.check(new TripAdvisorAPI(), new BookingComAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());

    }
}
