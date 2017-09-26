package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC003_DuplicateTestLead extends GenericWrappers{
	@Test
	public void editLead() throws InterruptedException{
		invokeApp("chrome","http://leaftaps.com/opentaps");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");	
		clickByXpath("//span[text()='Email']");
		enterByName("emailAddress","sridhar@gmail.com");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(2000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickByLink("Duplicate Lead");
		verifyTextById("sectionHeaderTitle_leads","Duplicate Lead");
		clickByClassName("smallSubmit");
		verifyTextById("createLeadForm_firstName","Sridhar");
		closeBrowser();
	}

}
