package ToolsQA.com.bing;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBing {

	SessionInitiator test;
	
	@BeforeClass
	public void open()
	{
		test = new SessionInitiator();
		
	}
	
	
	@Test
	public void TC_01verifyhomepage()
	{
		test.launchurl();
	
	}
	
	
	@Test
	public void TC_02_verify_dropDownBOx()
	{
		test.bing.dropDownBox();
	}
	
	
	@Test
	public void TC_03_verify_dropDownBox2()
	{
		test.bing.dropDownBox2();
	}
	
	@Test
	public void TC_04_verify_textBox()
	{
		test.bing.textbox();
	}

	@Test
	public void TC_05_verify_translationBox()
	{
		test.bing.translationBox();
	}
	
	@Test
	public void TC_06_verify_selectlangtoBeTranslated()
	{
		test.bing.selectlangtoBeTranslated();
	}
	

	@Test
	public void TC_07_verify_selectTranslatedLang()
	{
		test.bing.selectTranslatedLang();
	}
}
