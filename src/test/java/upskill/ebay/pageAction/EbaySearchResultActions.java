package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObject;
	
	public EbaySearchResultActions() {
		EbaySearchResultLocatorsObject = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObject);
	}
	
	public void verifyShoesItems() {
		
		// option 1
		Assert.assertTrue(EbaySearchResultLocatorsObject.txtShoes.isDisplayed());
		// option 2
		Assert.assertEquals(EbaySearchResultLocatorsObject.txtShoes.getText(), "Shoes");
	}
	
	public void verifyPantsItems() {
		
		// option 1
		Assert.assertTrue(EbaySearchResultLocatorsObject.txtPants.isDisplayed());
		// option 2
		Assert.assertEquals(EbaySearchResultLocatorsObject.txtPants.getText(), "Pants");
	}
	
	public void verifyShirtsItems() {
		
		// option 1
		Assert.assertTrue(EbaySearchResultLocatorsObject.txtShirts.isDisplayed());
		// option 2
		Assert.assertEquals(EbaySearchResultLocatorsObject.txtShirts.getText(), "Shirts");
	}
	
	// By Brands
	public void filterBrand(String Brand) {
		if (Brand.equals("Adidas")) {
			EbaySearchResultLocatorsObject.cbxBrandAdidas.click();
		} else if (Brand.equals("Nike")) {
			EbaySearchResultLocatorsObject.cbxBrandNike.click();
		} else if (Brand.equals("Unbranded")) {
			EbaySearchResultLocatorsObject.cbxBrandUnbranded.click();
		} else {
			System.out.println("Brand not selected/found");
		}
	}
	
	public void verifyBrandItems(String Brand) {
		if (Brand.equals("Adidas")) {
			Assert.assertTrue(EbaySearchResultLocatorsObject.txtShirts.isDisplayed());
		} else if (Brand.equals("Shoes")) {
			Assert.assertTrue(EbaySearchResultLocatorsObject.txtShoes.isDisplayed());
		} else if (Brand.equals("Pants")) {
			Assert.assertTrue(EbaySearchResultLocatorsObject.txtPants.isDisplayed());
		} else {
			System.out.println("Brand not found");
		}
	}
	
	// By Colors
	public void filterColor(String color) {
		if (color.equals("Black")) {
			EbaySearchResultLocatorsObject.cbxColorBlack.click();
		} else if (color.equals("White")) {
			EbaySearchResultLocatorsObject.cbxColorWhite.click();
//		} else if (color.equals("Blue")) {
//			EbaySearchResultLocatorsObject.cbxColorBlue.click();
		} else {
			System.out.println("Color not selected/found");
		}
	}
	
	public void verifyColorItems(String color) {
		if (color.equals("Black")) {
			Assert.assertTrue(EbaySearchResultLocatorsObject.txtShoes.isDisplayed());
		} else if (color.equals("White")) {
			Assert.assertTrue(EbaySearchResultLocatorsObject.txtShirts.isDisplayed());
//		} else if (color.equals("Blue")) {
//			Assert.assertTrue(EbaySearchResultLocatorsObject.txtPants.isDisplayed());
		} else {
			System.out.println("Color not found");
		}
	}
	
	public void selectCottonTee() {
		EbaySearchResultLocatorsObject.linkShirtItems.click();
	}
}
