package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/login.feature",glue= {"stepdefination"}, monochrome=true,
plugin={"pretty","json:target/JsonReports/json.json"})
//plugin= {"pretty","html:target/HtmlReports"}
//plugin= {"pretty","junit:target/JunitReports/report.xml"}



public class TestRunner {

	
}

