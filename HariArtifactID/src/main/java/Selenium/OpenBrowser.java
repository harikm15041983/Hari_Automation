package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		//WebDriver driver = new WebDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChrromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("username");
		driver.findElement(By.id("loginpassword")).sendKeys("passowrd");
		driver.findElement(By.className("btn btn-primary")).sendKeys("username");
		
		
		
		
			
		
		/*
		 * System.setProperty("webdriver.gecko,driver",
		 * "D:\\FirefoxDriver\\geckodriver.exe"); WebDriver firfox = new
		 * FirefoxDriver(); firfox.get("https://www.google.com/"); firfox.close();
		 */

		
		
		
		
		
	
	}
}