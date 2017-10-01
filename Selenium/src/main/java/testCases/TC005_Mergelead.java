package testCases;

import org.junit.Test;
import wrappers.GenericWrappers;

public class TC005_Mergelead extends GenericWrappers {

	@Test
	public void merge() throws Exception {
		invokeApp("chrome","http://leaftaps.com/opentaps");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		Thread.sleep(3000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		Thread.sleep(2000);
		switchToParentWindow();
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		Thread.sleep(3000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a");	
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		acceptAlert();
	}

}
