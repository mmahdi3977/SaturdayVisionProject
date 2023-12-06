package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObject = new EbayHomePageActions();
	
	@Given ("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		// page loading in setup driver class
	}
	
	@When ("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObject.searchShoes();
	}
	
	@When("^Search for pants$")
	public void search_for_pants() throws Throwable {
		EbayHomePageActionsObject.searchPants();
	}
	
	@When("^Search for shirts$")
	public void search_for_shirts() throws Throwable {
		EbayHomePageActionsObject.searchShirts();
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String Items) throws Throwable {   
		EbayHomePageActionsObject.searchItems(Items);
	}
	
	@Given("^Search for Big & Tall Cotton Tee$")
	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
		EbayHomePageActionsObject.searchItems("Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT");
	}
	
	@When("^Mouse Hover to My eBay Summary$")
	public void mouse_Hover_to_My_eBay_Summary() throws Throwable {
		EbayHomePageActionsObject.mouseHoverMyEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomePageActionsObject.clickSummary();
	}
}
