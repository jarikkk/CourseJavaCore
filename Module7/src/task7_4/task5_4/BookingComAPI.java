package task7_4.task5_4;


import task7_4.task5_1_and_5_2.Room;
import task7_4.task5_3.API;

import java.util.ArrayList;
import java.util.Date;

public class BookingComAPI implements API {

    private ArrayList<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(1, 1000, 1, new Date("07/04/2016 10:00"), "First hotel", "Kiyv"));
        rooms.add(new Room(2, 2000, 2, new Date("09/04/2016 10:00"), "Second hotel", "Kiyv"));
        rooms.add(new Room(3, 1200, 1, new Date("10/04/2016 11:00"), "Third hotel", "Kiyv"));
        rooms.add(new Room(4, 500, 1, new Date("06/04/2016 10:00"), "Fourth hotel", "Kiyv"));
        rooms.add(new Room(5, 1200, 1, new Date("15/04/2016 10:00"), "Fifth hotel", "Kiyv"));
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


