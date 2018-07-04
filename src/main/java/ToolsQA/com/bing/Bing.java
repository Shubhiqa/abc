package ToolsQA.com.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
public class Bing {
	
	protected WebDriver driver;
	
	Bing(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void dropDownBox()
	{
		driver.findElement(By.xpath("//select[@id='t_sl']"));
	}
	
	public void dropDownBox2()
	{
		driver.findElement(By.xpath("//select[@id='t_tl']"));
	}
	
	public void textbox()
	{
		driver.findElement(By.xpath("//textarea[@id='t_sv']"));
	}

	public void translationBox()
	{
		driver.findElement(By.xpath("//textarea[@class='b_focusTextMedium']"));
		
	}
		

	public void selectlangtoBeTranslated()
	{
		Select selLang=new Select (driver.findElement(By.id("id=\"t_sl\"")));
		selLang.selectByVisibleText("Hindi");
			
	}
	
	public void selectTranslatedLang()
	{
		Select translatedLang=new Select(driver.findElement(By.id("t_tl")));
		translatedLang.selectByVisibleText("English");
	}
}
