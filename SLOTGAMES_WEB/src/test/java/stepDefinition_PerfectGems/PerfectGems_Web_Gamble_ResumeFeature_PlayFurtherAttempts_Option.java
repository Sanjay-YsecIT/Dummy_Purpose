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

public class PerfectGems_Web_Gamble_ResumeFeature_PlayFurtherAttempts_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_denomination_balance_win_symbols_spin_button_Gamble_screen_new_browser() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_red_button_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
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

		Pattern red=new Pattern("Images/Perfect_Gems/red.PNG");
		Pattern win=new Pattern("Images/Perfect_Gems/win.PNG");
		Pattern lose=new Pattern("Images/Perfect_Gems/lose.PNG");
		Pattern balance_gamble_lose=new Pattern("Images/Perfect_Gems/balance1_1.PNG");

		Pattern resume_pre_gambleamount=new Pattern("Images/Perfect_Gems/resume_gambleamount.PNG");
		Pattern resume_post_gambleamount=new Pattern("Images/Perfect_Gems/resume_post_gambleamount.PNG");
		Pattern resume_pre_gamblecount=new Pattern("Images/Perfect_Gems/pre_gamblecount.PNG");
		Pattern resume_post_gamblecount=new Pattern("Images/Perfect_Gems/post_gamblecount.PNG");

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
		Thread.sleep(7000);

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
			System.out.println("Win amount comparision completed successfully. Win amount is 0.40 SRD");
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
		screen.click(red);
		Thread.sleep(900);

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

			//Verify the gamble win amount field before resuming the gamble page
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(resume_pre_gambleamount);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("pre Gamble Win amount before resuming");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Pre Gamble win comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 97);			  
			Thread.sleep(3000);

			//comparing the Gamble count before resuming to gamble page
			Finder finder13 =new Finder(screen.capture().getImage());
			String ht13 = finder13.find(resume_pre_gamblecount);
			double score13=20;                
			System.out.println("the value of ht13"+" "+ht13);
			if(finder13.hasNext())
			{
				Match m13=finder13.next();
				System.out.println("Match Found with: "+(m13.getScore())*100+"%");
				score13=(m13.getScore())*100;
				System.out.println("pre gamble attempts left over and comparision completed successfully.");
				finder13.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("pre gamble attempts left over and comparision value equals to: "+" "+score13 +"%");
			Assert.assertTrue(score13 > 97);
			Thread.sleep(2000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);

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
			Thread.sleep(5000);
			screen.wait(collect, 30);
			Thread.sleep(5000);

			// Verify the gamble amount after resuming to gamble page 
			Finder finder31 =new Finder(screen.capture().getImage());
			String ht31 = finder31.find(resume_post_gambleamount);
			double score31=20;                
			System.out.println("the value of ht3"+" "+ht31);
			if(finder31.hasNext())
			{
				Match m31=finder31.next();
				System.out.println("Match Found with: "+(m31.getScore())*100+"%");
				score31=(m31.getScore())*100;
				System.out.println("post gamble amount after resuming");
				finder31.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("post resume gamble amount after resuming comparision: "+" "+score31 +"%");
			Assert.assertTrue(score31 > 97);			  
			Thread.sleep(3000);

			//comparing the Gamble count before resuming to gamble page
			Finder finder14 =new Finder(screen.capture().getImage());
			String ht14 = finder14.find(resume_post_gamblecount);
			double score14=20;                
			System.out.println("the value of ht14"+" "+ht14);
			if(finder14.hasNext())
			{
				Match m14=finder14.next();
				System.out.println("Match Found with: "+(m14.getScore())*100+"%");
				score14=(m14.getScore())*100;
				System.out.println("post gamble attempts left over after resuming and comparision completed successfully.");
				finder14.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("pre gamble attempts left over after resuming and comparision value equals to: "+" "+score13 +"%");
			Assert.assertTrue(score14 > 97);
			Thread.sleep(2000);

			//Clicking on black button
			screen.click(red);
			Thread.sleep(1000);

			if(screen.exists(win) != null) {
				System.out.println("2nd gamble attempts is won");
				Thread.sleep(3000);
				screen.click(collect);
				Thread.sleep(4000);
			}else
			{
				System.out.println("Gamble lose on 2nd attempt");
				Thread.sleep(4000);
			}
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
				System.out.println("Balance After losing in gamble. Balance is 299.75 SRD");
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

	@Then("^Resume feature should be enabled and land on the gamble screen of Perfect Gems slot game$")
	public void resume_feature_should_be_enabled_and_land_on_the_gamble_screen_of_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify the Gamble attempts, gamble amount and user is able to play left over attempts and collect the win amount in Perfect Gems slot game$")
	public void verify_the_Gamble_attempts_gamble_amount_and_user_is_able_to_play_left_over_attempts_and_collect_the_win_amount_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
