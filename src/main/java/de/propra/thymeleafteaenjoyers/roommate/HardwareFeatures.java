package de.propra.thymeleafteaenjoyers.roommate;

public class HardwareFeatures {
    private final boolean hasPrinter;
    private final boolean hasStandingDesk;
    private final int numberofSockets;

    public HardwareFeatures(boolean hasPrinter, boolean hasStandingDesk, int numberofSockets) {
        this.hasPrinter = hasPrinter;
        this.hasStandingDesk = hasStandingDesk;
        this.numberofSockets = numberofSockets;
    }

    public boolean hasPrinter() {
        return hasPrinter;
    }

    public boolean hasStandingDesk() {
        return hasStandingDesk;
    }

    public int getNumberOfSockets() {
        return numberofSockets;
    }
}
