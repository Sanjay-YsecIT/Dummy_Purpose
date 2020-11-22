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

public class TropicanaCasine_Web_BigWin_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, bet type, denomination, balance, scatter symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the scatter appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_scatter_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern spin=new Pattern("Images/Tropicana_Casine/spin.PNG");                                    
		Pattern take=new Pattern("Images/Tropicana_Casine/take.PNG");
		Pattern wheelspin =new Pattern("Images/Tropicana_Casine/wheelspin.PNG");

		Pattern scsymb_1=new Pattern("Images/Tropicana_Casine/scsymb_1.PNG");
		Pattern scsymb_2=new Pattern("Images/Tropicana_Casine/scsymb_2.PNG");
		Pattern scsymb_3=new Pattern("Images/Tropicana_Casine/scsymb_3.PNG");

		Pattern bigwinbanner =new Pattern("Images/Tropicana_Casine/bigwinbanner.PNG");
		Pattern bigwin =new Pattern("Images/Tropicana_Casine/bigwin.PNG"); 

		//Arranging the symbols to generate 3 Scatter
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(scsymb_2);
		Thread.sleep(1000);
		screen.click(scsymb_2);
		Thread.sleep(1000);
		screen.click(scsymb_3);
		Thread.sleep(1000);
		screen.click(scsymb_3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(2000);

		// free spin banner
		screen.wait(bigwinbanner, 10);
		Thread.sleep(4000);

		//click on wheel spin
		screen.wait(wheelspin, 10);
		Thread.sleep(2000);
		screen.click(wheelspin);
		Thread.sleep(5000);

		//compare the bigwin amount after the wheel spin
		screen.wait(bigwin, 30);
		Thread.sleep(4000);
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(bigwin);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Compare the scatter bigwin amount in win field.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter bigwin amount comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
		Thread.sleep(2000);

		screen.click(take);
		Thread.sleep(8000);
	}

	@Then("^Big Win screen should appear when five scatter symbols appears on the screen in Tropicana Casine slot game$")
	public void big_Win_screen_should_appear_when_five_scatter_symbols_appears_on_the_screen_in_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
