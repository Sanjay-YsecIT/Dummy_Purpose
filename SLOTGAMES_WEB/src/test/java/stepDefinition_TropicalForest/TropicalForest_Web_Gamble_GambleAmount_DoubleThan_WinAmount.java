package stepDefinition_TropicalForest;

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

public class TropicalForest_Web_Gamble_GambleAmount_DoubleThan_WinAmount {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tropical Forest game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Tropical_Forest_game_balance_spin_button_win_amount_gamble_button_gamble_amount_and_gamble_to_win_amount() throws Throwable {
		this.driver = TropicalForest_URL_Login.getDriver();
	}

	@When("^Open the Tropical Forest game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Tropical Forest slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount$")
	public void open_the_Tropical_Forest_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Tropical_Forest_slot_game_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_to_win_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropical_Forest/TropicalForest.PNG", 30);
		
		Pattern spin=new Pattern("Images/Tropical_Forest/spin.PNG");
		Pattern balance=new Pattern("Images/Tropical_Forest/balance.PNG");
		Pattern win_1 = new Pattern("Images/Tropical_Forest/win_1.PNG");            
		Pattern gamble=new Pattern("Images/Tropical_Forest/gamble.PNG"); 
		Pattern gambletowin=new Pattern("/Images/Tropical_Forest/gambletowin.PNG");

		Pattern symb_1=new Pattern("Images/Tropical_Forest/symb_1.PNG");

		//comparing the balance before Win
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully. Balance is 300 SRD");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision after spin completed successfully.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		screen.click(gamble);
		Thread.sleep(2000);

		//comparing the Gamble to win amount should be double as win amount
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(gambletowin);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Gamble Win amount comparision completed successfully. Gamble Win amount is 1 SRD");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble Win amount comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
	}

	@Then("^Gamble To Win amount should be double than Gamble amount in the gamble page of the Tropical Forest game$")
	public void gamble_To_Win_amount_should_be_double_than_Gamble_amount_in_the_gamble_page_of_the_Tropical_Forest_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
