package task5_4;


import task5_1_and_5_2.Room;
import task5_3.API;

import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(1, 1000, 1, new Date("07/04/2016 10:00"), "First hotel", "Kiyv");
        rooms[0] = room1;
        Room room2 = new Room(2, 2000, 2, new Date("09/04/2016 10:00"), "Second hotel", "Kiyv");
        rooms[1] = room2;
        Room room3 = new Room(3, 1500, 1, new Date("10/04/2016 11:00"), "Third hotel", "Kiyv");
        rooms[2] = room3;
        Room room4 = new Room(4, 500, 1, new Date("06/04/2016 10:00"), "Fourth hotel", "Kiyv");
        rooms[3] = room4;
        Room room5 = new Room(5, 1200, 1, new Date("15/04/2016 10:00"), "Fifth hotel", "Kiyv");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room roomIsFound[] = null;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(findRooms(price, persons, city, hotel))) roomIsFound = new Room[i];
        }
        return roomIsFound;
    }
}
