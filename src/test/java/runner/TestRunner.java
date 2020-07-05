package runner;

import io.cucumber.testng.CucumberOptions;
import tests.business.TestBase;

@CucumberOptions(
        features = "src/test/java/features/BusinessUserCreateNewShipments.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"})
public class TestRunner extends TestBase {

}