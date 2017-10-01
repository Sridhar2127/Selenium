package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers {
	RemoteWebDriver driver;
	public int i = 1;
	public String currentwindow ="";
	public int firstindex, secondindex;

	/**
	 * This method will launch the given browser and maximise the browser and
	 * set the wait for 30 seconds and load the url
	 * 
	 * @author Babu - TestLeaf
	 * @param browser
	 *            - The browser of the application to be launched
	 * @param url
	 *            - The url with http or https @
	 * 
	 */
	public void invokeApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/srajendran/Desktop/drivers/ChromeDriver");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		currentwindow = driver.getWindowHandle();
	
		System.out.println("The browser : " + browser + " is launched Successfully");
	}

	/**
	 * This method will enter the value to the text field using id attribute to
	 * locate
	 * 
	 * @param idValue
	 *            - id of the webelement
	 * @param data
	 *            - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @return @
	 */

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The Value " + data + " has been entered successfully in : " + idValue + "");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
			throw new RuntimeException();
		} catch (WebDriverException e) {
			System.out.println("Web driver exception error");
		} finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The value " + data + " has neen entered successfully");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
			throw new RuntimeException();
		} catch (WebDriverException e) {
			System.out.println("Web driver exception error");
		} finally {
			takeSnap();
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The Firstname " + data + " has been entered successfully in : " + xpathValue + "");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver exception error");
		} finally {
			takeSnap();
		}
	}

	public boolean verifyTitle(String title) {
		try {
			if (driver.getTitle().contains(title)) {
				System.out.println("Captured title matches with " + title);
			}
		} catch (WebDriverException e) {
			System.out.println("Web driver exception error");
		} finally {
			takeSnap();
		}
		return false;

	}

	public boolean verifyTextById(String id, String text) {
		try {
			if (driver.findElementById(id).getText().equalsIgnoreCase(text)) {
				System.out.println("Entered name " + text + " is matching with the result");
			} else {
				System.out.println("Entered name " + text + " is not matching with the result");
			}
		} catch (NoSuchElementException e) {
			System.out.println("No such element exception");
		} catch (WebDriverException e) {
			System.out.println("Web driver exception");
		} finally {
			takeSnap();
		}
		return false;
	}

	public void verifyTextByXpath(String xpath, String text) {
		try {
			if (driver.findElementByXPath(xpath).getText().equals(text)) {
				System.out.println("Entered name " + text + " is matching with the result");
			} else {
				System.out.println("Entered name " + text + " is not matching with the result");
			}
		} catch (NoSuchElementException e) {
			System.out.println("No such element excemption");
		} catch (WebDriverException e) {
			System.out.println("No such element excemption");
		} finally {
			takeSnap();
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {

		try {
			if (driver.findElementByXPath(xpath).getText().contains(text)) {
				System.out.println("The Given Text :" + text + " Matches");
			} else {
				System.out.println("Entered name " + text + " is not matching with the result");
			}
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver element error");
		} finally {
			takeSnap();
		}

	}

	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			System.out.println("The Buttion " + id + " has been clicked successfully");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver exception");
		} finally {
			takeSnap();
		}
	}

	public void clickByClassName(String classVal) {

		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The Button " + classVal + " Clicked Successfully");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found");
		} catch (WebDriverException e) {
			System.out.println("Web driver exception");
		} finally {
			takeSnap();
		}

	}

	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			System.out.println("The Button " + name + " has been clicked successfully");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver exception");
		} finally {
			takeSnap();
		}
	}

	public void clickByLink(String name) {

		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The link " + name + " has been clicked");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		} finally {
			takeSnap();
		}

	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The value " + name + " has been clicked");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		}

	}

	public void clickByXpath(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The value " + xpathVal + " has been clicked");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		} finally {
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The value " + xpathVal + " has been clicked");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		}

	}

	public String getTextById(String idVal) {
		String text = null;
		try {
			text = driver.findElementById(idVal).getText();
			System.out.println("The captured text is " + text);
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		} finally {
			takeSnap();
		}
		return text;
	}

	public String getTextByXpath(String xpathVal) {
		String text = null;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			System.out.println("The captured text is " + text);
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		} finally {
			takeSnap();
		}

		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		try {
			Select options = new Select(driver.findElementById(id));
			options.selectByVisibleText(value);
			System.out.println("Entered value " + value + " has been selected in the dropdown");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		} finally {
			takeSnap();
		}

	}

	public void selectIndexById(String id, int value) {
		try {
			Select number = new Select(driver.findElementById(id));
			number.selectByIndex(value);
			System.out.println("Entered value " + value + " has been selected in the dropdown");
		} catch (NoSuchElementException e) {
			System.out.println("No such element found error");
		} catch (WebDriverException e) {
			System.out.println("Web driver excemption");
		} finally {
			takeSnap();
		}
	}

	public void switchToParentWindow() {
		try { 
				driver.switchTo().window(currentwindow);
				System.out.println("Switched to parent window successfully");
	
		} catch (NoSuchWindowException e) {
			System.out.println("No such window exception");
		} 
	}

	public void switchToLastWindow() {
		try {
			Set<String> allwindow = driver.getWindowHandles();
			for (String eachwindow : allwindow) {
				driver.switchTo().window(eachwindow);
			}
			System.out.println("Switched to last window successfully");
		} catch (NoSuchWindowException e) {
			System.out.println("No such window exception");
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("The Alert popup has been accepted");
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present exception");
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("The Alert popup has been dismissed");
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present exception");
		}
	}

	public String getAlertText() {
		String name = null;
		try {
			name = driver.switchTo().alert().getText();
			System.out.println(name + "text has been captured successfully");
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present exception");
		}
		return name;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img" + i + ".jpg");
		try {
			FileUtils.copyFile(src, desc);
			System.out.println("Screenshot captured");
		} catch (IOException e) {
			System.out.println("IO exception");
		}
		i++;
	}

	public void closeBrowser() {
		try {
			System.out.println("Browser has been closed");
			driver.close();
		} catch (WebDriverException e) {
			System.out.println("web driver exception");
		}
	}

	public void closeAllBrowsers() {
		try {
			System.out.println("All the windows are closed");
			driver.quit();
		} catch (WebDriverException e) {
			System.out.println("web driver exception");
		}
	}

	public String splitTextCaptureLeadId(String str){
		
		int firstindex = str.indexOf("(");
		int lastindex = str.indexOf(")");
		
		String capturedtext = str.substring(firstindex+1, lastindex);
		System.out.println("Captured lead id is " +capturedtext);
		return capturedtext;	
		
	}
}
