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

public class SkinfiriMysterious_Web_Gamble_WinAmount_SameAs_GambleAmount {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, win amount, gamble button and gamble amount$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_win_amount_gamble_button_and_gamble_amount() throws Throwable {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_amount_on_web() throws Throwable {
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
		Pattern GAMBLE_COLLECT=new Pattern("Images/Skinfiri_Mysterious/Gamble_Collect.PNG");
		Pattern GAMBLE_BTN=new Pattern("Images/Skinfiri_Mysterious/gamble_icon.PNG");
		Pattern GAMBLE_AMT_DISPLAY=new Pattern("/Images/Skinfiri_Mysterious/Gamble_amt_display.PNG");

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

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(WIN_AMT);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 0.4 YSI");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		screen.click(GAMBLE_BTN);
		Thread.sleep(3000);

		//comparing the Gamble win amount should be same as win amount
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(GAMBLE_AMT_DISPLAY);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Gamble Win amount comparision completed successfully. Gamble Win amount is 0.4 YSI");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble Win amount comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);
		screen.click(GAMBLE_COLLECT);
	}

	@Then("^Win amount should be displayed as Gamble amount in the gamble page of the Skinfiri Mysterious slot game on web$")
	public void win_amount_should_be_displayed_as_Gamble_amount_in_the_gamble_page_of_the_Golden_Crown_slot_game_on_web() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
