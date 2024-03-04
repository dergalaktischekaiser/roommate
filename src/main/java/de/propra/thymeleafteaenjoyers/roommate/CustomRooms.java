package de.propra.thymeleafteaenjoyers.roommate;
import java.util.ArrayList;
import java.util.List;

public class CustomRooms {
    static Location customLocation1 = new Location("Building5A", "19","13");
    static Location customLocation2 = new Location("Building5B","2", "65b");
    static Location customLocation3 = new Location("Building1B","U:1", "123");
    static Location customLocation4 = new Location("Building6C","U:4", "1");
    static Location customLocation5= new Location("Building2B","1", "34");
    static Location customLocation6 = new Location("Building3A","0", "61c");
    static Location customLocation7 = new Location("Building4A","3", "5");
    static Location customLocation8 = new Location("Building6B","1", "75");
    static Location customLocation9 = new Location("Building2C","2", "56");
    static Location customLocation10 = new Location("Building1A","6", "15");

    static HardwareFeatures customHardwareFeatures1 = new HardwareFeatures( false, false, 5);
    static HardwareFeatures customHardwareFeatures2 = new HardwareFeatures( true, false, 5);
    static HardwareFeatures customHardwareFeatures3 = new HardwareFeatures( false, false, 3);
    static HardwareFeatures customHardwareFeatures4 = new HardwareFeatures( false, true, 2);
    static HardwareFeatures customHardwareFeatures5 = new HardwareFeatures( true, false, 1);
    static HardwareFeatures customHardwareFeatures6= new HardwareFeatures( false, true, 4);
    static HardwareFeatures customHardwareFeatures7 = new HardwareFeatures( false, false, 10);
    static HardwareFeatures customHardwareFeatures8 = new HardwareFeatures( true, false, 7);
    static HardwareFeatures customHardwareFeatures9 = new HardwareFeatures( true, true, 3);
    static HardwareFeatures customHardwareFeatures10 = new HardwareFeatures( false, true, 1);

    static Room customRoom1 = new Room(customLocation1,customHardwareFeatures1,false);
    static Room customRoom2 = new Room(customLocation2,customHardwareFeatures2,true);
    static Room customRoom3 = new Room(customLocation3,customHardwareFeatures3,false);
    static Room customRoom4 = new Room(customLocation4,customHardwareFeatures4,true);
    static Room customRoom5 = new Room(customLocation5,customHardwareFeatures5,false);
    static Room customRoom6 = new Room(customLocation6,customHardwareFeatures6,true);
    static Room customRoom7 = new Room(customLocation7,customHardwareFeatures7,false);
    static Room customRoom8 = new Room(customLocation8,customHardwareFeatures8,true);
    static Room customRoom9 = new Room(customLocation9,customHardwareFeatures9,false);
    static Room customRoom10 = new Room(customLocation10,customHardwareFeatures10,true);

    public static List<Room> getCustomRooms()
    {
        List<Room> rooms = new ArrayList<>();
        rooms.add(customRoom1);
        rooms.add(customRoom2);
        rooms.add(customRoom3);
        rooms.add(customRoom4);
        rooms.add(customRoom5);
        rooms.add(customRoom6);
        rooms.add(customRoom7);
        rooms.add(customRoom8);
        rooms.add(customRoom9);
        rooms.add(customRoom10);
        return rooms;
    }

    // :TODO createRandomRoomNeu Schreiben da sich die Room Methode geändert hat und das hier eh Müll war
   // :TODO Können Mirna und Paul machen


}

