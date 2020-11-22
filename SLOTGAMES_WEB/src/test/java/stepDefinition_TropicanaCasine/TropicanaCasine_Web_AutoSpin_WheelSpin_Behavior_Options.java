package stepDefinition_TropicanaCasine;

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

public class TropicanaCasine_Web_AutoSpin_WheelSpin_Behavior_Options {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, bet type, denomination, balance, win symbols, spin button, wheelspin screen, new browser, new tab, network interuptions and reload$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_bet_type_denomination_balance_win_symbols_spin_button_wheelspin_screen_new_browser_new_tab_network_interuptions_and_reload() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and wheelspin is activated and observe the wheelspin continuity under various conditions$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_wheelspin_is_activated_and_observe_the_wheelspin_continuity_under_various_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern autoplay=new Pattern("Images/Tropicana_Casine/autoplay.PNG");
		Pattern auto_auto=new Pattern("Images/Tropicana_Casine/auto_auto.PNG"); 
		Pattern spin =new Pattern("Images/Tropicana_Casine/spin.PNG");
		Pattern wheelspin =new Pattern("Images/Tropicana_Casine/wheelspin.PNG");

		Pattern reload=new Pattern("Images/Tropicana_Casine/reload.PNG");
		Pattern newtab=new Pattern("Images/Tropicana_Casine/newtab.PNG");
		Pattern gametab=new Pattern("Images/Tropicana_Casine/gametab.PNG");
		Pattern scsymb_1=new Pattern("Images/Tropicana_Casine/scsymb_1.PNG");

		// wheelspin congrulation window pop-up
		Pattern wheelspinbanner =new Pattern("Images/Tropicana_Casine/wheelspinbanner.PNG");

		//Arranging the symbols to generate 3 Scatter
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(autoplay);
		Thread.sleep(1000);
		screen.click(auto_auto);
		Thread.sleep(3000);

		// wheelspin banner
		screen.wait(wheelspinbanner, 10);
		Thread.sleep(5000);

		//Wheelspin under opening a new tab operation
		screen.click(newtab);
		Thread.sleep(1500);
		screen.click(gametab);
		Thread.sleep(3000);

		screen.wait(wheelspin, 30);
		Thread.sleep(4000);
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(wheelspin);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Verify the wheelspin button after changing tabs in wheelspin screen.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Verify the wheelspin button after changing tabs in wheelspin screen comparision: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);
		Thread.sleep(2000);

		screen.click(reload);
		Thread.sleep(8000);

		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[11]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(10000);
		screen.wait("Images/Tropicana_Casine/wheelspin.PNG", 30);
		Thread.sleep(2000);

		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(wheelspin);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Verify the wheelspin button after reloading tab in wheelspin screen.");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Verify the wheelspin button after reloading tab in wheelspin screen comparision: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 97);
		Thread.sleep(2000);

		//Resume property when landed on wheelspin screen
		Robot robot = new Robot();
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\TropicanaCasine.properties");
		obj.load(objfile);

		String gamePath = obj.getProperty("TropicanaCasine");
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
		screen.wait(wheelspin, 30);
		Thread.sleep(3000);

		Finder finder14 =new Finder(screen.capture().getImage());
		String ht14 = finder14.find(wheelspin);
		double score14=20;                
		System.out.println("the value of ht14"+" "+ht14);
		if(finder14.hasNext())
		{
			Match m14=finder14.next();
			System.out.println("Match Found with: "+(m14.getScore())*100+"%");
			score14=(m14.getScore())*100;
			System.out.println("Verify the wheelspin button after resuming in wheelspin screen.");
			finder14.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Verify the wheelspin button after resuming in wheelspin screen comparision: "+" "+score14 +"%");
		Assert.assertTrue(score14 > 97);
		Thread.sleep(2000);

		screen.click(wheelspin);
		Thread.sleep(8000);

		// Verify the autospin is stopped after wheelspin completion
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

	@Then("^wheelspin should be enabled and resumed and after reloading the game autoplay should be stopped in Tropicana Casine slot game$")
	public void wheelspin_should_be_enabled_and_resumed_and_after_reloading_the_game_autoplay_should_be_stopped_in_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
