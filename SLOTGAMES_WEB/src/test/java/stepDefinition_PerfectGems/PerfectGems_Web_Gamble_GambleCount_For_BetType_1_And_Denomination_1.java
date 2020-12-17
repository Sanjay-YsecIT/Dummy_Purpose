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

public class PerfectGems_Web_Gamble_GambleCount_For_BetType_1_And_Denomination_1 {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as (\\d+)\\.(\\d+), denomination as (\\d+)\\.(\\d+), balance , spin button, win amount, gamble button, gamble amount, game info page and gamble count$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_as_denomination_as_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+)\\.(\\d+), click on spin button till user wins, click on gamble button and check the gamble count$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Perfect_Gems_slot_game_select_bet_type_as_denomination_as_click_on_spin_button_till_user_wins_click_on_gamble_button_and_check_the_gamble_count(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);
		Thread.sleep(2000);

		Pattern spin=new Pattern("Images/Perfect_Gems/spin.PNG");                         
		Pattern collect=new Pattern("Images/Perfect_Gems/collect.PNG");            
		Pattern gamble=new Pattern("Images/Perfect_Gems/gamble.PNG");  
		Pattern take=new Pattern("Images/Perfect_Gems/take.PNG"); 

		// Gamble win amount
		Pattern win_amt1=new Pattern("Images/Perfect_Gems/win_g_1_1.PNG");  
		Pattern win_amt2=new Pattern("Images/Perfect_Gems/win_g_1_2.PNG");   
		Pattern win_amt3=new Pattern("Images/Perfect_Gems/win_g_1_3.PNG");    
		Pattern win_amt4=new Pattern("Images/Perfect_Gems/win_g_1_4.PNG");    
		Pattern win_amt5=new Pattern("Images/Perfect_Gems/win_g_1_5.PNG");    
		Pattern win_amt6=new Pattern("Images/Perfect_Gems/win_g_1_6.PNG");    

		// Gamble counts 
		Pattern gamblecount1=new Pattern("Images/Perfect_Gems/gamblecount1.PNG");
		Pattern gamblecount2=new Pattern("Images/Perfect_Gems/gamblecount2.PNG");
		Pattern gamblecount3=new Pattern("Images/Perfect_Gems/gamblecount3.PNG");
		Pattern gamblecount4=new Pattern("Images/Perfect_Gems/gamblecount4.PNG");
		Pattern gamblecount5=new Pattern("Images/Perfect_Gems/gamblecount5.PNG");

		//win symbols set to reproduce the gamble count win amount respectively
		Pattern symb_1_1=new Pattern("Images/Perfect_Gems/symb_1_1.PNG");
		Pattern symb_1_2=new Pattern("Images/Perfect_Gems/symb_1_2.PNG");

		Pattern symb_2_1=new Pattern("Images/Perfect_Gems/symb_2_1.PNG");

		Pattern symb_3_1=new Pattern("Images/Perfect_Gems/symb_3_1.PNG");

		Pattern symb_4_1=new Pattern("Images/Perfect_Gems/symb_4_1.PNG");
		Pattern symb_4_2=new Pattern("Images/Perfect_Gems/symb_4_2.PNG");
		Pattern symb_4_3=new Pattern("Images/Perfect_Gems/symb_4_3.PNG");

		Pattern symb_5_1=new Pattern("Images/Perfect_Gems/symb_5_1.PNG");

		Pattern symb_6_1=new Pattern("Images/Perfect_Gems/symb_6_1.PNG");
		Pattern symb_6_2=new Pattern("Images/Perfect_Gems/symb_6_2.PNG");
		Pattern symb_6_3=new Pattern("Images/Perfect_Gems/symb_6_3.PNG");
		Pattern symb_6_4=new Pattern("Images/Perfect_Gems/symb_6_4.PNG");
		Pattern symb_6_5=new Pattern("Images/Perfect_Gems/symb_6_5.PNG");
		Pattern symb_6_6=new Pattern("Images/Perfect_Gems/symb_6_6.PNG");
		Pattern symb_6_7=new Pattern("Images/Perfect_Gems/symb_6_7.PNG");
		Pattern symb_6_8=new Pattern("Images/Perfect_Gems/symb_6_8.PNG");
		Pattern symb_6_9=new Pattern("Images/Perfect_Gems/symb_6_9.PNG");


		// SET THE BET TYPE AS 0.01 AND DENOMIANTION AS 0.25
		//Arranging the symbols to generate gamble count as 5
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_2);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//win amount comparision
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(win_amt1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("If the win amount is 0.40, gamble count should be 5.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		screen.click(gamble);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(gamblecount5);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble count should be 5.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(5000);

		screen.click(collect);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 4
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//win amount comparison
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(win_amt2);
		double score11=20;                
		System.out.println("the value of ht1"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("If the win amount is 0.80, gamble count should be 4.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);

		screen.click(gamble);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(gamblecount4);
		double score22=20;                
		System.out.println("the value of ht2"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble count should be 4.");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 95);
		Thread.sleep(5000);

		screen.click(collect);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 3
		screen.click(symb_3_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//win amount comparison
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(win_amt3);
		double score12=20;                
		System.out.println("the value of ht1"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("If the win amount is 1.20, gamble count should be 3.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);

		screen.click(gamble);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(gamblecount3);
		double score21=20;                
		System.out.println("the value of ht2"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble count should be 3.");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score21 +"%");
		Assert.assertTrue(score21 > 95);
		Thread.sleep(3000);

		screen.click(collect);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 2
		screen.click(symb_4_1);
		Thread.sleep(1000);
		screen.click(symb_4_2);
		Thread.sleep(1000);
		screen.click(symb_4_3);
		Thread.sleep(1000);
		screen.click(symb_4_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//win amount comparison
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(win_amt4);
		double score13=20;                
		System.out.println("the value of ht1"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("If the win amount is 3.20, gamble count should be 2.");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 97);

		screen.click(gamble);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		Finder finder23 =new Finder(screen.capture().getImage());
		String ht23 = finder23.find(gamblecount2);
		double score23=20;                
		System.out.println("the value of ht2"+" "+ht23);
		if(finder23.hasNext())
		{
			Match m23=finder23.next();
			System.out.println("Match Found with: "+(m23.getScore())*100+"%");
			score23=(m23.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble count should be 2.");
			finder23.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score23 +"%");
		Assert.assertTrue(score23 > 97);
		Thread.sleep(5000);

		screen.click(collect);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 1
		screen.click(symb_5_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//win amount comparison
		Finder finder14 =new Finder(screen.capture().getImage());
		String ht14 = finder14.find(win_amt5);
		double score14=20;                
		System.out.println("the value of ht1"+" "+ht14);
		if(finder14.hasNext())
		{
			Match m14=finder14.next();
			System.out.println("Match Found with: "+(m14.getScore())*100+"%");
			score14=(m14.getScore())*100;
			System.out.println("If the win amount is 6.40, gamble count should be 1.");
			finder14.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score14 +"%");
		Assert.assertTrue(score14 > 97);

		screen.click(gamble);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		Finder finder24 =new Finder(screen.capture().getImage());
		String ht24 = finder24.find(gamblecount1);
		double score24=20;                
		System.out.println("the value of ht2"+" "+ht24);
		if(finder24.hasNext())
		{
			Match m24=finder24.next();
			System.out.println("Match Found with: "+(m24.getScore())*100+"%");
			score24=(m24.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble count should be 1.");
			finder24.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score24 +"%");
		Assert.assertTrue(score24 > 97);
		Thread.sleep(3000);

		screen.click(collect);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 1
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_6);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_7);
		Thread.sleep(1000);
		screen.click(symb_6_7);
		Thread.sleep(1000);
		screen.click(symb_6_7);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);
		screen.click(take);
		Thread.sleep(2000);
		screen.click(symb_6_9);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//win amount comparison
		Finder finder15 =new Finder(screen.capture().getImage());
		String ht15 = finder15.find(win_amt6);
		double score15=20;                
		System.out.println("the value of ht1"+" "+ht15);
		if(finder15.hasNext())
		{
			Match m15=finder15.next();
			System.out.println("Match Found with: "+(m15.getScore())*100+"%");
			score15=(m15.getScore())*100;
			System.out.println("If the win amount is 9.60, gamble should be disabled");
			finder15.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score15 +"%");
		Assert.assertTrue(score15 > 97);

		//comparing the gamble link disabled
		Finder finder25 =new Finder(screen.capture().getImage());
		String ht25 = finder25.find(gamble);
		double score25=20;                
		System.out.println("the value of ht2"+" "+ht25);
		if(finder25.hasNext())
		{
			Match m25=finder25.next();
			System.out.println("Match Found with: "+(m25.getScore())*100+"%");
			score25=(m25.getScore())*100;
			System.out.println("Gamble link comparision completed successfully. Gamble link should be disabled.");
			finder25.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score25 +"%");
		Assert.assertFalse(score25 > 97);
	}

	@Then("^Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type (\\d+)\\.(\\d+) & denomination (\\d+)\\.(\\d+) in Perfect Gems game$")
	public void gamble_count_should_be_displayed_based_on_win_amount_and_gamble_max_amount_configured_on_the_info_page_for_bet_type_denomination_in_Perfect_Gems_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
