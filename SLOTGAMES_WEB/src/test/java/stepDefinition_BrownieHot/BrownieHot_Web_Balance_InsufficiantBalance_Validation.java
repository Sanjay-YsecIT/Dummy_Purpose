package stepDefinition_BrownieHot;

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

public class BrownieHot_Web_Balance_InsufficiantBalance_Validation {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button and insufficient alert message$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_balance_spin_button_and_insufficient_alert_message() throws Throwable {
		this.driver = BrownieHot_URL_Login.getDriver();
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance less than bet value and check the validation message$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_less_than_bet_value_and_check_the_validation_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Brownie_Hot/BrownieHot.PNG", 30);

		Pattern maxbet=new Pattern("Images/Brownie_Hot/maxbet.PNG");
		Pattern ok=new Pattern("Images/Brownie_Hot/ok.PNG");
		Pattern insufficiant=new Pattern("Images/Brownie_Hot/insufficiant.PNG");
		Pattern credit_dec=new Pattern("Images/Brownie_Hot/credit_dec.PNG");
		Pattern bet_dec=new Pattern("Images/Brownie_Hot/bet_dec.PNG");
		Pattern spin=new Pattern("Images/Brownie_Hot/spin.PNG");
		Pattern home=new Pattern("Images/Brownie_Hot/home.PNG");

		Pattern symb_1_1=new Pattern("Images/Brownie_Hot/symb_1_1.PNG");

		screen.click(symb_1_1);
		Thread.sleep(1000);

		//Click on maxbet button and start autoplay again
		screen.click(maxbet);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//check insufficient balance alert is present on the screen when the balance is less than the bet value
		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(insufficiant);
		double score6=20;                
		System.out.println("the value of ht"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("Insufficiant balance message is not displayed. Test case passed");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Insufficiant balance message is not displayes & Comparision value equals to: "+" "+score6 +"%");
		Assert.assertFalse(score6 > 97);
		Thread.sleep(2000);

		screen.click(spin);
		Thread.sleep(2000);

		// Verify the alert pop-up
		Finder finder61 =new Finder(screen.capture().getImage());
		String ht61 = finder61.find(insufficiant);
		double score61=20;                
		System.out.println("the value of ht61"+" "+ht61);
		if(finder61.hasNext())
		{
			Match m61=finder61.next();
			System.out.println("Match Found with: "+(m61.getScore())*100+"%");
			score61=(m61.getScore())*100;
			System.out.println("Insufficiant balance message is displayed. Test case passed");
			finder61.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Insufficiant balance message is displayes & Comparision value equals to: "+" "+score61 +"%");
		Assert.assertTrue(score61 > 97);
		Thread.sleep(2000);

		screen.click(ok);
		Thread.sleep(2000);

		// Again click on Spin button 
		screen.click(spin);
		Thread.sleep(2000);

		// Verify the alert pop-up is again displayed on click of spin button 
		Finder finder71 =new Finder(screen.capture().getImage());
		String ht71 = finder71.find(insufficiant);
		double score71=20;                
		System.out.println("the value of ht71"+" "+ht71);
		if(finder71.hasNext())
		{
			Match m71=finder71.next();
			System.out.println("Match Found with: "+(m71.getScore())*100+"%");
			score71=(m71.getScore())*100;
			System.out.println("Insufficiant balance message is displayed. Test case passed");
			finder71.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Insufficiant balance message is displayes & Comparision value equals to: "+" "+score71 +"%");
		Assert.assertTrue(score71 > 97);
		Thread.sleep(2000);

		screen.click(ok);
		Thread.sleep(2000);

		screen.click(credit_dec);
		Thread.sleep(2000);
		screen.click(credit_dec);
		Thread.sleep(2000);
		screen.click(credit_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);

		screen.click(spin);
		Thread.sleep(5000);


		// Verify the home button is active and manual spin is continued after decreasing bet and credit values
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(home);
		double score11=20;                
		System.out.println("the value of ht"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Home button is present on screen. Test case passed");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Home button is present on screen & Comparision value equals to: "+" "+score11+"%");
		Assert.assertTrue(score11 > 97);
	}

	@Then("^Player should be blocked from playing the game when there is less balance in the account in Brownie Hot game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_less_balance_in_the_account_in_Brownie_Hot_game() throws Throwable {
		Thread.sleep(2000);
	}

	@Then("^Decrease the credit and bet value and again start the spin in Brownie Hot Slot game$")
	public void decrease_the_credit_and_bet_value_and_again_start_the_spin_in_Brownie_Hot_Slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
