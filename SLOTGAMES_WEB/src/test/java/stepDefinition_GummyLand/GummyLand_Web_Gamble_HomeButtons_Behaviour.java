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

public class GummyLand_Web_Gamble_HomeButtons_Behaviour {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Gummy Land slot game, spin, gamble link, gamble page, HUD buttons$")
	public void chrome_browser_valid_URL_valid_login_details_Gummy_Land_slot_game_spin_gamble_link_gamble_page_HUD_buttons() throws Throwable {
		this.driver = GummyLand_URL_Login.getDriver();
	}

	@When("^Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, spin the reels and access to gamble and click on HUD buttons present on the screen$")
	public void open_the_Gummy_Land_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_spin_the_reels_and_access_to_gamble_and_click_on_HUD_buttons_present_on_the_screen() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Gummy_Land/GummyLand.PNG", 30);

		Pattern maximize=new Pattern("Images/Gummy_Land/maximize.PNG");
		Pattern disable_home=new Pattern("Images/Gummy_Land/disable_home.PNG");
		Pattern spin=new Pattern("Images/Gummy_Land/spin.PNG");       
		Pattern url=new Pattern("Images/Gummy_Land/url.PNG");
		Pattern gamble=new Pattern("Images/Gummy_Land/gamble.PNG"); 

		Pattern disable_info=new Pattern("Images/Gummy_Land/disable_info.PNG");
		Pattern disable_lines=new Pattern("Images/Gummy_Land/disable_lines.PNG");
		Pattern disable_turbo=new Pattern("Images/Gummy_Land/disable_turbo.PNG");
		Pattern disable_credit=new Pattern("Images/Gummy_Land/disable_credit1.PNG");
		Pattern disable_betvalue=new Pattern("Images/Gummy_Land/disable_betvalue.PNG");
		Pattern disable_betvalue_click=new Pattern("Images/Gummy_Land/disable_betvalue_click.PNG");
		Pattern bet=new Pattern("Images/Gummy_Land/bet1.PNG");
		Pattern disable_autoplay=new Pattern("Images/Gummy_Land/disable_autoplay.PNG");
		Pattern disable_spin=new Pattern("Images/Gummy_Land/disable_spin.PNG");
		Pattern autolist=new Pattern("Images/Gummy_Land/autolist.PNG");
		Pattern credit1=new Pattern("Images/Gummy_Land/credit1.PNG");
		Pattern cr1=new Pattern("Images/Gummy_Land/cr1.PNG");
		Pattern spin_stop=new Pattern("Images/Gummy_Land/spin_stop.PNG");
		Pattern disable_maxbet=new Pattern("Images/Gummy_Land/disable_maxbet.PNG");
		Pattern maxbet4=new Pattern("Images/Gummy_Land/maxbet4.PNG");
		Pattern disable_hidden=new Pattern("Images/Gummy_Land/hidden_disable.PNG");
		Pattern Afterspin_bal=new Pattern("Images/Gummy_Land/balance1_1.PNG");
		Pattern bal=new Pattern("Images/Gummy_Land/balance1_1.PNG");

		Pattern symb_1=new Pattern("Images/Gummy_Land/symb_1.PNG");

		// WIN PATTERN COMBINATION 
		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);
		screen.click(gamble);
		Thread.sleep(3000);

		// Comparing balance field should not be clickable
		screen.click(bal);
		Thread.sleep(1000);

		Finder finder32 =new Finder(screen.capture().getImage());
		String ht32 = finder32.find(bal);
		double score32=20;                
		System.out.println("the value of ht32"+" "+ht32);
		if(finder32.hasNext())
		{
			Match m32=finder32.next();
			System.out.println("Match Found with: "+(m32.getScore())*100+"%");
			score32=(m32.getScore())*100;
			System.out.println("Balance field is not clickable. Test case passed");
			finder32.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance field is not clickable Comparision value equals to: "+" "+score32 +"%");
		Assert.assertTrue(score32 > 97);
		
		//Check for Gamble icon is present on the screen when gamble page is accessed
		Finder finder33 =new Finder(screen.capture().getImage());
		String ht33 = finder33.find(gamble);
		double score33=20;                
		System.out.println("the value of ht32"+" "+ht33);
		if(finder33.hasNext())
		{
			Match m33=finder33.next();
			System.out.println("Match Found with: "+(m33.getScore())*100+"%");
			score33=(m33.getScore())*100;
			System.out.println("Balance field is not clickable. Test case passed");
			finder32.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance field is not clickable Comparision value equals to: "+" "+score32 +"%");
		Assert.assertFalse(score32 > 97);

		//comparing home disabled button and not clickable
		screen.click(disable_home);
		Thread.sleep(1000);
		screen.click(disable_home);
		Thread.sleep(1000);

		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(disable_home);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Testcase2: Disabled home is visible and not clickable during gamble. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase2 Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//comparing info disabled button and not clickable
		screen.click(disable_info);
		Thread.sleep(1000);
		screen.click(disable_info);
		Thread.sleep(1000);

		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(disable_info);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Testcase3: Disabled info is visible and not clickable during gamble. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase3 Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 95);

		//comparing maximum disabled button and not clickable
		screen.click(maximize);
		Thread.sleep(1000);

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(url);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Testcase4: Disabled maximum button is visible and not clickable during gamble. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase4 Comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 95);

		//comparing left payline disabled button and not clickable
		screen.click(disable_lines);
		Thread.sleep(1000);
		screen.click(disable_lines);
		Thread.sleep(1000);

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(disable_lines);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Testcase5: Disabled payline button is visible and not clickable during gamble. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase5 Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);

		//comparing turbo button is disabled and not clickable
		screen.click(disable_turbo);
		Thread.sleep(1000);
		screen.click(disable_turbo);
		Thread.sleep(1000);

		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(disable_turbo);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Testcase6: Disabled turbo button is visible and not clickable during gamble. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase6 Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 96);


		//comparing the Credit value button should be disabled and not clickable
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(disable_credit);
		double score21=20;                
		System.out.println("the value of ht21"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("Testcase4: Disabled credit value button is visible");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Tedst case failed");         
		}
		System.out.println("Testcase4 comparision value equals to: "+" "+score21 +"%");
		Assert.assertTrue(score21 > 97);

		screen.click(credit1);
		Thread.sleep(1000);
		//Comparing the credit value after clicking on disbled credit value button and it should be 0.01
		Finder finder31 =new Finder(screen.capture().getImage());
		String ht31 = finder31.find(cr1);
		double score31=20;                
		System.out.println("the value of ht31"+" "+ht31);
		if(finder31.hasNext())
		{
			Match m31=finder31.next();
			System.out.println("Match Found with: "+(m31.getScore())*100+"%");
			score31=(m31.getScore())*100;
			System.out.println("After clicking on credit button, credit value is 0.02 is verified on screen. Test case3 passed");
			finder31.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Test case: 3 comparision value equals to: "+" "+score31 +"%");
		Assert.assertFalse(score31 > 97);

		//comparing the Bet value button should be disabled and not clickable
		Finder finder14 =new Finder(screen.capture().getImage());
		String ht14 = finder14.find(disable_betvalue);
		double score14=20;                
		System.out.println("the value of ht14"+" "+ht14);
		if(finder14.hasNext())
		{
			Match m14=finder14.next();
			System.out.println("Match Found with: "+(m14.getScore())*100+"%");
			score14=(m14.getScore())*100;
			System.out.println("Testcase5: Disabled Bet value button is visible");
			finder14.destroy();  
		}         
		else    
		{ 
			System.out.println("Testcase5 comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score14 +"%");
		Assert.assertTrue(score14 > 97);

		screen.click(disable_betvalue_click);
		Thread.sleep(1000);
		screen.click(disable_betvalue_click);
		Thread.sleep(1000);

		//Comparing the Bet value after clicking on disbled Bet value button and it should be 0.2
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(bet);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("After clicking on Bet button, bet value selected is 0.2. Test case4 passed");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase: 6 comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 97);

		screen.click(disable_autoplay);
		Thread.sleep(1000);

		//Comparing the autoplay button after clicking on disbled autoplay button
		Finder finder15 =new Finder(screen.capture().getImage());
		String ht15 = finder15.find(autolist);
		double score15=20;                
		System.out.println("the value of ht15"+" "+ht15);
		if(finder15.hasNext())
		{
			Match m15=finder15.next();
			System.out.println("Match Found with: "+(m15.getScore())*100+"%");
			score15=(m15.getScore())*100;
			System.out.println("Autolist is not present on screen");
			finder15.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Autolist is not present & comparision value equals to: "+" "+score15 +"%");
		Assert.assertFalse(score15 > 97);

		screen.click(disable_spin);
		Thread.sleep(1000);

		//Comparing the spin button after clicking on disbled spin button
		Finder finder16 =new Finder(screen.capture().getImage());
		String ht16 = finder16.find(spin_stop);
		double score16=20;                
		System.out.println("the value of ht16"+" "+ht16);
		if(finder16.hasNext())
		{
			Match m16=finder16.next();
			System.out.println("Match Found with: "+(m16.getScore())*100+"%");
			score16=(m16.getScore())*100;
			System.out.println("spinstop is not present on screen");
			finder16.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("spinstop is not present & comparision value equals to: "+" "+score16 +"%");
		Assert.assertFalse(score16 > 97);

		screen.click(disable_maxbet);
		Thread.sleep(1000);

		//Comparing the maxbet button after clicking on disbled maxbet button
		Finder finder17 =new Finder(screen.capture().getImage());
		String ht17 = finder17.find(maxbet4);
		double score17=20;                
		System.out.println("the value of ht17"+" "+ht17);
		if(finder17.hasNext())
		{
			Match m17=finder17.next();
			System.out.println("Match Found with: "+(m17.getScore())*100+"%");
			score17=(m17.getScore())*100;
			System.out.println("maxbet value is not present on screen");
			finder17.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("maxbet value is not present & comparision value equals to: "+" "+score17 +"%");
		Assert.assertFalse(score17 > 97);

		screen.click(disable_hidden);
		Thread.sleep(1000);

		//Comparing the hidden button after clicking on disabled hidden button
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(Afterspin_bal);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("spin balance value is present on screen");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("spin balance value is present & comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);
	}

	@Then("^All HUD buttons should be inactive upon click shoudn't perform any action in Gummy Land slot game$")
	public void all_HUD_buttons_should_be_inactive_upon_click_shoudn_t_perform_any_action_in_Gummy_Land_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
