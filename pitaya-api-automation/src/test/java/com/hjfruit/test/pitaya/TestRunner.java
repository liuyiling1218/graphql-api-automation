package com.hjfruit.test.pitaya;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@SpringBootTest(classes = PitayaApiAutomationApplication.class)
@CucumberOptions(monochrome = true,features = {"src/test/resources/Features"},
        glue = "com.hjfruit.test.pitaya",publish = true)
public class TestRunner {
}
