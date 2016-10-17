package task7_4.task5_6;


import task7_4.task5_1_and_5_2.Room;
import task7_4.task5_3.API;
import task7_4.task5_4.BookingComAPI;
import task7_4.task5_4.GoogleAPI;
import task7_4.task5_4.TripAdvisorAPI;
import task7_4.task5_5.DAOimpl;

import java.util.ArrayList;

public class Controller {


private ArrayList<API> apis = new ArrayList<>();

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis.add(bookingComAPI);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis.add(tripAdvisorAPI);
        GoogleAPI googleAPI = new GoogleAPI();
        apis.add(googleAPI);
    }

    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {


        ArrayList<Room> rooms = new ArrayList<>();
        apis.get(0).findRooms(price, persons, city, hotel);
        apis.get(1).findRooms(price, persons, city, hotel);
        apis.get(2).findRooms(price, persons, city, hotel);

        rooms.add((Room) apis.get(0));
        rooms.add((Room) apis.get(1));
        rooms.add((Room) apis.get(2));


        DAOimpl daOimpl = new DAOimpl();
        for (int i = 0; i < rooms.size(); i++)
            if (rooms.get(i) != null) {
                daOimpl.save(rooms.get(i));
            } else return null;

        return rooms;
    }

    public ArrayList<Room> check(API api1, API api2) {

        ArrayList<Room> rooms = new ArrayList<>();

        for (int i = 0; i < api1.getAll().size(); i++) {
            for (int j = 0; j < api2.getAll().size(); j++) {
                if (api1.getAll().get(i) == api2.getAll().get(i)) rooms.add(api1.getAll().get(i));
                else return null;
            }
            return rooms;
        }


        return null;
    }



}
