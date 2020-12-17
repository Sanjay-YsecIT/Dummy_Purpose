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

public class PerfectGems_Web_Wild_Behavior {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, wild symbols, spin button, wild win, bet and denominations, wild pop-up$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_denomination_balance_wild_symbols_spin_button_wild_win_bet_and_denominations_wild_pop_up() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild appears and for successive spin try change the bet and denominations$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_wild_appears_and_for_successive_spin_try_change_the_bet_and_denominations() throws Throwable {
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
		Pattern Yes =new Pattern("Images/Perfect_Gems/wild_yes.PNG");
		Pattern No =new Pattern("Images/Perfect_Gems/wild_no.PNG");

		Pattern credit_inc = new Pattern("Images/Perfect_Gems/credit_inc.PNG");
		Pattern bet=new Pattern("Images/Perfect_Gems/bet1.PNG");
		Pattern bet1_2=new Pattern("Images/Perfect_Gems/bet1_2.PNG");
		
		Pattern wild1=new Pattern("Images/Perfect_Gems/wild1.PNG");
		Pattern wild2=new Pattern("Images/Perfect_Gems/wild2.PNG");
		Pattern wild3=new Pattern("Images/Perfect_Gems/wild3.PNG");
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
		Assert.assertTrue(score1 > 96);

		// Change bet and denomination to verify wild pop-up is generated 
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
			System.out.println("Wild pop-up is present on the screen. When credit in incremented");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild pop-up is present on the screen and comparision is successful and value equal to: "+" "+score8 +"%");
		Assert.assertTrue(score8 > 97);

		//Reject the popup
		screen.click(No);
		Thread.sleep(2000);

		// Change bet and denomination to verify wild pop-up is generated 
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
			System.out.println("Wild pop-up is present on the screen. When bet in incremented");
			finder81.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild pop-up is present on the screen and comparision is successful and value equal to: "+" "+score81 +"%");
		Assert.assertTrue(score81 > 97);

		//Reject the popup
		screen.click(Yes);
		Thread.sleep(2000);
		screen.click(bet1_2);
		Thread.sleep(2000);

		//Spin the reels
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
			System.out.println("Wild is not triggered for the 3rd reel as the bet is changed ");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild disappears as bet is changed and comparision is successful and value equal to: "+" "+score5 +"%");
		Assert.assertFalse(score5 > 97);
	}

	@Then("^Upon change of bet and denominations wild pop-up to appear on screen$")
	public void upon_change_of_bet_and_denominations_wild_pop_up_to_appear_on_screen() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^If the user selects 'No' wild iterations should be continued for further spins$")
	public void if_the_user_selects_No_wild_iterations_should_be_continued_for_further_spins() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^If the user selects 'Yes' wild iterations should be terminated for next spin$")
	public void if_the_user_selects_Yes_wild_iterations_should_be_terminated_for_next_spin() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
}
