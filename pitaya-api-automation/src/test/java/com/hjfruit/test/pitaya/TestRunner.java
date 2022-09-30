package com.hjfruit.test.pitaya;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,features = {"src/test/resources/Features"},
        glue = "com.hjfruit.test.pitaya",publish = true)
public class TestRunner {
}
