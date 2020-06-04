package stepDefinition_VegasMania;

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

public class VegasMania_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Vegas Mania slot game, bet type, denomination, balance, Seven symbols , spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Vegas_Mania_slot_game_bet_type_denomination_balance_Seven_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = VegasMania_URL_Login.getDriver();
	}

	@When("^Open the Vegas Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the seven symbols appears on (\\d+)rd, (\\d+)th and (\\d+)th reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Vegas_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_seven_symbols_appears_on_rd_th_and_th_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance(int arg1, int arg2, int arg3) throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Vegas_Mania/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Vegas_Mania/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Vegas_Mania/collect.PNG");
		Pattern balance=new Pattern("./Images/Vegas_Mania/bal_300.PNG");
		Pattern BalanceAfter1=new Pattern("./Images/Vegas_Mania/BW_bal_afterwin1.PNG");
		Pattern BalanceAfter2=new Pattern("./Images/Vegas_Mania/BW_bal_afterwin2.PNG");
		Pattern BalanceAfter3=new Pattern("./Images/Vegas_Mania/BW_bal_afterwin3.PNG");
		Pattern BigWin1=new Pattern("./Images/Vegas_Mania/BigWin1.PNG");
		Pattern BigWin2=new Pattern("./Images/Vegas_Mania/BigWin2.PNG");
		Pattern BigWin3=new Pattern("./Images/Vegas_Mania/BigWin3.PNG");
		Pattern win_amt1=new Pattern("./Images/Vegas_Mania/BW_win_amt1.PNG");
		Pattern win_amt2=new Pattern("./Images/Vegas_Mania/BW_win_amt2.PNG");
		Pattern win_amt3=new Pattern("./Images/Vegas_Mania/BW_win_amt3.PNG");


		// IMAGES IN 5th REELS
		Pattern cherry5=new Pattern("./Images/Vegas_Mania/5R_cherry.PNG");
		Pattern bar5=new Pattern("./Images/Vegas_Mania/5R_bar.PNG");
		Pattern lemon5=new Pattern("./Images/Vegas_Mania/5R_lemon.PNG");
		Pattern orange5=new Pattern("./Images/Vegas_Mania/5R_orange.PNG");

		// IMAGES IN 5th REELS
		Pattern melon4=new Pattern("./Images/Vegas_Mania/4R_melon.PNG");
		Pattern lemon4=new Pattern("./Images/Vegas_Mania/4R_lemon.PNG");

		// IMAGES IN 3rd REELS
		Pattern melon3=new Pattern("./Images/Vegas_Mania/3R_melon.PNG");
		Pattern lemon3=new Pattern("./Images/Vegas_Mania/3R_lemon.PNG");
		Pattern wild3=new Pattern("./Images/Vegas_Mania/3R_wild.PNG");
		Pattern bar3=new Pattern("./Images/Vegas_Mania/3R_bar.PNG");




		//comparing the balance before spin
		//  Pattern balance=new Pattern("E:/Sikuli Images/Win/balance_beforeSpin_1_1.PNG");
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

		// Arrange the symbols to generate the seven symbols on 5th the reels
		// Arrange 5th Reels
		screen.click(bar5);
		Thread.sleep(1000);
		screen.click(bar5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(1000);

		// Big Win  Screen pop-up
		screen.wait(BigWin1, 10);
		Thread.sleep(1000);

		//Comparing the win amount after the big win

		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(win_amt1);
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
		String ht2 = finder2.find(BalanceAfter1);
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

		// Arrange the symbols to generate the seven symbols on 4th the reel
		// Arrange 4th Reels
		screen.click(melon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(1000);

		// Big Win  Screen pop-up
		screen.wait(BigWin2, 10);
		Thread.sleep(1000);

		//Comparing the win amount after the big win

		Finder finder44 =new Finder(screen.capture().getImage());
		String ht44 = finder44.find(win_amt2);
		double score44=20;                
		System.out.println("the value of ht44"+" "+ht44);
		if(finder44.hasNext())
		{
			Match m44=finder44.next();
			System.out.println("Match Found with: "+(m44.getScore())*100+"%");
			score44=(m44.getScore())*100;
			System.out.println("Win amount comparision completed successfully.");
			finder44.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score44+"%");
		Assert.assertTrue(score44 > 95);


		//clicking on collect button
		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win amount should exists after spin
		//  Pattern winA=new Pattern("E:/Sikuli Images/Win/win_1_1.PNG");
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(BalanceAfter2);
		double score22=20;                
		System.out.println("the value of ht22"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("Win amount added to main balance comparision after spin completed successfully.");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 97);
		Thread.sleep(2000);


		// Arrange the symbols to generate the seven symbols on 3rd the reel
		// Arrange 3rd Reels
		screen.click(wild3);
		Thread.sleep(1000);
		screen.click(wild3);
		Thread.sleep(1000);
		screen.click(wild3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(melon3);
		Thread.sleep(1000);
		screen.click(melon3);
		Thread.sleep(1000);
		screen.click(bar3);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(1000);

		// Big Win  Screen pop-up
		screen.wait(BigWin3, 10);
		Thread.sleep(1000);

		//Comparing the win amount after the big win

		Finder finder43 =new Finder(screen.capture().getImage());
		String ht43 = finder4.find(win_amt3);
		double score43=20;                
		System.out.println("the value of ht43"+" "+ht43);
		if(finder43.hasNext())
		{
			Match m43=finder43.next();
			System.out.println("Match Found with: "+(m43.getScore())*100+"%");
			score43=(m43.getScore())*100;
			System.out.println("Win amount comparision completed successfully.");
			finder43.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score43 +"%");
		Assert.assertTrue(score43 > 95);


		//clicking on collect button
		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win amount should exists after spin
		//  Pattern winA=new Pattern("E:/Sikuli Images/Win/win_1_1.PNG");
		Finder finder23 =new Finder(screen.capture().getImage());
		String ht23 = finder23.find(BalanceAfter3);
		double score23=20;                
		System.out.println("the value of ht23"+" "+ht23);
		if(finder23.hasNext())
		{
			Match m23=finder23.next();
			System.out.println("Match Found with: "+(m23.getScore())*100+"%");
			score23=(m23.getScore())*100;
			System.out.println("Win amount added to main balance comparision after spin completed successfully.");
			finder23.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score23 +"%");
		Assert.assertTrue(score23> 97);
		Thread.sleep(2000);


	}

	@Then("^Big Win screen should appear when  three, six, nine (\\d+)symbols appears on the screen in Vegas Mania game$")
	public void big_Win_screen_should_appear_when_three_six_nine_symbols_appears_on_the_screen_in_Vegas_Mania_game(int arg1) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
