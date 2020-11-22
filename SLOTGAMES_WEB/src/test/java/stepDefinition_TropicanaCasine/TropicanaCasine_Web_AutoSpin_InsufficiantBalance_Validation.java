package stepDefinition_TropicanaCasine;

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

public class TropicanaCasine_Web_AutoSpin_InsufficiantBalance_Validation {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, balance, AutoSpin button, validation message, maxbet button, credit decrement button$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_balance_AutoSpin_button_validation_message_maxbet_button_credit_decrement_button() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select maxbet, click on Autospin button till balance turns to zero and check the validation message and decrement the denomination and again spin the reels$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_maxbet_click_on_Autospin_button_till_balance_turns_to_zero_and_check_the_validation_message_and_decrement_the_denomination_and_again_spin_the_reels() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);
		
		Pattern autoplay=new Pattern("Images/Tropicana_Casine/autoplay.PNG");
		Pattern disable_spin=new Pattern("Images/Tropicana_Casine/disable_spin.PNG");
		Pattern disable_bet4_5=new Pattern("Images/Tropicana_Casine/disable_bet4_5.PNG");
		Pattern disable_betval=new Pattern("Images/Tropicana_Casine/bet_dropdown4.PNG");
		Pattern disable_cr1=new Pattern("Images/Tropicana_Casine/cr1.PNG");
		Pattern disable_credit4=new Pattern("Images/Tropicana_Casine/disable_credit4.PNG");
		Pattern autolist=new Pattern("Images/Tropicana_Casine/autolist.PNG");
		Pattern astop=new Pattern("Images/Tropicana_Casine/spin_stop.PNG");
		Pattern autoplay_disable=new Pattern("Images/Tropicana_Casine/autoplay_disable.PNG");
		Pattern info_disable=new Pattern("Images/Tropicana_Casine/info_disable.PNG");
		Pattern home_disable=new Pattern("Images/Tropicana_Casine/home_disable.PNG");
		Pattern turbo_disable=new Pattern("Images/Tropicana_Casine/turbo_disable.PNG");
		Pattern paylines_disable=new Pattern("Images/Tropicana_Casine/paylines_disable.PNG");
		Pattern maximize_disable=new Pattern("Images/Tropicana_Casine/maximize_disable.PNG");
		Pattern hidden_disable=new Pattern("Images/Tropicana_Casine/hidden_disable.PNG");
		Pattern bal_disable=new Pattern("Images/Tropicana_Casine/bal_disable.PNG");
		Pattern creditdec_disable=new Pattern("Images/Tropicana_Casine/creditdec_disable.PNG");
		Pattern betdec_disable=new Pattern("Images/Tropicana_Casine/betdec_disable.PNG");
		Pattern auto_auto=new Pattern("Images/Tropicana_Casine/auto_auto.PNG");
		Pattern maxbet=new Pattern("Images/Tropicana_Casine/maxbet.PNG");
		Pattern ok=new Pattern("Images/Tropicana_Casine/ok.PNG");
		Pattern insufficiant=new Pattern("Images/Tropicana_Casine/insufficiant.PNG");
		Pattern credit_dec=new Pattern("Images/Tropicana_Casine/credit_dec.PNG");
		Pattern bet_dec=new Pattern("Images/Tropicana_Casine/bet_dec.PNG");
		Pattern spin=new Pattern("Images/Tropicana_Casine/spin.PNG");

		Pattern symb_1_1=new Pattern("Images/Tropicana_Casine/symb_1_1.PNG");

		//autoplay list alignment, font, color button validation
		screen.click(autoplay);
		Thread.sleep(2000);
		System.out.println("tapping on autoplay button");
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(autolist);
		double score11=20;                
		System.out.println("the value of ht"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Autolist dropdown comparsion successfull.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Autolist dropdown  & Comparision value equals to: "+" "+score11+"%");
		Assert.assertTrue(score11 > 97);

		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);

		//Click on maxbet button and start autoplay again
		screen.click(maxbet);
		Thread.sleep(1000);
		screen.click(auto_auto);
		Thread.sleep(8000);

		//click on max bet to check insufficient balance message
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
		Assert.assertTrue(score6 > 94);
		Thread.sleep(2000);

		//Check the game buttons state during insufficient balance alert
		//spin button
		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(disable_spin);
		double score7=20;                
		System.out.println("the value of ht"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("Spin button is disabled during insufficient alert. Test case passed");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Spin button is disabled to click & Comparision value equals to: "+" "+score7 +"%");
		Assert.assertTrue(score7 > 97);

		//home button
		screen.click(home_disable);
		Thread.sleep(1000);
		System.out.println("tapping on home");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(home_disable);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("home button is present on screen and disabled during insufficient alert. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("home button is disabled to click & Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		//betvalues button
		screen.click(disable_bet4_5);
		Thread.sleep(1000);
		System.out.println("tapping on betvalue button");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(disable_betval);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("betvalues is not present on screen during insufficient alert. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case passed");         
		}
		System.out.println("betvalues is not present on screen & Comparision value equals to: "+" "+score2 +"%");
		Assert.assertFalse(score2 > 97);

		//bet decrement button
		// bet dec button is tapped and verified whether the bet value decremented upon tapping
		screen.click(betdec_disable);
		Thread.sleep(1000);
		System.out.println("tapping on bet decrement button");
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(disable_bet4_5);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("successive betvalues is not present on screen during insufficient alert. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("successive betvalues is not present on screen & Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);

		//Credit button validation
		screen.click(disable_credit4);
		Thread.sleep(1000);
		System.out.println("tapping on credit value");
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(disable_cr1);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("credit values is not present on screen during insufficient alert. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case passed");         
		}
		System.out.println("credit values is not present on screen & Comparision value equals to: "+" "+score4 +"%");
		Assert.assertFalse(score4 > 97);

		//Credit button validation
		screen.click(creditdec_disable);
		Thread.sleep(1500);
		System.out.println("tapping on credit decrement button");
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(disable_credit4);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("credit values is not decremented during insufficient alert. Test case passed");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit values is not decremented & Comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 96);

		//maximum screen button validation
		screen.click(maximize_disable);
		Thread.sleep(1000);
		System.out.println("tapping on maximum button");
		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(maximize_disable);
		double score8=20;                
		System.out.println("the value of ht"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("disabled maximum button still availiable on screen during insufficient alert. Test case passed");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("disabled max button is present on screen & Comparision value equals to: "+" "+score8 +"%");
		Assert.assertTrue(score8 > 95);

		//turbo button validation
		screen.click(turbo_disable);
		Thread.sleep(1000);
		System.out.println("tapping on turbo button");
		Finder finder9 =new Finder(screen.capture().getImage());
		String ht9 = finder9.find(turbo_disable);
		double score9=20;                
		System.out.println("the value of ht"+" "+ht9);
		if(finder9.hasNext())
		{
			Match m9=finder9.next();
			System.out.println("Match Found with: "+(m9.getScore())*100+"%");
			score9=(m9.getScore())*100;
			System.out.println("disabled turbo is in off state on screen during insufficient alert. Test case passed");
			finder9.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("disabled turbo is in off state on screen & Comparision value equals to: "+" "+score9 +"%");
		Assert.assertTrue(score9 > 96);

		//autoplay button validation
		screen.click(autoplay_disable);
		Thread.sleep(1000);
		System.out.println("tapping on autoplay button");
		Finder finder10 =new Finder(screen.capture().getImage());
		String ht10 = finder10.find(autoplay_disable);
		double score10=20;                
		System.out.println("the value of ht"+" "+ht10);
		if(finder10.hasNext())
		{
			Match m10=finder10.next();
			System.out.println("Match Found with: "+(m10.getScore())*100+"%");
			score10=(m10.getScore())*100;
			System.out.println("disabled autoplay is inactive on screen during insufficient alert");
			finder10.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case passed");         
		}
		System.out.println("disabled autoplay is inactive on screen & Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score10 > 96);

		//info button validation
		screen.click(info_disable);
		Thread.sleep(1000);
		System.out.println("tapping on turbo button");
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(autoplay_disable);
		double score12=20;                
		System.out.println("the value of ht"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("disabled info button is clicked and still autoplay available on screen during insufficient alert. Test case passed");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("disabled info button is clicked and still autoplay available on screen & Comparision value equals to: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 95);


		//info button validation
		screen.click(hidden_disable);
		Thread.sleep(1000);
		System.out.println("tapping on hidden button");
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(bal_disable);
		double score13=20;                
		System.out.println("the value of ht"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("disabled hidden button is clicked and balance available on screen during insufficient alert");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("disabled hidden button is clicked and balance available on screen & Comparision value equals to: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 95);

		//paylines button validation
		screen.click(paylines_disable);
		Thread.sleep(1000);
		System.out.println("tapping on paylines button");
		Finder finder14 =new Finder(screen.capture().getImage());
		String ht14 = finder14.find(paylines_disable);
		double score14=20;                
		System.out.println("the value of ht"+" "+ht14);
		if(finder14.hasNext())
		{
			Match m14=finder14.next();
			System.out.println("Match Found with: "+(m14.getScore())*100+"%");
			score14=(m14.getScore())*100;
			System.out.println("disabled paylines button is clicked and still available on screen during insufficient alert. Test case passed");
			finder14.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case passed");         
		}
		System.out.println("disabled paylines button is clicked and is inactive in the game & Comparision value equals to: "+" "+score14 +"%");
		Assert.assertTrue(score14 > 95);

		screen.click(ok);
		Thread.sleep(3000);

		//Verify spin button state after accepting the insufficient alert pop-up
		Finder finder17 =new Finder(screen.capture().getImage());
		String ht17 = finder17.find(spin);
		double score17=20;                
		System.out.println("the value of ht"+" "+ht17);
		if(finder17.hasNext())
		{
			Match m17=finder17.next();
			System.out.println("Match Found with: "+(m17.getScore())*100+"%");
			score17=(m17.getScore())*100;
			System.out.println("Spin button is active on screen after accepting alert pop-up. Test case passed");
			finder17.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Spin button is active on screen after accepting alert pop-up & Comparision value equals to: "+" "+score17 +"%");
		Assert.assertTrue(score17 > 97);
		Thread.sleep(2000);

		//Verify autoplay button state after accepting the insufficient alert pop-up
		Finder finder18 =new Finder(screen.capture().getImage());
		String ht18 = finder18.find(autoplay);
		double score18=20;                
		System.out.println("the value of ht"+" "+ht18);
		if(finder18.hasNext())
		{
			Match m18=finder18.next();
			System.out.println("Match Found with: "+(m18.getScore())*100+"%");
			score18=(m18.getScore())*100;
			System.out.println("autoplay button is active on screen after accepting alert pop-up. Test case passed");
			finder18.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("autoplay button is active on screen after accepting alert pop-up & Comparision value equals to: "+" "+score18 +"%");
		Assert.assertTrue(score18 > 97);


		//decrement the bet and credit values after accepting insufficient balance alert
		screen.click(credit_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);
		screen.click(autoplay);
		Thread.sleep(2000);
		screen.click(auto_auto);
		Thread.sleep(1000);

		//Checking Spin spot button availabiity after validation message
		Finder finder15 =new Finder(screen.capture().getImage());
		String ht15 = finder15.find(astop);
		double score15=20;                
		System.out.println("the value of ht"+" "+ht15);
		if(finder15.hasNext())
		{
			Match m15=finder15.next();
			System.out.println("Match Found with: "+(m15.getScore())*100+"%");
			score15=(m15.getScore())*100;
			System.out.println("spin stop button available on screen after decrementing the credit and bet values. Test case passed");
			finder15.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("spin stop button available on screen after decrementing the credit and bet values & Comparision value equals to: "+" "+score15 +"%");
		Assert.assertTrue(score15 > 97);
	}

	@Then("^Check for the game buttons during the insufficient alert message in the Tropicana Casine slot game$")
	public void check_for_the_game_buttons_during_the_insufficient_alert_message_in_the_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account and after decrementing credit and trigger autospin in  game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_and_after_decrementing_credit_and_trigger_autospin_in_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
