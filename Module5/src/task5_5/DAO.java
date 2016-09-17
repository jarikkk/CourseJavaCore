package task5_5;

import task5_1_and_5_2.Room;

public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    

}
