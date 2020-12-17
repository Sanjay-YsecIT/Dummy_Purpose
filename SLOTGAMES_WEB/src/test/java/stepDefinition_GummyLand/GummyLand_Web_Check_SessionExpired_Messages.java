package stepDefinition_GummyLand;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GummyLand_Web_Check_SessionExpired_Messages {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, transfer button$")
	public void chrome_browser_valid_URL_valid_login_details_Gummy_Land_slot_game_balance_transfer_button() throws Throwable {
		this.driver = GummyLand_URL_Login.getDriver();
	}

	@When("^Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, idle the game session for about (\\d+)mins$")
	public void open_the_Gummy_Land_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_idle_the_game_session_for_about_mins(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Gummy_Land/GummyLand.PNG", 30);
		
		Pattern SessionExpired=new Pattern("Images/Gummy_Land/Session_Expired.PNG");

		// execute some command to keep the session alive
		System.out.println("d1"+driver.getCurrentUrl()); 
		Thread.sleep(10*60*1000); // 10 minutes sleep time
		System.out.println("d2"+driver.getCurrentUrl()); 
		Thread.sleep(11*60*1000); // 11 minutes sleep time
		System.out.println("d3"+driver.getCurrentUrl());

		//Session Expired message with balck screen around it
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(SessionExpired);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Session Expired message with black screen. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Session Expired message with black screen & Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);
		Thread.sleep(4000);

	}

	@Then("^Session Expired message should display and user has to start new session for game play in Gummy Land slot game$")
	public void session_Expired_message_should_display_and_user_has_to_start_new_session_for_game_play_in_Gummy_Land_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
