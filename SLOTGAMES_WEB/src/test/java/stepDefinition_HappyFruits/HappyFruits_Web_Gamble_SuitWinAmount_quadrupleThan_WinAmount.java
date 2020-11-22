package stepDefinition_HappyFruits;

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

public class HappyFruits_Web_Gamble_SuitWinAmount_quadrupleThan_WinAmount {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount, Suit win dice options, gamble amount and suit to win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_game_balance_spin_button_win_amount_Suit_win_dice_options_gamble_amount_and_suit_to_win_amount() throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, click on spin button till player wins, click on suit win dice button and check the suit to win amount$")
	public void open_the_Happy_Fruits_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Happy_Fruits_slot_game_click_on_spin_button_till_player_wins_click_on_suit_win_dice_button_and_check_the_suit_to_win_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);
		Thread.sleep(2000);

		Pattern spin=new Pattern("Images/Happy_Fruits/spin.PNG");
		Pattern balance=new Pattern("Images/Happy_Fruits/balance.PNG");
		Pattern win_1 = new Pattern("Images/Happy_Fruits/win_1.PNG");            
		Pattern gamble=new Pattern("Images/Happy_Fruits/gamble.PNG"); 
		Pattern suitwin=new Pattern("Images/Happy_Fruits/suitwin.PNG");
		Pattern suitoption=new Pattern("Images/Happy_Fruits/suitoption.PNG");

		Pattern symb_1=new Pattern("Images/Happy_Fruits/symb_1.PNG");

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

		//comparing the Suit win amount should be 4X as win amount
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(suitwin);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Gamble Win amount comparision completed successfully. Gamble Win amount is 1.20 SRD");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble Win amount comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(3000);

		//Validation Suit win options in the gamble page
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(suitoption);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Suit win options comparision completed successfully.Suit Win has four options to win");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Suit win options comparision value equals to: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 97);
		Thread.sleep(3000);
	}

	@Then("^suit To Win amount should be quadruple than win amount in the gamble page of the Happy Fruits game$")
	public void suit_To_Win_amount_should_be_quadruple_than_win_amount_in_the_gamble_page_of_the_Happy_Fruits_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify the suit win options and gamble page color, alignment and text fonts in Happy Fruits slot game$")
	public void verify_the_suit_win_options_and_gamble_page_color_alignment_and_text_fonts_in_Happy_Fruits_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
