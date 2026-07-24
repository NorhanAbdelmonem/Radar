package org.example.taskfawry.service;

import org.example.taskfawry.model.Fine;
import org.example.taskfawry.model.Observation;
import org.example.taskfawry.rules.Rule;
import org.example.taskfawry.model.Violation;

import java.util.List;

public class Radar {

    private final List<Rule> rules;

    public Radar(List<Rule> rules) {
        this.rules = rules;
    }

    public Fine scan(Observation observation) {

        Fine fine = new Fine(observation.getPlateNumber());

        for (Rule rule : rules) {

            Violation violation = rule.check(observation);

            if (violation != null) {
                fine.addViolation(violation);
            }

        }

        return fine;
    }

}