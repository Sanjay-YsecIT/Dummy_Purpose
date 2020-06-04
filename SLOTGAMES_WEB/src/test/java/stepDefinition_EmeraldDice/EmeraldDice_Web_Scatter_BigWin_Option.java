package stepDefinition_EmeraldDice;

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

public class EmeraldDice_Web_Scatter_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Emerald Dice slot game, bet type, denomination, balance, seven symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Emerald_Dice_slot_game_bet_type_denomination_balance_seven_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = EmeraldDice_URL_Login.getDriver();
	}

	@When("^Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the Scatter appears on with (\\d+),(\\d+) and (\\d+) symbols appears all Reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Emerald_Dice_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_Scatter_appears_on_with_and_symbols_appears_all_Reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance(int arg1, int arg2, int arg3) throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Emerald_Dice/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern spin=new Pattern("./Images/Emerald_Dice/spin.PNG");
		Pattern collect=new Pattern("./Images/Emerald_Dice/collect.PNG");
		//	Pattern balance=new Pattern("./Images/Emerald_Dice/bal_300.PNG");
		Pattern balance1=new Pattern("./Images/Emerald_Dice/bal_3scatter.PNG");
		Pattern balance2=new Pattern("./Images/Emerald_Dice/bal_4scatter.PNG");
		Pattern BW_balance=new Pattern("./Images/Emerald_Dice/BW_bal_afterwin.PNG");
		//		Pattern BigWin=new Pattern("./Images/Emerald_Dice/BigWin.PNG");
		Pattern BW_amt=new Pattern("./Images/Emerald_Dice/BW_win_amt.PNG");
		Pattern win1=new Pattern("./Images/Emerald_Dice/win1_3scatter.PNG");
		Pattern win2=new Pattern("./Images/Emerald_Dice/win2_4scatter.PNG");


		// IMAGES IN 1st REELS
		Pattern apple1=new Pattern("./Images/Emerald_Dice/1R_apple.PNG");
		Pattern orange1=new Pattern("./Images/Emerald_Dice/1R_orange.PNG");
		Pattern cherry1=new Pattern("./Images/Emerald_Dice/1R_cherry.PNG");
		Pattern wild1=new Pattern("./Images/Emerald_Dice/1R_wild.PNG");
		Pattern seven1=new Pattern("./Images/Emerald_Dice/1R_seven.PNG");
		Pattern dollar1=new Pattern("./Images/Emerald_Dice/1R_dollar.PNG");
		Pattern berry1=new Pattern("./Images/Emerald_Dice/1R_berry.PNG");


		// IMAGES IN 2nd REELS
		Pattern seven2=new Pattern("./Images/Emerald_Dice/2R_seven.PNG");
		Pattern apple2=new Pattern("./Images/Emerald_Dice/2R_apple.PNG");
		Pattern dollar2=new Pattern("./Images/Emerald_Dice/2R_dollar.PNG");
		Pattern orange2=new Pattern("./Images/Emerald_Dice/2R_orange.PNG");
		Pattern wild2=new Pattern("./Images/Emerald_Dice/2R_wild.PNG");

		// IMAGES IN 3rd REELS
		Pattern bell3=new Pattern("./Images/Emerald_Dice/3R_bell.PNG");
		Pattern grape3=new Pattern("./Images/Emerald_Dice/3R_grape.PNG");
		Pattern seven3=new Pattern("./Images/Emerald_Dice/3R_seven.PNG");
		Pattern orange3=new Pattern("./Images/Emerald_Dice/3R_orange.PNG");
		Pattern wild3=new Pattern("./Images/Emerald_Dice/3R_wild.PNG");
		Pattern berry3=new Pattern("./Images/Emerald_Dice/3R_berry.PNG");
		Pattern dollar3=new Pattern("./Images/Emerald_Dice/3R_dollar.PNG");
		Pattern apple3=new Pattern("./Images/Emerald_Dice/3R_apple.PNG");
		Pattern cherry3=new Pattern("./Images/Emerald_Dice/3R_cherry.PNG");

		// IMAGES IN 4th REELS
		Pattern berry4=new Pattern("./Images/Emerald_Dice/4R_berry.PNG");
		Pattern dollar4=new Pattern("./Images/Emerald_Dice/4R_dollar.PNG");
		Pattern apple4=new Pattern("./Images/Emerald_Dice/4R_apple.PNG");
		Pattern orange4=new Pattern("./Images/Emerald_Dice/4R_orange.PNG");
		Pattern wild4=new Pattern("./Images/Emerald_Dice/4R_wild.PNG");

		// IMAGES IN 5th REELS
		Pattern dollar5=new Pattern("./Images/Emerald_Dice/5R_dollar.PNG");
		Pattern apple5=new Pattern("./Images/Emerald_Dice/5R_apple.PNG");
		Pattern orange5=new Pattern("./Images/Emerald_Dice/5R_orange.PNG");
		Pattern wild5=new Pattern("./Images/Emerald_Dice/5R_wild.PNG");
		Pattern cherry5=new Pattern("./Images/Emerald_Dice/5R_cherry.PNG");
		Pattern bell5=new Pattern("./Images/Emerald_Dice/5R_bell.PNG");
		Pattern grape5=new Pattern("./Images/Emerald_Dice/5R_grape.PNG");
		Pattern berry5=new Pattern("./Images/Emerald_Dice/5R_berry.PNG");
		Pattern seven5=new Pattern("./Images/Emerald_Dice/5R_seven.PNG");

		// Arrange the symbols to generate the three Scatters symbols on all the reels

		// Arrange 1st Reels
		screen.click(apple1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(wild1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(seven1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(dollar1);
		Thread.sleep(1000);
		screen.click(apple1);
		Thread.sleep(1000);

		//		 Arrange 2nd Reel
		screen.click(seven2);
		Thread.sleep(1000);
		screen.click(dollar2);
		Thread.sleep(1000);
		screen.click(apple2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(wild2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);


		//		 Arrange 3rd Reel
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(grape3);
		Thread.sleep(1000);
		screen.click(seven3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(wild3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(seven3);
		Thread.sleep(1000);
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(grape3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(dollar3);
		Thread.sleep(1000);
		screen.click(apple3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(seven3);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(1000);


		//Comparing the win amount after the 3 scatters arranged

		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(win1);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Win amount comparision completed successfully.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 95);


		//clicking on collect button
		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win amount should exists after spin
		//  Pattern winA=new Pattern("E:/Sikuli Images/Win/win_1_1.PNG");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(balance1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount added to main balance comparision after spin completed successfully.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(2000);

		// Arrange 4th Reels
		screen.click(berry4);
		Thread.sleep(1000);
		screen.click(dollar4);
		Thread.sleep(1000);
		screen.click(apple4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(wild4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(1000);


		//Comparing the win amount after the 4 scatter symbols arranged

		Finder finder41 =new Finder(screen.capture().getImage());
		String ht41 = finder4.find(win2);
		double score41=20;                
		System.out.println("the value of ht41"+" "+ht41);
		if(finder41.hasNext())
		{
			Match m41=finder41.next();
			System.out.println("Match Found with: "+(m41.getScore())*100+"%");
			score41=(m41.getScore())*100;
			System.out.println("Win amount comparision completed successfully.");
			finder41.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score41 +"%");
		Assert.assertTrue(score41 > 95);


		//clicking on collect button
		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win amount should exists after spin
		//  Pattern winA=new Pattern("E:/Sikuli Images/Win/win_1_1.PNG");
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(balance2);
		double score21=20;                
		System.out.println("the value of ht21"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("Win amount added to main balance comparision after spin completed successfully.");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score21 +"%");
		Assert.assertTrue(score21 > 97);
		Thread.sleep(2000);




		// Arrange 5th Reels
		screen.click(dollar5);
		Thread.sleep(1000);
		screen.click(apple5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(wild5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(grape5);
		Thread.sleep(1000);
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(dollar5);
		Thread.sleep(1000);
		screen.click(apple5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(seven5);
		Thread.sleep(1000);
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(grape5);
		Thread.sleep(1000);
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(dollar5);
		Thread.sleep(1000);
		screen.click(apple5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(grape5);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(1000);


		//Comparing the win amount after the big win

		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(BW_amt);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Win amount comparision completed successfully.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score41 +"%");
		Assert.assertTrue(score11 > 95);


		//clicking on collect button
		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win amount should exists after spin
		//  Pattern winA=new Pattern("E:/Sikuli Images/Win/win_1_1.PNG");
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(BW_balance);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Win amount added to main balance comparision after spin completed successfully.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
		Thread.sleep(2000);


	}

	@Then("^Scatter wins with (\\d+) and (\\d+) arranged patterns and Big Win screen should appear when five Scatter symbols appears on the screen in Emerald Dice game$")
	public void scatter_wins_with_and_arranged_patterns_and_Big_Win_screen_should_appear_when_five_Scatter_symbols_appears_on_the_screen_in_Emerald_Dice_game(int arg1, int arg2) throws Throwable {

		Thread.sleep(3000);
		 driver.quit();

	}
}
