package packageOneSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class scriptThreeSel_IE {

	public static void main(String[] args){
	
		/*DesiredCapabilities ieCapas = DesiredCapabilities.internetExplorer();
		ieCapas.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		ieCapas.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		*/
		DesiredCapabilities ieCapas = DesiredCapabilities.internetExplorer();
		ieCapas.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		ieCapas.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		InternetExplorerOptions optIE = new InternetExplorerOptions().merge(ieCapas);
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver(optIE);
		driver.navigate().to("https://www.facebook.com");
		/*driver.manage().window().maximize();*/
		WebDriverWait myWaitVar = new WebDriverWait(driver, 15);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email']")));		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Pyongyang");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("chingpong");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
	}
}
