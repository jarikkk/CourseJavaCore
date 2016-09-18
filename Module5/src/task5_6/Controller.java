package task5_6;


import task5_1_and_5_2.Room;
import task5_3.API;
import task5_4.BookingComAPI;
import task5_4.GoogleAPI;
import task5_4.TripAdvisorAPI;

public class Controller {

    private API apis[] = new API[3];


    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[1] = tripAdvisorAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[2] = googleAPI;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){


        Room [] rooms = new Room[15];

        Room [] res1 = apis[0].findRooms(price, persons, city, hotel);
        Room [] res2 = apis[1].findRooms(price, persons, city, hotel);
        Room [] res3 = apis[2].findRooms(price, persons, city, hotel);


        resToArray(res1, rooms);
        resToArray(res2, rooms);
        resToArray(res3, rooms);

        return rooms;
    }

    public Room[] check(API api1, API api2){
        //api1.findRooms(0, 0, null, null);
        int roomsCount = 0;
        Room [] rooms = new Room[roomsCount];

        Room res1[] = api1.getAll();
        Room res2[] = api2.getAll();

        for (int i = 0; i < res1.length; i++){
            for(int j = 0; j < res2.length; j++){
                if (res1[i] == res2[i]);
            }
        }


        return null;
    }

    public void resToArray(Room [] res, Room [] rooms){

        for (int i = 0; i < res.length; i++){
            if (res[i] != null) {

                rooms[i] = res[i];
            }
        }
       
    }

}
