package org.example.taskfawry.rules;

import org.example.taskfawry.model.Observation;
import org.example.taskfawry.model.Violation;

public class SeatbeltRule implements Rule {

    @Override
   public Violation check(Observation observation){
     if(!observation.isSeatbeltFastened()){
         return new Violation(
                 "Seatbelt not fastened",
                 100
         );
     }


        return null;
    }

}
