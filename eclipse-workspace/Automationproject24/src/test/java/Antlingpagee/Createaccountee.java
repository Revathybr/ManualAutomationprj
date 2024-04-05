package Antlingpagee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createaccountee {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/div[3]/a[1]")
	WebElement carthome;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/div[3]/a[1]")
	WebElement login;
	@FindBy(xpath="//*[@id=\"customer_login\"]/p/a")
	WebElement createacc;
	@FindBy(xpath="//*[@id=\"register-first-name\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"register-last-name\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"register-email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"register-password\"]")
	WebElement password; 	
	//@FindBy(xpath="/html/body/main/div/div/form/div[6]/button")
	//WebElement createbutton;
	
	
	public Createaccountee(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void carthomeclk()
	{
		carthome.click();
	}
	public void registermtd()
	{
		login.click();
		createacc.click();
	}
	public void createaccountmtd()
	{
		firstname.sendKeys("Revathy");
		lastname.sendKeys("B R");
		email.sendKeys("revathybr10008@gmail.com");
		password.sendKeys("Revathysyam@1005");
	}
	public void buttonclk() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");	
		//createbutton.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"create_customer\"]/div[6]/button"))).click();
		
		
		
	}
	
	
	
	
}
