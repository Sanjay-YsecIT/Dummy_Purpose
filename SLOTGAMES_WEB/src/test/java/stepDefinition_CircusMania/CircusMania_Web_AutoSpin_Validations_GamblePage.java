package stepDefinition_CircusMania;

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

public class CircusMania_Web_AutoSpin_Validations_GamblePage {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_check_for_buttons_behavior_functionality_after_navigating_from_gamble_page() throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_behavior_of_different_buttons_after_navigating_from_gamble_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);
		
		Pattern autoplay=new Pattern("Images/Circus_Mania/autoplay.PNG");
		Pattern auto_stop=new Pattern("Images/Circus_Mania/auto_stop.PNG");
		Pattern auto_auto=new Pattern("Images/Circus_Mania/auto_auto.PNG");
		Pattern astop=new Pattern("Images/Circus_Mania/spin_stop.PNG");
		Pattern credit_inc=new Pattern("Images/Circus_Mania/credit_inc.PNG");
		Pattern gamble=new Pattern("Images/Circus_Mania/gamble.PNG");
		Pattern collect=new Pattern("Images/Circus_Mania/collect.PNG");
		Pattern credit_dec=new Pattern("Images/Circus_Mania/credit_dec.PNG");
		Pattern bet_inc=new Pattern("Images/Circus_Mania/bet_inc.PNG");
		Pattern balance=new Pattern("Images/Circus_Mania/balance.PNG");
		Pattern balance_afterspin=new Pattern("Images/Circus_Mania/balance_afterspin.PNG");
		Pattern credit3=new Pattern("Images/Circus_Mania/credit3.PNG");
		Pattern bet3_5=new Pattern("Images/Circus_Mania/bet3_5.PNG");

		Pattern symb_1=new Pattern("Images/Circus_Mania/symb_1.PNG");
		Pattern symb_2=new Pattern("Images/Circus_Mania/symb_2.PNG");
		Pattern symb_3=new Pattern("Images/Circus_Mania/symb_3.PNG");

		//Checking win amount getting added to the balance: Check balance before and check win amount
		//comparing the balance before spin
		Thread.sleep(3000);
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance is 300 before autoplay & comparision completed successfully.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance is 300 before autoplay & comparision value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);	

		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(symb_2);
		Thread.sleep(1000);
		screen.click(symb_3);
		Thread.sleep(1000);
		screen.click(symb_3);
		Thread.sleep(1000);
		screen.click(symb_1);
		Thread.sleep(1000);
		
		//selecting credit value as 0.5
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(2000);

		//Selecting auto option form auto play drop down
		screen.click(autoplay);
		Thread.sleep(2000);
		screen.click(auto_auto);
		Thread.sleep(5000);

		//clicking gamble button and then collect button
		screen.wait(gamble, 10);
		screen.click(gamble);
		Thread.sleep(8000);
		screen.click(collect);
		Thread.sleep(3000);

		/*Checking the balance after win & navigating from gamble page
		  As the next iteration is triggered hence the image comparison is taken after 1spin iteration
		  balance before spin-290
		  win amount is 15 and it is added to main balance after collecting from gamble page hence new bal is 305
		 * 305 is at main balance and after next spin balance is 295 in main balance field
		 * Hence 295 is taken consideration for win amount added to balance during autospin returning from gamble
		 */
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(balance_afterspin);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Balance after win in auto play is 295 and navigating from gamble page & balance comparision completed successfully.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance is 296 SRD after win in autoplay and navigating from gamble page & comparision value equal to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 92);
		Thread.sleep(1000);

		//Check navigating from gamble page, autoplay should continue hence stop button should be displayed
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(astop);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("After navigating from gamble page, autoplay spins still continuing. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Test case comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);

		//stop autoplay after navigating from gamble page
		screen.click(auto_stop);
		Thread.sleep(3000);

		//decrease credit value
		screen.click(credit_dec);
		Thread.sleep(2000);

		//comparing the credit value should be 0.05 after decreasing
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(credit3);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Credit value is 0.05. Able to decrease the credit value after navigating from gamble page. ");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println(" comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 90);

		//increase credit value
		screen.click(bet_inc);
		Thread.sleep(2000);
		screen.click(bet_inc);
		Thread.sleep(2000);
		screen.click(bet_inc);
		Thread.sleep(2000);
		screen.click(bet_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.05 after decreasing
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(bet3_5);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("Bet value is 20. Able to increase the bet value after navigating from gamble page. ");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println(" comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 90);

		//Start autoplay
		screen.click(autoplay);
		Thread.sleep(2000);
		screen.click(auto_auto);
		Thread.sleep(2000);

		//stop autoplay
		screen.click(auto_stop);
		Thread.sleep(2000);
	}

	@Then("^Bet value & Credit value buttons should be clickable after navigating from gamble page when autospin is stopped in Circus Mania slot game$")
	public void bet_value_Credit_value_buttons_should_be_clickable_after_navigating_from_gamble_page_when_autospin_is_stopped_in_Circus_Mania_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Win amount should get added to the balance during autoplay$")
	public void win_amount_should_get_added_to_the_balance_during_autoplay() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
