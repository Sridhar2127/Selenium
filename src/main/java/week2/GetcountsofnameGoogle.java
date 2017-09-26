package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcountsofnameGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/srajendran/Desktop/drivers/ChromeDriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String name = "Sridhar";
		driver.findElementById("lst-ib").sendKeys(name);
		driver.findElementByName("btnK").click();
		int count = 0;
		List<WebElement> allElements = driver.findElementsByXPath("//h3");
		for (WebElement eachElement : allElements)
		{
			if(eachElement.getText().contains(name))
				 count = count + 1;
			
		}
		System.out.println(name+ " is available in " +count+ " links");

	}

}
