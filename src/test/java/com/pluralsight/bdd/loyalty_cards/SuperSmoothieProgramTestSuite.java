package com.pluralsight.bdd.loyalty_cards;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features.loyalty_cards",
        glue="com.pluralsight.bdd"
)
public class SuperSmoothieProgramTestSuite {
}
