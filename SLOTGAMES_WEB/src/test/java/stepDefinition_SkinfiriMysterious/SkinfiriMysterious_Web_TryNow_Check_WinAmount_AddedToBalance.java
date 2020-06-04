package stepDefinition_SkinfiriMysterious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriMysterious_Web_TryNow_Check_WinAmount_AddedToBalance {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, try now button, balance to play, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_try_now_button_balance_to_play_spin_button_and_win_amount() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver_win32/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'N_slotgame_w')]//li[5]//div[2]//div[2]")).click();
		screen.wait("./Images/Skinfiri_Mysterious/Bet_place.PNG", 10);
		//	Thread.sleep(15000);
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button_click_on_spin_button_till_player_win_and_check_the_balance_after_win() throws Throwable {
	   
		//Pattern Trynow_bal=new Pattern("./Images/Skinfiri_Mysterious/Try_now_bal.PNG");
		
		
		
		
	}

	@Then("^Win amount should get added to the balance when the player wins in try now page of Skinfiri Mysterious slot game$")
	public void win_amount_should_get_added_to_the_balance_when_the_player_wins_in_try_now_page_of_Skinfiri_Mysterious_slot_game() throws Throwable {
	    
	}

}
