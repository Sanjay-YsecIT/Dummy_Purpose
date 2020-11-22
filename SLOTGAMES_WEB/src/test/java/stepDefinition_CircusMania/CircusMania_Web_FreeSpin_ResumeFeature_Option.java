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

public class CircusMania_Web_FreeSpin_ResumeFeature_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, bet type, denomination, balance, win symbols, spin button, freespin screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_bet_type_denomination_balance_win_symbols_spin_button_freespin_screen_new_browser() throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and freespin screen is switched and close the browser and again login to the game with new browser$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_freespin_screen_is_switched_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);

		Pattern spin=new Pattern("Images/Circus_Mania/spin.PNG");                         
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
		Pattern freespinwin =new Pattern("Images/Circus_Mania/freespinwin.PNG");  
		Pattern take =new Pattern("Images/Circus_Mania/take.PNG"); 

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
		screen.click(spin);
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
		Thread.sleep(5000);

		Robot robot = new Robot();
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

		WebElement sub = driver.findElement(By.xpath(gamePath));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);
		screen.wait(freespin, 30);
		Thread.sleep(5000);

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
		Thread.sleep(2000);

		screen.wait(freespinwin, 240);
		Thread.sleep(2000);
		screen.wait(take, 90);
		Thread.sleep(6000);
		screen.click(take);
		Thread.sleep(2000);
	}

	@Then("^Resume feature should enabled and land on the freespin screen of Circus Mania slot game$")
	public void resume_feature_should_enabled_and_land_on_the_freespin_screen_of_Circus_Mania_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
