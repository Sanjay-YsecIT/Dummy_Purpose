package stepDefinition_PerfectGems;

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


public class PerfectGems_Web_Gamble_GamblePage_NetworkInteruptions {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, network turnOFF and ON, network messages$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_balance_spin_button_network_turnOFF_and_ON_network_messages() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin and turn OFF network and check for valid message and turn on network for manual spin is continued$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_and_launch_the_game_spin_and_turn_OFF_network_and_check_for_valid_message_and_turn_on_network_for_manual_spin_is_continued() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);

		Pattern balance=new Pattern("Images/Perfect_Gems/balance.PNG");            
		Pattern networkgamble=new Pattern("Images/Perfect_Gems/networkgamble.PNG"); 
		Pattern networkcollect=new Pattern("Images/Perfect_Gems/networkcollect.PNG");
		Pattern online=new Pattern("Images/Perfect_Gems/online.PNG");
		Pattern offline=new Pattern("Images/Perfect_Gems/offline.PNG");
		Pattern online1=new Pattern("Images/Perfect_Gems/online1.PNG");
		Pattern offline1=new Pattern("Images/Perfect_Gems/offline1.PNG");
		Pattern NoInternet=new Pattern("Images/Perfect_Gems/NoInternet.PNG");
		Pattern Disconnected=new Pattern("Images/Perfect_Gems/Disconnected.PNG");
		Pattern network_gamble_lose=new Pattern("Images/Perfect_Gems/networkbalance1_1.PNG");
		Pattern Network=new Pattern("Images/Perfect_Gems/Network.PNG");
		Pattern networkspin=new Pattern("Images/Perfect_Gems/networkspin.PNG");
		Pattern network_red=new Pattern("Images/Perfect_Gems/networkred.PNG");

		Pattern symb_1=new Pattern("Images/Perfect_Gems/symb_1.PNG");
		Pattern symb_2=new Pattern("Images/Perfect_Gems/symb_2.PNG");

		//comparing the balance before Win
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully. Balance is 300 SRD");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// WIN PATTERN COMBINATION 
		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(symb_2);
		Thread.sleep(1000);

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
		Thread.sleep(1500);
		screen.click(networkspin);
		Thread.sleep(1500);

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
		Assert.assertTrue(score2 > 97);

		//Switching back to online
		screen.click(offline1);
		Thread.sleep(1500);
		screen.click(online1);
		Thread.sleep(4000);
		//Clicking on gamble button
		screen.click(networkgamble);
		Thread.sleep(4000);

		//Switching to offline
		screen.click(online);
		Thread.sleep(1500);
		screen.click(offline);
		Thread.sleep(1000);

		//Clicking on Red button
		screen.click(network_red);
		Thread.sleep(1000);

		//comparing the "No-Internet" alert popup
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(NoInternet);
		double score21=20;                
		System.out.println("the value of ht21"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("No Internet alert popup comparision completed successfully.");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("No Internet alert popup comparision after spin: "+" "+score21 +"%");
		Assert.assertTrue(score21 > 95);

		//Switching back to online
		screen.click(offline1);
		Thread.sleep(1000);
		screen.click(online1);
		Thread.sleep(8000);

		//comparing the balance amount after spin
		if  (screen.exists(networkcollect) != null)
		{
			Pattern gambleStatus=new Pattern(networkcollect);
			Finder finder33 =new Finder(screen.capture().getImage());
			String ht33 = finder33.find(gambleStatus);
			double score33=20;                
			System.out.println("the value of ht33"+" "+ht33);
			if(finder33.hasNext())
			{
				Match m33=finder33.next();
				System.out.println("Match Found with: "+(m33.getScore())*100+"%");
				score33=(m33.getScore())*100;
				System.out.println("Gamble Win in network toggle condition");
				finder33.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble win comparision: "+" "+score33 +"%");
			Assert.assertTrue(score33 > 97);			  
			Thread.sleep(3000);

			screen.click(networkcollect);
			Thread.sleep(3000);
		}
		else
		{
			Finder finder35 =new Finder(screen.capture().getImage());
			String ht35 = finder35.find(networkcollect);
			double score35=20;                
			System.out.println("the value of ht35"+" "+ht35);
			if(finder35.hasNext())
			{
				Match m35=finder35.next();
				System.out.println("Match Found with: "+(m35.getScore())*100+"%");
				score35=(m35.getScore())*100;
				System.out.println("Gamble Lose.");
				finder35.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Gamble lose comparision: "+" "+score35+"%");
			Assert.assertFalse(score35 > 97);
			Thread.sleep(4000);

			Finder finder11 =new Finder(screen.capture().getImage());
			String ht11 = finder11.find(network_gamble_lose);
			double score11=20;                
			System.out.println("the value of ht1"+" "+ht11);
			if(finder11.hasNext())
			{
				Match m11=finder11.next();
				System.out.println("Match Found with: "+(m11.getScore())*100+"%");
				score11=(m11.getScore())*100;
				System.out.println("Balance After losing in gamble. Balance is 299.75 SRD");
				finder11.destroy();  
			}         
			else    
			{ 
				System.out.println("Comparision failed. Test case failed");         
			}
			System.out.println("Balance comparision after lose: "+" "+score11 +"%");
			Assert.assertTrue(score1 > 95);
			Thread.sleep(2000);
		}
		screen.click(online);
		Thread.sleep(1500);
		screen.click(offline);
		Thread.sleep(2000);

		//spin the reels
		screen.click(networkspin);
		Thread.sleep(1*60*1000);

		Finder finder33 =new Finder(screen.capture().getImage());
		String ht33 = finder33.find(Disconnected);
		double score33=20;                
		System.out.println("the value of ht33"+" "+ht33);
		if(finder33.hasNext())
		{
			Match m33=finder33.next();
			System.out.println("Match Found with: "+(m33.getScore())*100+"%");
			score33=(m33.getScore())*100;
			System.out.println("Disconnected from Server alert popup");
			finder33.destroy();  
		}         
		else    
		{ 
			System.out.println("Disconnected from Server alert popup and Comparision failed. Test case failed");         
		}
		System.out.println("Disconnected from Server alert popup comparision: "+" "+score33 +"%");
		Assert.assertTrue(score33 > 97);			  
		Thread.sleep(3000);
	}

	@Then("^User is addressed with valid error message 'No Internet' for network interruptions in Perfect Gems slot game$")
	public void user_is_addressed_with_valid_error_message_No_Internet_for_network_interruptions_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(2000);
	}

	@Then("^User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions in Perfect Gems slot game$")
	public void user_is_addressed_with_valid_error_message_Disconnected_from_Server_for_longer_duration_network_interruptions_in_Perfect_Gems_slot_game() throws Throwable {
		driver.quit();
	}
}
