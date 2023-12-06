package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCartActions;

public class EbayCartSteps {
	
	EbayCartActions EbayCartActionsObject = new EbayCartActions();
	
	@When("^Select Size$")
	public void select_Size() throws Throwable {
	    EbayCartActionsObject.switchNewWindow();
	    EbayCartActionsObject.ddSizeType();
	}

	@When("^Select Men Size$")
	public void select_Men_Size() throws Throwable {
		EbayCartActionsObject.ddMenSize();
	}

	@When("^Select Shade$")
	public void select_Shade() throws Throwable {
		EbayCartActionsObject.ddShade();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		EbayCartActionsObject.shirtQty();
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartActionsObject.addToCart();
	}

}
