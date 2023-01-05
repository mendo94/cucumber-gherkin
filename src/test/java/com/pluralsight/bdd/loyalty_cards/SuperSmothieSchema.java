package com.pluralsight.bdd.loyalty_cards;


import java.util.HashMap;
import java.util.Map;

public class SuperSmothieSchema {
    private Map<String, Integer> pointsPerCategory = new HashMap<>();

    public void setPointsPerCategory(String category, Integer points) {
        pointsPerCategory.put(category, points);
    }
}
