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

public class CircusMania_Web_Gamble_GambleBehavior_For_LastGambleCount {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as (\\d+)\\.(\\d+), denomination as (\\d+)\\.(\\d+), balance, spin button, win amount, gamble button, gamble amount, red button, win amount field in main page$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_bet_type_as_denomination_as_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_win_amount_field_in_main_page(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Circus Mania slot game, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+)\\.(\\d+), click on spin button till user wins, click on gamble button and pay gamble with last gamble count$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Circus_Mania_slot_game_select_bet_type_as_denomination_as_click_on_spin_button_till_user_wins_click_on_gamble_button_and_pay_gamble_with_last_gamble_count(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);
		
		Pattern spin=new Pattern("Images/Circus_Mania/spin.PNG");                                     
		Pattern gamble=new Pattern("Images/Circus_Mania/gamble.PNG"); 
		Pattern gamblecount1=new Pattern("Images/Circus_Mania/gamblecount1.PNG");
		Pattern gamble_winfield=new Pattern("Images/Circus_Mania/gamble_winfield.PNG");
		Pattern lose_balance=new Pattern("Images/Circus_Mania/balance1_1.PNG");
		Pattern main_bal=new Pattern("Images/Circus_Mania/main_bal.PNG");
		Pattern lose_field=new Pattern("Images/Circus_Mania/lose_field.PNG");

		Pattern red=new Pattern("Images/Circus_Mania/red.PNG");
		Pattern win=new Pattern("Images/Circus_Mania/win.PNG");
		Pattern lose=new Pattern("Images/Circus_Mania/lose.PNG");

		//win symbols set to reproduce the gamble count win amount respectively
		Pattern symb_1_1=new Pattern("Images/Circus_Mania/symb_1_1.PNG");
		Pattern symb_1_2=new Pattern("Images/Circus_Mania/symb_1_2.PNG");
		Pattern symb_1_3=new Pattern("Images/Circus_Mania/symb_1_3.PNG");
		Pattern symb_1_4=new Pattern("Images/Circus_Mania/symb_1_4.PNG");
		Pattern symb_1_5=new Pattern("Images/Circus_Mania/symb_1_5.PNG");

		Pattern symb_2_1=new Pattern("Images/Circus_Mania/symb_2_1.PNG");
		Pattern symb_2_2=new Pattern("Images/Circus_Mania/symb_2_2.PNG");
		Pattern symb_2_3=new Pattern("Images/Circus_Mania/symb_2_3.PNG");
		Pattern symb_2_4=new Pattern("Images/Circus_Mania/symb_2_4.PNG");
		Pattern symb_2_5=new Pattern("Images/Circus_Mania/symb_2_5.PNG");
		Pattern symb_2_6=new Pattern("Images/Circus_Mania/symb_2_6.PNG");

		Pattern symb_3_1=new Pattern("Images/Circus_Mania/symb_3_1.PNG");
		Pattern symb_4_1=new Pattern("Images/Circus_Mania/symb_4_1.PNG");

		Pattern symb_5_1=new Pattern("Images/Circus_Mania/symb_5_1.PNG");
		Pattern symb_5_2=new Pattern("Images/Circus_Mania/symb_5_2.PNG");
		Pattern symb_5_3=new Pattern("Images/Circus_Mania/symb_5_3.PNG");
		Pattern symb_5_4=new Pattern("Images/Circus_Mania/symb_5_4.PNG");
		Pattern symb_5_5=new Pattern("Images/Circus_Mania/symb_5_5.PNG");
		Pattern symb_5_6=new Pattern("Images/Circus_Mania/symb_5_6.PNG");

		// SET THE BET TYPE AS 0.01 AND DENOMIANTION AS 0.2
		//Arranging the symbols to generate gamble count as 5
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_2);
		Thread.sleep(1000);
		screen.click(symb_1_1);
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
		screen.click(symb_2_5);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_6);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_3_1);
		Thread.sleep(1000);
		screen.click(symb_4_1);
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
		screen.click(spin);
		Thread.sleep(10000);
		screen.click(gamble);
		Thread.sleep(3000);

		//comparing the gamble count based on the win amount
		Finder finder24 =new Finder(screen.capture().getImage());
		String ht24 = finder24.find(gamblecount1);
		double score24=20;                
		System.out.println("the value of ht2"+" "+ht24);
		if(finder24.hasNext())
		{
			Match m24=finder24.next();
			System.out.println("Match Found with: "+(m24.getScore())*100+"%");
			score24=(m24.getScore())*100;
			System.out.println("Gamble count comparision completed successfully. Gamble count should be 1.");
			finder24.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Gamble count comparision after Win: "+" "+score24 +"%");
		Assert.assertTrue(score24 > 97);
		Thread.sleep(3000);

		//Clicking on Red button
		screen.click(red);
		Thread.sleep(1000);

		//comparing the balance amount after spin
		if  (screen.exists(win) != null)
		{
			Pattern gambleStatus=new Pattern(win);
			Finder finder33 =new Finder(screen.capture().getImage());
			String ht33 = finder33.find(gambleStatus);
			double score33=20;                
			System.out.println("the value of ht33"+" "+ht33);
			if(finder33.hasNext())
			{
				Match m33=finder33.next();
				System.out.println("Match Found with: "+(m33.getScore())*100+"%");
				score33=(m33.getScore())*100;
				System.out.println("Gamble Win");
				finder33.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win comparision: "+" "+score33 +"%");
			Assert.assertTrue(score33 > 90);			  
			Thread.sleep(5000);

			Finder finder6 =new Finder(screen.capture().getImage());
			String ht6 = finder6.find(gamble_winfield);
			double score6=20;                
			System.out.println("the value of ht3"+" "+ht6);
			if(finder6.hasNext())
			{
				Match m6=finder6.next();
				System.out.println("Match Found with: "+(m6.getScore())*100+"%");
				score6=(m6.getScore())*100;
				System.out.println("Gamble Win amount displayed over win field");
				finder6.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win displayed over win field and comparision: "+" "+score6 +"%");
			Assert.assertTrue(score6 > 97);
			Thread.sleep(2000);

			//Gamble amount added to main balance 
			Finder finder61 =new Finder(screen.capture().getImage());
			String ht61 = finder61.find(main_bal);
			double score61=20;                
			System.out.println("the value of ht61"+" "+ht61);
			if(finder61.hasNext())
			{
				Match m61=finder61.next();
				System.out.println("Match Found with: "+(m61.getScore())*100+"%");
				score61=(m61.getScore())*100;
				System.out.println("Gamble Win amount added to main balance");
				finder61.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble Win amount added to main balance and comparision: "+" "+score61 +"%");
			Assert.assertTrue(score61 > 97);
			Thread.sleep(2000);
		}
		else
		{
			Thread.sleep(100);
			Finder finder35 =new Finder(screen.capture().getImage());
			String ht35 = finder35.find(lose);
			double score35=20;                
			System.out.println("the value of ht35"+" "+ht35);
			if(finder35.hasNext())
			{
				Match m35=finder35.next();
				System.out.println("Match Found with: "+(m35.getScore())*100+"%");
				score35=(m35.getScore())*100;
				System.out.println("Gamble Lose.");
				finder35.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score35+"%");
			Assert.assertTrue(score35 > 90);
			Thread.sleep(5000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(lose_balance);
			double score11=20;                
			System.out.println("the value of ht1"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.80 SRD");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score11 > 97);
			Thread.sleep(2000);

			Finder finder18 =new Finder(screen.capture().getImage());
			String ht18 = finder18.find(lose_field);
			double score18=20;                
			System.out.println("the value of ht18"+" "+ht18);
			if(finder18.hasNext())
			{
				Match m18=finder18.next();
				System.out.println("Match Found with: "+(m18.getScore())*100+"%");
				score18=(m18.getScore())*100;
				System.out.println("win field is empty");
				finder18.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("win field comparision after lose: "+" "+score18 +"%");
			Assert.assertTrue(score18 > 97);
		}
	}

	@Then("^Gamble page should terminate and win amount should be added to main balance in Circus Mania slot game$")
	public void gamble_page_should_terminate_and_win_amount_should_be_added_to_main_balance_in_Circus_Mania_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
