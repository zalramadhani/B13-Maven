package com.runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (
					features = "src/test/resources/smoke/SmokeTest.feature",
					glue = "com.steps",
					plugin = {"pretty",
					"json:target/cucumber.json",
					"html:target/cucumber.html"}
				)


public class Runner {

}



/** 

example of maven goal


		clean -Dtest=Runner test
*/