package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"Defination"})
public class FireCucumber {
	public static void main(String args[])
	{
		
	}
	
	

}
