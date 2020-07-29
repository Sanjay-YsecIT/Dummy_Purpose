package stepDefinition_DeluxeFruit;

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

public class DeluxeFruit_Web_Gamble_GambleCount_For_BetType_2_And_Denomination_5 {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruit slot game, bet type as (\\d+)\\.(\\d+), denomination as EIGHT, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruit_slot_game_bet_type_as_denomination_as_EIGHT_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count(int arg1, int arg2) throws Throwable {
	    
		this.driver = DeluxeFruit_URL_Login.getDriver();
	}

	@When("^Open the Deluxe Fruit slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Deluxe Fruit slot game, select bet type as (\\d+)\\.(\\d+) & denomination as EIGHT, click on spin button till player wins, click on gamble button and check the gamble count$")
	public void open_the_Deluxe_Fruit_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Deluxe_Fruit_slot_game_select_bet_type_as_denomination_as_EIGHT_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count(int arg1, int arg2) throws Throwable {
	    
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Deluxe_Fruit/Bet_place.PNG", 10);
		//	Thread.sleep(15000);
		
		Pattern SPIN=new Pattern("./Images/Deluxe_Fruit/spin.PNG");                         // SPIN BUTTON
		Pattern GAMBLE_COLLECT=new Pattern("./Images/Deluxe_Fruit/gb_collect.PNG");  // AMOUNT COLLECT ICON ON GAMBLE WINDOW          
		Pattern GAMBLE_BTN=new Pattern("./Images/Deluxe_Fruit/gb_button.PNG");     // GAMBLE BUTTON TO SWITCH TO GAMBLE WINDOW
		Pattern winBF=new Pattern("./Images/Deluxe_Fruit/gb_disable.PNG");         // GAMBLE DISABLE BUTTON 
		Pattern betval=new Pattern("./Images/Deluxe_Fruit/betval2_5.PNG");
		Pattern bet2=new Pattern("./Images/Deluxe_Fruit/bet2.PNG");
		Pattern credit_inc = new Pattern("./Images/Deluxe_Fruit/credit_inc.PNG");

		// IMAGES IN 1st REELS
		Pattern watermelon1=new Pattern("./Images/Deluxe_Fruit/1R_melon.PNG");
		Pattern lemon1=new Pattern("./Images/Deluxe_Fruit/1R_lemon.PNG");
		Pattern orange1=new Pattern("./Images/Deluxe_Fruit/1R_orange.PNG");
		Pattern bell1=new Pattern("./Images/Deluxe_Fruit/1R_bell.PNG");
		Pattern cherry1=new Pattern("./Images/Deluxe_Fruit/1R_cherry.PNG");
		Pattern diamond1=new Pattern("./Images/Deluxe_Fruit/1R_diamond.PNG");
		Pattern mango1=new Pattern("./Images/Deluxe_Fruit/1R_mango.PNG");
		Pattern berry1=new Pattern("./Images/Deluxe_Fruit/1R_berry.PNG");
		Pattern grape1=new Pattern("./Images/Deluxe_Fruit/1R_grape.PNG");

		// IMAGES IN 2nd REELS
		Pattern bell2=new Pattern("./Images/Deluxe_Fruit/2R_bell.PNG");
		Pattern cherry2=new Pattern("./Images/Deluxe_Fruit/2R_cherry.PNG");
		Pattern diamond2=new Pattern("./Images/Deluxe_Fruit/2R_diamond.PNG");
		Pattern mango2=new Pattern("./Images/Deluxe_Fruit/2R_mango1.PNG");
		Pattern cherry21=new Pattern("./Images/Deluxe_Fruit/2R_cherry1.PNG");
		Pattern diamond21=new Pattern("./Images/Deluxe_Fruit/2R_diamond1.PNG");
		Pattern bell21=new Pattern("./Images/Deluxe_Fruit/2R_bell1.PNG");
		Pattern bar2=new Pattern("./Images/Deluxe_Fruit/2R_bar.PNG");
		Pattern lemon2=new Pattern("./Images/Deluxe_Fruit/2R_lemon.PNG");

		Pattern WIN_AMT1=new Pattern("./Images/Deluxe_Fruit/win_16.PNG");    // 1st WIN AMOUNT WITH GAMBLE ATTEMPTS 5
		Pattern WIN_AMT2=new Pattern("./Images/Deluxe_Fruit/win_24.PNG");    // 2st WIN AMOUNT WITH GAMBLE ATTEMPTS 4
		Pattern WIN_AMT3=new Pattern("./Images/Deluxe_Fruit/win_48.PNG");    // 3st WIN AMOUNT WITH GAMBLE ATTEMPTS 3
		Pattern WIN_AMT4=new Pattern("./Images/Deluxe_Fruit/win_110.PNG");    // 4st WIN AMOUNT WITH GAMBLE ATTEMPTS 2
		Pattern WIN_AMT5=new Pattern("./Images/Deluxe_Fruit/win_168.PNG");    // 5st WIN AMOUNT WITH GAMBLE ATTEMPTS 1
		Pattern WIN_AMT6=new Pattern("./Images/Deluxe_Fruit/win_320.PNG");    // 6st WIN AMOUNT WITH GAMBLE ATTEMPTS 0

		// ATTEMPTS LEFT
		Pattern Attempt_5=new Pattern("./Images/Deluxe_Fruit/Attempt5.PNG");
		Pattern Attempt_4=new Pattern("./Images/Deluxe_Fruit/Attempt4.PNG");
		Pattern Attempt_3=new Pattern("./Images/Deluxe_Fruit/Attempt3.PNG");
		Pattern Attempt_2=new Pattern("./Images/Deluxe_Fruit/Attempt2.PNG");
		Pattern Attempt_1=new Pattern("./Images/Deluxe_Fruit/Attempt1.PNG");

		// SET THE BET TYPE AS 0.02 AND DENOMIANTION AS 8
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(bet2);
		Thread.sleep(1000);
		screen.click(betval);
		Thread.sleep(1000);

		//Arranging the symbols to generate gamble count as 5
		//Arranging the first Reel
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(grape1);
		Thread.sleep(1000);
		screen.click(watermelon1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(mango1);
		Thread.sleep(1000);
		screen.click(diamond1);
		Thread.sleep(1000);
		screen.click(bell2);
		Thread.sleep(1000);
		screen.click(diamond2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//win amount comparision
		//    Pattern balance=new Pattern("E:/Sikuli Images/gamble/Win_1_1_1.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(WIN_AMT1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("If the win amount is 16, gamble count should be 5.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		screen.click(GAMBLE_BTN);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		// Pattern winA=new Pattern("E:/Sikuli Images/gamble/gambleCount.png");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(Attempt_5);
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
		Assert.assertTrue(score2 > 95);
		Thread.sleep(5000);

		screen.click(GAMBLE_COLLECT);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 4
		screen.click(mango2);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//win amount comparision
		// Pattern balance1=new Pattern("E:/Sikuli Images/gamble/Win_1_1_2.PNG");
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(WIN_AMT2);
		double score11=20;                
		System.out.println("the value of ht1"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("If the win amount is 24, gamble count should be 4.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 90);

		screen.click(GAMBLE_BTN);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		// Pattern winB=new Pattern("E:/Sikuli Images/gamble/gambleCount_2.png");
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(Attempt_4);
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

		screen.click(GAMBLE_COLLECT);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 3
		screen.click(lemon1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(grape1);
		Thread.sleep(1000);
		screen.click(bell1);
		Thread.sleep(1000);
		screen.click(watermelon1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(mango1);
		Thread.sleep(1000);
		screen.click(mango1);
		Thread.sleep(1000);
		screen.click(grape1);
		Thread.sleep(1000);
		screen.click(grape1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);
		screen.click(mango1);
		Thread.sleep(1000);
		screen.click(mango1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//win amount comparision
		// Pattern Win3=new Pattern("E:/Sikuli Images/gamble/Win_1_1_3.PNG");
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(WIN_AMT3);
		double score12=20;                
		System.out.println("the value of ht1"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("If the win amount is 48, gamble count should be 3.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 90);

		screen.click(GAMBLE_BTN);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		//Pattern winBC=new Pattern("E:/Sikuli Images/gamble/gambleCount_3.png");
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(Attempt_3);
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
		Thread.sleep(5000);

		screen.click(GAMBLE_COLLECT);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 2
		screen.click(watermelon1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//win amount comparision
		// Pattern Win4=new Pattern("E:/Sikuli Images/gamble/Win_1_1_4.PNG");
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(WIN_AMT4);
		double score13=20;                
		System.out.println("the value of ht1"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("If the win amount is 110, gamble count should be 2.");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 90);

		screen.click(GAMBLE_BTN);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		// Pattern winBD=new Pattern("E:/Sikuli Images/gamble/gambleCount_4.png");
		Finder finder23 =new Finder(screen.capture().getImage());
		String ht23 = finder23.find(Attempt_2);
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
		Assert.assertTrue(score23 > 95);
		Thread.sleep(5000);

		screen.click(GAMBLE_COLLECT);
		Thread.sleep(3000);

		//Arranging the symbols to generate gamble count as 1
		screen.click(mango1);
		Thread.sleep(1000);
		screen.click(cherry21);
		Thread.sleep(1000);
		screen.click(cherry21);
		Thread.sleep(1000);
		screen.click(diamond21);
		Thread.sleep(1000);
		screen.click(bell21);
		Thread.sleep(1000);
		screen.click(bell21);
		Thread.sleep(1000);
		screen.click(bar2);
		Thread.sleep(1000);
		screen.click(bar2);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//win amount comparision
		//  Pattern Win33=new Pattern("E:/Sikuli Images/gamble/Win_1_1_5.PNG");
		Finder finder123 =new Finder(screen.capture().getImage());
		String ht123 = finder123.find(WIN_AMT5);
		double score123=20;                
		System.out.println("the value of ht1"+" "+ht123);
		if(finder123.hasNext())
		{
			Match m123=finder123.next();
			System.out.println("Match Found with: "+(m123.getScore())*100+"%");
			score123=(m123.getScore())*100;
			System.out.println("If the win amount is 168, gamble count should be 1.");
			finder123.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score123 +"%");
		Assert.assertTrue(score123 > 90);

		screen.click(GAMBLE_BTN);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		// Pattern winBDC=new Pattern("E:/Sikuli Images/gamble/gambleCount_5.png");
		Finder finder25 =new Finder(screen.capture().getImage());
		String ht25 = finder25.find(Attempt_1);
		double score25=20;                
		System.out.println("the value of ht2"+" "+ht25);
		if(finder25.hasNext())
		{
			Match m25=finder25.next();
			System.out.println("Match Found with: "+(m25.getScore())*100+"%");
			score25=(m25.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble count should be 1.");
			finder25.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score25 +"%");
		Assert.assertTrue(score25 > 95);
		Thread.sleep(5000);

		screen.click(GAMBLE_COLLECT);
		Thread.sleep(3000);

		//Arranging the symbols to generate win amount more than 280 and checking gamble link should be disabled
		screen.click(lemon2);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//win amount comparision
		//  Pattern Win331=new Pattern("E:/Sikuli Images/gamble/Win_1_1_6.PNG");
		Finder finder1231 =new Finder(screen.capture().getImage());
		String ht1231 = finder1231.find(WIN_AMT6);
		double score1231=20;                
		System.out.println("the value of ht1"+" "+ht1231);
		if(finder1231.hasNext())
		{
			Match m1231=finder1231.next();
			System.out.println("Match Found with: "+(m1231.getScore())*100+"%");
			score1231=(m1231.getScore())*100;
			System.out.println("If the win amount is exceeds 280 YSI, gamble link should be disabled.");
			finder1231.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision is successful and value equal to: "+" "+score1231 +"%");
		Assert.assertTrue(score1231 > 90);


		//comparing the gamble count based on the win amount
		Finder finder26 =new Finder(screen.capture().getImage());
		String ht26 = finder26.find(winBF);
		double score26=20;                
		System.out.println("the value of ht2"+" "+ht26);
		if(finder26.hasNext())
		{
			Match m26=finder26.next();
			System.out.println("Match Found with: "+(m26.getScore())*100+"%");
			score26=(m26.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble link is not available.");
			finder26.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble link comparision after Win: "+" "+score26 +"%");
		Assert.assertTrue(score26 > 95);
	}

	@Then("^Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type (\\d+)\\.(\\d+) & denomination EIGHT in Deluxe Fruit game$")
	public void gamble_count_should_be_displayed_based_on_win_amount_and_gamble_max_amount_configured_on_the_game_info_page_for_bet_type_denomination_EIGHT_in_Deluxe_Fruit_game(int arg1, int arg2) throws Throwable {
	  
		Thread.sleep(3000);
		driver.quit();
	}
}
