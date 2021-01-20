package packageOneSel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;

import org.apache.commons.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;




public class scriptTwoSel_Chrome {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Pyongyang");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("chingpong");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		// Code to take Screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Code to save screenshot at desired location
		FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"\\screenshot.png"));
		
		driver.close();
	}

}
