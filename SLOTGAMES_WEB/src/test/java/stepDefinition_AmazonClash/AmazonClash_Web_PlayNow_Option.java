package stepDefinition_AmazonClash;

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

public class AmazonClash_Web_PlayNow_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, Play Now button and balance to play$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_Play_Now_button_and_balance_to_play() throws Throwable {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
		obj.load(objfile);

		String gamePath = obj.getProperty("PlayNow_AmazonClash");
		String textUserName = obj.getProperty("textUserName");
		String userName = obj.getProperty("userName");
		String passwordPath = obj.getProperty("passwordPath");
		String password = obj.getProperty("password");
		String login = obj.getProperty("login");
//		String suribetURL = obj.getProperty("login");

		driver = new ChromeDriver();
		driver.navigate().to("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		System.out.println(parent);

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
	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, click on Play Now button$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_click_on_Play_Now_button() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(7000);
		System.out.println("gg");
		screen.wait("Images/Amazon_Clash/playnow_betplace.PNG", 30);
		System.out.println("kk");
		Pattern playnow_betplace=new Pattern("Images/Amazon_Clash/playnow_betplace.PNG");
		System.out.println("mm");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(playnow_betplace);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Playnow game is launched and balance is verified in the game. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("balance comparision is verified and matching score is: "+" "+score +"%");
		Assert.assertTrue(score > 97);
	}

	@Then("^System should enable to launch the game in seperate browser tab and balance is added to the game in Amazon Clash slot game$")
	public void system_should_enable_to_launch_the_game_in_seperate_browser_tab_and_balance_is_added_to_the_game_in_Amazon_Clash_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}

}
