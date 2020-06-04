package stepDefinition_SapphireHeart;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SapphireHeart_Web_Balance_InsufficiantBalance_Validation {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_balance_spin_button_and_validation_message() throws Throwable {
	    
		this.driver = SapphireHeart_URL_Login.getDriver();
	}

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_to_zero_and_check_the_validation_message() throws Throwable {
	    
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Sapphire_Heart/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Sapphire_Heart/spin.PNG");
		Pattern creditValue=new Pattern("./Images/Sapphire_Heart/betval1_5.PNG");
		Pattern Insufficient_info=new Pattern("./Images/Sapphire_Heart/Insufficient_info.PNG");


		// Clicking the denomination and spin button
		screen.click(creditValue);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(4000);
		screen.click(spin);
		Thread.sleep(4000);
		screen.click(spin);
		Thread.sleep(4000);

		//comparing the insufficiant balance message displayed or not
		// Pattern bal=new Pattern("E:/Sikuli Images/credits/insufficiant.png");

		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Insufficient_info);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Insufficiant balance message displayed. Test case passed.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Insufficiant balance message comparision value is equal to: "+" "+score +"%");
		Assert.assertTrue(score > 90);
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account in Sapphire Heart game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_in_Sapphire_Heart_game() throws Throwable {
	    
		Thread.sleep(3000);
		driver.quit();
	}
}
