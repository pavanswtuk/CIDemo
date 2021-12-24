package co.uk.mailnewspapers.ci;

import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"classpath:features/"},
        glue={"co.uk.mailnewspapers.ci"},
        plugin = {"pretty", "summary"}, dryRun = true, monochrome=true)
public class Hooks {

    @Before
    public void init(Scenario scenario){
        System.out.println(scenario+" - Running...");
        open("https://www.saucedemo.com/");
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println(scenario.getName()+" - Completed");
    }

    }

