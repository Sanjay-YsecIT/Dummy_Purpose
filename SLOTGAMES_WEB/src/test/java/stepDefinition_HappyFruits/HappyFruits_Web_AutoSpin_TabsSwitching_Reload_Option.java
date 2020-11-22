package stepDefinition_HappyFruits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class HappyFruits_Web_AutoSpin_TabsSwitching_Reload_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, transfer button, spin button, multiple tabs and reload option$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_game_balance_transfer_button_spin_button_multiple_tabs_and_reload_option() throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on autospin and switch between tabs and again reload the game$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_autospin_and_switch_between_tabs_and_again_reload_the_game() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);
		Thread.sleep(2000);

		Pattern autoplay=new Pattern("Images/Happy_Fruits/autoplay.PNG");
		Pattern auto_auto=new Pattern("Images/Happy_Fruits/auto_auto.PNG");
		Pattern auto_stop=new Pattern("Images/Happy_Fruits/auto_stop.PNG");
		Pattern reload=new Pattern("Images/Happy_Fruits/reload.PNG");
		Pattern newtab=new Pattern("Images/Happy_Fruits/newtab.PNG");
		Pattern gametab=new Pattern("Images/Happy_Fruits/gametab.PNG");

		//Click on autoplay button and start auto spin
		screen.click(autoplay);
		Thread.sleep(1000);
		screen.click(auto_auto);
		Thread.sleep(4000);

		screen.click(newtab);
		Thread.sleep(5000);
		screen.click(gametab);
		Thread.sleep(5000);

		//Verify the autospin stop button is available on screen and autospin is continued
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(auto_stop);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Autospin stop button is present and autospin is continued & comparision completed successfully.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Autospin stop button is present & comparision value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);	

		screen.click(reload);
		Thread.sleep(8000);

		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[10]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(10000);

		WebElement TransferInput1 =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput1.clear();
		Thread.sleep(1000);
		TransferInput1.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);

		//Verify the autospin stop button is available on screen and autospin is continued
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(auto_stop);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Autospin stop button is not present and autospin is not continued & comparision completed successfully.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Autospin stop button is not present & comparision value equal to: "+" "+score11 +"%");
		Assert.assertFalse(score11 > 97);
	}

	@Then("^Switching between tabs should be allowed and reloading the game resulting in ending game session and shouldn't resume the Happy Fruits slot game$")
	public void switching_between_tabs_should_be_allowed_and_reloading_the_game_resulting_in_ending_game_session_and_shouldn_t_resume_the_Happy_Fruits_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
