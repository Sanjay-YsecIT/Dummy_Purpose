package stepDefinition_DeluxeFruit;

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

public class DeluxeFruit_Web_AutoSpin_AutoSpinOption {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruit slot game, balance, spin button, auto spin button, auto spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruit_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_number_of_spins_left_message() throws Throwable {
	    
		this.driver = DeluxeFruit_URL_Login.getDriver();
	}

	@When("^Open the Deluxe Fruit slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message$")
	public void open_the_Deluxe_Fruit_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_the_player_instruction_message() throws Throwable {
	    
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Deluxe_Fruit/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern autoplay=new Pattern("./Images/Deluxe_Fruit/autoplay.PNG");
		Pattern autospin=new Pattern("./Images/Deluxe_Fruit/autospin.PNG");
		Pattern goodluck=new Pattern("./Images/Deluxe_Fruit/goodluck.PNG");
		Pattern pat=new Pattern("./Images/Deluxe_Fruit/goodluck.PNG");

		// click on autospin icon
		screen.click(autoplay);
		Thread.sleep(1000);
		screen.click(autospin);
		Thread.sleep(1000);


		//comparing the good luck message after clicking on auto button
		//	Pattern credit1=new Pattern("./Images/Skinfiri_Mysterious/GoodLuck.PNG");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(goodluck);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Good Luck message is displayed after clicking on auto button. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 95);

		Thread.sleep(5000);
		//  Wait for some time for some autospin feature is enabled and verify the user interaction message
		//	Pattern pat=new Pattern("./Images/Skinfiri_Mysterious/GoodLuck.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(pat);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Good Luck message is displayed after clicking on auto button. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score1 > 95);
	}

	@Then("^System should keep performing the spins in Deluxe Fruit slot game$")
	public void system_should_keep_performing_the_spins_in_Deluxe_Fruit_slot_game() throws Throwable {
	    
		Pattern autospin_cancel=new Pattern("./Images/Deluxe_Fruit/autospin_cancel.PNG");
		screen.click(autospin_cancel);
		Thread.sleep(3000);
		driver.quit();
	}
}
