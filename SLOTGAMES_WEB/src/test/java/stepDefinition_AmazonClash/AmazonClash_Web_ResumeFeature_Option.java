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

public class AmazonClash_Web_ResumeFeature_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_slot_game_bet_type_denomination_balance_win_symbols_spin_button_Gamble_screen_new_browser() throws Throwable {
		this.driver = AmazonClash_URL_Login.getDriver();
	}

	@When("^Open the Amazon Clash slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser$")
	public void open_the_Amazon_Clash_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_red_button_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Amazon_Clash/Bet_place.PNG", 30);

		Pattern spin=new Pattern("Images/Amazon_Clash/spin.PNG");
		Pattern gb_collect=new Pattern("Images/Amazon_Clash/gb_collect.PNG");
		Pattern gamble_btn=new Pattern("Images/Amazon_Clash/gb_button.PNG");
		Pattern red_btn=new Pattern("Images/Amazon_Clash/red_btn.PNG");
		Pattern gb_win=new Pattern("./Images/Amazon_Clash/gb_win.PNG");
		Pattern gb_amt_display=new Pattern("Images/Amazon_Clash/gb_amt.PNG");
		Pattern Attempt_5=new Pattern("Images/Amazon_Clash/Attempt5.PNG");

		//win symbols
		Pattern tiger=new Pattern("./Images/Amazon_Clash/1R_tiger.PNG");
		Pattern scatter3=new Pattern("Images/Amazon_Clash/3R_scatter.PNG");
		Pattern blue1=new Pattern("Images/Amazon_Clash/1R_blue.PNG");

		// WIN PATTERN COMBINATION 
		screen.click(tiger);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(8000);

		//Clicking on gamble button
		screen.click(gamble_btn);
		Thread.sleep(2000);

		//Clicking on Red button
		screen.click(red_btn);
		Thread.sleep(2000);

		if  (screen.exists(gb_win) != null)
		{
			Pattern gambleStatus=new Pattern(gb_win);
			Finder finder3 =new Finder(screen.capture().getImage());
			String ht3 = finder3.find(gambleStatus);
			double score3=20;                
			System.out.println("the value of ht3"+" "+ht3);
			if(finder3.hasNext())
			{
				Match m3=finder3.next();
				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
				score3=(m3.getScore())*100;
				System.out.println("Gamble Win.");
				finder3.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win comparision: "+" "+score3 +"%");
			Assert.assertTrue(score3 > 97);			  
			Thread.sleep(3000);
			
			//comparing the Gamble win amount should be same as win amount
			Finder finder13 =new Finder(screen.capture().getImage());
			String ht13 = finder13.find(gb_amt_display);
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
			Finder finder2 =new Finder(screen.capture().getImage());
			String ht2 = finder2.find(Attempt_5);
			double score2=20;                
			System.out.println("the value of ht2"+" "+ht2);
			if(finder2.hasNext())
			{
				Match m2=finder2.next();
				System.out.println("Match Found with: "+(m2.getScore())*100+"%");
				score2=(m2.getScore())*100;
				System.out.println("Gamble count comparision completed successfully. Gamble count should be 5.");
				finder2.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble count comparision after Win: "+" "+score2 +"%");
			Assert.assertTrue(score2 > 97);
			
			Pattern collect=new Pattern(gb_collect);
			Finder finder6 =new Finder(screen.capture().getImage());
			String ht6 = finder6.find(collect);
			double score6=20;                
			System.out.println("the value of ht3"+" "+ht6);
			if(finder6.hasNext())
			{
				Match m6=finder6.next();
				System.out.println("Match Found with: "+(m6.getScore())*100+"%");
				score6=(m6.getScore())*100;
				System.out.println("resume to the gamble window");
				finder6.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble window resumed and comparision is: "+" "+score6 +"%");
			Assert.assertTrue(score6 > 97);
			Thread.sleep(2000);

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
			Thread.sleep(5000);

			screen.wait(gb_collect, 30);
			Pattern collect1=new Pattern(gb_collect);
			Finder finder61 =new Finder(screen.capture().getImage());
			String ht61= finder61.find(collect1);
			double score61=20;                
			System.out.println("the value of ht3"+" "+ht61);
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
			Assert.assertTrue(score61 > 97);
			Thread.sleep(2000);
		}
		else
		{
			screen.click(scatter3);
			Thread.sleep(1000);
			screen.click(scatter3);
			Thread.sleep(1000);
			screen.click(scatter3);
			Thread.sleep(1000);
			screen.click(spin);
			Thread.sleep(8000);

			//Clicking on gamble button
			screen.click(gamble_btn);
			Thread.sleep(2000);

			//Clicking on Red button
			screen.click(red_btn);
			Thread.sleep(2000);

			if  (screen.exists(gb_win) != null)
			{
				Pattern gambleStatus=new Pattern(gb_win);
				Finder finder13 =new Finder(screen.capture().getImage());
				String ht13 = finder13.find(gambleStatus);
				double score13=20;                
				System.out.println("the value of ht13"+" "+ht13);
				if(finder13.hasNext())
				{
					Match m13=finder13.next();
					System.out.println("Match Found with: "+(m13.getScore())*100+"%");
					score13=(m13.getScore())*100;
					System.out.println("Gamble Win.");
					finder13.destroy();  
				}         
				else    
				{ 
					System.out.println("Comparision failed. Test case failed");         
				}
				System.out.println("Gamble win comparision: "+" "+score13 +"%");
				Assert.assertTrue(score13 > 97);			  
				Thread.sleep(3000);

			}else {


				screen.click(blue1);
				Thread.sleep(1000);
				screen.click(spin);
				Thread.sleep(8000);

				//Clicking on gamble button
				screen.click(gamble_btn);
				Thread.sleep(2000);

				//Clicking on Red button
				screen.click(red_btn);
				Thread.sleep(2000);

				if  (screen.exists(gb_win) != null)
				{
					Pattern gambleStatus=new Pattern(gb_win);
					Finder finder31 =new Finder(screen.capture().getImage());
					String ht31 = finder31.find(gambleStatus);
					double score31=20;                
					System.out.println("the value of ht31"+" "+ht31);
					if(finder31.hasNext())
					{
						Match m31=finder31.next();
						System.out.println("Match Found with: "+(m31.getScore())*100+"%");
						score31=(m31.getScore())*100;
						System.out.println("Gamble Win.");
						finder31.destroy();  
					}         
					else    
					{ 
						System.out.println("Comparision failed. Test case failed");         
					}
					System.out.println("Gamble win comparision: "+" "+score31 +"%");
					Assert.assertTrue(score31 > 97);			  
					Thread.sleep(3000);

				}
			}		

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
			//String suribetURL = obj.getProperty("suribetURL");

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

			screen.wait(gb_collect, 30);
			Pattern collect11=new Pattern(gb_collect);
			Finder finder611 =new Finder(screen.capture().getImage());
			String ht611= finder611.find(collect11);
			double score611=20;                
			System.out.println("the value of ht3"+" "+ht611);
			if(finder611.hasNext())
			{
				Match m611=finder611.next();
				System.out.println("Match Found with: "+(m611.getScore())*100+"%");
				score611=(m611.getScore())*100;
				System.out.println("resume to the gamble window");
				finder611.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble window resumed and comparision is: "+" "+score611 +"%");
			Assert.assertTrue(score611 > 97);
			Thread.sleep(2000);
		}

	}

	@Then("^Resume feature should enabled and land on the gamble screen of Amazon Clash slot game$")
	public void resume_feature_should_enabled_and_land_on_the_gamble_screen_of_Amazon_Clash_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}

}
