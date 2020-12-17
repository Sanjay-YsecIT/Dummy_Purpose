package stepDefinition_PerfectGems;

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

public class PerfectGems_Web_WildWin_Pattern_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, wild symbols, spin button, wild win, bet and denominations$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_denomination_balance_wild_symbols_spin_button_wild_win_bet_and_denominations() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild appears and for each spin it shifts its position from (\\d+)th reel to (\\d+)st reel and drops$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_wild_appears_and_for_each_spin_it_shifts_its_position_from_th_reel_to_st_reel_and_drops(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);
		Thread.sleep(2000);

		Pattern spin=new Pattern("Images/Perfect_Gems/spin.PNG");
		Pattern take=new Pattern("Images/Perfect_Gems/take.PNG");
		Pattern info =new Pattern("Images/Perfect_Gems/info.PNG");

		Pattern credit_inc = new Pattern("Images/Perfect_Gems/credit_inc.PNG");
		Pattern bet=new Pattern("Images/Perfect_Gems/bet1.PNG");

		Pattern wild1=new Pattern("Images/Perfect_Gems/wild1.PNG");
		Pattern wild2=new Pattern("Images/Perfect_Gems/wild2.PNG");
		Pattern wild3=new Pattern("Images/Perfect_Gems/wild3.PNG");
		Pattern wild4=new Pattern("Images/Perfect_Gems/wild4.PNG");
		Pattern wild5=new Pattern("Images/Perfect_Gems/wild5.PNG");
		Pattern wild_popup=new Pattern("Images/Perfect_Gems/wild_popup.PNG");
		//win symbols set to reproduce the wild at the 5th reel
		Pattern symb_6_1=new Pattern("Images/Perfect_Gems/symb_6_1.PNG");
		Pattern symb_6_2=new Pattern("Images/Perfect_Gems/symb_6_2.PNG");
		Pattern symb_6_3=new Pattern("Images/Perfect_Gems/symb_6_3.PNG");
		Pattern symb_6_4=new Pattern("Images/Perfect_Gems/symb_6_4.PNG");
		Pattern symb_6_5=new Pattern("Images/Perfect_Gems/symb_6_5.PNG");
		Pattern symb_6_6=new Pattern("Images/Perfect_Gems/symb_6_6.PNG");
		Pattern symb_6_7=new Pattern("Images/Perfect_Gems/symb_6_7.PNG");
		Pattern symb_6_8=new Pattern("Images/Perfect_Gems/symb_6_8.PNG");

		//Arranging the symbols to generate gamble count as 1
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_6);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(symb_6_7);
		Thread.sleep(1000);
		screen.click(symb_6_7);
		Thread.sleep(1000);
		screen.click(symb_6_7);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_8);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(9000);

		//if win is triggered in the interval
		if  (screen.exists(take) != null)
		{
			screen.click(take);
			System.out.println("win is not triggered");
		}
		else {
			System.out.println("win is not triggered");
		}

		//wild pattern comparison
		Finder finder15 =new Finder(screen.capture().getImage());
		String ht15 = finder15.find(wild1);
		double score15=20;                
		System.out.println("the value of ht15"+" "+ht15);
		if(finder15.hasNext())
		{
			Match m15=finder15.next();
			System.out.println("Match Found with: "+(m15.getScore())*100+"%");
			score15=(m15.getScore())*100;
			System.out.println("Wild triggered on the 5th reel");
			finder15.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild triggered on the 5th reel and comparision is successful and value equal to: "+" "+score15 +"%");
		Assert.assertTrue(score15 > 97);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(9000);

		//if win is triggered in the interval
		if  (screen.exists(take) != null)
		{
			screen.click(take);
			System.out.println("win is not triggered");
		}
		else {
			System.out.println("win is not triggered");
		}

		//wild pattern comparison
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(wild2);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Wild triggered on the 5th reel and on next 1 spin itteration moved to 4th reel");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild triggered on the 5th reel and on next 1 spin itteration moved to 4th reel and comparision is successful and value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(9000);

		//if win is triggered in the interval
		if  (screen.exists(take) != null)
		{
			screen.click(take);
			System.out.println("win is not triggered");
		}
		else {
			System.out.println("win is not triggered");
		}
		screen.hover(info);
		Thread.sleep(1000);
		//wild pattern comparison
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(wild3);
		double score5=20;                
		System.out.println("the value of ht5"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("Wild triggered on the 5th reel and on next 2 spin itteration moved to 3th reel position");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild triggered on the 5th reel and on next 2 spin itteration moved to 3rd reel comparision is successful and value equal to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 97);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(9000);

		//if win is triggered in the interval
		if  (screen.exists(take) != null)
		{
			screen.click(take);
			System.out.println("win is not triggered");
		}
		else {
			System.out.println("win is not triggered");
		}
		screen.hover(info);
		Thread.sleep(1000);

		//wild pattern comparison
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(wild4);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Wild triggered on the 5th reel and on next 3 spin itteration moved to 2nd reel");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild triggered on the 5th reel and on next 3 spin itteration moved to 2nd reel and comparision is successful and value equal to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(8000);

		//if win is triggered in the interval
		if  (screen.exists(take) != null)
		{
			screen.click(take);
			System.out.println("win is not triggered");
		}
		else {
			System.out.println("win is not triggered");
		}
		screen.hover(info);
		Thread.sleep(1000);

		//wild pattern comparison
		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(wild5);
		double score6=20;                
		System.out.println("the value of ht6"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("Wild triggered on the 5th reel and on next 4 spin itteration moved to 1st reel");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild triggered on the 5th reel and on next 4 spin itteration moved to 1st reel comparision is successful and value equal to: "+" "+score6 +"%");
		Assert.assertTrue(score6 > 97);

		// Change bet and denomaination to verify wild pop-up is not generated 
		screen.click(credit_inc);
		Thread.sleep(2000);

		//wild pop-up comparison
		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(wild_popup);
		double score8=20;                
		System.out.println("the value of ht8"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("Wild pop-up is not present on the screen. When credit in incremented as the wild is at 1st reel as wild drops in next itteration");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild pop-up is not present on the screen and comparision is successful and value equal to: "+" "+score8 +"%");
		Assert.assertFalse(score8 > 97);

		screen.click(bet);
		Thread.sleep(2000);

		//wild pop-up comparison
		Finder finder81 =new Finder(screen.capture().getImage());
		String ht81 = finder81.find(wild_popup);
		double score81=20;                
		System.out.println("the value of ht81"+" "+ht81);
		if(finder81.hasNext())
		{
			Match m81=finder81.next();
			System.out.println("Match Found with: "+(m81.getScore())*100+"%");
			score81=(m81.getScore())*100;
			System.out.println("Wild pop-up is not present on the screen. When bet in incremented as the wild is at 1st reel as wild drops in next itteration");
			finder81.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild pop-up is not present on the screen and comparision is successful and value equal to: "+" "+score81 +"%");
		Assert.assertFalse(score81 > 97);

		// Spin the reels
		screen.click(spin);
		Thread.sleep(8000);

		//if win is triggered in the interval
		if  (screen.exists(take) != null)
		{
			screen.click(take);
			System.out.println("win is not triggered");
		}
		else {
			System.out.println("win is not triggered");
		}

		//wild pattern comparison
		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(wild5);
		double score7=20;                
		System.out.println("the value of ht7"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("Wild triggered on the 5th reel and on next 6th spin itteration wild is dropped and not present on the screen");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild triggered on the 5th reel and on next 6th spin itteration wild is dropped and comparision is successful and value equal to: "+" "+score7 +"%");
		Assert.assertFalse(score7 > 97);
	}

	@Then("^Wild win should be activated as per game info page$")
	public void wild_win_should_be_activated_as_per_game_info_page() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Change the denominations when wild is at (\\d+)st reel and observer the pop should not be generated in Perfect Gems slot Game$")
	public void change_the_denominations_when_wild_is_at_st_reel_and_observer_the_pop_should_not_be_generated_in_Perfect_Gems_slot_Game(int arg1) throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
}
