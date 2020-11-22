package stepDefinition_TropicanaCasine;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TropicanaCasine_Web_AutoSpin_AutoSpinOption {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, balance, spin button, auto spin button, auto spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_number_of_spins_left_message() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_the_player_instruction_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern autoplay=new Pattern("Images/Tropicana_Casine/autoplay.PNG");
		Pattern auto_auto=new Pattern("Images/Tropicana_Casine/auto_auto.PNG");
		Pattern goodluck=new Pattern("Images/Tropicana_Casine/goodluck.PNG");

		screen.click(autoplay);
		Thread.sleep(1000);
		screen.click(auto_auto);
		Thread.sleep(2000);

		//comparing the good luck message after clicking on auto button
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
		Assert.assertTrue(score > 97);
		Thread.sleep(5000);

		//  Wait for some time for some autospin feature is enabled and verify the user interaction message
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(goodluck);
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
		Assert.assertTrue(score1 > 97);
		Thread.sleep(5000);
	}

	@Then("^System should keep performing the spins in Tropicana Casine slot game$")
	public void system_should_keep_performing_the_spins_in_Tropicana_Casine_slot_game() throws Throwable {
		Pattern auto_stop=new Pattern("Images/Tropicana_Casine/auto_stop.PNG");
		screen.click(auto_stop);
		Thread.sleep(5000);

		Pattern placebet=new Pattern("Images/Tropicana_Casine/placebet.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(placebet);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Please place the bet message is displayed after clicking on auto-stop button. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
		Thread.sleep(2000);
		driver.quit();
	}
}