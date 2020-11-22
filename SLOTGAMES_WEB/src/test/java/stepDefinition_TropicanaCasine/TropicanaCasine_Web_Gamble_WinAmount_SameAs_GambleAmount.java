package stepDefinition_TropicanaCasine;

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

public class TropicanaCasine_Web_Gamble_WinAmount_SameAs_GambleAmount {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, balance, spin button, win amount, gamble button, gamble page and gamble amount$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_balance_spin_button_win_amount_gamble_button_gamble_page_and_gamble_amount() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_amount_on_web() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern spin=new Pattern("Images/Tropicana_Casine/spin.PNG");
		Pattern balance=new Pattern("Images/Tropicana_Casine/balance.PNG");
		Pattern win_1 = new Pattern("Images/Tropicana_Casine/win_g_1_5.PNG");            
		Pattern gamble=new Pattern("Images/Tropicana_Casine/gamble.PNG"); 
		Pattern gambleamount=new Pattern("/Images/Tropicana_Casine/gambleamount.PNG");

		Pattern symb_5_1=new Pattern("Images/Tropicana_Casine/symb_5_1.PNG");

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
		screen.click(symb_5_1);
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
		Thread.sleep(3000);

		//comparing the Gamble win amount should be same as win amount
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(gambleamount);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Gamble Win amount comparision completed successfully. Gamble Win amount is 6.40 SRD");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble Win amount comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
	}

	@Then("^Win amount should be displayed as Gamble amount in the gamble page of the Tropicana Casine slot game on web$")
	public void win_amount_should_be_displayed_as_Gamble_amount_in_the_gamble_page_of_the_Tropicana_Casine_slot_game_on_web() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
