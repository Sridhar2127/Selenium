package week1Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/srajendran/Desktop/drivers/ChromeDriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("FirstData");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sridhar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajendiran");
		driver.findElementByClassName("smallSubmit").click();
	}

}
