package com.example.vamosystask.model;

import java.util.List;

public class Data {
    public List<VehicleLocations> vehicleLocations;

    public Data(List<VehicleLocations> vehicleLocations) {
        this.vehicleLocations = vehicleLocations;
    }

    public List<VehicleLocations> getVehicleLocations() {
        return vehicleLocations;
    }

    public void setVehicleLocations(List<VehicleLocations> vehicleLocations) {
        this.vehicleLocations = vehicleLocations;
    }
}


