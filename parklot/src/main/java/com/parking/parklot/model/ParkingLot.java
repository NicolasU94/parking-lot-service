package com.parking.parklot.model;

import java.util.List;

public class ParkingLot {

private List<SpotPlace> freeSpots;
private List<SpotPlace> busySpots;

    public void create (List<SpotPlace> spots) {

    }

    public List<SpotPlace> getFreeSpots() {
        return freeSpots;
    }

    public List<SpotPlace> getBusySpots() {
        return busySpots;
    }


    public int getRemainingSpots(){

        int freeplaces = this.freeSpots.size();
        return freeplaces;
    }

    public int getTotalSpots(){

        int totalSpots = this.busySpots.size() + this.freeSpots.size();

        return totalSpots;
    }

    public int getTotalBusy(){

        int busyPlaces = this.busySpots.size();

        return busyPlaces;
    }

    

}
