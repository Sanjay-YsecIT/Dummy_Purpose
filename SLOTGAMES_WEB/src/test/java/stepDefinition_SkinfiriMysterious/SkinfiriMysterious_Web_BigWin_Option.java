package stepDefinition_SkinfiriMysterious;

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

public class SkinfiriMysterious_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, bet type, denomination, balance, seven symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_bet_type_denomination_balance_seven_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the seven appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_seven_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);
	
		Pattern spin=new Pattern("Images/Skinfiri_Mysterious/Spin.PNG"); 
		Pattern collect =new Pattern("Images/Skinfiri_Mysterious/collect_image.PNG");
		Pattern balance=new Pattern("Images/Skinfiri_Mysterious/bal_300.PNG");
		Pattern BalanceAfter=new Pattern("Images/Skinfiri_Mysterious/BW_bal_afterwin.PNG");
		Pattern BigWin=new Pattern("Images/Skinfiri_Mysterious/BigWin_50.PNG");
		Pattern win_amt=new Pattern("Images/Skinfiri_Mysterious/BW_win_amt.PNG");

		// IMAGES IN 1st REEL
		Pattern eye =new Pattern("Images/Skinfiri_Mysterious/BW_R1_eye.PNG");
		Pattern skull =new Pattern("Images/Skinfiri_Mysterious/BW_R1_skull.PNG");
		Pattern cross =new Pattern("Images/Skinfiri_Mysterious/BW_R1_cross.PNG");

		// IMAGES IN 2nd REEL
		Pattern owl2 =new Pattern("Images/Skinfiri_Mysterious/BW_R2_owl.PNG");
		Pattern ten2 =new Pattern("Images/Skinfiri_Mysterious/BW_R2_ten.PNG");
		Pattern crow2 =new Pattern("Images/Skinfiri_Mysterious/BW_R2_crow.PNG");
		Pattern cross2 =new Pattern("Images/Skinfiri_Mysterious/BW_R2_cross.PNG");

		// IMAGES IN 3rd REEL
		Pattern owl3 =new Pattern("Images/Skinfiri_Mysterious/BW_R3_owl.PNG");
		Pattern ten3 =new Pattern("Images/Skinfiri_Mysterious/BW_R3_ten.PNG");
		Pattern crow3 =new Pattern("Images/Skinfiri_Mysterious/BW_R3_crow.PNG");
		Pattern cross3 =new Pattern("Images/Skinfiri_Mysterious/BW_R3_cross.PNG");
		Pattern skull3 =new Pattern("Images/Skinfiri_Mysterious/BW_R3_skull.PNG");
		Pattern scatter3 =new Pattern("Images/Skinfiri_Mysterious/BW_R3_scatter.PNG");

		// IMAGES IN 4th REEL
		Pattern cross4 =new Pattern("Images/Skinfiri_Mysterious/BW_R4_cross.PNG");

		// IMAGES IN 5th REEL
		Pattern eye5 =new Pattern("Images/Skinfiri_Mysterious/BW_R5_eye.PNG");
		Pattern owl5 =new Pattern("Images/Skinfiri_Mysterious/BW_R5_owl.PNG");
		Pattern skull5 =new Pattern("Images/Skinfiri_Mysterious/BW_R5_skull.PNG");
		Pattern ten5 =new Pattern("Images/Skinfiri_Mysterious/BW_R5_ten.PNG");

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

		// Arrange the symbols to generate the seven symbols on all the reels
		// Arrange 1st Reels
		screen.click(eye);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);

		// Arrange 2nd Reels
		screen.click(cross2);
		Thread.sleep(1000);
		screen.click(owl2);
		Thread.sleep(1000);
		screen.click(owl2);
		Thread.sleep(1000);
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(crow2);
		Thread.sleep(1000);
		screen.click(crow2);
		Thread.sleep(1000);
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(ten2);
		Thread.sleep(1000);
		screen.click(cross2);
		Thread.sleep(1000);
		screen.click(cross2);
		Thread.sleep(1000);
		screen.click(crow2);
		Thread.sleep(1000);
		screen.click(ten2);
		Thread.sleep(1000);

		// Arranging 3rd Reels 
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(owl3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(skull3);
		Thread.sleep(1000);
		screen.click(skull3);
		Thread.sleep(1000);
		screen.click(skull3);
		Thread.sleep(1000);
		screen.click(ten3);
		Thread.sleep(1000);
		screen.click(ten3);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(skull3);
		Thread.sleep(1000);
		screen.click(skull3);
		Thread.sleep(1000);
		screen.click(skull3);
		Thread.sleep(1000);
		screen.click(scatter3);
		Thread.sleep(1000);
		screen.click(owl3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);

		// Arranging 4th Reel 
		screen.click(cross4);
		Thread.sleep(1000);
		screen.click(cross4);
		Thread.sleep(1000);
		
		// Arranging 5th Reel 
		screen.click(owl5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(eye5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(owl5);
		Thread.sleep(1000);
		screen.click(ten5);
		Thread.sleep(1000);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(5000);

		// Big Win  Screen pop-up
		screen.wait(BigWin, 10);
		Thread.sleep(8000);

		//Comparing the win amount after the big win
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(win_amt);
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
		Assert.assertTrue(score4 > 97);

		//clicking on collect button
		screen.click(collect);
		Thread.sleep(3000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(BalanceAfter);
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
	}

	@Then("^Big Win screen should appear when five seven symbols appears on the screen in Skinfiri Mysterious game$")
	public void big_Win_screen_should_appear_when_five_seven_symbols_appears_on_the_screen_in_Skinfiri_Mysterious_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
