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

public class DeluxeFruit_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruit slot game, bet type, denomination, balance, scatter symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruit_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = DeluxeFruit_URL_Login.getDriver();
	}

	@When("^Open the Deluxe Fruit slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Deluxe_Fruit_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Deluxe_Fruit/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Sapphire_Heart/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Sapphire_Heart/collect.PNG");

		// IMAGES IN 1st REELS
		Pattern watermelon1=new Pattern("./Images/Deluxe_Fruit/1R_melon.PNG");
		Pattern orange1=new Pattern("./Images/Deluxe_Fruit/1R_orange.PNG");
		Pattern grape1=new Pattern("./Images/Deluxe_Fruit/1R_grape.PNG");
		Pattern berry1=new Pattern("./Images/Deluxe_Fruit/1R_berry.PNG");

		// IMAGES IN 3rd REELS
		Pattern cherry3=new Pattern("./Images/Deluxe_Fruit/3R_cherry.PNG");

		// IMAGES IN 3rd REELS
		Pattern bell4=new Pattern("./Images/Deluxe_Fruit/4R_bell.PNG");

		// Congrulation and Win window pop-up 
		Pattern BigWin =new Pattern("./Images/Deluxe_Fruit/BigWin_20.PNG");
		Pattern wheelspin =new Pattern("./Images/Deluxe_Fruit/wheelspin.PNG");
		Pattern bigwin_amt =new Pattern("./Images/Deluxe_Fruit/bigwin_amt.PNG");

		// Arrange symbols on 1st REELS
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(grape1);
		Thread.sleep(1000);
		screen.click(watermelon1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		
		// Arrange symbols on 3rd REELS
		screen.click(cherry3);
		Thread.sleep(1000);
		
		// Arrange symbols on 4th REELS
		screen.click(bell4);
		Thread.sleep(1000);
		screen.click(bell4);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(6000);
		
		// Big win window
		screen.wait(BigWin, 10);
		Thread.sleep(1000);

		//comparing the win amount for the pattern matcing with wild symbol and winamt= patternwin*2
		// big win triggers by 5 scatter symbols
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(BigWin);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 20");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score13 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score13 > 97);

		screen.click(wheelspin);
		Thread.sleep(6000);
		screen.wait(bigwin_amt,25);
		Thread.sleep(1000);
		screen.click(collect);
		Thread.sleep(1000);

	}

	@Then("^Big Win screen should appear when five scatter symbols appears on the screen in Deluxe Fruit game$")
	public void big_Win_screen_should_appear_when_five_scatter_symbols_appears_on_the_screen_in_Deluxe_Fruit_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
