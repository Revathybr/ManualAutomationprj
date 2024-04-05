package Antlingpagee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartantlingpage {
WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"product-form-template--22211842965826__main\"]/div[2]/quantity-input/div/button[2]")
	WebElement button;
	@FindBy(xpath="//*[@id=\"product-form-template--22211842965826__main\"]/div[2]/div/button")
	WebElement addcart;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/main-menu/details/div/nav/ul/li[1]/a")
	WebElement homee;
	public Cartantlingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void cartclk()
	{
		
		button.click();
		addcart.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[4]/cart-drawer/header/div/a"))).click();
		homee.click();
		
	}
	
	
	
	
}

