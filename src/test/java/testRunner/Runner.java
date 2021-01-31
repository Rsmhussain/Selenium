package testRunner;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions
		(
		features="Feature",
		glue={"stepDefinitions"},
		dryRun = false, 
	    strict = false,      
	    monochrome = true,
		tags={"@Login"}
		)	
public class Runner 
{

}
