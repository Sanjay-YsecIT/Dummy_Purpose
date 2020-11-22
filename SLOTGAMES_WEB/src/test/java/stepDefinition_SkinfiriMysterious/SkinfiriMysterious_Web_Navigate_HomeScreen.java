package stepDefinition_SkinfiriMysterious;

//import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriMysterious_Web_Navigate_HomeScreen {

	WebDriver driver;
	Screen screen=new Screen();


	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_and_home_button() throws Throwable {

		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);
		Thread.sleep(3000);
		
		Pattern Skinfiri_Mysterious=new Pattern("Images/Skinfiri_Mysterious/gamelogo.PNG");
		Pattern home=new Pattern("Images/Skinfiri_Mysterious/home_icon.PNG");
		Pattern Home_Screen_Logo=new Pattern("Images/Skinfiri_Mysterious/suribetlogo.PNG");

		//Comparing whether Skinfiri Mysterious game is loaded and home button is visible
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Skinfiri_Mysterious);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Skinfiri Mysterious game is loaded and comparision successfull.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Skinfiri Mysterious is loaded and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//Clicking on home button
		screen.click(home);
		Thread.sleep(3000);

		//After clicking on home button, Skinfiri Mysterious game should not be visible
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(Home_Screen_Logo);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Navigate to the home screen & Suribet home page should not be visible and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Navigate to the home screen of the slot games and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
	}

	@Then("^System should take the player to Home page after clicking on home button from Skinfiri Mysterious game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Skinfiri_Mysterious_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
