package org.example.taskfawry;
import org.example.taskfawry.enums.VehicleType;
import org.example.taskfawry.model.Fine;
import org.example.taskfawry.model.Observation;
import org.example.taskfawry.model.Violation;
import org.example.taskfawry.rules.SeatbeltRule;
import org.example.taskfawry.rules.SpeedRule;
import org.example.taskfawry.service.Radar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Radar radar = new Radar(List.of(
                new SeatbeltRule(),
                new SpeedRule()
        ));

        List<Fine> fines = new ArrayList<>();

        Observation observation1 = new Observation(
                "ABC1234",
                LocalDate.now(),
                VehicleType.PRIVATE,
                94,
                false);

        Observation observation2 = new Observation(
                "XYZ5678",
                LocalDate.now(),
                VehicleType.TRUCK,
                75,
                true);

        fines.add(radar.scan(observation1));
        fines.add(radar.scan(observation2));
        //fines.add(radar.scan(observation3));

        for (Fine fine : fines) {
            fine.print();
            System.out.println();
        }

        System.out.println("All Fines:");
        for (Fine fine : fines) {
            System.out.println(fine.getPlateNumber()
                    + " : "
                    + fine.getTotalAmount()
                    + " EGP");
        }

        Map<String, Integer> count = new HashMap<>();

        int speedCount = 0;
        int seatbeltCount = 0;
        for (Fine fine : fines) {
            for (Violation violation : fine.getViolations()) {
                if (violation.getMessage().startsWith("speed")) {
                    speedCount++;
                }
                if (violation.getMessage().equals("Seatbelt not fastened")) {
                    seatbeltCount++;
                }}
        }
        System.out.println("\nViolated Rules:");
        System.out.println("Speed Rule : " + speedCount);
        System.out.println("Seatbelt Rule : " + seatbeltCount);
}}
