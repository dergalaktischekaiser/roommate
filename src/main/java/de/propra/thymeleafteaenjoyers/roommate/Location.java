package de.propra.thymeleafteaenjoyers.roommate;

public class Location {
    private final String Building;
    private final String Floor;
    private final String RoomNumber;

    public Location(String building, String floor, String roomNumber) {
        Building = building;
        Floor = floor;
        RoomNumber = roomNumber;
    }
    public String getBuilding() {
        return Building;
    }
    public String getFloor() {
        return Floor;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

}
