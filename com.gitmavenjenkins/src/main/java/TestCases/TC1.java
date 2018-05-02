package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class TC1 
{
	
	WebDriver driver;
	WebElement searchButton;
	
	@Given("^open youtube in firefox browser$")
	public void open_youtube_in_firefox_browser() throws InterruptedException
	{
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
	    
	}

	@When("^youtube url is opened$")
	public void youtube_url_is_opened() throws InterruptedException
	{
		
		driver.get("https://www.youtube.com/");
		System.out.println("Youtube Open");
		Thread.sleep(10000);
	    
	}

	@Then("^check the search button$")
	public void check_the_search_button() 
	{
		
		searchButton= driver.findElement(By.xpath(".//*[@id='search-icon-legacy']"));
		if(searchButton.isDisplayed())
		{
			

			System.out.println("Button found");
		}
		else
		{
			
			System.out.println("Button not found");
		}
	    
	}

	@Then("^quit the browser$")
	public void quit_the_browser() 
	{
		
		driver.quit();
		System.out.println("Firefox quit");
		System.out.println("Firefox Close");
	   
	}


}
