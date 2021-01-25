package selenium_learning;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Class_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*****************How to launch browsers in Selenium***********/
		
		
		
		
		/**** firefox Driver*******
		 * 
		WebDriver abc = new FirefoxDriver();
		//GetURL
		abc.get("https://www.google.com");
		//Get Current URL
		System.out.println(abc.getCurrentUrl());
		
		//get Page Source
		String xyz = abc.getPageSource();
		System.out.println(xyz);
		
		//Windows maximize
		abc.manage().window().maximize();
		
		//quit
		abc.quit();
		 * 
		 * 
		 * 
		 */
		
		/***** Chrome***/
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting..");
		driver.quit();
		/*********************************/
		
		/********************Internet Explorer********/
		DesiredCapabilities ieCapas = DesiredCapabilities.internetExplorer();
		ieCapas.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		ieCapas.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		InternetExplorerOptions optIE = new InternetExplorerOptions().merge(ieCapas);
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
		WebDriver driverIE =new InternetExplorerDriver(optIE);
		driverIE.navigate().to("https://www.facebook.com");
		
		

	}




}