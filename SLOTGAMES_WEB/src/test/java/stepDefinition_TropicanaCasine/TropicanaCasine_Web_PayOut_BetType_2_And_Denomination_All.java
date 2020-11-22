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

public class TropicanaCasine_Web_PayOut_BetType_2_And_Denomination_All {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type (\\d+)\\.(\\d+) and  denomination values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+) & (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_back_button_bet_type_and_denomination_values_like(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+) & (\\d+) and check payout amount$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_click_on_back_button_select_bet_type_as_denomination_values_like_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern credit2=new Pattern("Images/Tropicana_Casine/credit2.PNG");
		Pattern info=new Pattern("Images/Tropicana_Casine/info.PNG");
		Pattern bet_inc=new Pattern("Images/Tropicana_Casine/bet_inc.PNG");
		Pattern credit_inc=new Pattern("Images/Tropicana_Casine/credit_inc.PNG");
		Pattern bet_dec=new Pattern("Images/Tropicana_Casine/bet_dec.PNG");

		Pattern pat1=new Pattern("Images/Tropicana_Casine/payout2_1.PNG");
		Pattern pat2=new Pattern("Images/Tropicana_Casine/payout2_2.PNG");
		Pattern pat3=new Pattern("Images/Tropicana_Casine/payout2_3.PNG");
		Pattern pat4=new Pattern("Images/Tropicana_Casine/payout2_4.PNG");
		Pattern pat5=new Pattern("Images/Tropicana_Casine/payout2_5.PNG");

		// incremental the credit values
		screen.click(credit_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.02
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit2);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Comparing the credit value should be 0.02. Test case passed");
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

		//Comparing the max payout value for denomination 0.4
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(pat1);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Comparing the max payout value for 0.4 denomination. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 0.4 denomination and comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 96);
		Thread.sleep(2000);

		//Selecting the denomination as 0.8
		screen.click(bet_inc);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 0.8
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(pat2);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Comparing the max payout value for 0.8 denomination. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 0.8 denomination and comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 96);
		Thread.sleep(2000);

		//Selecting the denomination as 2
		screen.click(bet_inc);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 2
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(pat3);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Comparing the max payout value for 2 denomination. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 2 denomination and comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 96);
		Thread.sleep(2000);

		//Selecting the denomination as 4
		screen.click(bet_inc);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 4
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(pat4);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Comparing the max payout value for 4 denomination. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 4 denomination and comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 96);
		Thread.sleep(2000);

		//Selecting the denomination as 8
		screen.click(bet_inc);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 8
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(pat5);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("Comparing the max payout value for 8 denomination. Test case passed");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 8 denomination and comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 97);
		Thread.sleep(2000);

		//Selecting the denomination as 0.4
		screen.click(bet_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);
		screen.click(bet_dec);
		Thread.sleep(2000);

		//Comparing the max payout value for denomination 0.4
		Finder finder51 =new Finder(screen.capture().getImage());
		String ht51 = finder51.find(pat1);
		double score51=20;                
		System.out.println("the value of ht"+" "+ht51);
		if(finder51.hasNext())
		{
			Match m51=finder51.next();
			System.out.println("Match Found with: "+(m51.getScore())*100+"%");
			score51=(m51.getScore())*100;
			System.out.println("Comparing the max payout value for 0.4 denomination. Test case passed");
			finder51.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 0.4 denomination and comparision value equals to: "+" "+score51 +"%");
		Assert.assertTrue(score51 > 96);
		Thread.sleep(2000);
	}

	@Then("^System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+) & (\\d+) in Tropicana Casine slot game on Web$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_values_like_in_Tropicana_Casine_slot_game_on_Web(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
