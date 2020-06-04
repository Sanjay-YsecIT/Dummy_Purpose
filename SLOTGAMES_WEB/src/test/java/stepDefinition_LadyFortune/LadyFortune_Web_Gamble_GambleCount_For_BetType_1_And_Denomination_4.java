package stepDefinition_LadyFortune;

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

public class LadyFortune_Web_Gamble_GambleCount_For_BetType_1_And_Denomination_4 {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune slot game, amount to transfer, transfer button, bet type as (\\d+)\\.(\\d+), denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_slot_game_amount_to_transfer_transfer_button_bet_type_as_denomination_as_TWO_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count(int arg1, int arg2) throws Throwable {
	   
		this.driver = LadyFortune_URL_Login.getDriver();
	}

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Lady Fortune slot game, transfer the amount, select bet type as (\\d+)\\.(\\d+) & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_transfer_the_balance_click_on_Lady_Fortune_slot_game_transfer_the_amount_select_bet_type_as_denomination_as_TWO_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count(int arg1, int arg2) throws Throwable {
	    
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Lady_Fortune/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern SPIN=new Pattern("./Images/Lady_Fortune/spin.PNG");                         // SPIN BUTTON
		Pattern GAMBLE_COLLECT=new Pattern("./Images/Lady_Fortune/gb_collect.PNG");  // AMOUNT COLLECT ICON ON GAMBLE WINDOW          
		Pattern GAMBLE_BTN=new Pattern("./Images/Lady_Fortune/gb_button.PNG");     // GAMBLE BUTTON TO SWITCH TO GAMBLE WINDOW
		Pattern winBF=new Pattern("./Images/Lady_Fortune/gb_disable.PNG");         // GAMBLE DISABLE BUTTON 
		Pattern betval=new Pattern("./Images/Lady_Fortune/betval1_4.PNG");
		// Pattern credit_inc = new Pattern("./Images/Lady_Fortune/credit_inc.PNG");


		// IMAGES IN 2nd REELS
		Pattern ten2=new Pattern("./Images/Lady_Fortune/2R_10.PNG");
		Pattern scatter2=new Pattern("./Images/Lady_Fortune/2R_scatter.PNG");


		// IMAGES IN 3rd REELS
		Pattern A3=new Pattern("./Images/Lady_Fortune/3R_a.PNG");
		Pattern scatter3=new Pattern("./Images/Lady_Fortune/3R_scatter.PNG");
		Pattern leaf3=new Pattern("./Images/Lady_Fortune/3R_leaf.PNG");
		Pattern bug3=new Pattern("./Images/Lady_Fortune/3R_bug.PNG");
		Pattern Q3=new Pattern("./Images/Lady_Fortune/3R_q.PNG");
		Pattern wild3=new Pattern("./Images/Lady_Fortune/3R_wild.PNG");
		Pattern ten3=new Pattern("./Images/Lady_Fortune/3R_10.PNG");
		Pattern HorseShoe3=new Pattern("./Images/Lady_Fortune/3R_shoe.PNG");
		Pattern nine3=new Pattern("./Images/Lady_Fortune/3R_9.PNG");

		// IMAGES IN 4th REELS
		Pattern ten4=new Pattern("./Images/Lady_Fortune/4R_10.PNG");
		Pattern HorseShoe4=new Pattern("./Images/Lady_Fortune/4R_shoe.PNG");
		Pattern A4=new Pattern("./Images/Lady_Fortune/4R_a.PNG");
		Pattern wild4=new Pattern("./Images/Lady_Fortune/4R_wild.PNG");
		Pattern leaf4=new Pattern("./Images/Lady_Fortune/4R_leaf.PNG");
		Pattern A41=new Pattern("./Images/Lady_Fortune/4R_a1.PNG");
		Pattern nine4=new Pattern("./Images/Lady_Fortune/4R_9.PNG");
		
		// IMAGES IN 5th REELS
		Pattern K5=new Pattern("./Images/Lady_Fortune/5R_k.PNG");
		Pattern nine5=new Pattern("./Images/Lady_Fortune/5R_9.PNG");
	

		Pattern WIN_AMT1=new Pattern("./Images/Lady_Fortune/win_1.6.PNG");    // 1st WIN AMOUNT WITH GAMBLE ATTEMPTS 5
		Pattern WIN_AMT2=new Pattern("./Images/Lady_Fortune/win_6.8.PNG");    // 2st WIN AMOUNT WITH GAMBLE ATTEMPTS 4
		Pattern WIN_AMT3=new Pattern("./Images/Lady_Fortune/win_10.8.PNG");    // 3st WIN AMOUNT WITH GAMBLE ATTEMPTS 3
		Pattern WIN_AMT4=new Pattern("./Images/Lady_Fortune/win_20.PNG");    // 4st WIN AMOUNT WITH GAMBLE ATTEMPTS 2
		Pattern WIN_AMT5=new Pattern("./Images/Lady_Fortune/win_61.PNG");    // 5st WIN AMOUNT WITH GAMBLE ATTEMPTS 1
		Pattern WIN_AMT6=new Pattern("./Images/Lady_Fortune/win_80.PNG");    // 6st WIN AMOUNT WITH GAMBLE ATTEMPTS 0


		// ATTEMPTS LEFT
		Pattern Attempt_5=new Pattern("./Images/Lady_Fortune/Attempt5.PNG");
		Pattern Attempt_4=new Pattern("./Images/Lady_Fortune/Attempt4.PNG");
		Pattern Attempt_3=new Pattern("./Images/Lady_Fortune/Attempt3.PNG");
		Pattern Attempt_2=new Pattern("./Images/Lady_Fortune/Attempt2.PNG");
		Pattern Attempt_1=new Pattern("./Images/Lady_Fortune/Attempt1.PNG");


		// SET THE BET TYPE AS 0.02 AND DENOMIANTION AS 2
		// AS AT INITIAL STAGE IT WILL BE SET DEFAULT
		

		//Arranging the symbols to generate gamble count as 5
		//Arranging the Second Reel
		screen.click(betval);
		Thread.sleep(1000);
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(scatter2);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);


		//comparing gamble count based on win amount
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
			System.out.println("If the win amount is 1.60, gamble count should be 5.");
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
		screen.click(A3);
		Thread.sleep(1000);
		screen.click(A3);
		Thread.sleep(1000);
		screen.click(scatter3);
		Thread.sleep(1000);
		screen.click(leaf3);
		Thread.sleep(1000);
		screen.click(bug3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(Q3);
		Thread.sleep(1000);
		screen.click(wild3);
		Thread.sleep(1000);
		
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(wild4);
		Thread.sleep(1000);
		screen.click(A4);
		Thread.sleep(1000);
		screen.click(nine5);
		Thread.sleep(1000);
		
		screen.click(SPIN);
		Thread.sleep(6000);

		//comparing gamble count based on win amount
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
			System.out.println("If the win amount is 3.40, gamble count should be 4.");
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

		screen.click(A41);
		Thread.sleep(3000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//comparing gamble count based on win amount
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
			System.out.println("If the win amount is 10.80, gamble count should be 3.");
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
		screen.click(HorseShoe3);
		Thread.sleep(1000);
		screen.click(nine3);
		Thread.sleep(1000);
		screen.click(ten3);
		Thread.sleep(1000);
		screen.click(ten3);
		Thread.sleep(1000);
		screen.click(ten3);
		Thread.sleep(1000);
		screen.click(leaf3);
		Thread.sleep(1000);
		screen.click(HorseShoe4);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//comparing gamble count based on win amount
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
			System.out.println("If the win amount is 20, gamble count should be 2.");
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
		screen.click(nine4);
		Thread.sleep(1000);
		screen.click(K5);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//comparing gamble count based on win amount
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
			System.out.println("If the win amount is 61, gamble count should be 1.");
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


		//Arranging the symbols to generate win amount more than 70 and checking gamble link should be disabled

		screen.click(HorseShoe4);
		Thread.sleep(1000);
		screen.click(SPIN);
		Thread.sleep(6000);

		//comparing gamble count based on win amount
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
			System.out.println("If the win amount is exceeds 70 YSI, gamble link should be disabled.");
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
			System.out.println("Gamble count comparision completed successfully. Gamble link is disabled.");
			finder26.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble link comparision after Win: "+" "+score26 +"%");
		Assert.assertTrue(score26 > 95);
	}

	@Then("^Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type (\\d+)\\.(\\d+) and denomination TWO in Lady Fortune game$")
	public void gamble_count_should_be_displayed_based_on_win_amount_and_max_amount_of_the_gamble_configured_on_the_game_info_page_for_bet_type_and_denomination_TWO_in_Lady_Fortune_game(int arg1, int arg2) throws Throwable {
	    
		Thread.sleep(3000);
		driver.quit();
	}
}
