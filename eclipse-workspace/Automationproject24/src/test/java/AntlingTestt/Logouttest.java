package AntlingTestt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Antlingpagee.Logoutantlingpage;


public class Logouttest {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://antling.in/account");
	}
	
	@Test
	public void antlingtest() throws InterruptedException 
	{
		Logoutantlingpage obj=new Logoutantlingpage(driver);
		obj.capclk();
		obj.whishlistmtd();
			
	}
}

