package ToolsQA.com.bing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionInitiator {
	
	WebDriver driver;
	Bing bing;
	
	public SessionInitiator() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhinigam\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		bing=new Bing(driver);
	}
	
	
	
	
	
	public void launchurl()
	{
		driver.get("https://www.bing.com/translator");
			
	}

}
