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

public class TropicanaCasine_Web_WheelSpin_ResumeFeature_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, bet type, denomination, balance, win symbols, spin button, wheelspin screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_bet_type_denomination_balance_win_symbols_spin_button_wheelspin_screen_new_browser() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and wheelspin screen is switched and close the browser and again login to the game with new browser$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_wheelspin_screen_is_switched_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern spin=new Pattern("Images/Tropicana_Casine/spin.PNG"); 
		Pattern take=new Pattern("Images/Tropicana_Casine/take.PNG");
		Pattern scsymb_1=new Pattern("Images/Tropicana_Casine/scsymb_1.PNG");

		// Congulation and Win window pop-up and free spin left 
		Pattern wheelspinbanner =new Pattern("Images/Tropicana_Casine/wheelspinbanner.PNG"); 
		Pattern wheelspinlogo =new Pattern("Images/Tropicana_Casine/wheelspinlogo.PNG");
		Pattern wheelspin =new Pattern("Images/Tropicana_Casine/wheelspin.PNG");

		//Arranging the symbols to generate 3 Scatter
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(2000);

		// free spin banner
		screen.wait(wheelspinbanner, 10);

		//Resume property when scatter symbol triggering wheelspin 
		Robot robot = new Robot();
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

		WebElement sub = driver.findElement(By.xpath(gamePath));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);
		screen.wait(wheelspinlogo, 30);
		Thread.sleep(3000);

		//Resume property when landed on wheelspin screen
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		gamePath = obj.getProperty("TropicanaCasine");
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
		screen.wait(wheelspinlogo, 30);
		Thread.sleep(3000);

		screen.wait(wheelspin, 30);
		Thread.sleep(4000);
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(wheelspin);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Verify the wheelspin button after resuming to wheelspin screen.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Verify the wheelspin button after resuming to wheelspin screen comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
		Thread.sleep(2000);

		screen.click(wheelspin);
		Thread.sleep(3000);
		screen.wait(take, 30);
		screen.click(take);
	}

	@Then("^Resume feature should enabled and land on the wheelspin screen of Tropicana Casine slot game$")
	public void resume_feature_should_enabled_and_land_on_the_wheelspin_screen_of_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
