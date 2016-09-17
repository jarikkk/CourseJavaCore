package task5_3;

import task5_1_and_5_2.Room;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
