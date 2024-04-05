package AntlingTestt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Antlingpagee.Createaccountee;



public class Createacctest {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://antling.in/collections/footed-rompers/products/premium-peterpan-collar-romper-peach");
	}
	
	@Test
	public void antlingtest() throws InterruptedException
	{
		Createaccountee obj=new Createaccountee(driver);
		obj.carthomeclk();
		obj.registermtd();
		obj.createaccountmtd();
		obj.buttonclk();
	}
}


