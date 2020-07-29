package stepDefinition_40GlowingHot;

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

public class FortyGlowingHot_Web_ScatterDollar_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type, denomination, balance, dollar symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_FortyGlowing_Hot_slot_game_bet_type_denomination_balance_dollar_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = FortyGlowingHot_URL_Login.getDriver();
	}

	@When("^Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till dollar appears on three and above three reels and win amount added to the balance$")
	public void open_the_FortyGlowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_dollar_appears_on_three_and_above_three_reels_and_win_amount_added_to_the_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/40Glowing_Hot/spin.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/40Glowing_Hot/spin.PNG"); 
		Pattern collect =new Pattern("./Images/40Glowing_Hot/collect.PNG");
		Pattern win1 =new Pattern("./Images/40Glowing_Hot/scatterdollar1.PNG");
		Pattern win2 =new Pattern("./Images/40Glowing_Hot/scatterdollar2.PNG");
		Pattern win3 =new Pattern("./Images/40Glowing_Hot/scatterdollar3.PNG");

		// IMAGES IN 1st REELS
		Pattern lemon1=new Pattern("./Images/40Glowing_Hot/1R_lemon1.PNG");
		Pattern berry1=new Pattern("./Images/40Glowing_Hot/1R_berry1.PNG");

		// IMAGES IN 2nd REELS
		Pattern orange2=new Pattern("./Images/40Glowing_Hot/2R_orange1.PNG");
		Pattern lemon2=new Pattern("./Images/40Glowing_Hot/2R_lemon.PNG");
		Pattern cherry2=new Pattern("./Images/40Glowing_Hot/2R_cherry.PNG");
		Pattern berry2=new Pattern("./Images/40Glowing_Hot/2R_berry.PNG");
		Pattern seven2=new Pattern("./Images/40Glowing_Hot/2R_seven.PNG");
		Pattern grape2=new Pattern("./Images/40Glowing_Hot/2R_grape.PNG");
		Pattern bell2=new Pattern("./Images/40Glowing_Hot/2R_bell.PNG");
		Pattern leaf2=new Pattern("./Images/40Glowing_Hot/2R_leaf.PNG");

		// IMAGES IN 3rd REELS
		Pattern lemon3=new Pattern("./Images/40Glowing_Hot/3R_lemon.PNG");
		Pattern orange3=new Pattern("./Images/40Glowing_Hot/3R_orange.PNG");
		Pattern berry3=new Pattern("./Images/40Glowing_Hot/3R_berry.PNG");
		Pattern leaf3=new Pattern("./Images/40Glowing_Hot/3R_leaf.PNG");

		// IMAGES IN 4th REELS
		Pattern cherry4=new Pattern("./Images/40Glowing_Hot/4R_cherry.PNG");
		Pattern orange4=new Pattern("./Images/40Glowing_Hot/4R_orange.PNG");
		Pattern lemon4=new Pattern("./Images/40Glowing_Hot/4R_lemon.PNG");
		Pattern leaf4=new Pattern("./Images/40Glowing_Hot/4R_leaf.PNG");
		Pattern berry4=new Pattern("./Images/40Glowing_Hot/4R_berry.PNG");
		Pattern bell4=new Pattern("./Images/40Glowing_Hot/4R_bell.PNG");
		Pattern melon4=new Pattern("./Images/40Glowing_Hot/4R_melon.PNG");

		// IMAGES IN 5th REELS
		Pattern lemon5=new Pattern("./Images/40Glowing_Hot/5R_lemon1.PNG");
		Pattern berry5=new Pattern("./Images/40Glowing_Hot/5R_berry1.PNG");
		Pattern orange5=new Pattern("./Images/40Glowing_Hot/5R_orange1.PNG");
		Pattern seven5=new Pattern("./Images/40Glowing_Hot/5R_seven1.PNG");
		Pattern cherry5=new Pattern("./Images/40Glowing_Hot/5R_cherry1.PNG");

		// Arrange symbols on 1st REELS
		screen.click(berry1);
		Thread.sleep(1000);
		screen.click(lemon1);
		Thread.sleep(1000);

		// Arrange symbols on 2nd REELS
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(leaf2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(bell2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(cherry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(grape2);
		Thread.sleep(1000);
		screen.click(grape2);
		Thread.sleep(1000);
		screen.click(seven2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(berry2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(orange2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);
		screen.click(lemon2);
		Thread.sleep(1000);

		// Arrange symbols on 3rd REELS
		screen.click(orange3);
		Thread.sleep(1000);
		screen.click(leaf3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(berry3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(6000);

		//Comparing the scatter-dollar win triggered once appears on screen
		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(win1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("On appearance of 3 scatter-dollar, win has to be triggered and win amount is 1.60 YSI.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		screen.click(collect);
		Thread.sleep(1000);

		// Arrange symbols on 4th REELS
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(orange4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(bell4);
		Thread.sleep(1000);
		screen.click(melon4);
		Thread.sleep(1000);
		screen.click(berry4);
		Thread.sleep(1000);
		screen.click(berry4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(lemon4);
		Thread.sleep(1000);
		screen.click(bell4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(cherry4);
		Thread.sleep(1000);
		screen.click(bell4);
		Thread.sleep(1000);
		screen.click(melon4);
		Thread.sleep(1000);
		screen.click(melon4);
		Thread.sleep(1000);

		//Comparing the scatter-dollar win triggered once appears on screen
		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win2);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("On appearance of 4 scatter-dollar, win has to be triggered and win amount is 8 YSI.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		screen.click(collect);
		Thread.sleep(1000);

		// Arrange symbols on 5th REELS
		screen.click(berry5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(seven5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(cherry5);
		Thread.sleep(1000);
		screen.click(orange5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(lemon5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(6000);

		//Comparing the scatter-dollar win triggered once appears on screen
		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		screen.wait(win3,10);
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(win3);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("On appearance of 5 scatter-dollar, win has to be triggered and win amount is 40 YSI.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);

		screen.click(collect);
		Thread.sleep(1000);
	}

	@Then("^Scatter-dollar win amount should appear when three and above three, dollar symbols appears on the screen in FortyGlowing Hot game$")
	public void scatter_dollar_win_amount_should_appear_when_three_and_above_three_dollar_symbols_appears_on_the_screen_in_FortyGlowing_Hot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
