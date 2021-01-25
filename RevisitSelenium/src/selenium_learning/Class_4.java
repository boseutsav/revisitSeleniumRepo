package selenium_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Class_4 {

	@Test
	public void validateURL() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Actual = driver.getCurrentUrl();
		String Expected = new String("https://www.facebook.com/");
		Assert.assertEquals(Expected, Actual);
		System.out.println(Actual.contentEquals(Expected));
	}

}
