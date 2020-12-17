package stepDefinition_PerfectGems;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PerfectGems_Web_TryNow_CheckBalance {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, try now button and balance to play$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_try_now_button_and_balance_to_play() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[9]/div[2]/div[2]")).click();
		screen.wait("Images/Perfect_Gems/TryNow_spin.PNG", 120);
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, click on try now button$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button() throws Throwable {
		Pattern TryNow_bal=new Pattern("Images/Perfect_Gems/TryNow_balance.PNG");

		//Comparing the amount which is transferring to the slot game
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(TryNow_bal);
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
		Assert.assertTrue(score > 97);
	}

	@Then("^System should provide five thousand as balance on click on try now button in Perfect Gems slot game$")
	public void system_should_provide_five_thousand_as_balance_on_click_on_try_now_button_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
