package RunnerFiles;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\NARMAE\\eclipse-workspace\\OrangeHRMautomation\\src\\test\\java\\featureFiles\\PIM.feature"}, 
glue={"stepDefinitionFiles"},plugin = {"pretty" , "html:target/PIM_report.html"})

public class PIMrunner {

}
