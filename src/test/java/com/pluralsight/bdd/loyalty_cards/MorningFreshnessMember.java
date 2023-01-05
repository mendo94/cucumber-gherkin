package com.pluralsight.bdd.loyalty_cards;

import static org.assertj.core.api.Assertions.assertThat;

public class MorningFreshnessMember {
    private String name;
    private SuperSmothieSchema schema;
    private int points;

    public MorningFreshnessMember(String name, SuperSmothieSchema schema) {
        this.name = name;
        this.schema = schema;
    }

    public void orders(Integer amount, String drink) {
        points += schema.getPointsFor(drink) * amount;
    }

    public int getPoints() {
        return points;
    }
}
