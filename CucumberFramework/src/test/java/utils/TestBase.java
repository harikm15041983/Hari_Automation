package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		
		Properties prop = new Properties();
		prop.load(stream);
		String appUrl = prop.getProperty("url");
		
		
		
		if(driver == null) {
			
			if(prop.getProperty("url") ==  "chrome") {
			
			System.setProperty("webdriver.chrome.driver", "D:\\ChrromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			}else
			{
				System.out.println("NO Browser Defined");
			}
			
			driver.get(appUrl);
		}
		return driver;
	}

}
