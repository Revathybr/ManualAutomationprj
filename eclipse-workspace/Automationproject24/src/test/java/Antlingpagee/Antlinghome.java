package Antlingpagee;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Antlinghome {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/main-menu/details/div/nav/ul/li[1]/a")
	WebElement Home;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/main-menu/details/div/nav/ul/li[2]/details/summary/a")
	WebElement Babies;
	@FindBy(xpath="//*[@id=\"template--22217872343362__qdd_column_grid_xpyTcW \"]/div[2]/div/ul/li[2]/div/a/div/img")
	WebElement Rompers;
	//@FindBy(xpath="//*[@id=\\\"facets\\\"]/div/details-disclosure[1]/details/div/div/div[1]/ul/li[1]/label")
	//WebElement instock;
	@FindBy(xpath="//*[@id=\"filter-results\"]/ul/li[1]/product-card/div[1]/a/img")
	WebElement image;
	@FindBy(xpath="//*[@id=\"product-form-template--22211842965826__main\"]/div[2]/quantity-input/div/button[2]")
	WebElement addprd;
	@FindBy(xpath="//*[@id=\"product-form-template--22211842965826__main\"]/div[2]/div/button")
	WebElement addcart;
	
	public Antlinghome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void homemtd()
	{
		Home.click();
		
	}	
	public void babiesmtd()
	{
		Babies.click();
		//Select co=new Select(Babies);
		//co.selectByVisibleText("Rompers");
		String exp="Baby collections - Antling - curated Mom & Baby Store";
		String act=driver.getTitle();
		if(exp.equalsIgnoreCase(act))
		{
			System.out.println("Title verified");
			
		}
		else
		{
			System.out.println("Title not verified");

		}
		Rompers.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"facets\"]/div/details-disclosure[1]/details/div/div/div[1]/ul/li[1]/label"))).click();
		//instock.click();
		image.click();
		addprd.click();
		addcart.click();
	}
	
	public void linkresponce()
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in home page: "+l.size());
		for(WebElement ele:l)
		{
			String link=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(link+"-----------"+linktext);
			try
			{
				URL u=new URL(link);
				HttpURLConnection con=(HttpURLConnection)u.openConnection();  
				int code=con.getResponseCode();
				System.out.println(code);
				
				if(code==200)   
				{
					System.out.println("Response code is 200- successfull");

				}
				else if(code==404)
				{
					System.out.println("The connection is broken-404");
		
				}
				else
				{
					System.out.println("The response code is unexpected");

			} 
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			Boolean logo=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--22211836969282__header\"]/store-header/header/div[1]/a/span/img")).isDisplayed(); 
			if(logo)		
			{
				System.out.println("Logo is present");
				
			}
			else
			{
				System.out.println("Logo is not present");
		
			}
			
		}
	}
}
			
		
	
		
		
	
		
	
	
	




