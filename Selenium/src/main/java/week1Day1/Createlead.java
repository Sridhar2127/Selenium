package week1Day1;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createlead {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","/Users/srajendran/Desktop/drivers/ChromeDriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Engravers");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sridhar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajendran");
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Direct Mail");
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Automobile");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sri");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("21");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Quality");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Myown");
		driver.findElementById("createLeadForm_currencyUomId").sendKeys("INR - Indian Rupee");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("3,00,000");
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Computer Hardware");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Partnership");
		driver.findElementByName("sicCode").sendKeys("234");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Breakfast");
		driver.findElementById("createLeadForm_description").sendKeys("Consists of my own team data");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Highly confidential!!");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("12");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("0413");
	
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9894970410");
		driver.findElementByClassName("inputBox").sendKeys("4");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("2017");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Omprakash");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sridhar@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("facebook.com/Sridhar");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Sri");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("sraj");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("H68/T5");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Raju street");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("India");
		Thread.sleep(1000);
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("TAMILNADU");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600041");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("041");	
//		driver.findElementByName("submitButton").click();	
	}

}

