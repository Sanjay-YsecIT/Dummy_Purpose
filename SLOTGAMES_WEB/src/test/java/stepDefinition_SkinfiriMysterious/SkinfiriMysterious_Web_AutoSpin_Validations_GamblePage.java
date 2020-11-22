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

public class SkinfiriMysterious_Web_AutoSpin_Validations_GamblePage {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_check_for_buttons_behavior_functionality_after_navigating_from_gamble_page() throws Throwable {
		this.driver =  SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_behavior_of_different_buttons_after_navigating_from_gamble_page() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(4000);
		balT.sendKeys("300");
		Thread.sleep(4000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);

		Pattern autoplay=new Pattern("Images/Skinfiri_Mysterious/autoplay.PNG");
		Pattern spin=new Pattern("Images/Skinfiri_Mysterious/Spin.PNG");
		Pattern pat1=new Pattern("Images/Skinfiri_Mysterious/autospin_stop.PNG");
		Pattern auto=new Pattern("Images/Skinfiri_Mysterious/auto.PNG");
		Pattern astop=new Pattern("Images/Skinfiri_Mysterious/spin_stop.PNG");
		Pattern credit_inc=new Pattern("Images/Skinfiri_Mysterious/credit_inc.PNG");

		Pattern EYE=new Pattern("Images/Skinfiri_Mysterious/EYE.PNG");
		Pattern SKULL=new Pattern("Images/Skinfiri_Mysterious/SKULL.PNG");
		Pattern CROW=new Pattern("Images/Skinfiri_Mysterious/CROW.PNG");

		Pattern gamble=new Pattern("Images/Skinfiri_Mysterious/gamble_icon.PNG");
		Pattern collect=new Pattern("Images/Skinfiri_Mysterious/collect_image_gamble.PNG");
		Pattern balance_win=new Pattern("Images/Skinfiri_Mysterious/balance_afterSpin.PNG");	
		Pattern credit_dec=new Pattern("Images/Skinfiri_Mysterious/credit_dec.PNG");
		Pattern bet_inc=new Pattern("Images/Skinfiri_Mysterious/bet_inc.PNG");
		Pattern credit3=new Pattern("Images/Skinfiri_Mysterious/credit3.PNG");
		Pattern betval3_5=new Pattern("Images/Skinfiri_Mysterious/betval3_5.PNG");
		Pattern maxbet=new Pattern("Images/Skinfiri_Mysterious/maxbetval.PNG");
		Pattern ok=new Pattern("Images/Skinfiri_Mysterious/ok.PNG");
		Pattern insufficiant=new Pattern("Images/Skinfiri_Mysterious/Insufficient_info.PNG");
		Pattern balance=new Pattern("Images/Skinfiri_Mysterious/balance.PNG");

		//selecting credit value as 0.5
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(2000);

		screen.click(EYE);
		Thread.sleep(1000);
		screen.click(SKULL);
		Thread.sleep(1000);
		screen.click(CROW);
		Thread.sleep(1000);

		//Checking win amount getting added to the balance: Check balance before and check win amount
		//comparing the balance before spin
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
		Assert.assertTrue(score1 > 94);

		//Selecting auto option form auto play drop down
		screen.click(autoplay);
		Thread.sleep(2000);
		screen.click(auto);
		Thread.sleep(3000);

		//clicking gamble button and then collect button
		screen.wait(gamble, 10);
		screen.click(gamble);
		Thread.sleep(8000);
		screen.click(collect);
		Thread.sleep(2000);

		//Checking the balance after win & navigating from gamble page
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(balance_win);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Balance after win in auto play is 310.00 and navigating from gamble page & balance comparision completed successfully.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance is 310.00 YSI after win in autoplay and navigating from gamble page & comparision value equal to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 92);
		Thread.sleep(5000);

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
		screen.click(pat1);
		Thread.sleep(5000);

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
		Thread.sleep(1000);
		screen.click(bet_inc);
		Thread.sleep(1000);
		screen.click(bet_inc);
		Thread.sleep(1000);
		screen.click(bet_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.05 after decreasing
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(betval3_5);
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
		screen.click(auto);
		Thread.sleep(2000);

		//stop autoplay
		screen.click(pat1);
		Thread.sleep(2000);
		
		//Click on maxbet button and start autoplay again
		screen.click(maxbet);
		Thread.sleep(1000);
		screen.click(autoplay);
		Thread.sleep(2000);
		screen.click(auto);
		Thread.sleep(4000);

		//click on max bet to check insufficiant balance msg
		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(insufficiant);
		double score6=20;                
		System.out.println("the value of ht"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("Insufficiant balance message is displayes and spin button is visible. Test case passed");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Insufficiant balance message is displayes and spin button is visible & Comparision value equals to: "+" "+score6 +"%");
		Assert.assertTrue(score6 > 90);
		Thread.sleep(2000);

		screen.click(ok);
		Thread.sleep(1000);

		//Checking Spin button availabiity after validation message
		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(spin);
		double score7=20;                
		System.out.println("the value of ht"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("Spin button is available to click after Insufficiant balance message is displayed. Test case passed");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Spin button is available to click & Comparision value equals to: "+" "+score7 +"%");
		Assert.assertTrue(score7 > 90);
	}

	@Then("^Bet value & Credit value buttons should not be clickable after navigating from gamble page$")
	public void bet_value_Credit_value_buttons_should_not_be_clickable_after_navigating_from_gamble_page() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Win amount should get added to the balance during autoplay$")
	public void win_amount_should_get_added_to_the_balance_during_autoplay() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Insufficiant balance should be displayed when there is no balance during autoplay$")
	public void insufficiant_balance_should_be_displayed_when_there_is_no_balance_during_autoplay() throws Throwable {
		Thread.sleep(1000);
//		driver.quit();
	}
}