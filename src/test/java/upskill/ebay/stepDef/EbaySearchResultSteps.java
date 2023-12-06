package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObject = new EbaySearchResultActions();
	
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResultActionsObject.verifyShoesItems();
	}
	
	@Then("^Item list should have only pants related products$")
	public void item_list_should_have_only_pants_related_products() throws Throwable {
		EbaySearchResultActionsObject.verifyPantsItems();
	}
	
	@Then("^Item list should have only shirts related products$")
	public void item_list_should_have_only_shirts_related_products() throws Throwable {
		EbaySearchResultActionsObject.verifyShirtsItems();
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String Brand) throws Throwable {
	    EbaySearchResultActionsObject.filterBrand(Brand);
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String Brand) throws Throwable {
	    EbaySearchResultActionsObject.verifyBrandItems(Brand);
	}
	
	@When("^Specific color of \"([^\"]*)\"$")
	public void specific_color_of(String color) throws Throwable {
		EbaySearchResultActionsObject.filterColor(color);
	}

	@Then("^Item list should have \"([^\"]*)\"$")
	public void item_list_should_have(String color) throws Throwable {
		EbaySearchResultActionsObject.verifyColorItems(color);
	}
	
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObject.selectCottonTee();
	}
	
}
