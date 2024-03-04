package de.propra.thymeleafteaenjoyers.roommate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class Room {
    private final UUID ID = randomUUID();
    private final String building;
    private final String floor;
    private final String roomNumber;
    private final int numberOfSockets;
    private final boolean hasPrinter;
    private final boolean hasStandingDesk;
    private final boolean accessibility;


    public Location getLocation() {
        return location;
    }

    private final  Location location;

    public UUID getID() {
        return ID;
    }

    public String getBuilding() {
        return building;
    }

    public String getFloor() {
        return floor;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfSockets() {
        return numberOfSockets;
    }
    public boolean hasPrinter() {
        return hasPrinter;
    }

    public boolean hasStandingDesk() {
        return hasStandingDesk;
    }

    public boolean isAccessable() {
        return accessibility;
    }



    public Room( Location location, HardwareFeatures hardwareFeatures, Boolean accessibility) {
        this.building = location.getBuilding();
        this.floor = location.getFloor();
        this.roomNumber = location.getRoomNumber();
        this.numberOfSockets = hardwareFeatures.getNumberOfSockets();
        this.hasPrinter = hardwareFeatures.hasPrinter();
        this.hasStandingDesk = hardwareFeatures.hasStandingDesk();
        this.accessibility = accessibility;
        this.location = location;
    }
    public List<String> getAttributes()
    {
        List<String> attributes = new ArrayList<>();
        attributes.add(""+this.getID());
        attributes.add(this.getBuilding());
        attributes.add(this.getFloor());
        attributes.add(this.getRoomNumber());
        attributes.add(this.getNumberOfSockets()+"");
        attributes.add(this.hasPrinter()+"");
        attributes.add(this.hasStandingDesk()+"");
        attributes.add(this.isAccessable()+"");
        return  attributes;
    }


}
