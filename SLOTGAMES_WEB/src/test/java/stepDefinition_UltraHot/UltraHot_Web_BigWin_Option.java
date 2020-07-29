package stepDefinition_UltraHot;

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

public class UltraHot_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type, denomination, balance, seven symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_bet_type_denomination_balance_seven_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = UltraHot_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till seven appears on all the three reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_seven_appears_on_all_the_three_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Ultra_Hot/UltraHot_logo.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Ultra_Hot/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Ultra_Hot/collect.PNG");

		// IMAGES IN 1st REELS
		Pattern melon1=new Pattern("./Images/Ultra_Hot/1R_melon1.PNG");

		// IMAGES IN 2nd REELS
		Pattern berry2=new Pattern("./Images/Ultra_Hot/2R_berry1.PNG");
		Pattern cherry2=new Pattern("./Images/Ultra_Hot/2R_cherry1.PNG");
		Pattern melon2=new Pattern("./Images/Ultra_Hot/2R_melon.PNG");
		Pattern grape2=new Pattern("./Images/Ultra_Hot/2R_grape.PNG");
		Pattern star2=new Pattern("./Images/Ultra_Hot/2R_star.PNG");

		// IMAGES IN 3rd REELS
		Pattern cherry3=new Pattern("./Images/Ultra_Hot/3R_cherry.PNG");
		Pattern berry3=new Pattern("./Images/Ultra_Hot/3R_berry.PNG");
		Pattern grape3=new Pattern("./Images/Ultra_Hot/3R_grape.PNG");
		Pattern lemon3=new Pattern("./Images/Ultra_Hot/3R_lemon.PNG");
		Pattern melon3=new Pattern("./Images/Ultra_Hot/3R_melon.PNG");

		// Congrulation and Win window pop-up 
		Pattern BigWin =new Pattern("./Images/Ultra_Hot/BigWin_15.PNG");

		// Arrange symbols on 1st REELS
		screen.click(melon1);
		Thread.sleep(1000);

		// Arrange symbols on 2nd REELS
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(melon2);
		Thread.sleep(1000);
		screen.click(grape2);
		Thread.sleep(1000);
		screen.click(star2);
		Thread.sleep(1000);

		// Arrange symbols on 3rd REELS
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(melon3);
		Thread.sleep(1000);
		screen.click(grape3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(6000);

		// Big win window
		screen.wait(BigWin, 10);
		Thread.sleep(1000);

		// big win triggers by 5 seven symbols
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(BigWin);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Comparision happened successfully and win amount is 15 ");
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

	@Then("^Big Win screen should appear when three seven symbols appears on the screen in Ultra Hot game$")
	public void big_Win_screen_should_appear_when_three_seven_symbols_appears_on_the_screen_in_Ultra_Hot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
