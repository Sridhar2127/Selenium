package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC002_CreateTestLead extends GenericWrappers {

	@Test
	public void login() {
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "Revolution");
		enterById("createLeadForm_firstName","Sridhar");
		enterById("createLeadForm_lastName","R");
		selectVisibileTextById("createLeadForm_dataSourceId","Employee");
		clickByClassName("smallSubmit");
		verifyTextById("viewLead_firstName_sp","Sridhar");
		
	}
}
