package wrappers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers{
	RemoteWebDriver driver;

	/**
	 * This method will launch the given browser and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Babu - TestLeaf
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @ 
	 * 
	 */
	public void invokeApp(String browser, String url) {		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/srajendran/Desktop/drivers/ChromeDriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The browser : "+browser+" is launched Successfully");	
	}

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Babu - TestLeaf
	 * @return 
	 * @ 
	 */

	public void enterById(String idValue, String data) {		
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("The Value "+data+" has been entered successfully in : "+idValue+"");		
	}

	public void enterByName(String nameValue, String data) {
		driver.findElementByName(nameValue).clear();
		driver.findElementByName(nameValue).sendKeys(data);

	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub

	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean verifyTextById(String id, String text) {
	if(driver.findElementById(id).getText().equals(text)){
			System.out.println("Entered name " +text+ " is matching with the result");
		}
	else{
		System.out.println("Entered name " +text+ " is not matching with the result");
	}
	return false;
		
		// TODO Auto-generated method stub
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextContainsByXpath(String xpath, String text) {

		if (driver.findElementByXPath(xpath).getText().contains(text)) {
			System.out.println("The Given Text :"+text+" Matches");
		} 

	}

	public void clickById(String id) {
		// TODO Auto-generated method stub

	}

	public void clickByClassName(String classVal) {

		driver.findElementByClassName(classVal).click();
		System.out.println("The Button " +classVal+ " Clicked Successfully");

	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByLink(String name) {

		driver.findElementByLinkText(name).click();
		System.out.println("The link " +name+ " has been clicked");
		// TODO Auto-generated method stub

	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		
		System.out.println("The value " +xpathVal+ " has been clicked");
		// TODO Auto-generated method stub

	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		Select options = new Select(driver.findElementById(id));
		options.selectByVisibleText(value);
		System.out.println("Entered value " +value+ " has been selected in the dropdown");	
		// TODO Auto-generated method stub

	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub

	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		// TODO Auto-generated method stub

	}

	public void closeBrowser() {
		System.out.println("Browser has been closed");
		driver.close();	
		// TODO Auto-generated method stub

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
