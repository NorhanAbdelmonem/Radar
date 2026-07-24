package org.example.taskfawry.model;

import org.example.taskfawry.enums.VehicleType;

import java.time.LocalDate;

public class Observation {

   private String plateNumber;
    private LocalDate date;
    private VehicleType vehicleType;
    private int speed;
    private boolean seatbeltFastened;

    public Observation(String plateNumber,
                       LocalDate date, VehicleType vehicleType,
                       int speed, boolean seatbeltFastened) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.vehicleType = vehicleType;
        this.speed = speed;
        this.seatbeltFastened = seatbeltFastened;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isSeatbeltFastened() {
        return seatbeltFastened;
    }
}
