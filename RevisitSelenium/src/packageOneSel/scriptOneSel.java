package packageOneSel;



import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class scriptOneSel {

	public static void main(String[] args) throws Exception{
		/*DesiredCapabilities ieCapas = DesiredCapabilities.internetExplorer();
		ieCapas.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true)
		ieCapas.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty(webdriver.chrome.driver, value)
		System.setProperty("webd", value)*/
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Utsav\\Documents\\Softwares\\geckodriver-v0.17.0-win64\\geckodriver");*/
		/*FirefoxProfile profile =new FirefoxProfile();
		FirefoxOptions options = new FirefoxOptions().setProfile(profile);*/
		
		/*FirefoxOptions options = new FirefoxOptions()
				      .addPreference("browser.startup.page", 1)
				      .addPreference("browser.startup.homepage", "https://www.google.co.uk");*/
		File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxOptions options = new FirefoxOptions().setBinary(ffBinary).setProfile(firefoxProfile);
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Pyongyang");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("chingpong");
		/*WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("textbox")));
		driver.findElement(arg0)*/
		Thread.sleep(5000);
		driver.close();
	}

}
