package stepDefinition_LadyCharm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LadyCharm_Web_Navigate_HomeScreen {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Lady Charm slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Charm_slot_game_and_home_button() throws Throwable {

		this.driver = LadyCharm_URL_Login.getDriver();
	}

	@When("^Open the Lady Charm slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Lady_Charm_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Lady_Charm/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern Home_Screen_Logo=new Pattern("./Images/Lady_Charm/suribet_logo.PNG");
		Pattern Lady_Charm=new Pattern("./Images/Lady_Charm/LC_logo.PNG");
		Pattern home=new Pattern("./Images/Lady_Charm/home.PNG");



		//Comparing whether Lady_Charm  game is loaded and home button is visible

		// Pattern credit1=new Pattern("E:/Sikuli Images/others/goldenhot.png");

		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Lady_Charm);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Lady Charm game is loaded and comparision successfull.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Lady Charm is loaded and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//Clicking on home button
		screen.click(home);
		Thread.sleep(3000);



		//After clicking on home button, Lady Charm game should not be visible

		// Pattern winA=new Pattern("E:/Sikuli Images/others/goldenhot.PNG");

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(Home_Screen_Logo);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Navigate to the home screen & Lady Charm home page should not be visible and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Navigate to the home screen of the Lady Charm slot games and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertFalse(score2 > 95);
	}

	@Then("^System should take the player to Home page after clicking on home button from Lady Charm game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Lady_Charm_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
