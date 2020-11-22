package stepDefinition_CircusMania;

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

public class CircusMania_Web_AutoSpin_FreeSpin_Behavior_Options {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, bet type, denomination, balance, win symbols, spin button, freespin screen, new browser, new tab, network interuptions and reload$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_bet_type_denomination_balance_win_symbols_spin_button_freespin_screen_new_browser_new_tab_network_interuptions_and_reload() throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and freespin is activated and observe the freespin continuity under various conditions$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_freespin_is_activated_and_observe_the_freespin_continuity_under_various_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);

		Pattern autoplay=new Pattern("Images/Circus_Mania/autoplay.PNG");
		Pattern auto_auto=new Pattern("Images/Circus_Mania/auto_auto.PNG"); 
		Pattern freespinwin =new Pattern("Images/Circus_Mania/freespinwin.PNG");

		Pattern online=new Pattern("Images/Circus_Mania/online.PNG");
		Pattern offline=new Pattern("Images/Circus_Mania/offline.PNG");
		Pattern online1=new Pattern("Images/Circus_Mania/online1.PNG");
		Pattern offline1=new Pattern("Images/Circus_Mania/offline1.PNG");
		Pattern NoInternet=new Pattern("Images/Circus_Mania/NoInternet.PNG");
		Pattern Network=new Pattern("Images/Circus_Mania/Network.PNG");

		Pattern reload=new Pattern("Images/Circus_Mania/reload.PNG");
		Pattern newtab=new Pattern("Images/Circus_Mania/newtab.PNG");
		Pattern gametab=new Pattern("Images/Circus_Mania/gametab.PNG");

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
		screen.click(autoplay);
		Thread.sleep(1000);
		screen.click(auto_auto);
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
		Thread.sleep(1000);

		//Freespin under network interuotions
		// Network is switched between online and offline
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
		Thread.sleep(2000);
		screen.click(Network);
		Thread.sleep(2000);
		screen.click(online);
		Thread.sleep(1500);
		screen.click(offline);
		Thread.sleep(7000);

		//comparing the "No-Internet" alert popup
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(NoInternet);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("No Internet alert popup comparision completed successfully.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("No Internet alert popup comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		//Switching back to online
		screen.click(offline1);
		Thread.sleep(1500);
		screen.click(online1);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
		Thread.sleep(2000);

		//Verify the freespin game screen after resuming to the game. 
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(freespin);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Freespin screen is resumed.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Freespin screen is resumed comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 90);
		Thread.sleep(1000);


		//Freespin under opening a new tab operation
		screen.click(newtab);
		Thread.sleep(1500);
		screen.click(gametab);
		Thread.sleep(3000);

		//Verify the freespin is available on screen and freespin is continued
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(freespin);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Freespin is present and freespin is continued & comparision completed successfully.");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Freespin is present & comparision value equal to: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 97);	

		screen.click(reload);
		Thread.sleep(8000);

		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[11]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(10000);
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);
		Thread.sleep(10000);

		//Verify the freespin stop button is available on screen and freespin is continued
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(freespin);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("freespin is present and freespin is continued & comparision completed successfully.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Freespin is present & comparision value equal to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);


		// Verify the resume feature of freespin feature under autospin condition
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\CircusMania.properties");
		obj.load(objfile);

		String gamePath = obj.getProperty("CircusMania");
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
		screen.wait(freespin, 30);
		Thread.sleep(5000);

		//Verify the freespin game screen after resuming to the game. 
		Finder finder14 =new Finder(screen.capture().getImage());
		String ht14 = finder14.find(freespin);
		double score14=20;                
		System.out.println("the value of ht14"+" "+ht14);
		if(finder14.hasNext())
		{
			Match m14=finder14.next();
			System.out.println("Match Found with: "+(m14.getScore())*100+"%");
			score14=(m14.getScore())*100;
			System.out.println("Freespin screen is resumed.");
			finder14.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Freespin screen is resumed comparision: "+" "+score14 +"%");
		Assert.assertTrue(score14 > 90);
		Thread.sleep(2000);

		screen.wait(freespinwin, 240);
		Thread.sleep(8000);

		// Verify the autospin is stopped after freespin completion
		Finder finder15 =new Finder(screen.capture().getImage());
		String ht15 = finder15.find(autoplay);
		double score15=20;                
		System.out.println("the value of ht15"+" "+ht15);
		if(finder15.hasNext())
		{
			Match m15=finder15.next();
			System.out.println("Match Found with: "+(m15.getScore())*100+"%");
			score15=(m15.getScore())*100;
			System.out.println("Autoplay button is displayed after completion of freespin. Test case passed");
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

	@Then("^freespin should be enabled and continued till the (\\d+) spins is spun and in game screen autospin should be stopped after freespin completion in Circus Mania slot game$")
	public void freespin_should_be_enabled_and_continued_till_the_spins_is_spun_and_in_game_screen_autospin_should_be_stopped_after_freespin_completion_in_Circus_Mania_slot_game(int arg1) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
