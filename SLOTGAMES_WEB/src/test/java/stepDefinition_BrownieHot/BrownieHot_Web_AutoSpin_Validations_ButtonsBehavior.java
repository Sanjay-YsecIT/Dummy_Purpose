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

public class BrownieHot_Web_AutoSpin_Validations_ButtonsBehavior {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_check_for_buttons_behavior_functionality() throws Throwable {
		this.driver = BrownieHot_URL_Login.getDriver();
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_behavior_of_different_buttons_in_different_scenarios() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Brownie_Hot/placebet.PNG", 30);

		Pattern autoicon=new Pattern("Images/Brownie_Hot/autoplay.PNG");
		Pattern spin=new Pattern("Images/Brownie_Hot/spin.PNG");
		Pattern auto_stop=new Pattern("Images/Brownie_Hot/auto_stop.PNG");
		Pattern auto_auto=new Pattern("Images/Brownie_Hot/auto_auto.PNG");
		Pattern auto_home=new Pattern("Images/Brownie_Hot/auto_home.PNG");
		Pattern auto_info=new Pattern("Images/Brownie_Hot/auto_info.PNG");
		Pattern auto_lines=new Pattern("Images/Brownie_Hot/auto_lines.PNG");
		Pattern auto_turbo=new Pattern("Images/Brownie_Hot/auto_turbo.PNG");
		Pattern auto_credit=new Pattern("Images/Brownie_Hot/auto_credit.PNG");
		Pattern auto_betvalue=new Pattern("Images/Brownie_Hot/auto_betvalue.PNG");
		Pattern auto_betvalue_click=new Pattern("Images/Brownie_Hot/auto_betvalue_click.PNG");
		Pattern auto_credit_click=new Pattern("Images/Brownie_Hot/auto_credit_click.PNG");
		Pattern bet=new Pattern("Images/Brownie_Hot/bet1.PNG");
		Pattern payout1_1=new Pattern("Images/Brownie_Hot/payout1_1.PNG");
		Pattern placebet=new Pattern("Images/Brownie_Hot/placebet.PNG");
		Pattern credit1=new Pattern("Images/Brownie_Hot/credit1.PNG");
		Pattern astop=new Pattern("Images/Brownie_Hot/spin_stop.PNG");

		//selecting auto spins by clicking auto spin icon
		screen.click(autoicon);
		Thread.sleep(2000);
		screen.click(auto_auto);
		Thread.sleep(2000);

		//Comparing stop button is visible 
		//Comparing if the home button is clicked then stop button is not visible
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(astop);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Testcase3: Stop button is visible during autoplay. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Testcase 2 & 3 Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		//comparing home disabled button and not clickable
		Finder finder =new Finder(screen.capture().getImage());
		screen.wait(auto_home, 20);
		String ht = finder.find(auto_home);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Testcase2: Disabled home is visible and not clickable during autoplay. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase2 Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		screen.click(auto_home);
		Thread.sleep(1000);
		screen.click(auto_home);
		Thread.sleep(1000);

		//comparing the Credit value button should be disabled and not clickable
		screen.wait(auto_credit, 20);
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(auto_credit);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Testcase4: Disabled credit value button is visible");
			System.out.println("TC2:Stop button is visible hence home button click is not working during autoplay. Test case1 passed successfully");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Tedst case failed");         
		}
		System.out.println("Testcase4 comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		screen.click(auto_credit_click);
		Thread.sleep(1000);
		screen.click(auto_credit_click);
		Thread.sleep(1000);

		//Comparing the credit value after clicking on disbled credit value button and it should be 0.01
		screen.wait(credit1, 20);
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(credit1);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("After clicking on credit button, credit value selected is 0.01. Test case3 passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Test case: 3 comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);

		//comparing the Bet value button should be disabled and not clickable
		screen.wait(auto_betvalue, 20);
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(auto_betvalue);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Testcase5: Disabled Bet value button is visible");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Testcase5 comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);

		screen.click(auto_betvalue_click);
		Thread.sleep(1000);
		screen.click(auto_betvalue_click);
		Thread.sleep(1000);

		//Comparing the Bet value after clicking on disbled Bet value button and it should be 0.2
		screen.wait(bet, 20);
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(bet);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("After clicking on Bet button, credit value selected is 0.2. Test case4 passed");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase: 6 comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 9);

		//comparing info disabled button and not clickable
		screen.wait(auto_info, 20);
		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(auto_info);
		double score6=20;                
		System.out.println("the value of ht"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("Testcase6: Disabled INFO button is visible and not clickable during autoplay. Test case passed");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase6 comparision value equals to: "+" "+score6 +"%");
		Assert.assertTrue(score6 > 97);

		screen.click(auto_info);
		Thread.sleep(1000);
		screen.click(auto_info);
		Thread.sleep(1000);

		//comparing if the info button click is working
		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(payout1_1);
		double score7=20;                
		System.out.println("the value of ht"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("Testcase7:Payout screen for betvalue 0.3 is not visible after clicking on info button . Test case passed");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase7 comparision value equals to: "+" "+score7 +"%");
		Assert.assertFalse(score7 > 97);

		//comparing the paylines button should be disabled and not clickable
		screen.wait(auto_lines, 20);
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(auto_lines);
		double score21=20;                
		System.out.println("the value of ht21"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("Testcase8: Disabled paylines button is visible");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase8 comparision value equals to: "+" "+score21 +"%");
		Assert.assertTrue(score21 > 97);

		screen.click(auto_lines);
		Thread.sleep(1000);
		screen.click(auto_lines);
		Thread.sleep(2000);

		//Comparing the paylines button on disabled button and it should be 30
		Finder finder31 =new Finder(screen.capture().getImage());
		String ht31 = finder31.find(auto_lines);
		double score31=20;                
		System.out.println("the value of ht31"+" "+ht31);
		if(finder31.hasNext())
		{
			Match m31=finder31.next();
			System.out.println("Match Found with: "+(m31.getScore())*100+"%");
			score31=(m31.getScore())*100;
			System.out.println("After clicking on paylines button paylines is 30. Test case3 passed");
			finder31.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Test case: comparision value equals to: "+" "+score31 +"%");
		Assert.assertTrue(score31 > 97);

		//comparing the disabled turbo button should be disabled and not clickable
		screen.click(auto_turbo);
		Thread.sleep(2000);
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(auto_turbo);
		double score22=20;                
		System.out.println("the value of ht22"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("Testcase8: Disabled turbo button is visible and not cickable");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase8 comparision value equals to: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 97);

		screen.click(auto_stop);
		Thread.sleep(6000);

		//Checking the functionality of stop button
		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(spin);
		double score8=20;                
		System.out.println("the value of ht"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("Test case 8: Spin button is visible after clicking on stop button. Hence stop button functionality wokring.  Test case passed");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Test case 8 comparision value equals to: "+" "+score8 +"%");
		Assert.assertTrue(score8 > 97);

		//Check message 'Please place your bet' after clicking on stop button
		Finder finder9 =new Finder(screen.capture().getImage());
		String ht9 = finder9.find(placebet);
		double score9=20;                
		System.out.println("the value of ht"+" "+ht9);
		if(finder9.hasNext())
		{
			Match m9=finder9.next();
			System.out.println("Match Found with: "+(m9.getScore())*100+"%");
			score9=(m9.getScore())*100;
			System.out.println("Test case 9: 'Please place your bet' message should be displayed after clicking on stop button. Test case passed");
			finder9.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Test case 9 comparision value equals to: "+" "+score9 +"%");
		Assert.assertTrue(score9 > 97);
	}

	@Then("^Bet value & Credit value buttons should not be clickable$")
	public void bet_value_Credit_value_buttons_should_not_be_clickable() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Home & Info buttons should not be clickable$")
	public void home_Info_buttons_should_not_be_clickable() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Spin button should not visible & Stop button should be visible and clickable$")
	public void spin_button_should_not_visible_Stop_button_should_be_visible_and_clickable() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Spin button should be visble after clicking on stop button$")
	public void spin_button_should_be_visble_after_clicking_on_stop_button() throws Throwable {
		driver.quit();
	}
}
