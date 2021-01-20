package packageOneSel;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Utsav Bose
 *
 */
public class edurekaScript {

	WebDriver myDriver;

	public void invokeBrowser(String courseName) {
		try {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			myDriver = new ChromeDriver();
			myDriver.manage().deleteAllCookies();
			myDriver.manage().window().maximize();
			myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			myDriver.get("http://edureka.co");
			this.searchCourse(courseName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchCourse(String courseName) {
		try {
			myDriver.findElement(By.id("homeSearchBar")).sendKeys(courseName);
			WebDriverWait myWait = new WebDriverWait(myDriver, 10);
			myWait.until(ExpectedConditions.elementToBeClickable(By.id("homeSearchBarIcon")));
			myDriver.findElement(By.id("homeSearchBarIcon")).click();
			JavascriptExecutor jse = (JavascriptExecutor) myDriver;
			jse.executeScript("scroll(0, 800)");
			Thread.sleep(5000);
			jse.executeScript("scroll(800,50)");
			Thread.sleep(5000);
			jse.executeScript("scroll(50,0)");
			myDriver.findElement(By.xpath("//button/span[contains(text(),'Batch Type')]")).click();
			myDriver.findElement(By.xpath("//label[@class='checkbox']/input[@value='weekend']/parent::label")).click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Browser Not Present" + " " + "\n" + e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("This is the default block");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		edurekaScript myObj = new edurekaScript();
		myObj.invokeBrowser("Java");
		Thread.sleep(5000);
		myObj.myDriver.quit();
	}

}
