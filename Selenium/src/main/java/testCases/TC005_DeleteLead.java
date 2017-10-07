package testCases;

import org.testng.annotations.Test;
import wrappers.ProjectWrappers;

public class TC005_DeleteLead extends ProjectWrappers{

	@Test
	public void duplicatelead() throws InterruptedException{
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Phone']");
		enterByName("phoneNumber", "9994870420");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(2000);
		String value = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Delete");
		Thread.sleep(2000);
		clickByLink("Find Leads");
		enterByName("id",value);
		clickByXpath("//button[text()='Find Leads']");
		verifyTextByXpath("//div[text()='No records to display']", "No records to display");	
	}
}
