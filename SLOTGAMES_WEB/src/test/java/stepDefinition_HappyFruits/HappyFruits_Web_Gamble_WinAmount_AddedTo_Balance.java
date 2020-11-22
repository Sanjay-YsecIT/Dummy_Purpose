package stepDefinition_HappyFruits;

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

public class HappyFruits_Web_Gamble_WinAmount_AddedTo_Balance {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, gamble amount, red button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_and_gamble_status() throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red button and check the balance after win$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_button_and_check_the_balance_after_win() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);
		Thread.sleep(2000);
		
		Pattern spin=new Pattern("Images/Happy_Fruits/spin.PNG");
		Pattern balance=new Pattern("Images/Happy_Fruits/balance.PNG");
		Pattern win_1 = new Pattern("Images/Happy_Fruits/win_1.PNG");            
		Pattern gamble=new Pattern("Images/Happy_Fruits/gamble.PNG"); 
		Pattern collect=new Pattern("Images/Happy_Fruits/collect.PNG");

		Pattern red=new Pattern("Images/Happy_Fruits/red.PNG");
		Pattern win=new Pattern("Images/Happy_Fruits/win.PNG");
		Pattern lose=new Pattern("Images/Happy_Fruits/lose.PNG");
		Pattern balance_gamble_win=new Pattern("Images/Happy_Fruits/balance_gamble_win.PNG");
		Pattern balance_gamble_lose=new Pattern("Images/Happy_Fruits/balance1_1.PNG");
		Pattern gamble_win=new Pattern("Images/Happy_Fruits/gamble_win.PNG");

		Pattern symb_1=new Pattern("Images/Happy_Fruits/symb_1.PNG");

		//comparing the balance before Win
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully. Balance is 300 SRD");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 0.30");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(3000);

		//Clicking on gamble button
		screen.click(gamble);
		Thread.sleep(2000);

		//Clicking on red button
		screen.click(red);
		Thread.sleep(800);

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
			Thread.sleep(3000);

			screen.click(collect);
			Thread.sleep(3000);

			Finder finder6 =new Finder(screen.capture().getImage());
			String ht6 = finder6.find(balance_gamble_win);
			double score6=20;                
			System.out.println("the value of ht3"+" "+ht6);
			if(finder6.hasNext())
			{
				Match m6=finder6.next();
				System.out.println("Match Found with: "+(m6.getScore())*100+"%");
				score6=(m6.getScore())*100;
				System.out.println("Gamble Win amount added to the balance");
				finder6.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win added to the balance comparision: "+" "+score6 +"%");
			Assert.assertTrue(score6 > 97);
			Thread.sleep(2000);

			//Gamble win amount added to win field 
			Finder finder61 =new Finder(screen.capture().getImage());
			String ht61 = finder61.find(gamble_win);
			double score61=20;                
			System.out.println("the value of ht61"+" "+ht61);
			if(finder61.hasNext())
			{
				Match m61=finder61.next();
				System.out.println("Match Found with: "+(m61.getScore())*100+"%");
				score61=(m61.getScore())*100;
				System.out.println("Gamble Win amount is displayed over win field");
				finder61.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win is displayed over win field and comparision: "+" "+score61 +"%");
			Assert.assertTrue(score61 > 97);
			Thread.sleep(2000);
		}
		else
		{
			Finder finder38 =new Finder(screen.capture().getImage());
			String ht38 = finder38.find(lose);
			double score38=20;                
			System.out.println("the value of ht38"+" "+ht38);
			if(finder38.hasNext())
			{
				Match m38=finder38.next();
				System.out.println("Match Found with: "+(m38.getScore())*100+"%");
				score38=(m38.getScore())*100;
				System.out.println("Gamble Lose.");
				finder38.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score38+"%");
			Assert.assertTrue(score38 > 90);
			Thread.sleep(4000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(balance_gamble_lose);
			double score11=20;                
			System.out.println("the value of ht1"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.85 SRD");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score1 > 97);
		}
	}

	@Then("^Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should be closed in Happy Fruits slot game$")
	public void gamble_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_be_closed_in_Happy_Fruits_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
