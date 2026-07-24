package org.example.taskfawry.rules;

import org.example.taskfawry.model.Observation;
import org.example.taskfawry.model.Violation;

public interface Rule {
    Violation check(Observation observation);
}
