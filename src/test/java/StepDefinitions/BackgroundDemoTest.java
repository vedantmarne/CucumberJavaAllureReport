package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
    glue = {"StepsForBackground"},
    plugin = {
        "pretty",
        "html:target/HtmlReports/report.html",
        "json:target/JsonReports/report.json",
        "junit:target/JUnitReports/report.xml",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
    }
)
public class BackgroundDemoTest {   
}
