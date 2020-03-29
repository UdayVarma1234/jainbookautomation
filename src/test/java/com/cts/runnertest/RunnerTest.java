package com.cts.runnertest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/feature/PlacingOder.feature"},glue = {"com/cts/stepdefinitions"},plugin= {"html:reports/"} )
@RunWith(Cucumber.class)
public class RunnerTest {
	
}