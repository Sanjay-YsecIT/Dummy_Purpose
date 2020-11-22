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

public class SkinfiriMysterious_Web_Gamble_WinAmount_AddedTo_Balance {

	WebDriver driver;
	Screen screen=new Screen();
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_black_button_and_gamble_status() throws Throwable {

		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_after_win() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);

		Pattern SPIN=new Pattern("Images/Skinfiri_Mysterious/Spin.PNG");
		Pattern BALANCE=new Pattern("Images/Skinfiri_Mysterious/bal_300.PNG");
		Pattern EYE=new Pattern("Images/Skinfiri_Mysterious/EYE.PNG");
		Pattern SKULL=new Pattern("Images/Skinfiri_Mysterious/SKULL.PNG");
		Pattern CROW=new Pattern("Images/Skinfiri_Mysterious/CROW.PNG");
		Pattern WIN_AMT=new Pattern("Images/Skinfiri_Mysterious/win_amt_0.4.PNG");
		Pattern RED_GAMBLE_BTN=new Pattern("Images/Skinfiri_Mysterious/red_gamble_button.PNG");
		Pattern GAMBLE_BTN=new Pattern("Images/Skinfiri_Mysterious/gamble_icon.PNG");
		Pattern WIN_GAMBLE=new Pattern("Images/Skinfiri_Mysterious/win_gamble.PNG");
		Pattern GAMBLE_COLLECT=new Pattern("Images/Skinfiri_Mysterious/collect_image_gamble.PNG");
		Pattern BAL_AFTERWIN=new Pattern("Images/Skinfiri_Mysterious/bal_after_gambleamt_add.PNG");
		Pattern LOOSE_GAMBLE=new Pattern("Images/Skinfiri_Mysterious/lose_gamble.PNG");
		Pattern BAL_GAMBLELOOSE=new Pattern("Images/Skinfiri_Mysterious/Reminingbal_299.80.PNG");

		//comparing the balance before Win
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(BALANCE);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully. Balance is 300 YSI");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(EYE);
		Thread.sleep(2000);
		screen.click(SKULL);
		Thread.sleep(2000);
		screen.click(CROW);
		Thread.sleep(2000);
		screen.click(SPIN);
		Thread.sleep(9000);

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(WIN_AMT);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 0.40 YSI");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		//Clicking on gamble button
		screen.click(GAMBLE_BTN);
		Thread.sleep(2000);

		//Clicking on Red button
		screen.click(RED_GAMBLE_BTN);
		Thread.sleep(1000);

		if  (screen.exists(WIN_GAMBLE) != null)
		{
			Pattern gambleStatus=new Pattern(WIN_GAMBLE);
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(gambleStatus);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("Gamble Win");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 90);			  
			Thread.sleep(1000);

			screen.click(GAMBLE_COLLECT);
			Thread.sleep(2000);

			Finder finder6 =new Finder(screen.capture().getImage());
			String ht6 = finder6.find(BAL_AFTERWIN);
			double score6=20;                
			System.out.println("the value of ht3"+" "+ht6);
			if(finder6.hasNext())
			{
				Match m6=finder6.next();
				System.out.println("Match Found with: "+(m6.getScore())*100+"%");
				score6=(m6.getScore())*100;
				System.out.println("Gamable Win amount added to the balance");
				finder6.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win added to the balance comparision: "+" "+score6 +"%");
			Assert.assertTrue(score6 > 97);
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("inside gamble loose");
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(LOOSE_GAMBLE);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("Gamble Lose.");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 90);
			Thread.sleep(3000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(BAL_GAMBLELOOSE);
			double score11=20;                
			System.out.println("the value of ht1"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.80 YSI");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score11 > 97);
		}
	}

	@Then("^Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Skinfiri Mysterious slot game$")
	public void gamble_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Skinfiri_Mysterious_slot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();

	}
}
