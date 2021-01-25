package selenium_learning;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Locators
		File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxOptions options = new FirefoxOptions().setBinary(ffBinary).setProfile(firefoxProfile);
		WebDriver abc = new FirefoxDriver(options);
		abc.get("https://www.w3schools.com/html/");
		abc.manage().window().maximize();
		
		//===========================================Default Selenium Locators================/////
		
		/*** Locating elements by ID****/
		abc.findElement(By.id("btnIntranetSearch")).click();
		
		//by Name
		abc.findElement(By.name("name"));

		//css selector
		abc.findElement(By.cssSelector("tagname.class"));
		abc.findElement(By.cssSelector("tagname#id"));
		
		//classname
		abc.findElement(By.className("classname"));
		
		//xpath
		abc.findElement(By.xpath("xpath expression"));
		
		//partiallinktext
		abc.findElement(By.partialLinkText("partiallinktext"));
		
		//linktext
		abc.findElement(By.linkText("partiallinktext"));
		
		//tagname
		abc.findElement(By.tagName("partiallinktext"));
		
		abc.close();
	}

}
