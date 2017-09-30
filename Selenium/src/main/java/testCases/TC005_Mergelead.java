package testCases;

import org.junit.Test;
import wrappers.GenericWrappers;

public class TC005_Mergelead extends GenericWrappers {

	@Test
	public void merge() throws InterruptedException {
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		verifyTextContainsByXpath("//h2[contains(text(),'Welcome')]", "Welcome Demo Sales Manager");
		clickByLink("CRM/SFA");
		clickByLink("Leads");

	}

}
