package com.parking.parklot.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class ParkingLot {

private List<SpotPlace> freeSpots;
private List<SpotPlace> busySpots;

    public ParkingLot(List<SpotPlace> freeSpots) {
        this.freeSpots = freeSpots;
        this.busySpots = new ArrayList<SpotPlace>();

    }

    public List<SpotPlace> getFreeSpots() {
        return freeSpots;
    }

    public List<SpotPlace> getBusySpots() {
        return busySpots;
    }


    public int getRemainingSpots(Spot spot){

        int freeplaces = 0;
        for (SpotPlace mySpot: this.freeSpots) {

            if (mySpot.getSpot().equals(spot)) freeplaces++;
        }

        return freeplaces;

    }


    public int getTotalFreeSpots(){

        return this.freeSpots.size();


    }


    public int getTotalSpots(){

        int totalSpots = this.busySpots.size() + this.freeSpots.size();

        return totalSpots;
    }

    public int getTotalBusy(){

        int busyPlaces = this.busySpots.size();

        return busyPlaces;
    }

    public boolean isFull(){

        boolean isFull = false;

        if (freeSpots.size() == 0) isFull = true;

        return isFull;

    }

    public boolean isEmpty(){

        boolean isEmpty = false;

        if (this.busySpots.size() == 0) isEmpty = true;

        return isEmpty;
    }


}
