package org.example.taskfawry.model;

import java.util.ArrayList;
import java.util.List;

public class Fine {

    private String plateNumber;

    private List<Violation> violations = new ArrayList<>();

    public Fine(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void addViolation(Violation violation) {
        violations.add(violation);
    }
    public String getPlateNumber() {
        return plateNumber;
    }
    public List<Violation> getViolations() {
        return violations;
    }

    public int getTotalAmount() {

        int total = 0;

        for (Violation violation : violations) {
            total += violation.getAmount();
        }

        return total;
    }

    public void print() {

        System.out.println("Traffic fine for car " + plateNumber);

        System.out.println("Total amount: "
                + getTotalAmount()
                + " EGP");

        System.out.println("Violations:");

        violations.forEach(v ->

                System.out.println("- "
                        + v.getMessage()
                        + " : "
                        + v.getAmount()
                        + " EGP"));

    }

}