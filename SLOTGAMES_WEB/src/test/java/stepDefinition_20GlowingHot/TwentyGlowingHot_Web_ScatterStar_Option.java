package stepDefinition_20GlowingHot;

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

public class TwentyGlowingHot_Web_ScatterStar_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, TwentyGlowing Hot slot game, bet type, denomination, balance, star symbols, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_TwentyGlowing_Hot_slot_game_bet_type_denomination_balance_star_symbols_spin_button_and_win_amount() throws Throwable {

		this.driver = TwentyGlowingHot_URL_Login.getDriver();
	}

	@When("^Open the TwentyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till star appears on (\\d+),(\\d+),(\\d+)th reels and win amount added to the balance$")
	public void open_the_TwentyGlowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_star_appears_on_th_reels_and_win_amount_added_to_the_balance(int arg1, int arg2, int arg3) throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/20Glowing_Hot/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/20Glowing_Hot/spin.PNG"); 
		Pattern collect =new Pattern("./Images/20Glowing_Hot/collect.PNG");
		Pattern star_win =new Pattern("./Images/20Glowing_Hot/star_win.PNG");

		// IMAGES IN 1st REELS
		Pattern lemon1=new Pattern("./Images/20Glowing_Hot/1R_lemon.PNG");
		Pattern bell1=new Pattern("./Images/20Glowing_Hot/1R_bell.PNG");
		Pattern melon1=new Pattern("./Images/20Glowing_Hot/1R_melon.PNG");
		Pattern berry1=new Pattern("./Images/20Glowing_Hot/1R_berry.PNG");

		// IMAGES IN 5th REELS
		Pattern lemon5=new Pattern("./Images/20Glowing_Hot/5R_lemon.PNG");
		Pattern bell5=new Pattern("./Images/20Glowing_Hot/5R_bell.PNG");

		// Arrange symbols on 1st REELS
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(bell1);
		Thread.sleep(1000);
		screen.click(melon1);
		Thread.sleep(1000);
		screen.click(melon1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);

		// Arrange symbols on 5th REELS
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(6000);

		//scatter-star win triggering when appeared on 1,3,5th reels
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(star_win);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 4YSI");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score13 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score13 > 97);

		screen.click(collect);
		Thread.sleep(1000);
	}

	@Then("^Scatter-star win is triggered and win amount should appear when star symbol appears on (\\d+),(\\d+),(\\d+)th reels, in TwentyGlowing Hot game$")
	public void scatter_star_win_is_triggered_and_win_amount_should_appear_when_star_symbol_appears_on_th_reels_in_TwentyGlowing_Hot_game(int arg1, int arg2, int arg3) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
