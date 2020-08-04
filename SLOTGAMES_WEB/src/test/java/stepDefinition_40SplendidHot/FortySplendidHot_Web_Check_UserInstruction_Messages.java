package stepDefinition_40SplendidHot;

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

public class FortySplendidHot_Web_Check_UserInstruction_Messages {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button and user instruction message$")
	public void chrome_browser_valid_URL_valid_login_details_FortySplendidHot_slot_game_balance_spin_button_and_user_instruction_message() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("txtUserName")).sendKeys("5273290266");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Password / Card Pin']")).sendKeys("mans@123");
		Thread.sleep(2000);

		driver.findElement(By.className("loginActive")).click();
		Thread.sleep(2000);
		System.out.println("Login to the game with valid credentials");

		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[31]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(4000);
	}

	@When("^Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages$")
	public void open_the_FortySplendidHot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_and_check_the_user_instruction_messages() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/40Splendid_Hot/Bet_place.PNG", 30);
		//	Thread.sleep(15000);
		
		Pattern spin=new Pattern("Images/40Splendid_Hot/spin.PNG");
		Pattern Good_Luck = new Pattern("Images/40Splendid_Hot/goodluck.PNG");
		Pattern Bet_Place = new Pattern("Images/40Splendid_Hot/Bet_place.PNG");

		//Comparing Place your bet message is displaying
		// Pattern credit1=new Pattern("E:/Sikuli Images/Tiki Isle/placebet.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Bet_Place);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Place your bet message is displayed and comparision successfull.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Place your bet message is displayed and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//Clicking on spin button
		screen.click(spin);
		Thread.sleep(1000);

		// After click on Spin button Good luck is displayed and is validated
		// Pattern winA=new Pattern("E:/Sikuli Images/others/goodluck.PNG");
		screen.wait(Good_Luck, 5);
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(Good_Luck);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Good luck message is displayed and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Good luck message is displayed and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 95);
	}

	@Then("^User instruction message 'Please place your bet' should be displayed before spin button is clicked$")
	public void user_instruction_message_Please_place_your_bet_should_be_displayed_before_spin_button_is_clicked() throws Throwable {
		Thread.sleep(3000);
	}

	@Then("^User instruction message 'Good Luck' should be displayed after spin button is clicked in FortySplendidHot slot game$")
	public void user_instruction_message_Good_Luck_should_be_displayed_after_spin_button_is_clicked_in_FortySplendidHot_slot_game() throws Throwable {
		driver.quit();
	}
}
