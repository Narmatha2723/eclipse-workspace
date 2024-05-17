package runnerfile;
    import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features={"C:\\Users\\NARMAE\\eclipse-workspace\\xyzBank\\src\\test\\java\\feature\\addcustomer.feature"},
	glue={"stepdef"},
	plugin = {"pretty" , "html:target/addedcustomer_report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
	)

   public class addcustomerrunner  {

	}



