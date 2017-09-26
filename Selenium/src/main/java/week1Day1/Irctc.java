package week1Day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/srajendran/Desktop/drivers/ChromeDriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("sridhar2127");
		driver.findElementById("userRegistrationForm:password").sendKeys("Pondicherry123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Pondicherry123");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("what make was your first car or bike?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Yamaha");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sridhar");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("NA");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Rajendran");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("21");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUL");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1990");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Professional");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("ZYXWVUTSRQPO");
		driver.findElementById("userRegistrationForm:idno").sendKeys("DHKPS6209H");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("sridharrajendran@live.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9994870420");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("16");
		driver.findElementById("userRegistrationForm:street").sendKeys("Nehru Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Nainarmandabam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("605004", Keys.TAB);
		Thread.sleep(1000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Pondicherry");
		Thread.sleep(1000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Mudaliarpet S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("04132355568");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
	}

}
