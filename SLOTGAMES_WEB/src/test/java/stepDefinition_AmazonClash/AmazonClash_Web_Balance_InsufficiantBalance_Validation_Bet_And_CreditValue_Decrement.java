package stepDefinition_AmazonClash;

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

public class AmazonClash_Web_Balance_InsufficiantBalance_Validation_Bet_And_CreditValue_Decrement {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, balance, spin button, validation message, credit types and bet types$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_balance_spin_button_validation_message_credit_types_and_bet_types() throws Throwable {
		this.driver = AmazonClash_URL_Login.getDriver();
	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns less than available balance and check the validation message and reduce the bet and credit values to resume the play\\.$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_less_than_available_balance_and_check_the_validation_message_and_reduce_the_bet_and_credit_values_to_resume_the_play() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Amazon_Clash/Bet_place.PNG", 30);

		Pattern spin=new Pattern("Images/Amazon_Clash/spin.PNG");
		Pattern cr_dec=new Pattern("Images/Amazon_Clash/cr_dec.PNG");
		Pattern bet_dec=new Pattern("Images/Amazon_Clash/bet_dec.PNG");
		Pattern maxbet=new Pattern("Images/Amazon_Clash/maxbet.PNG");
		Pattern ok=new Pattern("Images/Amazon_Clash/ok.PNG");
		Pattern Insufficient_info=new Pattern("Images/Amazon_Clash/Insufficient_info.PNG");

		// IMAGES IN 1st REELS
		Pattern tiger1=new Pattern("Images/Amazon_Clash/1R_tiger1.PNG");
		Pattern blue1=new Pattern("Images/Amazon_Clash/1R_blue1.PNG");
		Pattern leaf1	=new Pattern("Images/Amazon_Clash/1R_leaf.PNG");

		// Clicking the maxbet and spin button
		screen.click(maxbet);
		Thread.sleep(1000);
		screen.click(blue1);
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
		screen.click(ok);
		Thread.sleep(2000);

		// Reducing the bet value 
		screen.click(bet_dec);
		Thread.sleep(1000);
		screen.click(bet_dec);
		Thread.sleep(1000);
		screen.click(blue1);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(7000);
		screen.click(bet_dec);
		Thread.sleep(1000);
		screen.click(tiger1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(7000);
		screen.click(tiger1);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(7000);
		screen.click(leaf1);
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
		screen.click(ok);
		Thread.sleep(2000);

		// Reducing the credit value 
		screen.click(cr_dec);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(5000);
	}

	@Then("^Player should be blocked from playing the game when there is less balance in the account and reducing the credit and bet types player is enable to continue slot game in Amazon Clash game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_less_balance_in_the_account_and_reducing_the_credit_and_bet_types_player_is_enable_to_continue_slot_game_in_Amazon_Clash_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
