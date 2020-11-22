package stepDefinition_CircusMania;

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

public class CircusMania_Web_Scatter_FreeSpin_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, bet type, denomination, balance, scatter symbols, spin button, free spin banner, free spin screen and free spin win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_free_spin_banner_free_spin_screen_and_free_spin_win_amount() throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three scatter symbols appears on the screen wins and Free Spin Activates and spin amount added to the win amount$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_Three_scatter_symbols_appears_on_the_screen_wins_and_Free_Spin_Activates_and_spin_amount_added_to_the_win_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);

		Pattern spin=new Pattern("Images/Circus_Mania/spin.PNG");                         
		Pattern collect=new Pattern("Images/Circus_Mania/collect.PNG");            
		Pattern gamble=new Pattern("Images/Circus_Mania/gamble.PNG");

		Pattern symb_1_3=new Pattern("Images/Circus_Mania/symb_1_3.PNG");
		Pattern symb_1_4=new Pattern("Images/Circus_Mania/symb_1_4.PNG");

		Pattern symb_5_1=new Pattern("Images/Circus_Mania/symb_5_1.PNG");
		Pattern symb_5_2=new Pattern("Images/Circus_Mania/symb_5_2.PNG");
		Pattern symb_5_3=new Pattern("Images/Circus_Mania/symb_5_3.PNG");
		Pattern symb_5_7=new Pattern("Images/Circus_Mania/symb_5_7.PNG");

		Pattern symb_6_1=new Pattern("Images/Circus_Mania/symb_6_1.PNG");
		Pattern symb_6_2=new Pattern("Images/Circus_Mania/symb_6_2.PNG");
		Pattern symb_6_3=new Pattern("Images/Circus_Mania/symb_6_3.PNG");
		Pattern symb_6_4=new Pattern("Images/Circus_Mania/symb_6_4.PNG");
		Pattern scsymb_1=new Pattern("Images/Circus_Mania/scsymb_1.PNG");
		Pattern scsymb_2=new Pattern("Images/Circus_Mania/scsymb_2.PNG");
		Pattern scsymb_3=new Pattern("Images/Circus_Mania/scsymb_3.PNG");

		// Congulation and Win window pop-up and free spin left 
		Pattern freespinbanner =new Pattern("Images/Circus_Mania/freespinbanner.PNG");
		Pattern freespin =new Pattern("Images/Circus_Mania/freespin.PNG");
		Pattern freespin15 =new Pattern("Images/Circus_Mania/freespin15.PNG");
		Pattern freespinwin =new Pattern("Images/Circus_Mania/freespinwin.PNG"); 
		Pattern freespin_gambleamount =new Pattern("Images/Circus_Mania/freespin_gambleamount.PNG"); 

		//Arranging the symbols to generate 3 Scatter
		screen.click(symb_1_3);
		Thread.sleep(1000);
		screen.click(symb_1_3);
		Thread.sleep(1000);
		screen.click(symb_1_4);
		Thread.sleep(1000);
		screen.click(symb_5_7);
		Thread.sleep(1000);
		screen.click(symb_5_1);
		Thread.sleep(1000);
		screen.click(symb_5_2);
		Thread.sleep(1000);
		screen.click(symb_5_2);
		Thread.sleep(1000);
		screen.click(symb_5_3);
		Thread.sleep(1000);
		screen.click(symb_5_2);
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
		screen.click(symb_6_4);
		Thread.sleep(1000);
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(scsymb_2);
		Thread.sleep(1000);
		screen.click(scsymb_3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		// free spin banner
		screen.wait(freespinbanner, 30);
		Thread.sleep(2000);

		//Comparing the Free Spins once the scatter  symbol triggers
		screen.wait(freespin15, 30);
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(freespin15);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("On appearance of 3 scatters, bonus game should be triggered and Free spin attempts should be 15.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
		Thread.sleep(60000);

		//compare the win amount after the free spin, win amount is of base payout configured win.
		screen.wait(freespinwin, 240);
		Thread.sleep(2000);
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(freespinwin);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
		Thread.sleep(2000);
		
		//After free spin is completed, scatter win is used for gambling in the game.
		screen.click(gamble);
		Thread.sleep(3000);
		
		//Comparing the Free Spins win amount is same as gamble amount in gamble page
		screen.wait(freespin_gambleamount, 10);
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(freespin_gambleamount);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Freespin win amount in gamble page is compared.");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Freespin win amount in gamble page comparision: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 97);
		Thread.sleep(2000);
		screen.click(collect);
		Thread.sleep(1000);
	}

	@Then("^Fifteen Free Spin screen should appear when Three scatter symbols appears on the screen in Circus Mania game$")
	public void fifteen_Free_Spin_screen_should_appear_when_Three_scatter_symbols_appears_on_the_screen_in_Circus_Mania_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
