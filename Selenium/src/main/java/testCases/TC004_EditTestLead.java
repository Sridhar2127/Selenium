package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC004_EditTestLead extends GenericWrappers{
	@Test
	public void editlead() throws InterruptedException{
		invokeApp("chrome","http://leaftaps.com/opentaps");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Name and ID']");
		enterByXpath("(//input[@name='firstName'])[3]","Sridhar");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(2000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTitle("View Lead");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", "Revolution New");
		clickByXpath("//input[@value='Update']");
		verifyTextContainsByXpath("//span[@id='viewLead_companyName_sp']","Revolution New");
		closeBrowser();	
	}

}
