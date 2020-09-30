package com.vano;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"},
        monochrome = true, features = "src/main/resources/features",
        glue = "com.vano.steps", tags = "@all",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunCucumberTest {
}
