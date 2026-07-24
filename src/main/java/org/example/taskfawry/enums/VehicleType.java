package org.example.taskfawry.enums;

public enum VehicleType {
PRIVATE(80),TRUCK(60),BUS(70);
    private final int maxSpeed;
VehicleType(final int maxSpeed) {
    this.maxSpeed=maxSpeed;
}

public int getMaxSpeed() {
    return maxSpeed;
}

}
