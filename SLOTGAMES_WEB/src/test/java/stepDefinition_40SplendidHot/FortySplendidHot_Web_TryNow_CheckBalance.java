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

public class FortySplendidHot_Web_TryNow_CheckBalance {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, FortySplendidHot slot game, try now button and balance to play$")
	public void chrome_browser_valid_URL_valid_login_details_FortySplendidHot_slot_game_try_now_button_and_balance_to_play() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[32]/div[2]/div[2]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(4000);
		Pattern betplace=new Pattern("Images/40Splendid_Hot/trynow_betplace.PNG");
		screen.wait(betplace, 30);
	}

	@When("^Open the FortySplendidHot slot game by entering the valid URL in browser, click on try now button$")
	public void open_the_FortySplendidHot_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button() throws Throwable {
		Pattern Trynow_bal=new Pattern("Images/40Splendid_Hot/Try_now_bal.PNG");

		//Comparing the amount which is transferring to the slot game
		//  Pattern credit1=new Pattern("E:/Sikuli Images/others/.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Trynow_bal);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Balance should be 5000 in try now screen and comparision successfull");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance should be 5000 in try now screen and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 95);
	}

	@Then("^System should provide five thousand as balance on click on try now button in FortySplendidHot slot game$")
	public void system_should_provide_five_thousand_as_balance_on_click_on_try_now_button_in_FortySplendidHot_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
