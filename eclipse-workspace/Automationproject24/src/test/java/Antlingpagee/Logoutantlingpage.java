package Antlingpagee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutantlingpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/div[3]/wishlist-link/wk-button/a/wk-icon")
	WebElement whishlist;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/div[3]/a[1]")
	WebElement profile;
	@FindBy(xpath="//*[@id=\"customer-email\"]")
	WebElement emaill;
	@FindBy(xpath="//*[@id=\"customer-password\"]")
	WebElement pass;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[4]/button")
	WebElement login;
	
	public Logoutantlingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void capclk() throws InterruptedException
	{
		Thread.sleep(3000);
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");	
		whishlist.click();
	}
	public void whishlistmtd()
	{
		profile.click();
		emaill.sendKeys("revathybr10008@gmail.com");
		pass.sendKeys("Revathysyam@1005");
		login.click();
	}
	
	
}

