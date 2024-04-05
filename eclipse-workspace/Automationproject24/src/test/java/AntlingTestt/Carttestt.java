package AntlingTestt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Antlingpagee.Cartantlingpage;


public class Carttestt {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://antling.in/collections/footed-rompers/products/footed-rompers-duckling");
	}
	@Test
	public void cartmtd()
	{
		Cartantlingpage obj=new Cartantlingpage(driver);
		obj.cartclk();
		
	}

}


