package stepDefinition_PerfectGems;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PerfectGems_Web_Gamble_ResumeFeature_Collect_Reload_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slotPerfect Gems slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, collect, new browser$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slotPerfect_Gems_slot_game_bet_type_denomination_balance_win_symbols_spin_button_Gamble_screen_collect_new_browser() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and close the browser and again login to the game with new browser window$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_close_the_browser_and_again_login_to_the_game_with_new_browser_window() throws Throwable {
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
		Pattern balance=new Pattern("Images/Perfect_Gems/balance.PNG");
		Pattern win_amt1 = new Pattern("Images/Perfect_Gems/win_1.PNG");            
		Pattern gamble=new Pattern("Images/Perfect_Gems/gamble.PNG"); 
		Pattern collect=new Pattern("Images/Perfect_Gems/collect.PNG");

		Pattern black=new Pattern("Images/Perfect_Gems/black.PNG");
		Pattern win=new Pattern("Images/Perfect_Gems/win.PNG");
		Pattern lose=new Pattern("Images/Perfect_Gems/lose.PNG");
		Pattern balance_gamble_lose=new Pattern("Images/Perfect_Gems/balance1_1.PNG");
		Pattern resgamble_win=new Pattern("Images/Perfect_Gems/resgamble_win.PNG");

		Pattern symb_1=new Pattern("Images/Perfect_Gems/symb_1.PNG");
		Pattern symb_2=new Pattern("Images/Perfect_Gems/symb_2.PNG");

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
		screen.click(symb_2);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_amt1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 0.40 SRD ");
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

		//Clicking on black button
		screen.click(black);
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
			Assert.assertTrue(score33 > 97);			  
			Thread.sleep(3000);

			Properties obj = new Properties();
			FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/PerfectGems.properties");
			obj.load(objfile);

			String gamePath = obj.getProperty("gamePath");
			String textUserName = obj.getProperty("textUserName");
			String userName = obj.getProperty("userName");
			String passwordPath = obj.getProperty("passwordPath");
			String password = obj.getProperty("password");
			String login = obj.getProperty("login");
			//String suribetURL = obj.getProperty("login");

			// Verify the reload option in gamble page after win
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_F5);
			robot.keyRelease(KeyEvent.VK_F5);
			Thread.sleep(4000);
			System.out.println("Reload the gamble screen");

			WebElement sub1 = driver.findElement(By.xpath(gamePath));
			JavascriptExecutor jse1=(JavascriptExecutor)driver;
			jse1.executeScript("arguments[0].click();", sub1);
			Thread.sleep(5000);
			System.out.println("Load the game and landing on gamble screen");
			screen.wait(collect, 30);
			Thread.sleep(2000);

			//Verify the black button after reloading the HappyFruits slot game
			Finder finder21 =new Finder(screen.capture().getImage());
			String ht21 = finder21.find(black);
			double score21=20;                
			System.out.println("the value of ht21"+" "+ht21);
			if(finder21.hasNext())
			{
				Match m21=finder21.next();
				System.out.println("Match Found with: "+(m21.getScore())*100+"%");
				score21=(m21.getScore())*100;
				System.out.println("Black button is present after reloading the slot game ");
				finder21.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Black button comparision after spin: "+" "+score21 +"%");
			Assert.assertTrue(score21 > 96);
			Thread.sleep(5000);

			// Resume option
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			System.out.println("load the game in another window");

			driver = new ChromeDriver();
			driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
			driver.manage().window().maximize();
			Thread.sleep(3000);

			driver.findElement(By.id(textUserName)).sendKeys(userName);
			Thread.sleep(2000);

			driver.findElement(By.xpath(passwordPath)).sendKeys(password);
			Thread.sleep(2000);

			driver.findElement(By.className(login)).click();
			Thread.sleep(2000);
			System.out.println("Login to the game with valid credentials");
			Thread.sleep(2000);
			WebElement sub = driver.findElement(By.xpath(gamePath));
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", sub);
			screen.wait(collect, 30);
			Thread.sleep(2000);

			//Verify the black button after resuming the Happyfruits slot game
			Finder finder12 =new Finder(screen.capture().getImage());
			String ht12 = finder12.find(black);
			double score12=20;                
			System.out.println("the value of ht12"+" "+ht12);
			if(finder12.hasNext())
			{
				Match m12=finder12.next();
				System.out.println("Match Found with: "+(m12.getScore())*100+"%");
				score12=(m12.getScore())*100;
				System.out.println("Black button is present after resuming the slot game ");
				finder12.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Black button comparision after spin: "+" "+score12 +"%");
			Assert.assertTrue(score12 > 96);
			Thread.sleep(5000);
			System.out.println("landing on gamble screen and collect the win amount");
			screen.click(collect);
			Thread.sleep(5000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(resgamble_win);
			double score11=20;                
			System.out.println("the value of ht11"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Gamble win amount in win meter after reloading and resuming the gamble page");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win amount in win meter after reloading and resuming the gamble page: "+" "+score11 +"%");
			Assert.assertTrue(score11 > 97);
		}
		else
		{
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
			Assert.assertTrue(score35 > 97);
			Thread.sleep(3000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(balance_gamble_lose);
			double score11=20;                
			System.out.println("the value of ht1"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.75 SRD");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score11 > 97);
		}
	}

	@Then("^Resume feature should be enabled and land on the game screen and collect the win amount in Perfect Gems slot game$")
	public void resume_feature_should_be_enabled_and_land_on_the_game_screen_and_collect_the_win_amount_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify the reload option after gamble win in Perfect Gems slot game$")
	public void verify_the_reload_option_after_gamble_win_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
