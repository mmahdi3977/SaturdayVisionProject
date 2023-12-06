package upskill.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	@After //hook
	public void afterActions(Scenario Scenario) throws Exception {
		
		
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, browser Closed");
	
	}

}

