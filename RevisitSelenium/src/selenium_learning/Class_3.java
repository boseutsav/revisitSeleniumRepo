package selenium_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//xpath = .//tagname[@attribute = 'value']
		//xpath = .//input[@type='Text']
		//xpath = //a[@href = 'https://www.google.com']
		//xpath - .//btn[text() = 'text here']
		
		//xpath = //label[starts-with(@id,'message')]
		
		//xpath = //label[contains(@id,'message')]
		// use AND and OR xpath =  .//label[@href='xyz' and @class= 'classname']
		
	}

}
