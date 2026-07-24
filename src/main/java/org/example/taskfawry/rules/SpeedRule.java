package org.example.taskfawry.rules;

import org.example.taskfawry.model.Observation;
import org.example.taskfawry.model.Violation;

public class SpeedRule  implements Rule {
    @Override
   public Violation check (Observation observation) {
        int maxSpeed=observation.getVehicleType().getMaxSpeed();
        if(observation.getSpeed()>maxSpeed){
            return new Violation(
                    "speed of " + observation.getSpeed()
                            + " exceeded max allowed "
                            + maxSpeed,
                    300
            );
        }

        return null;
    }
}