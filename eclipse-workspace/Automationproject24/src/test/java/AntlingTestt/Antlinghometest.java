package AntlingTestt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Antlingpagee.Antlinghome;

public class Antlinghometest {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://antling.in/");
	}
	
	@Test
	public void antlingtest()
	{
		Antlinghome obj=new Antlinghome(driver);
		obj.homemtd();
		obj.babiesmtd();
		obj.linkresponce();
		
		
		
		
	}
}

