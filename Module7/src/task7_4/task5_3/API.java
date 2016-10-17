package task7_4.task5_3;

import task7_4.task5_1_and_5_2.Room;

import java.util.ArrayList;

public interface API {
   ArrayList<Room> findRooms(int price, int persons, String city, String hotel);
    ArrayList<Room> getAll();
}
