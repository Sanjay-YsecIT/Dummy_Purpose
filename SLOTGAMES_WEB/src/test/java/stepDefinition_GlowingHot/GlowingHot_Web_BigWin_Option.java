package stepDefinition_GlowingHot;

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

public class GlowingHot_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type, denomination, balance, seven symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_slot_game_bet_type_denomination_balance_seven_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = GlowingHot_URL_Login.getDriver();
	}

	@When("^Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till seven appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_seven_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Glowing_Hot/GlowingHot_logo.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Glowing_Hot/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Glowing_Hot/collect.PNG");

		// IMAGES IN 1st REELS
		Pattern lemon1=new Pattern("./Images/Glowing_Hot/1R_lemon.PNG");
		Pattern melon1=new Pattern("./Images/Glowing_Hot/1R_melon.PNG");
		Pattern berry1=new Pattern("./Images/Glowing_Hot/1R_berry.PNG");
		Pattern bell1=new Pattern("./Images/Glowing_Hot/1R_bell.PNG");
		Pattern orange1=new Pattern("./Images/Glowing_Hot/1R_orange.PNG");
		Pattern star1=new Pattern("./Images/Glowing_Hot/1R_star.PNG");
		Pattern dollar1=new Pattern("./Images/Glowing_Hot/1R_dollar.PNG");
		Pattern cherry1=new Pattern("./Images/Glowing_Hot/1R_cherry.PNG");

		// IMAGES IN 2nd REELS
		Pattern lemon2=new Pattern("./Images/Glowing_Hot/2R_lemon.PNG");

		// IMAGES IN 3rd REELS
		Pattern berry3=new Pattern("./Images/Glowing_Hot/3R_berry1.PNG");
		Pattern orange3=new Pattern("./Images/Glowing_Hot/3R_orange.PNG");
		Pattern lemon3=new Pattern("./Images/Glowing_Hot/3R_lemon.PNG");
		Pattern bell3=new Pattern("./Images/Glowing_Hot/3R_bell.PNG");
		Pattern star3=new Pattern("./Images/Glowing_Hot/3R_star.PNG");
		Pattern dollar3=new Pattern("./Images/Glowing_Hot/3R_dollar.PNG");
		Pattern cherry3=new Pattern("./Images/Glowing_Hot/3R_cherry.PNG");

		// IMAGES IN 4th REELS
		Pattern berry4=new Pattern("./Images/Glowing_Hot/4R_berry.PNG");

		// IMAGES IN 5th REELS
		Pattern berry5=new Pattern("./Images/Glowing_Hot/5R_berry.PNG");

		// Congrulation and Win window pop-up 
		Pattern BigWin =new Pattern("./Images/Glowing_Hot/BigWin_90.PNG");

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
		screen.click(bell1);
		Thread.sleep(1000);
		screen.click(dollar1);
		Thread.sleep(1000);
		screen.click(star1);
		Thread.sleep(1000);
		screen.click(bell1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(berry1);
		Thread.sleep(1000);
	    screen.click(orange1);
		Thread.sleep(1000);
		screen.click(orange1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		screen.click(cherry1);
		Thread.sleep(1000);
		
		// Arrange symbols on 2nd REELS
		screen.click(lemon2);
		Thread.sleep(1000);

		// Arrange symbols on 3rd REELS
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(star3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
	    screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(dollar3);
		Thread.sleep(1000);
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);

		// Arrange symbols on 4th REELS
		screen.click(berry4);
		Thread.sleep(1000);
	
		// Arrange symbols on 5th REELS
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(4000);

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
			System.out.println("Comparision happened successfully and win amount is 90 ");
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

	@Then("^Big Win screen should appear when five seven symbols appears on the screen in Glowing Hot game$")
	public void big_Win_screen_should_appear_when_five_seven_symbols_appears_on_the_screen_in_Glowing_Hot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
