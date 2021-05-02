package com.example.vamosystask.model;

public class VehicleLocations {
    public String regNo,lastSeen,fuelLitre,odoDistance,status,temperature,speed;

    public VehicleLocations(String regNo, String lastSeen, String fuelLitre, String odoDistance, String status, String temperature, String speed) {
        this.regNo = regNo;
        this.lastSeen = lastSeen;
        this.fuelLitre = fuelLitre;
        this.odoDistance = odoDistance;
        this.status = status;
        this.temperature = temperature;
        this.speed = speed;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getFuelLitre() {
        return fuelLitre;
    }

    public void setFuelLitre(String fuelLitre) {
        this.fuelLitre = fuelLitre;
    }

    public String getOdoDistance() {
        return odoDistance;
    }

    public void setOdoDistance(String odoDistance) {
        this.odoDistance = odoDistance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
