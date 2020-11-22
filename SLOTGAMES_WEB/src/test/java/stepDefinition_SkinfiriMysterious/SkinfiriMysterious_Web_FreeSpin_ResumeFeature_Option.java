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

public class SkinfiriMysterious_Web_FreeSpin_ResumeFeature_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot slot game, bet type, denomination, balance, win symbols, spin button, freespin screen, new browser\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_slot_game_bet_type_denomination_balance_win_symbols_spin_button_freespin_screen_new_browser() throws Throwable {
		this.driver =  SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and freespin screen is switched and close the browser and again login to the game with new browser$")
	public void open_the_Skinfiri_Mysterious_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_win_appears_and_freespin_screen_is_switched_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);

		Pattern spin=new Pattern("Images/Skinfiri_Mysterious/Spin.PNG"); 
		
		// IMAGES IN 1st REEL
		Pattern cross =new Pattern("Images/Skinfiri_Mysterious/SC_R1_cross.PNG");
		Pattern crow =new Pattern("/Images/Skinfiri_Mysterious/SC_R1_crow.PNG");
		Pattern eye =new Pattern("Images/Skinfiri_Mysterious/SC_R1_eye.PNG");
		Pattern seven =new Pattern("Images/Skinfiri_Mysterious/SC_R1_seven.PNG");
		Pattern skull =new Pattern("Images/Skinfiri_Mysterious/SC_R1_skull.PNG");
		Pattern ten =new Pattern("Images/Skinfiri_Mysterious/SC_R1_ten.PNG");

		// IMAGES IN 2nd REEL
		Pattern cross2=new Pattern("Images/Skinfiri_Mysterious/SC_R2_cross.PNG");
		Pattern owl2=new Pattern("Images/Skinfiri_Mysterious/SC_R2_owl.PNG");

		// IMAGES IN 3rd REEL
		Pattern cross3=new Pattern("Images/Skinfiri_Mysterious/SC_R3_cross.PNG");
		Pattern crow3=new Pattern("Images/Skinfiri_Mysterious/SC_R3_crow.PNG");
		Pattern owl3=new Pattern("Images/Skinfiri_Mysterious/SC_R3_owl.PNG");

		// Congrulation and Win window pop-up and free spin left 
		Pattern Cong_msg =new Pattern("Images/Skinfiri_Mysterious/SC_Congrulation_msg.PNG");
		Pattern FreeSpin15 =new Pattern("Images/Skinfiri_Mysterious/SC_FreeSpin15.PNG");
		Pattern freespinleft =new Pattern("Images/Skinfiri_Mysterious/freespinleft.PNG");

		//Arranging the symbols to generate 3 Scatter
		// Arranging the 1st Reel
		screen.click(eye);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(ten);
		Thread.sleep(1000);
		screen.click(seven);
		Thread.sleep(1000); 
		screen.click(eye);
		Thread.sleep(1000);
		screen.click(crow);
		Thread.sleep(1000);
		screen.click(crow);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);

		//Arranging 2nd Reel 
		screen.click(owl2);
		Thread.sleep(1000);
		screen.click(owl2);
		Thread.sleep(1000);
		screen.click(cross2);
		Thread.sleep(1000);

		//Arranging 3rd Reel
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(owl3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);

		// CLICK ON SPIN ICON
		screen.click(spin);
		Thread.sleep(5000);

		screen.wait(Cong_msg, 30);
		Thread.sleep(1000);

		//Comparing the Free Spins once the scatter  symbol triggers
		screen.wait(FreeSpin15, 30);
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(FreeSpin15);
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
		screen.wait(FreeSpin15, 30);
		Thread.sleep(1000);
		
		screen.wait(FreeSpin15, 10);
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(FreeSpin15);
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

	@Then("^Resume feature should enabled and land on the freespin screen of Skinfiri Mysterious slot game$")
	public void resume_feature_should_enabled_and_land_on_the_freespin_screen_of_Skinfiri_Mysterious_slot_game() throws Throwable {
		Thread.sleep(3000);
		//		driver.quit();
	}
}
