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

public class CircusMania_Web_BigWin_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, bet type, denomination, balance, monkey symbols, spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_bet_type_denomination_balance_monkey_symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the monkey appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_monkey_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);

		Pattern spin=new Pattern("Images/Circus_Mania/spin.PNG");                         
		Pattern take=new Pattern("Images/Circus_Mania/take.PNG");            
		Pattern balance=new Pattern("Images/Circus_Mania/balance.PNG");
		Pattern bigwinwin_bal=new Pattern("Images/Circus_Mania/bigwinwin_bal.PNG");

		Pattern BigWin=new Pattern("Images/Circus_Mania/BigWin.PNG");
		Pattern win_amt=new Pattern("Images/Circus_Mania/BW_amt.PNG");

		Pattern symb_1_1=new Pattern("Images/Circus_Mania/symb_1_1.PNG");
		Pattern symb_1_2=new Pattern("Images/Circus_Mania/symb_1_2.PNG");
		Pattern symb_1_3=new Pattern("Images/Circus_Mania/symb_1_3.PNG");
		Pattern symb_1_4=new Pattern("Images/Circus_Mania/symb_1_4.PNG");
		Pattern symb_1_5=new Pattern("Images/Circus_Mania/symb_1_5.PNG");

		Pattern symb_2_1=new Pattern("Images/Circus_Mania/symb_2_1.PNG");
		Pattern symb_2_2=new Pattern("Images/Circus_Mania/symb_2_2.PNG");
		Pattern symb_2_3=new Pattern("Images/Circus_Mania/symb_2_3.PNG");
		Pattern symb_2_4=new Pattern("Images/Circus_Mania/symb_2_4.PNG");
		Pattern symb_2_33=new Pattern("Images/Circus_Mania/symb_2_33.PNG");

		Pattern symb_5_1=new Pattern("Images/Circus_Mania/symb_5_1.PNG");
		Pattern symb_5_2=new Pattern("Images/Circus_Mania/symb_5_2.PNG");
		Pattern symb_5_3=new Pattern("Images/Circus_Mania/symb_5_3.PNG");
		Pattern symb_5_4=new Pattern("Images/Circus_Mania/symb_5_4.PNG");
		Pattern symb_5_5=new Pattern("Images/Circus_Mania/symb_5_5.PNG");
		Pattern symb_5_6=new Pattern("Images/Circus_Mania/symb_5_6.PNG");
		Pattern symb_5_7=new Pattern("Images/Circus_Mania/symb_5_7.PNG");
		
		Pattern symb_6_1=new Pattern("Images/Circus_Mania/symb_6_1.PNG");
		Pattern symb_6_2=new Pattern("Images/Circus_Mania/symb_6_2.PNG");
		Pattern symb_6_3=new Pattern("Images/Circus_Mania/symb_6_3.PNG");

		Pattern bigwinsymb_1=new Pattern("Images/Circus_Mania/bigwinsymb_1.PNG");
		Pattern bigwinsymb_2=new Pattern("Images/Circus_Mania/bigwinsymb_2.PNG");
		Pattern bigwinsymb_3=new Pattern("Images/Circus_Mania/bigwinsymb_3.PNG");
		Pattern bigwinsymb_5=new Pattern("Images/Circus_Mania/bigwinsymb_5.PNG");
		Pattern bigwinsymb_6=new Pattern("Images/Circus_Mania/bigwinsymb_6.PNG");
		Pattern bigwinsymb_7=new Pattern("Images/Circus_Mania/bigwinsymb_7.PNG");
		Pattern bigwinsymb_8=new Pattern("Images/Circus_Mania/bigwinsymb_8.PNG");	
		Pattern bigwinsymb_9=new Pattern("Images/Circus_Mania/bigwinsymb_9.PNG");
		Pattern bigwinsymb_10=new Pattern("Images/Circus_Mania/bigwinsymb_10.PNG");
		
		//comparing the balance before spin
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		//Arranging the symbols to generate bigwin
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_2);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3);
		Thread.sleep(1000);
		screen.click(symb_1_3);
		Thread.sleep(1000);
		screen.click(symb_1_3);
		Thread.sleep(1000);
		screen.click(symb_1_4);
		Thread.sleep(1000);
		screen.click(symb_1_5);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_2);
		Thread.sleep(1000);
		screen.click(symb_2_3);
		Thread.sleep(1000);
		screen.click(symb_2_4);
		Thread.sleep(1000);
		screen.click(symb_2_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_10);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_33);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_7);
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
		screen.click(symb_5_2);
		Thread.sleep(1000);
		screen.click(symb_5_2);
		Thread.sleep(1000);
		screen.click(symb_5_4);
		Thread.sleep(1000);
		screen.click(symb_5_3);
		Thread.sleep(1000);
		screen.click(symb_5_5);
		Thread.sleep(1000);
		screen.click(symb_5_6);
		Thread.sleep(1000);
		screen.click(symb_5_6);
		Thread.sleep(1000);
		screen.click(symb_5_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_8);
		Thread.sleep(1000);
		screen.click(symb_5_1);
		Thread.sleep(1000);
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_2);
		Thread.sleep(1000);
		screen.click(symb_6_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_9);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(3000);

		// Big Win  Screen pop-up
		screen.wait(BigWin, 20);
		Thread.sleep(8000);

		//Comparing the win amount after the big win
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(win_amt);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Win amount comparision completed successfully.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);

		//clicking on collect button
		screen.click(take);
		Thread.sleep(3000);

		//comparing the balance amount after spin
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(bigwinwin_bal);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Balance comparision after spin & win completed successfully.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance amount comparision after spin & win: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);
	}

	@Then("^Big Win screen should appear when five monkey symbols appears on the screen in Circus Mania slot game$")
	public void big_Win_screen_should_appear_when_five_monkey_symbols_appears_on_the_screen_in_Circus_Mania_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
