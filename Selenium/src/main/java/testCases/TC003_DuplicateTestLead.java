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
		Thread.sleep(1000);
		String name = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickByLink("Duplicate Lead");
		verifyTitle("Duplicate Lead");
		clickByClassName("smallSubmit");
		verifyTextById("viewLead_firstName_sp",name);
		closeBrowser();
	}

}
