package stepDefinition_GlowingHot;

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

public class GlowingHot_Web_Check_MaximizeAndMinimize_Buttons {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Glowing Hot slot game, maximize button and minimize button$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_slot_game_maximize_button_and_minimize_button() throws Throwable {

		this.driver = GlowingHot_URL_Login.getDriver();
	}

	@When("^Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button$")
	public void open_the_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_maximize_button_and_click_on_minimize_button() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Glowing_Hot/GlowingHot_logo.PNG", 10);
		//	Thread.sleep(15000);

		Pattern url=new Pattern("./Images/Glowing_Hot/url.PNG");
		Pattern settings=new Pattern("./Images/Glowing_Hot/settings_icon.PNG");
		Pattern min=new Pattern("./Images/Glowing_Hot/minimize_icon.PNG");
		Pattern max=new Pattern("./Images/Glowing_Hot/maximize_icon.PNG");

		//Clicking on setting icon and then clicking on maximize icon 
		screen.click(settings);
		Thread.sleep(3000);
		screen.click(max);
		Thread.sleep(3000);

		//if the screen is maximized, comparing URL bar should not be visible
		//  Pattern credit1=new Pattern("E:/Sikuli Images/others/url.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(url);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("If the screen is maximized, url bar should not be visible and comparision successfull.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("If the screen is maximized, url bar should not be visible and comparisin value equals to: "+" "+score +"%");
		Assert.assertFalse(score > 97);

		//Clicking on minimize icon 
		// screen.click(settings);
		//Thread.sleep(3000);
		screen.click(min);
		Thread.sleep(3000);

		//if the screen is minimized, comparing URL bar should  be visible
		// Pattern winA=new Pattern("E:/Sikuli Images/others/url.PNG");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(url);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("URl bar should be visible if the bar is minimized and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("URl bar should be visible if the bar is minimized and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 85);
		Thread.sleep(2000);
	}

	@Then("^Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Glowing Hot slot game$")
	public void full_screen_should_be_displayed_after_clicking_on_maximize_button_and_minimized_screen_should_be_displayed_after_clicking_on_minimize_button_in_Glowing_Hot_slot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
