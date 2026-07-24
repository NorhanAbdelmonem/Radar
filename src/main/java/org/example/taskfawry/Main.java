package org.example.taskfawry;

import org.example.taskfawry.enums.VehicleType;
import org.example.taskfawry.model.Fine;
import org.example.taskfawry.model.Observation;
import org.example.taskfawry.rules.SeatbeltRule;
import org.example.taskfawry.rules.SpeedRule;
import org.example.taskfawry.service.Radar;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Observation observation = new Observation(

                "ABC1234",

                LocalDate.now(),

                VehicleType.PRIVATE,

                94,

                false

        );

        Radar radar = new Radar(List.of(

                new SeatbeltRule(),
                new SpeedRule()



        ));

        Fine fine = radar.scan(observation);

        fine.print();

    }

}
