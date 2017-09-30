package testCases;

import org.junit.Test;
import wrappers.GenericWrappers;

public class TC002_CreateTestLead extends GenericWrappers {

	@Test
	public void login() throws InterruptedException {
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
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");
		enterById("createLeadForm_firstNameLocal","Sri");
		enterById("createLeadForm_lastNameLocal", "Ram");
		enterById("createLeadForm_personalTitle", "Quality");
		enterById("createLeadForm_generalProfTitle", "Automation");
		enterById("createLeadForm_departmentName", "QA");
		enterById("createLeadForm_annualRevenue", "3,50,000");	
		selectVisibileTextById("createLeadForm_currencyUomId", "INR - Indian Rupee");
		selectVisibileTextById("createLeadForm_industryEnumId", "Finance");
		enterById("createLeadForm_numberEmployees", "130");	
		selectVisibileTextById("createLeadForm_ownershipEnumId", "Partnership");
		enterById("createLeadForm_sicCode", "402");
		enterById("createLeadForm_primaryPhoneAreaCode", "TN");
		enterById("createLeadForm_tickerSymbol", "Symbol");
		enterById("createLeadForm_description", "Team information");
		enterById("createLeadForm_importantNote", "Highly Confidential");
		enterById("createLeadForm_primaryPhoneCountryCode", "12");
		enterById("createLeadForm_primaryPhoneNumber", "9994870420");
		enterById("createLeadForm_primaryPhoneExtension", "044");
		enterById("createLeadForm_primaryPhoneAskForName", "Omprakash");
		enterById("createLeadForm_primaryEmail", "sridhar@gmail.com");
		enterById("createLeadForm_primaryWebUrl", "facebook.com/Sridhar");
		enterById("createLeadForm_generalToName", "Sri");
		enterById("createLeadForm_generalAttnName", "Sraj");
		enterById("createLeadForm_generalAddress1", "H68/G3");
		enterById("createLeadForm_generalAddress2", "Kamaraj Street");
		Thread.sleep(1000);
		selectVisibileTextById("createLeadForm_generalCountryGeoId", "India");
		Thread.sleep(1000);
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId", "TAMILNADU");
		enterById("createLeadForm_generalCity", "Chennai");
		enterById("createLeadForm_generalPostalCode", "600041");
		enterById("createLeadForm_generalPostalCodeExt", "041");
		clickByClassName("smallSubmit");
		verifyTextById("viewLead_firstName_sp","Sridhar");	
	}
}
