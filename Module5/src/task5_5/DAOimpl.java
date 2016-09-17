package task5_5;

import task5_1_and_5_2.Room;

public class DAOimpl implements DAO {

    @Override
    public Room save(Room room) {
        if (room != null) System.out.println("Room is saved" + room.toString());
        return room+room;
    }

    @Override
    public boolean delete(Room room) {
        if (room != null) room = null;
        System.out.println("Room is deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        if (room != null) System.out.println("Room is saved: " + room.toString());
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 0, 0, null, null, null);
        System.out.println("Room is found: " + room.toString());
        return room;
    }
}
