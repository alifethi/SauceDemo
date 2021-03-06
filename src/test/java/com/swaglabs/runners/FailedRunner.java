package com.swaglabs.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt",
        glue = "com.swaglabs.steps",
        plugin = {"pretty"}
)
public class FailedRunner {

}
