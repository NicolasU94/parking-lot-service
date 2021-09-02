package com.parking.parklot.model;

public class SpotPlace {

    private Spot spot;
    private Vehicle vehicle;
    private String vehicleId;

    public SpotPlace(Spot spot) {
        this.spot = spot;
    }

    public SpotPlace(Spot spot, Vehicle vehicle, String vehicleId) {
        this.spot = spot;
        this.vehicle = vehicle;
        this.vehicleId = vehicleId;
    }

    public Spot getSpot() {
        return spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getVehicleId() {
        return vehicleId;
    }

}
