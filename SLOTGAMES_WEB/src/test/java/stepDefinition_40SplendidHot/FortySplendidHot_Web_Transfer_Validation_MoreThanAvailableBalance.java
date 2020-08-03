package stepDefinition_40SplendidHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FortySplendidHot_Web_Transfer_Validation_MoreThanAvailableBalance {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, FortySplendidHot game, balance greater than available balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_FortySplendidHot_game_balance_greater_than_available_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("txtUserName")).sendKeys("5273290266");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Password / Card Pin']")).sendKeys("mans@123");
		Thread.sleep(2000);

		driver.findElement(By.className("loginActive")).click();
		Thread.sleep(2000);
		System.out.println("Login to the game with valid credentials");

		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[31]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(4000);
	}

	@When("^Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button$")
	public void open_the_FortySplendidHot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_greater_than_available_balance_and_click_on_Ok_button() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("60000000");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);

		// Validating for the greater amount transfer
		Pattern credit1=new Pattern("Images/40Splendid_Hot/Amount_greater_msg.PNG");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit1);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Transfering the amount to which is greater than available balance and transfer is should get failed and validation message should be displayed.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Transfer should get failed and validation message should be displayed and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 95);
	}

	@Then("^Player should be blocked from loading the FortySplendidHot game when the amount entered in the transfer page is more than the available balance$")
	public void player_should_be_blocked_from_loading_the_FortySplendidHot_game_when_the_amount_entered_in_the_transfer_page_is_more_than_the_available_balance() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
