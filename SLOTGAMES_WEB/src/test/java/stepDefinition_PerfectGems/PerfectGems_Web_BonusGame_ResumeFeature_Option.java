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

public class PerfectGems_Web_BonusGame_ResumeFeature_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, win symbols, spin button, bonus game screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_denomination_balance_win_symbols_spin_button_bonus_game_screen_new_browser() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and bonus game screen is switched and close the browser and again login to the game with new browser$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_bonus_game_screen_is_switched_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);

		Pattern spin=new Pattern("Images/Perfect_Gems/spin.PNG");                         
		Pattern take=new Pattern("Images/Perfect_Gems/take.PNG");

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

		// congratulations and Win window pop-up and free spin left 
		Pattern bonusgamebanner =new Pattern("Images/Perfect_Gems/bonusgamebanner.PNG"); 
		Pattern bonusgametext =new Pattern("Images/Perfect_Gems/bonusgametext.PNG");
		Pattern TreasureBox1=new Pattern("Images/Perfect_Gems/TreasureBox1.PNG");
		Pattern bonusgame_winbanner =new Pattern("Images/Perfect_Gems/bonusgame_winbanner.PNG");
		Pattern bonusgame_win1 =new Pattern("Images/Perfect_Gems/bonusgame_win1.PNG");

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
		screen.click(spin);
		Thread.sleep(5000);

		// Bonus Game banner
		screen.exists(bonusgamebanner, 10);
		Thread.sleep(4000);

		//Resume property when scatter symbol triggering wheelspin 
		Robot robot = new Robot();
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

		WebElement sub = driver.findElement(By.xpath(gamePath));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);
		
		// Bonus Game banner
		screen.exists(bonusgamebanner, 10);
		Thread.sleep(8000);
		
		//Resume property when landed on wheelspin screen
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		gamePath = obj.getProperty("gamePath");
		textUserName = obj.getProperty("textUserName");
		userName = obj.getProperty("userName");
		passwordPath = obj.getProperty("passwordPath");
		password = obj.getProperty("password");
		login = obj.getProperty("login");
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
		screen.wait(bonusgamebanner, 30);
		Thread.sleep(8000);

		// verify the bonus game text on screen 
		Finder finder10 =new Finder(screen.capture().getImage());
		String ht10 = finder10.find(bonusgametext);
		double score10=20;                
		System.out.println("the value of ht"+" "+ht10);
		if(finder10.hasNext())
		{
			Match m10=finder10.next();
			System.out.println("Match Found with: "+(m10.getScore())*100+"%");
			score10=(m10.getScore())*100;
			System.out.println("Verify the bonus game screen, as bonus game text is verified on the screen.");
			finder10.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score10 > 97);
		Thread.sleep(2000);

		//Click on the Treasure Box to unlock the treasure amount
		screen.click(TreasureBox1);
		Thread.sleep(3000);

		//wheel spin win banner
		screen.exists(bonusgame_winbanner, 10);
		Thread.sleep(7000);

		//compare the win amount after the wheel spin
		screen.wait(bonusgame_win1, 10);
		Thread.sleep(4000);
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(bonusgame_win1);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
		Thread.sleep(2000);
	}

	@Then("^Resume feature should enabled and land on the bonus game screen of Perfect Gems slot game$")
	public void resume_feature_should_enabled_and_land_on_the_bonus_game_screen_of_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
