package Runner;

import org.testng.annotations.DataProvider;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/resources/Features",
glue = "Steps",
monochrome = true
		)


public class Run extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
}
}