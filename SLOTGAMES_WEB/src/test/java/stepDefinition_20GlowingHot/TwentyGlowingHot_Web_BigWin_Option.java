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

public class TwentyGlowingHot_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, TwentyGlowing Hot slot game, bet type, denomination, balance, seven symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_TwentyGlowing_Hot_slot_game_bet_type_denomination_balance_seven_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = TwentyGlowingHot_URL_Login.getDriver();
	}

	@When("^Open the TwentyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till seven appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_TwentyGlowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_seven_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

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

		// IMAGES IN 1st REELS
		Pattern lemon1=new Pattern("./Images/20Glowing_Hot/1R_lemon.PNG");
		Pattern star1=new Pattern("./Images/20Glowing_Hot/1R_star.PNG");
		Pattern bell1=new Pattern("./Images/20Glowing_Hot/1R_bell.PNG");
		Pattern melon1=new Pattern("./Images/20Glowing_Hot/1R_melon.PNG");
		Pattern cherry1=new Pattern("./Images/20Glowing_Hot/1R_cherry.PNG");
		Pattern dollar1=new Pattern("./Images/20Glowing_Hot/1R_dollar.PNG");
		Pattern berry1=new Pattern("./Images/20Glowing_Hot/1R_berry.PNG");
		Pattern orange1=new Pattern("./Images/20Glowing_Hot/1R_orange.PNG");

		// IMAGES IN 2nd REELS
		Pattern orange2=new Pattern("./Images/20Glowing_Hot/2R_orange.PNG");
		Pattern lemon2=new Pattern("./Images/20Glowing_Hot/2R_lemon.PNG");
		Pattern cherry2=new Pattern("./Images/20Glowing_Hot/2R_cherry.PNG");
		Pattern berry2=new Pattern("./Images/20Glowing_Hot/2R_berry.PNG");

		// IMAGES IN 3rd REELS
		Pattern lemon3=new Pattern("./Images/20Glowing_Hot/3R_lemon1.PNG");
		Pattern star3=new Pattern("./Images/20Glowing_Hot/3R_star1.PNG");
		Pattern bell3=new Pattern("./Images/20Glowing_Hot/3R_bell1.PNG");
		Pattern cherry3=new Pattern("./Images/20Glowing_Hot/3R_cherry.PNG");
		Pattern dollar3=new Pattern("./Images/20Glowing_Hot/3R_dollar.PNG");
		Pattern orange3=new Pattern("./Images/20Glowing_Hot/3R_orange.PNG");

		// IMAGES IN 4th REELS
		Pattern cherry4=new Pattern("./Images/20Glowing_Hot/4R_cherry1.PNG");
		Pattern orange4=new Pattern("./Images/20Glowing_Hot/4R_orange.PNG");
		Pattern lemon4=new Pattern("./Images/20Glowing_Hot/4R_lemon.PNG");

		// IMAGES IN 5th REELS
		Pattern lemon5=new Pattern("./Images/20Glowing_Hot/5R_lemon.PNG");
		Pattern star5=new Pattern("./Images/20Glowing_Hot/5R_star.PNG");
		Pattern bell5=new Pattern("./Images/20Glowing_Hot/5R_bell.PNG");
		Pattern melon5=new Pattern("./Images/20Glowing_Hot/5R_melon.PNG");
		Pattern cherry5=new Pattern("./Images/20Glowing_Hot/5R_cherry.PNG");
		Pattern orange5=new Pattern("./Images/20Glowing_Hot/5R_orange.PNG");
		Pattern berry5=new Pattern("./Images/20Glowing_Hot/5R_berry.PNG");

		// Congrulation and Win window pop-up 
		Pattern BigWin =new Pattern("./Images/20Glowing_Hot/BigWin_30.10.PNG");

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
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);

		// Arrange symbols on 3rd REELS
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
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);

		// Arrange symbols on 5th REELS
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(star5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(melon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(bell5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(berry5);
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
			System.out.println("Comparision happened successfully and win amount is 30.10");
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

	@Then("^Big Win screen should appear when five seven symbols appears on the screen in TwentyGlowing Hot game$")
	public void big_Win_screen_should_appear_when_five_seven_symbols_appears_on_the_screen_in_TwentyGlowing_Hot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
