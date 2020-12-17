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

public class PerfectGems_Web_AutoSpin_BonusGame_Behavior_Options {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, win symbols, spin button, Bonus Game screen, new browser, new tab, network interruptions and reload$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_denomination_balance_win_symbols_spin_button_Bonus_Game_screen_new_browser_new_tab_network_interruptions_and_reload() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and Bonus Game is activated and observe the Bonus Game continuity under various conditions$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_Bonus_Game_is_activated_and_observe_the_Bonus_Game_continuity_under_various_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);
                         
		Pattern autoplay=new Pattern("Images/Perfect_Gems/autoplay.PNG");
		Pattern auto_auto=new Pattern("Images/Perfect_Gems/auto_auto.PNG"); 
		Pattern reload=new Pattern("Images/Perfect_Gems/reload.PNG");
		Pattern newtab=new Pattern("Images/Perfect_Gems/newtab.PNG");
		Pattern gametab=new Pattern("Images/Perfect_Gems/gametab.PNG");

		Pattern bigwinsymb_1_1=new Pattern("Images/Perfect_Gems/bigwinsymb_1_1.PNG");
		Pattern bigwinsymb_1_2=new Pattern("Images/Perfect_Gems/bigwinsymb_1_2.PNG");
		Pattern bigwinsymb_1_3=new Pattern("Images/Perfect_Gems/bigwinsymb_1_3.PNG");
		Pattern bigwinsymb_1_4=new Pattern("Images/Perfect_Gems/bigwinsymb_1_4.PNG");
		Pattern bigwinsymb_1_5=new Pattern("Images/Perfect_Gems/bigwinsymb_1_5.PNG");
		Pattern bigwinsymb_1_6=new Pattern("Images/Perfect_Gems/bigwinsymb_1_6.PNG");
		Pattern bigwinsymb_1_7=new Pattern("Images/Perfect_Gems/bigwinsymb_1_7.PNG");

		Pattern bigwinsymb_2_1=new Pattern("Images/Perfect_Gems/bigwinsymb_2_1.PNG");

		Pattern bigwinsymb_3_1=new Pattern("Images/Perfect_Gems/bigwinsymb_3_1.PNG");
		Pattern bigwinsymb_3_2=new Pattern("Images/Perfect_Gems/bigwinsymb_3_2.PNG");
		Pattern bigwinsymb_3_3=new Pattern("Images/Perfect_Gems/bigwinsymb_3_3.PNG");
		Pattern bigwinsymb_3_4=new Pattern("Images/Perfect_Gems/bigwinsymb_3_4.PNG");
		Pattern bigwinsymb_3_5=new Pattern("Images/Perfect_Gems/bigwinsymb_3_5.PNG");
		Pattern bigwinsymb_3_6=new Pattern("Images/Perfect_Gems/bigwinsymb_3_6.PNG");
		Pattern bigwinsymb_3_7=new Pattern("Images/Perfect_Gems/bigwinsymb_3_7.PNG");
		Pattern bigwinsymb_3_8=new Pattern("Images/Perfect_Gems/bigwinsymb_3_8.PNG");

		// congratulations and Win window pop-up 
		Pattern bonusgamebanner =new Pattern("Images/Perfect_Gems/bonusgamebanner.PNG"); 
		Pattern bonusgametext =new Pattern("Images/Perfect_Gems/bonusgametext.PNG");
		Pattern TreasureBox1=new Pattern("Images/Perfect_Gems/TreasureBox1.PNG");

		//Arranging the symbols to generate 3 Scatter
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_1_7);
		Thread.sleep(1000);

		screen.click(bigwinsymb_2_1);
		Thread.sleep(1000);

		screen.click(bigwinsymb_3_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_3);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_4);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_1);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_5);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_6);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_7);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_2);
		Thread.sleep(1000);
		screen.click(bigwinsymb_3_8);
		Thread.sleep(1000);
		screen.click(autoplay);
		Thread.sleep(1000);
		screen.click(auto_auto);
		Thread.sleep(3000);

		// Bonus Game banner
		screen.exists(bonusgamebanner, 10);
		Thread.sleep(4000);

		//Bonus Game banner under opening a new tab operation
		screen.click(newtab);
		Thread.sleep(1500);
		screen.click(gametab);
		Thread.sleep(3000);

		screen.wait(bonusgametext, 30);
		Thread.sleep(4000);
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(bonusgametext);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Verify the bonus game text after changing tabs in bonus game screen.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Verify the bonus game text after changing tabs in bonus game screen comparision: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);
		Thread.sleep(2000);

		screen.click(reload);
		Thread.sleep(8000);

		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[9]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(10000);
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);
		Thread.sleep(2000);
		
		screen.wait(bonusgametext, 30);
		Thread.sleep(4000);
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(bonusgametext);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Verify the bonus game text after reloading tab in Bonus Game screen.");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Verify the bonus game text after reloading tab in Bonus Game screen comparision: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 97);
		Thread.sleep(2000);

		//Resume property when landed on BonusGame screen
		Robot robot = new Robot();
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\PerfectGems.properties");
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

		WebElement sub1 = driver.findElement(By.xpath(gamePath));
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click();", sub1);
		Thread.sleep(5000);
		screen.wait(TreasureBox1, 30);
		Thread.sleep(3000);

		Finder finder14 =new Finder(screen.capture().getImage());
		String ht14 = finder14.find(bonusgametext);
		double score14=20;                
		System.out.println("the value of ht14"+" "+ht14);
		if(finder14.hasNext())
		{
			Match m14=finder14.next();
			System.out.println("Match Found with: "+(m14.getScore())*100+"%");
			score14=(m14.getScore())*100;
			System.out.println("Verify the bonus game text after resuming in Bonus Game screen.");
			finder14.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Verify the bonus game text after resuming in Bonus Game screen comparision: "+" "+score14 +"%");
		Assert.assertTrue(score14 > 97);
		Thread.sleep(2000);

		screen.click(TreasureBox1);
		Thread.sleep(6000);

		// Verify the autospin is stopped after Bonus Game completion
		screen.wait(autoplay, 30);
		Thread.sleep(3000);
		Finder finder15 =new Finder(screen.capture().getImage());
		String ht15 = finder15.find(autoplay);
		double score15=20;                
		System.out.println("the value of ht15"+" "+ht15);
		if(finder15.hasNext())
		{
			Match m15=finder15.next();
			System.out.println("Match Found with: "+(m15.getScore())*100+"%");
			score15=(m15.getScore())*100;
			System.out.println("Autoplay button is displayed after completion of wheelspin. Test case passed");
			finder15.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score15 +"%");
		Assert.assertTrue(score15 > 97);
		Thread.sleep(2000);
	}

	@Then("^Bonus Game should be enabled and resumed and after reloading the game autoplay should be stopped in Perfect Gems slot game$")
	public void bonus_Game_should_be_enabled_and_resumed_and_after_reloading_the_game_autoplay_should_be_stopped_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
