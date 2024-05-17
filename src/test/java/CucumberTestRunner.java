import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:reports/test-report.html"}, features = "src/test/resources/features")
public class CucumberTestRunner {
}
