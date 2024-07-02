package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
                glue="stepDefinitions",
//                tags =  "@web and not @rest",
                plugin = {
                        "pretty", "html:target/cucumber-report.html",
                        "json:target/cucumber-json.json",
                        "junit:target/cucumber-junit.xml"
                },
                dryRun = true,
                monochrome = true,
                snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {

}



