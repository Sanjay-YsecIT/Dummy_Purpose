package stepDefinition_TropicanaCasine;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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

public class TropicanaCasine_Web_AutoSpin_NetworkInteruptions {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, balance, Autospin button, netwok turnOFF and ON, network messages$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_balance_Autospin_button_netwok_turnOFF_and_ON_network_messages() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, and launch the game, Autospin is turned ON and turn OFF netwok and check for valid message\\. and turn on netwok for Auto spin is continued$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_and_launch_the_game_Autospin_is_turned_ON_and_turn_OFF_netwok_and_check_for_valid_message_and_turn_on_netwok_for_Auto_spin_is_continued() throws Throwable {
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
		Pattern online=new Pattern("Images/Tropicana_Casine/online.PNG");
		Pattern offline=new Pattern("Images/Tropicana_Casine/offline.PNG");
		Pattern online1=new Pattern("Images/Tropicana_Casine/online1.PNG");
		Pattern offline1=new Pattern("Images/Tropicana_Casine/offline1.PNG");
		Pattern NoInternet=new Pattern("Images/Tropicana_Casine/NoInternet.PNG");
		Pattern Disconnected=new Pattern("Images/Tropicana_Casine/Disconnected.PNG");
		Pattern Network=new Pattern("Images/Tropicana_Casine/Network.PNG");
		Pattern auto_stop=new Pattern("Images/Tropicana_Casine/auto_stop.PNG");

		//Auto spin is enabled and reel spin is activated
		screen.click(autoplay);
		Thread.sleep(1500);
		screen.click(auto_auto);
		Thread.sleep(1000);

		//comparing the goodluck user message
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(goodluck);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Userinstruction message is compared during autospin");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Userinstruction message comparsion value: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
		Thread.sleep(3000);

		// Network is switched between online and offline
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
		Thread.sleep(2000);
		screen.click(Network);
		Thread.sleep(2000);
		screen.click(online);
		Thread.sleep(1500);
		screen.click(offline);
		Thread.sleep(8000);

		//comparing the "No-Internet" alert popup
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(NoInternet);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("No Internet alert popup comparision completed successfully.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("No Internet alert popup comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);

		//Switching back to online
		screen.click(offline1);
		Thread.sleep(1500);
		screen.click(online1);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
		Thread.sleep(2000);

		//comparing the "No-Internet" alert popup
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(auto_stop);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Auto stop button comparision completed successfully.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Auto stop button comparision during autospin: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);

		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
		Thread.sleep(2000);
		screen.click(Network);
		Thread.sleep(2000);
		screen.click(online);
		Thread.sleep(1500);
		screen.click(offline);
		Thread.sleep(2000);
		Thread.sleep(1*60*1000);

		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(Disconnected);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Disconnected from server message is displayed successfully");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision fails. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);
	}

	@Then("^User is addressed with valid error message 'No Internet' for network interruptions during Autospin in Tropicana Casine slot game$")
	public void user_is_addressed_with_valid_error_message_No_Internet_for_network_interruptions_during_Autospin_in_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(2000);
	}

	@Then("^User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions during Autospin feature in Tropicana Casine slot game$")
	public void user_is_addressed_with_valid_error_message_Disconnected_from_Server_for_longer_duration_network_interruptions_during_Autospin_feature_in_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
