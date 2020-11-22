package stepDefinition_CircusMania;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class CircusMania_Web_Check_MultipleLogin_Messages {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, spin, Multiple login windows, multiple login alert pop up$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_spin_Multiple_login_windows_multiple_login_alert_pop_up() throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Circus Mania slot game, spin the reels and open another session and play the game and return back to older session and play$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Circus_Mania_slot_game_spin_the_reels_and_open_another_session_and_play_the_game_and_return_back_to_older_session_and_play() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);
		String currentHandle = driver.getWindowHandle();

		
		Pattern spin=new Pattern("Images/Circus_Mania/spin.PNG");
		Pattern multiple_login=new Pattern("Images/Circus_Mania/multiple_login.PNG");

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\CircusMania.properties");
		obj.load(objfile);

		String gamePath = obj.getProperty("CircusMania");

		//Click on spin in the 1st login session
		screen.click(spin);
		Thread.sleep(5000);

		//Create new window tab and launch the game
		Robot r = new Robot();                 
		r.keyPress(KeyEvent.VK_CONTROL);         
		r.keyPress(KeyEvent.VK_T);        
		r.keyRelease(KeyEvent.VK_CONTROL);         
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);

		Set < String > handles = driver.getWindowHandles();
		for (String actual: handles) {
			System.out.println("windows: "+actual);
			if (!actual.equalsIgnoreCase(currentHandle)) {              
				driver.switchTo().window(actual);               
				driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
				driver.manage().window().maximize();
				Thread.sleep(5000);
			}
		}

		WebElement sub1 = driver.findElement(By.xpath(gamePath));
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click();", sub1);
		Thread.sleep(5000);
		WebElement TransferInput1 =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput1.clear();
		Thread.sleep(2000);
		TransferInput1.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		System.out.println("Load the game for another login session");
		screen.wait(spin, 30);
		Thread.sleep(5000);

		screen.click(spin);
		Thread.sleep(5000);

		driver.switchTo().window(currentHandle);
		Thread.sleep(5000);

		screen.click(spin);
		Thread.sleep(4000);

		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(multiple_login);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Multiple login alert popup is present on the screen");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Multiple login alert popup comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 98);
		Thread.sleep(2000);

		Set < String > tabs = driver.getWindowHandles();
		for (String actual: tabs) {
			System.out.println("windows: "+actual);
			if (!actual.equalsIgnoreCase(currentHandle)) {              
				driver.switchTo().window(actual);               
				Thread.sleep(5000);
			}
		}
		screen.click(spin);
		Thread.sleep(2000);
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(multiple_login);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Switching to new session and play the game: Test case Passed");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Switching to new session and play the gamecomparision: "+" "+score11 +"%");
		Assert.assertFalse(score11 > 97);
		Thread.sleep(2000);
	}

	@Then("^Verify the 'Multiple Login' alert message on the screen in Circus Mania slot game$")
	public void verify_the_Multiple_Login_alert_message_on_the_screen_in_Circus_Mania_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Move to new session and play without interruption in Circus Mania slot game$")
	public void move_to_new_session_and_play_without_interruption_in_Circus_Mania_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
