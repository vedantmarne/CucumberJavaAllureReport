package StepDefinitions;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
glue= {"StepsForBackground"},
monochrome=true,
plugin={/*"pretty","junit:target/JUnitReports/report.xml",*/
		"pretty",
        "html:target/HtmlReports/report.html",
        "json:target/JsonReports/report.json",
        "junit:target/JUnitReports/report.xml",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }// Allure plugin
)
public class TestRunnerForBackgroundDemo {

}
