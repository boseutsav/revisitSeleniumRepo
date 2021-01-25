package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Class_5 {

	@Test
	public void validatenavigation() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("");
		driver.findElement(By.id(""));
		Assert.assertEquals(driver.findElement(By.xpath("")).isDisplayed(), true);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close();
		driver.quit();
	}

}
