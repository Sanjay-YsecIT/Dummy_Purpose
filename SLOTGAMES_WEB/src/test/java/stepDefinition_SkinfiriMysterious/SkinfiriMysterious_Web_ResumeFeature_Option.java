package stepDefinition_SkinfiriMysterious;

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

public class SkinfiriMysterious_Web_ResumeFeature_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_slot_game_bet_type_denomination_balance_win_symbols_spin_button_Gamble_screen_new_browser() throws Throwable {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser$")
	public void open_the_Skinfiri_Mysterious_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_red_button_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);
		
		Pattern SPIN=new Pattern("Images/Skinfiri_Mysterious/Spin.PNG");
		Pattern BALANCE=new Pattern("Images/Skinfiri_Mysterious/bal_300.PNG");
		Pattern EYE=new Pattern("Images/Skinfiri_Mysterious/EYE.PNG");
		Pattern SKULL=new Pattern("Images/Skinfiri_Mysterious/SKULL.PNG");
		Pattern CROW=new Pattern("Images/Skinfiri_Mysterious/CROW.PNG");
		Pattern WIN_AMT=new Pattern("Images/Skinfiri_Mysterious/win_amt_0.4.PNG");
		Pattern BLACK_GAMBLE_BTN=new Pattern("Images/Skinfiri_Mysterious/black_gamble_button.PNG");
		Pattern GAMBLE_BTN=new Pattern("Images/Skinfiri_Mysterious/gamble_icon.PNG");
		Pattern WIN_GAMBLE=new Pattern("Images/Skinfiri_Mysterious/win_gamble.PNG");
		Pattern GAMBLE_COLLECT=new Pattern("Images/Skinfiri_Mysterious/collect_image_gamble.PNG");
		Pattern LOOSE_GAMBLE=new Pattern("Images/Skinfiri_Mysterious/lose_gamble.PNG");
		Pattern BAL_GAMBLELOOSE=new Pattern("Images/Skinfiri_Mysterious/Reminingbal_299.80.PNG");
		Pattern Attempt_4=new Pattern("Images/Skinfiri_Mysterious/Attempt_4.PNG");
		Pattern GAMBLE_AMT_DISPLAY=new Pattern("/Images/Skinfiri_Mysterious/gb_amt_display.PNG");

		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(BALANCE);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully. Balance is 300 YSI");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(EYE);
		Thread.sleep(2000);
		screen.click(SKULL);
		Thread.sleep(2000);
		screen.click(CROW);
		Thread.sleep(2000);
		screen.click(SPIN);
		Thread.sleep(8000);

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(WIN_AMT);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision completed successfully. Win amount is 0.40 YSI");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		//Clicking on gamble button
		screen.click(GAMBLE_BTN);
		Thread.sleep(2000);

		//Clicking on Red button
		screen.click(BLACK_GAMBLE_BTN);
		Thread.sleep(1000);

		if  (screen.exists(WIN_GAMBLE) != null)
		{
			Pattern gambleStatus=new Pattern(WIN_GAMBLE);
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(gambleStatus);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("Gamble Win");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 97);			  
			Thread.sleep(2000);

			//comparing the Gamble win amount should be same as win amount
			Finder finder13 =new Finder(screen.capture().getImage());
			String ht13 = finder13.find(GAMBLE_AMT_DISPLAY);
			double score13=20;                
			System.out.println("the value of ht13"+" "+ht13);
			if(finder13.hasNext())
			{
				Match m13=finder13.next();
				System.out.println("Match Found with: "+(m13.getScore())*100+"%");
				score13=(m13.getScore())*100;
				System.out.println("Gamble Win amount comparision completed successfully. Gamble Win amount is 0.40 YSI");
				finder13.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble Win amount comparision value equals to: "+" "+score13 +"%");
			Assert.assertTrue(score13 > 97);
			Thread.sleep(2000);

			//comparing the gamble count based on the win amount
			Finder finder21 =new Finder(screen.capture().getImage());
			String ht21 = finder21.find(Attempt_4);
			double score21=20;                
			System.out.println("the value of ht21"+" "+ht21);
			if(finder21.hasNext())
			{
				Match m21=finder21.next();
				System.out.println("Match Found with: "+(m21.getScore())*100+"%");
				score21=(m21.getScore())*100;
				System.out.println("Gamble count comparision completed successfully. Gamble count should be 4.");
				finder21.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble count comparision after Win: "+" "+score21 +"%");
			Assert.assertTrue(score21 > 97);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);

			Properties obj = new Properties();
			FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
			obj.load(objfile);

			String gamePath = obj.getProperty("Skinfiri_path");
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

			screen.wait(GAMBLE_COLLECT, 30);
			Thread.sleep(10000);
			Pattern collect1=new Pattern(GAMBLE_COLLECT);
			Finder finder61 =new Finder(screen.capture().getImage());
			String ht61= finder61.find(collect1);
			double score61=20;                
			System.out.println("the value of ht61"+" "+ht61);
			if(finder61.hasNext())
			{
				Match m61=finder61.next();
				System.out.println("Match Found with: "+(m61.getScore())*100+"%");
				score61=(m61.getScore())*100;
				System.out.println("resume to the gamble window");
				finder61.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble window resumed and comparision is: "+" "+score61 +"%");
			Assert.assertTrue(score61 > 88);
			Thread.sleep(2000);
			screen.click(GAMBLE_COLLECT);
		}
		else
		{
			System.out.println("inside gamble loose");
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(LOOSE_GAMBLE);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("Gamble Lose.");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 97);
			Thread.sleep(4000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(BAL_GAMBLELOOSE);
			double score11=20;                
			System.out.println("the value of ht11"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.80 YSI");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score11 > 97);
		}
	}

	@Then("^Resume feature should enabled and land on the gamble screen of Skinfiri Mysterious slot game$")
	public void resume_feature_should_enabled_and_land_on_the_gamble_screen_of_Skinfiri_Mysterious_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
