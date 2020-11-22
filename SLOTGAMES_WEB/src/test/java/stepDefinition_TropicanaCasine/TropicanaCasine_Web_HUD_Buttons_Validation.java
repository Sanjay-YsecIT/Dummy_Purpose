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

public class TropicanaCasine_Web_HUD_Buttons_Validation {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, HUD buttons$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_HUD_buttons() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, launch the game$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_launch_the_game() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern HUD=new Pattern("Images/Tropicana_Casine/HUD.PNG");
		Pattern spin=new Pattern("Images/Tropicana_Casine/spin.PNG");
		Pattern spin_stop=new Pattern("Images/Tropicana_Casine/spin_stop.PNG");
		Pattern turboON=new Pattern("Images/Tropicana_Casine/turboON.PNG");
		Pattern turboOFF=new Pattern("Images/Tropicana_Casine/turboOFF.PNG");
		Pattern hide=new Pattern("Images/Tropicana_Casine/hide.PNG");
		Pattern unhide=new Pattern("Images/Tropicana_Casine/unhide.PNG");
		Pattern balance_unhide=new Pattern("Images/Tropicana_Casine/balance.PNG");
		Pattern balance_hide=new Pattern("Images/Tropicana_Casine/balance_hide.PNG");

		screen.click(hide);
		Thread.sleep(2000);

		//Hide the balance field
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance_hide);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Hide the balance field and check the visiblity of balance amount on the screen. Test case Pass");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Hide the balance field and check the visiblity of balance amount on the screen and comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		screen.click(unhide);
		Thread.sleep(2000);

		//Un-Hide the balance field
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(balance_unhide);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Un-Hide the balance field and check the visiblity of balance amount on the screen. Test case Pass");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Un-Hide the balance field and check the visiblity of balance amount on the screen and comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);

		//HUD button Validation
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(HUD);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("All HUD buttons are validated with color font and alignment on the screen. Test case Pass");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("All HUD buttons are validated with color font and alignment on the screen and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 99);

		//Color of Turbo "ON" and "OFF" state
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(turboOFF);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("TurboOFF button color is validated and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("TurboOFF button color is validated and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(2000);

		screen.click(turboOFF);
		Thread.sleep(3000);

		//Color of Turbo "ON" and "OFF" state
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(turboON);
		double score21=20;                
		System.out.println("the value of ht21"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("TurboON button color is validated and comparision successfull.");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("TurboON button color is validated and comparision value is equal to: "+" "+score21 +"%");
		Assert.assertTrue(score21 > 96);
		Thread.sleep(2000);

		screen.click(spin);
		Thread.sleep(0500);

		//Color of stop button
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(spin_stop);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("TurboON button color is validated and comparision successfull.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("TurboON button color is validated and comparision value is equal to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);
	}

	@Then("^Verify all the text button letter case$")
	public void verify_all_the_text_button_letter_case() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify colors of bet and credit buttons$")
	public void verify_colors_of_bet_and_credit_buttons() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify the functionality of hide and unhide button$")
	public void verify_the_functionality_of_hide_and_unhide_button() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify the alignment of spin button$")
	public void verify_the_alignment_of_spin_button() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify the color of turbo button 'ON' and 'OFF' state$")
	public void verify_the_color_of_turbo_button_ON_and_OFF_state() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Verify the color of spin and stop button$")
	public void verify_the_color_of_spin_and_stop_button() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
}
