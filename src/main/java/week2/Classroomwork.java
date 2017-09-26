package week2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classroomwork {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/Users/srajendran/Desktop/drivers/ChromeDriver");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			String parentwindow = driver.getWindowHandle();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.findElementByLinkText("Contact Us").click();
			Set<String> allwindow = driver.getWindowHandles();
			int i=1;
			for (String eachwindow:allwindow)
			{
				driver.switchTo().window(eachwindow);
				if(i==2)
				{
					System.out.println(driver.getCurrentUrl());
					System.out.println(driver.getTitle());
				}
				i++;
			}
			driver.switchTo().window(parentwindow);
			driver.close();
		}

	}