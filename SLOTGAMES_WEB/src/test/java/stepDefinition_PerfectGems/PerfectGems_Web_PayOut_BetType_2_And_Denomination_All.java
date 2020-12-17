package stepDefinition_PerfectGems;

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

public class PerfectGems_Web_PayOut_BetType_2_And_Denomination_All {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type (\\d+)\\.(\\d+) and denomination values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+) & (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_back_button_bet_type_and_denomination_values_like(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+) & (\\d+) and check payout amount$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_click_on_back_button_select_bet_type_as_denomination_values_like_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);
		Thread.sleep(2000);

		Pattern credit2=new Pattern("Images/Perfect_Gems/credit2.PNG");
		Pattern info=new Pattern("Images/Perfect_Gems/info.PNG");
		Pattern bet_inc=new Pattern("Images/Perfect_Gems/bet_inc.PNG");
		Pattern credit_inc=new Pattern("Images/Perfect_Gems/credit_inc.PNG");
		Pattern bet_dec=new Pattern("Images/Perfect_Gems/bet_dec.PNG");
		Pattern forward=new Pattern("Images/Perfect_Gems/forward.PNG");
		Pattern backward=new Pattern("Images/Perfect_Gems/backward.PNG");

		Pattern pat1=new Pattern("Images/Perfect_Gems/payout2_1.PNG");
		Pattern pat2=new Pattern("Images/Perfect_Gems/payout2_2.PNG");
		Pattern pat3=new Pattern("Images/Perfect_Gems/payout2_3.PNG");
		Pattern pat4=new Pattern("Images/Perfect_Gems/payout2_4.PNG");
		Pattern pat11=new Pattern("Images/Perfect_Gems/payout2_11.PNG");
		Pattern pat22=new Pattern("Images/Perfect_Gems/payout2_22.PNG");
		Pattern pat33=new Pattern("Images/Perfect_Gems/payout2_33.PNG");
		Pattern pat44=new Pattern("Images/Perfect_Gems/payout2_44.PNG");

		// incremental the credit values
		screen.click(credit_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.03
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit2);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Comparing the credit value should be 0.03. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//Clicking on settings link and navigating to payout screen
		screen.click(info);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 0.75
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(pat1);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Comparing the max payout value for 0.75 denomination. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 0.75 denomination and comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
		Thread.sleep(2000);

		//Clicking on forward button and navigating to payout2 screen
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(pat11);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Comparing the max payout value for 0.75 denomination. Test case passed");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 0.75 denomination and comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97); 
		Thread.sleep(2000);

		//Clicking on forward button and navigating to payout screen
		screen.click(backward);
		Thread.sleep(1000);

		//Selecting the denomination as 1.5
		screen.click(bet_inc);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 1.5
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(pat2);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Comparing the max payout value for 1.5 denomination. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 1.5 denomination and comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(2000);

		//Clicking on forward button and navigating to payout2 screen
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(pat22);
		double score22=20;                
		System.out.println("the value of ht22"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("Comparing the max payout value for 1.5 denomination. Test case passed");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 1.5 denomination and comparision value equals to: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 97); 
		Thread.sleep(2000);

		//Clicking on forward button and navigating to payout screen
		screen.click(backward);
		Thread.sleep(1000);

		//Selecting the denomination as 2.25
		screen.click(bet_inc);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 2.25
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(pat3);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Comparing the max payout value for 2.25 denomination. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 2.25 denomination and comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);

		//Clicking on forward button and navigating to payout2 screen
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder33 =new Finder(screen.capture().getImage());
		String ht33 = finder33.find(pat33);
		double score33=20;                
		System.out.println("the value of ht33"+" "+ht33);
		if(finder33.hasNext())
		{
			Match m33=finder33.next();
			System.out.println("Match Found with: "+(m33.getScore())*100+"%");
			score33=(m33.getScore())*100;
			System.out.println("Comparing the max payout value for 2.25 denomination. Test case passed");
			finder33.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 2.25 denomination and comparision value equals to: "+" "+score33 +"%");
		Assert.assertTrue(score33 > 97); 
		Thread.sleep(2000);

		//Clicking on forward button and navigating to payout screen
		screen.click(backward);
		Thread.sleep(1000);

		//Selecting the denomination as 3
		screen.click(bet_inc);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 3
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(pat4);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Comparing the max payout value for 3 denomination. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 3 denomination and comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);
		Thread.sleep(2000);

		//Clicking on forward button and navigating to payout screen
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder44 =new Finder(screen.capture().getImage());
		String ht44 = finder44.find(pat44);
		double score44=20;                
		System.out.println("the value of ht44"+" "+ht44);
		if(finder44.hasNext())
		{
			Match m44=finder44.next();
			System.out.println("Match Found with: "+(m44.getScore())*100+"%");
			score44=(m44.getScore())*100;
			System.out.println("Comparing the max payout value for 3 denomination. Test case passed");
			finder44.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 3 denomination and comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score44 > 97);
		Thread.sleep(2000);

		//Selecting the denomination as 0.75
		screen.click(bet_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 0.75
		Finder finder51 =new Finder(screen.capture().getImage());
		String ht51 = finder51.find(pat11);
		double score51=20;                
		System.out.println("the value of ht"+" "+ht51);
		if(finder51.hasNext())
		{
			Match m51=finder51.next();
			System.out.println("Match Found with: "+(m51.getScore())*100+"%");
			score51=(m51.getScore())*100;
			System.out.println("Comparing the max payout value for 0.75 denomination. Test case passed");
			finder51.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 0.75 denomination and comparision value equals to: "+" "+score51 +"%");
		Assert.assertTrue(score51 > 97);
		Thread.sleep(2000);
	}

	@Then("^System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+) & (\\d+) in Perfect Gems slot game on Web$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_values_like_in_Perfect_Gems_slot_game_on_Web(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
