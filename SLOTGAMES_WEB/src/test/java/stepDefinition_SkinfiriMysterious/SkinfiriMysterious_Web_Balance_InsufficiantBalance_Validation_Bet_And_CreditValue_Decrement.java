package stepDefinition_SkinfiriMysterious;

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

public class SkinfiriMysterious_Web_Balance_InsufficiantBalance_Validation_Bet_And_CreditValue_Decrement {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, validation message, credit types and bet types$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_validation_message_credit_types_and_bet_types() throws Throwable {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns less than available balance and check the validation message and reduce the bet and credit values to resume the play\\.$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_less_than_available_balance_and_check_the_validation_message_and_reduce_the_bet_and_credit_values_to_resume_the_play() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);

		Pattern spin=new Pattern("Images/Skinfiri_Mysterious/Spin.PNG");
		Pattern cr_dec=new Pattern("Images/Skinfiri_Mysterious/cr_dec.PNG");
		Pattern bet_dec=new Pattern("Images/Skinfiri_Mysterious/bet_dec.PNG");
		Pattern maxbet=new Pattern("Images/Skinfiri_Mysterious/maxbetval.PNG");
		Pattern ok=new Pattern("Images/Skinfiri_Mysterious/ok.PNG");
		Pattern Insufficient_info=new Pattern("Images/Skinfiri_Mysterious/Insufficient_info.PNG");

		// IMAGES IN 1st REELS
		Pattern cross1=new Pattern("Images/Skinfiri_Mysterious/1R_cross.PNG");
		Pattern skull1=new Pattern("Images/Skinfiri_Mysterious/1R_skull.PNG");
		Pattern eye1=new Pattern("Images/Skinfiri_Mysterious/1R_eye.PNG");
		Pattern owl1=new Pattern("Images/Skinfiri_Mysterious/1R_owl.PNG");
		Pattern crow1=new Pattern("Images/Skinfiri_Mysterious/1R_crow.PNG");

		// Clicking the maxbet and spin button
		screen.click(maxbet);
		Thread.sleep(1000);
		screen.click(cross1);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(5000);
		screen.click(spin);
		Thread.sleep(3000);

		//comparing the insufficient balance message displayed or not
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
		Assert.assertTrue(score > 97);
		Thread.sleep(2000);
		screen.click(ok);
		Thread.sleep(2000);

		// Reducing the bet value 
		screen.click(bet_dec);
		Thread.sleep(1000);
		screen.click(bet_dec);
		Thread.sleep(1000);
		screen.click(skull1);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(7000);
		screen.click(bet_dec);
		Thread.sleep(1000);
		screen.click(eye1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(7000);
		screen.click(owl1);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(7000);
		screen.click(crow1);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(3000);

		//comparing the insufficient balance message displayed or not
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(Insufficient_info);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Insufficiant balance message displayed. Test case passed.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Insufficiant balance message comparision value is equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
		Thread.sleep(2000);
		screen.click(ok);
		Thread.sleep(2000);

		// Reducing the credit value 
		screen.click(cr_dec);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(5000);
	}

	@Then("^Player should be blocked from playing the game when there is less balance in the account and reducing the credit and bet types player is enable to continue slot game in Skinfiri Mysterious game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_less_balance_in_the_account_and_reducing_the_credit_and_bet_types_player_is_enable_to_continue_slot_game_in_Skinfiri_Mysterious_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
