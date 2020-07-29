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

public class DeluxeFruit_Web_WinPattern_Combinations_Matching_PayLinesAndRules {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruit slot game, bet type, denomination, balance, available symbols, spin button, win pattern combinations and line Combinations win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruit_slot_game_bet_type_denomination_balance_available_symbols_spin_button_win_pattern_combinations_and_line_Combinations_win_amount() throws Throwable {

		this.driver = DeluxeFruit_URL_Login.getDriver();
	}

	@When("^Open the Deluxe Fruit slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till reels win appears on the screen and respective win combination lines appear on the goodluck frame with win amount on game window$")
	public void open_the_Deluxe_Fruit_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_reels_win_appears_on_the_screen_and_respective_win_combination_lines_appear_on_the_goodluck_frame_with_win_amount_on_game_window() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Deluxe_Fruit/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Deluxe_Fruit/spin.PNG");
		Pattern collect = new Pattern("./Images/Deluxe_Fruit/collect.PNG");

		Pattern win_pattern=new Pattern("./Images/Deluxe_Fruit/payline_win_pattern.PNG");
		Pattern win1=new Pattern("./Images/Deluxe_Fruit/pattern_win1.PNG");
		Pattern win2=new Pattern("./Images/Deluxe_Fruit/pattern_win2.PNG");
		Pattern win3=new Pattern("./Images/Deluxe_Fruit/pattern_win3.PNG");
		Pattern win4=new Pattern("./Images/Deluxe_Fruit/pattern_win4.PNG");
		Pattern win5=new Pattern("./Images/Deluxe_Fruit/pattern_win5.PNG");

		// IMAGES IN 1st REELS
		Pattern watermelon1=new Pattern("./Images/Deluxe_Fruit/1R_melon1.PNG");
		Pattern grape1=new Pattern("./Images/Deluxe_Fruit/1R_grape1.PNG");
		Pattern orange1=new Pattern("./Images/Deluxe_Fruit/1R_orange1.PNG");

		// IMAGES IN 2nd REELS
		Pattern bell2=new Pattern("./Images/Deluxe_Fruit/2R_bell.PNG");
		Pattern diamond2=new Pattern("./Images/Deluxe_Fruit/2R_diamond.PNG");
		Pattern cherry2=new Pattern("./Images/Deluxe_Fruit/2R_cherry.PNG");

		// IMAGES IN 3rd REELS
		Pattern bell3=new Pattern("./Images/Deluxe_Fruit/3R_bell1.PNG");

		//Arranging the first Reel
		screen.click(watermelon1);
		Thread.sleep(1000);
		screen.click(grape1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);

		//Arranging the 2nd Reel
		screen.click(bell2);
		Thread.sleep(1000);
		screen.click(diamond2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);

		//Arranging the 3rd Reel
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(6000);

		//	win pattern combination with win amount
		screen.wait(win1,10);
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.05.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 95);

		//		 win pattern combination with win amount
		screen.wait(win2,10);
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(win2);
		double score22=20;                
		System.out.println("the value of ht2"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.05.");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 95);

		//		 win pattern combination with win amount
		screen.wait(win3,10);
		Finder finder23 =new Finder(screen.capture().getImage());
		String ht23 = finder23.find(win3);
		double score23=20;                
		System.out.println("the value of ht23"+" "+ht23);
		if(finder23.hasNext())
		{
			Match m23=finder23.next();
			System.out.println("Match Found with: "+(m23.getScore())*100+"%");
			score23=(m23.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.05.");
			finder23.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score23+"%");
		Assert.assertTrue(score23 > 95);

		//		 win pattern combination with win amount
		screen.wait(win4,10);
		Finder finder24 =new Finder(screen.capture().getImage());
		String ht24 = finder24.find(win4);
		double score24=20;                
		System.out.println("the value of ht24"+" "+ht24);
		if(finder24.hasNext())
		{
			Match m24=finder24.next();
			System.out.println("Match Found with: "+(m24.getScore())*100+"%");
			score24=(m24.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.05.");
			finder24.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score24 +"%");
		Assert.assertTrue(score24 > 95);

		//		 win pattern combination with win amount
		screen.wait(win5,10);
		Finder finder25 =new Finder(screen.capture().getImage());
		String ht25 = finder25.find(win5);
		double score25=20;                
		System.out.println("the value of ht25"+" "+ht25);
		if(finder25.hasNext())
		{
			Match m25=finder25.next();
			System.out.println("Match Found with: "+(m25.getScore())*100+"%");
			score25=(m25.getScore())*100;
			System.out.println("win pattern line combination matching and win amount is 0.05.");
			finder25.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score25 +"%");
		Assert.assertTrue(score25 > 95);

		screen.click(collect);
		Thread.sleep(2000);

		//comparing the win patterns for the above pattern wins
		//    Pattern balance=new Pattern("E:/Sikuli Images/gamble/Win_1_1_1.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(win_pattern);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("win symbols for the above pattern matching.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Pattern comparision is successful and value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
	}

	@Then("^Win pattern should highlight on the symbols and according to win patterns with the win amount, line combinations should display for each pattern wins on the goodluck frame of Deluxe Fruit slot game$")
	public void win_pattern_should_highlight_on_the_symbols_and_according_to_win_patterns_with_the_win_amount_line_combinations_should_display_for_each_pattern_wins_on_the_goodluck_frame_of_Deluxe_Fruit_slot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
