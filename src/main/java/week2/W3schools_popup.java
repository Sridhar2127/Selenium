package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools_popup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/srajendran/Desktop/drivers/ChromeDriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String name = "sridhar";
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
		String newname = driver.findElementByXPath("//p[@id='demo']").getText();
		if (newname.contains(name))
			System.out.println("Entered name is Present");
		else
			System.out.println("Entered name is Present");
	}

}
