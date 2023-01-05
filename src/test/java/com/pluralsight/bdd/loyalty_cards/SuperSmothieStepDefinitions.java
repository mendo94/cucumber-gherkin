package com.pluralsight.bdd.loyalty_cards;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class SuperSmothieStepDefinitions  {

    private DrinkCatalog drinkCatelog;
    private SuperSmothieSchema superSmothieSchema;
    private MorningFreshnessMember michael;
    @Given("the following drink categories:")
    public void the_following_drink_categories(List<Map<String, String>> drinkCategory) {
        drinkCategory.stream().forEach(
                drinkCategory -> {
                    String drink = drinkCategory.get("Drink");
                    String category = drinkCategory.get("Category");
                    Integer points = Integer.parseInt(drinkCategory.get("Points"));

                    drinkCategory.addDrink(drink, category);
                    superSmoothieSchema.setPointsPerCategory(category, points);

                }
        );
    }

    @Given("^(.*) is a Morning Freshness Member$")
    public void michael_is_a_Morning_Freshness_Member(String name) {
        michael = new MorningFreshnessMember(name);
    }

    @When("^(.*) purchases (\\d+) (.*) drinks?")
    public void michael_purchases_Banana_drinks(String name, Integer amount, String drink) {
    }

    @Then("he should earn {int} points")
    public void he_should_earn_points(Integer expectedPoints) {
    }
}
