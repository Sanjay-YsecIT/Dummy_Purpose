package stepDefinition_GoldenCrown;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class GoldenCrown_Web_ResumeFeature_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, kill button\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_bet_type_denomination_balance_win_symbols_spin_button_Gamble_screen_kill_button() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and login to the game$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_red_button_and_close_the_browser_and_login_to_the_game() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Golden_Crown/Bet_place.PNG", 30);

		Pattern balance=new Pattern("Images/Golden_Crown/bal_300.PNG");
		Pattern spin=new Pattern("Images/Golden_Crown/spin.PNG");
		Pattern gb_collect=new Pattern("Images/Golden_Crown/gb_collect.PNG");
		Pattern gamble_btn=new Pattern("Images/Golden_Crown/gb_button.PNG");
		Pattern red_btn=new Pattern("Images/Golden_Crown/red_btn.PNG");
		Pattern gb_win=new Pattern("./Images/Golden_Crown/gb_win.PNG");
		Pattern gb_lose=new Pattern("./Images/Golden_Crown/gb_loose.PNG");
		Pattern close=new Pattern("./Images/Golden_Crown/close.PNG");

		// IMAGES IN 3rd REELS
		Pattern orange3=new Pattern("Images/Golden_Crown/3R_orange.PNG");
		Pattern lemon3=new Pattern("Images/Golden_Crown/3R_lemon.PNG");
		Pattern bell3=new Pattern("Images/Golden_Crown/3R_bell.PNG");
		Pattern star3=new Pattern("Images/Golden_Crown/3R_star.PNG");
		Pattern cherry3=new Pattern("Images/Golden_Crown/3R_cherry.PNG");

		//comparing the balance before Win
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
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

		// Arrange symbols on 3rd REELS
		screen.click(star3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(cherry3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(lemon3);
		Thread.sleep(1000);
		screen.click(bell3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(5000);

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
					

//
//				screen.click(close);
//				Thread.sleep(2000);
//				WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[21]/div[1]/div[1]"));
//				JavascriptExecutor jse=(JavascriptExecutor)driver;
//				jse.executeScript("arguments[0].click();", sub);
//				Thread.sleep(5000);


//
//				((JavascriptExecutor) driver).executeScript("window.open()");
//					ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//					System.out.println(tabs);
//			driver.switchTo().window(tabs.get(1));
//				driver.switchTo().window(parent);
//				((JavascriptExecutor) driver).executeScript("window.close()");

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
			}
			else
			{
				
					while (screen.exists(gb_lose) != null)
				{
					screen.click(cherry3);
					Thread.sleep(1000);
					screen.click(spin);
					Thread.sleep(5000);
		
					//Clicking on gamble button
						screen.click(gamble_btn);
					Thread.sleep(2000);
		
						//Clicking on Red button
						screen.click(red_btn);
						Thread.sleep(2000);
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
		
					}			
				}
					String parent =driver.getWindowHandle();
		Robot robot = new Robot();
		//					robot.keyPress(KeyEvent.VK_CONTROL);
		//					robot.keyPress(KeyEvent.VK_N);
		//					robot.keyRelease(KeyEvent.VK_N);
		//					robot.keyRelease(KeyEvent.VK_CONTROL);
		//					Thread.sleep(3000);
		//				String child =driver.getWindowHandle();
		//					driver.switchTo().window(parent);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		//					
		//					driver.switchTo().window(child);
		//					Thread.sleep(2000);
		//					driver.get("http://demo.ysecit.in:82/SlotGames/SlotsGame");
		//					driver.navigate().to("http://demo.ysecit.in:82/SlotGames/SlotsGame");
		//					screen.wait(gb_collect);

		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		Thread.sleep(5000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("txtUserName")).sendKeys("5273290266");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Password / Card Pin']")).sendKeys("mans@123");
		Thread.sleep(2000);

		driver.findElement(By.className("loginActive")).click();
		Thread.sleep(2000);
		System.out.println("Login to the game with valid credentials");

		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[21]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);

		WebElement balT1 = driver.findElement(By.id("transferInput"));
		balT1.clear();
		Thread.sleep(1000);
		balT1.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait(gb_collect, 30);

		Pattern gambleStatus=new Pattern(gb_collect);
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(gambleStatus);
		double score11=20;                
		System.out.println("the value of ht1"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("gamble collect visible");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision after lose: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);


		//			System.out.println("entered else loop");
		//			Pattern gambleStatus=new Pattern(gb_lose);
		//			Finder finder3 =new Finder(screen.capture().getImage());
		//			String ht3 = finder3.find(gambleStatus);
		//			double score3=20;                
		//			System.out.println("the value of ht3"+" "+ht3);
		//			if(finder3.hasNext())
		//			{
		//				Match m3=finder3.next();
		//				System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		//				score3=(m3.getScore())*100;
		//				System.out.println("Gamble Lose.");
		//				finder3.destroy();  
		//				String parent =driver.getWindowHandle();
		//				((JavascriptExecutor) driver).executeScript("window.open()");
		//				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		//				System.out.println(tabs);
		//				driver.switchTo().window(tabs.get(1));
		//				driver.switchTo().window(parent);
		//				((JavascriptExecutor) driver).executeScript("window.close()");
		//			}         
		//			else    
		//			{ 
		//				System.out.println("Comparision failed. Test case failed");         
		//			}
		//			System.out.println("Gamble lose comparision: "+" "+score3 +"%");
		//			Assert.assertTrue(score3 > 97);
		//			Thread.sleep(4000);

		//			Pattern Abalance=new Pattern("E:/Sikuli Images/gamble/balance_afterLose.PNG");
		//			Finder finder11 =new Finder(screen.capture().getImage());
		//			String ht11 = finder11.find(Abalance);
		//			double score11=20;                
		//			System.out.println("the value of ht1"+" "+ht11);
		//			if(finder11.hasNext())
		//			{
		//				Match m11=finder11.next();
		//				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
		//				score11=(m11.getScore())*100;
		//				System.out.println("Balance After losing in gamble. Balance is 296 YSI");
		//				finder11.destroy();  
		//			}         
		//			else    
		//			{ 
		//				System.out.println("Comparision failed. Test case failed");         
		//			}
		//			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
		//			Assert.assertTrue(score11 > 97);

	}

	@Then("^Resume feature should enabled and land on the gamble screen of Golden Crown game$")
	public void resume_feature_should_enabled_and_land_on_the_gamble_screen_of_Golden_Crown_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
