package stepDefinition_VegasMania;

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

public class VegasMania_Web_Navigate_HomeScreen {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Vegas Mania slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Vegas_Mania_slot_game_and_home_button() throws Throwable {

		this.driver = VegasMania_URL_Login.getDriver();
	}

	@When("^Open the Vegas Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Vegas_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Vegas_Mania/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern Home_Screen_Logo=new Pattern("./Images/Vegas_Mania/VegasMania_logo.PNG");
		Pattern Vegas_Mania=new Pattern("./Images/Vegas_Mania/VM_logo.PNG");
		Pattern home=new Pattern("./Images/Vegas_Mania/home.PNG");



		//Comparing whether Amazon_Clash  game is loaded and home button is visible

		// Pattern credit1=new Pattern("E:/Sikuli Images/others/goldenhot.png");

		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Vegas_Mania);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Vegas Mania game is loaded and comparision successfull.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Vegas Mania is loaded and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//Clicking on home button
		screen.click(home);
		Thread.sleep(3000);



		//After clicking on home button, Vegas Mania game should not be visible

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
			System.out.println("Navigate to the home screen & Vegas Mania home page should not be visible and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Navigate to the home screen of the Vegas Mania slot games and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertFalse(score2 > 95);
	}

	@Then("^System should take the player to Home page after clicking on home button from Vegas Mania game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Vegas_Mania_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
