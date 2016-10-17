package task7_4.task5_4;

import task7_4.task5_1_and_5_2.Room;
import task7_4.task5_3.API;

import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {


    private ArrayList<Room> rooms = new ArrayList<>();

    public GoogleAPI() {

        rooms.add(new Room(1, 500, 1, new Date("07/04/2016 10:00"), "1 star hotel", "Kiyv"));
        rooms.add(new Room(2, 1000, 4, new Date("09/04/2016 10:00"), "2 star hotel", "Kiyv"));
        rooms.add(new Room(3, 1500, 2, new Date("10/04/2016 11:00"), "3 star hotel", "Kiyv"));
        rooms.add(new Room(4, 2000, 5, new Date("06/04/2016 10:00"), "4 star hotel", "Kiyv"));
        rooms.add(new Room(5, 2500, 1, new Date("15/04/2016 10:00"), "5 star hotel", "Kiyv"));

    }


    @Override
    public ArrayList<Room> findRooms(int price, int persons, String cityName, String hotel) {
        ArrayList<Room> roomIsFound = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getPrice() == price && rooms.get(i).getPersons() == persons &&
                    rooms.get(i).getCityName().equals(cityName) && rooms.get(i).getHotelName().equals(hotel)) {
                roomIsFound.add(rooms.get(i));
            }

        }
        return roomIsFound;
    }

    @Override
    public ArrayList<Room> getAll () {

        return rooms;
    }





}
