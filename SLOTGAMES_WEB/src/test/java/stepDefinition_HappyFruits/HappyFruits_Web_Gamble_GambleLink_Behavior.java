package stepDefinition_HappyFruits;

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

public class HappyFruits_Web_Gamble_GambleLink_Behavior {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Happy_Fruits slot game, spin, gamble link, gamble page, credit and bet values$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_game_spin_gamble_link_gamble_page_credit_and_bet_values() throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy_Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click onHappy_Fruits slot game, spin the reels and access to gamble link and change the bet and credit values$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_onHappy_Fruits_slot_game_spin_the_reels_and_access_to_gamble_link_and_change_the_bet_and_credit_values() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);

		Pattern credit1=new Pattern("Images/Happy_Fruits/credit1.PNG");
		Pattern bet=new Pattern("Images/Happy_Fruits/bet1.PNG");
		Pattern bet1_1=new Pattern("Images/Happy_Fruits/bet1_1.PNG");
		Pattern bet1_2=new Pattern("Images/Happy_Fruits/bet1_2.PNG");
		Pattern spin=new Pattern("Images/Happy_Fruits/spin.PNG");
		Pattern balance=new Pattern("Images/Happy_Fruits/balance.PNG");
		Pattern cr1=new Pattern("Images/Happy_Fruits/cr1.PNG");
		Pattern cr2=new Pattern("Images/Happy_Fruits/cr2.PNG");
		Pattern gamble=new Pattern("Images/Happy_Fruits/gamble.PNG");

		Pattern symb_1=new Pattern("Images/Happy_Fruits/symb_1.PNG");
		Pattern symb_2_1=new Pattern("Images/Happy_Fruits/symb_2_1.PNG");

		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit1);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

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
			System.out.println("Balance comparision before spin completed successfully.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(bet);
		Thread.sleep(1000);
		screen.click(bet1_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//Change the credit values
		screen.click(credit1);
		Thread.sleep(1000);
		screen.click(cr1);
		Thread.sleep(4000); 

		// Verify the gamble link
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(gamble);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Change the credit value and verify the gamble link: completed successfully.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Change the credit value and verify the gamble link: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);

		//Change the bet values
		screen.click(bet);
		Thread.sleep(1000);
		screen.click(bet1_1);
		Thread.sleep(3000); 

		//comparing the gamble link
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(gamble);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Change the bet value and verify the gamble link: completed successfully.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Change the bet value and verify the gamble link: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 90);
		Thread.sleep(2000);

		//Change the bet values
		screen.click(bet);
		Thread.sleep(1000);
		screen.click(bet1_2);
		Thread.sleep(3000); 

		//comparing the gamble link
		Finder finder30 =new Finder(screen.capture().getImage());
		String ht30 = finder30.find(gamble);
		double score30=20;                
		System.out.println("the value of ht30"+" "+ht30);
		if(finder30.hasNext())
		{
			Match m30=finder30.next();
			System.out.println("Match Found with: "+(m30.getScore())*100+"%");
			score30=(m30.getScore())*100;
			System.out.println("Change the bet value and verify the gamble link: completed successfully.");
			finder30.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Change the bet value and verify the gamble link: "+" "+score30 +"%");
		Assert.assertFalse(score30 > 90);
		System.out.println("Gamble link is not present");
		Thread.sleep(2000);

		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//Change the credit values
		screen.click(credit1);
		Thread.sleep(1000);
		screen.click(cr2);
		Thread.sleep(3000); 

		//comparing the gamble link
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(gamble);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Change the credit value and verify the gamble link:comparision completed successfully.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Change the credit value and verify the gamble link:Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score4 +"%");
		Assert.assertFalse(score4 > 90);
		System.out.println("Gamble link is not present");
	}

	@Then("^Verify the gamble link active and inactive state as changed bet and credit values in Happy_Fruits slot game$")
	public void verify_the_gamble_link_active_and_inactive_state_as_changed_bet_and_credit_values_in_Happy_Fruits_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
