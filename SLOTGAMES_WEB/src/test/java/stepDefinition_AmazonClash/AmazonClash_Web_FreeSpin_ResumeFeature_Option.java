package stepDefinition_AmazonClash;

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
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonClash_Web_FreeSpin_ResumeFeature_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot slot game, bet type, denomination, balance, win symbols, spin button, freespin screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_slot_game_bet_type_denomination_balance_win_symbols_spin_button_freespin_screen_new_browser() throws Throwable {
		this.driver = AmazonClash_URL_Login.getDriver();
	}

	@When("^Open the Amazon Clash slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and freespin screen is switched and close the browser and again login to the game with new browser$")
	public void open_the_Amazon_Clash_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_freespin_screen_is_switched_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Amazon_Clash/Bet_place.PNG", 30);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("Images/Amazon_Clash/spin.PNG"); 
		Pattern collect =new Pattern("Images/Amazon_Clash/collect.PNG");

		// IMAGES IN 2nd REEL
		Pattern clove2=new Pattern("Images/Amazon_Clash/2R_leaf1.PNG");
		Pattern wild2=new Pattern("Images/Amazon_Clash/2R_wild.PNG");
		Pattern blue2=new Pattern("Images/Amazon_Clash/2R_blue.PNG");
		Pattern lady21=new Pattern("Images/Amazon_Clash/2R_lady1.PNG");

		// IMAGES IN 4th REEL
		Pattern lady41=new Pattern("Images/Amazon_Clash/4R_lady11.PNG");
		Pattern lady42=new Pattern("Images/Amazon_Clash/4R_lady21.PNG");
		Pattern leaf4=new Pattern("Images/Amazon_Clash/4R_leaf1.PNG");
		Pattern blue4=new Pattern("Images/Amazon_Clash/4R_blue1.PNG");
		Pattern lady43=new Pattern("Images/Amazon_Clash/4R_lady31.PNG");


		Pattern Cong_msg_7 =new Pattern("Images/Amazon_Clash/free_spin_7.PNG");
		Pattern FreeSpin7 =new Pattern("Images/Amazon_Clash/FreeSpin7.PNG");
		Pattern freespinleft =new Pattern("Images/Amazon_Clash/freespinleft.PNG");

		//Arranging the symbols to generate 7 Scatter
		// Arranging the 2nd Reel
		screen.click(clove2);
		Thread.sleep(1000);
		screen.click(wild2);
		Thread.sleep(1000);
		screen.click(wild2);
		Thread.sleep(1000);
		screen.click(wild2);
		Thread.sleep(1000);
		screen.click(blue2);
		Thread.sleep(1000);
		screen.click(blue2);
		Thread.sleep(1000);
		screen.click(lady21);
		Thread.sleep(1000);

		// Arranging the 4th Reel
		screen.click(lady41);
		Thread.sleep(1000);
		screen.click(lady42);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(blue4);
		Thread.sleep(1000);
		screen.click(blue4);
		Thread.sleep(1000); 
		screen.click(lady43);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000); 

		// Spin the reels
		screen.click(spin);
		Thread.sleep(5000);

		// Congrulation message displays on the 7 scatters and 7 free spin triggers
		screen.wait(Cong_msg_7, 30);
		Thread.sleep(1000);

		//Comparing the Free Spins once the scatter  symbol triggers
		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		screen.wait(FreeSpin7, 30);
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(FreeSpin7);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("On appearance of 7 scatters, bonus game should be triggered and Free spin attempts should be 7");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
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
		screen.wait(freespinleft, 30);
		
		screen.wait(freespinleft, 10);
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(freespinleft);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("on resuming the freespin page remaining spins should be displayed");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);
	}

	@Then("^Resume feature should enabled and land on the freespin screen of Amazon Clash slot game$")
	public void resume_feature_should_enabled_and_land_on_the_freespin_screen_of_Amazon_Clash_slot_game() throws Throwable {
		Thread.sleep(3000);
		//driver.quit();
	}
}
