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

public class FortySplendidHot_Web_Transfer_Validation_ZeroBalance {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, FortySplendidHot game, zero balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_FortySplendidHot_game_zero_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
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

	@When("^Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button$")
	public void open_the_FortySplendidHot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_as_zero_SRD_and_click_on_Ok_button() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(2000);

		//Comparing the amount which is transferring to the slot game
		Pattern credit1=new Pattern("Images/40Splendid_Hot/zero_amount_msg.PNG");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit1);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Zero amount transfer should be blocked and transfer should get failed and validation message should be displayed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Transfering the zero amount should be blocked and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 95);
	}

	@Then("^An error should be displayed if balance entered was zero and player should be blocked from loading the FortySplendidHot game$")
	public void an_error_should_be_displayed_if_balance_entered_was_zero_and_player_should_be_blocked_from_loading_the_FortySplendidHot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
