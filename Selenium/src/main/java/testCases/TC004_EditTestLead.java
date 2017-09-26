package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC004_EditTestLead extends GenericWrappers{
	@Test
	public void editlead(){
		invokeApp("chrome","http://leaftaps.com/opentaps");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("//div[@id ='x-form-el-ext-gen256']","Sridhar");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTextById("sectionHeaderTitle_leads","View Lead");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", "Revolution New");
		clickByXpath("//input[@value='Update']");
		verifyTextContainsByXpath("//span[@id='viewLead_companyName_sp']","Revolution New");
		closeBrowser();	
	}

}
