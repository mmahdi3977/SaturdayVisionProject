package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {


	@Before //hook														// before action will run before executing any scenario
	public void beforeActions(Scenario scen) {

		System.out.println("--->>>> Initializing Driver"); 				// get cucumber scenario parameter for feature file name 
		SetupDrivers.setupDriver();										// calling setup driver method to execute before scenario
		
		System.out.println("Test Scenario Name: " + scen.getName());

	}

}