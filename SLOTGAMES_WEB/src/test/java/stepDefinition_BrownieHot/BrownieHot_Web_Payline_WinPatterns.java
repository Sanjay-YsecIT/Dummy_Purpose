package stepDefinition_BrownieHot;

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

public class BrownieHot_Web_Payline_WinPatterns {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, paylines and payline patterns$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_paylines_and_payline_patterns() throws Throwable {
		this.driver = BrownieHot_URL_Login.getDriver();
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on payline drop downs and reel side payline selector$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_payline_drop_downs_and_reel_side_payline_selector() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Brownie_Hot/BrownieHot.PNG", 30);
		
		Pattern payline=new Pattern("Images/Brownie_Hot/payline.PNG");
		Pattern paylines=new Pattern("Images/Brownie_Hot/paylines.PNG");
		Pattern pay1=new Pattern("Images/Brownie_Hot/pay1.PNG");
		Pattern pay5=new Pattern("Images/Brownie_Hot/pay5.PNG");
		Pattern pay3=new Pattern("Images/Brownie_Hot/pay3.PNG");
		Pattern leftpay1 = new Pattern("Images/Brownie_Hot/leftpay1.PNG");
		Pattern leftpay3=new Pattern("Images/Brownie_Hot/leftpay3.PNG");
		Pattern rightpay2=new Pattern("Images/Brownie_Hot/rightpay2.PNG");
		Pattern rightpay4=new Pattern("Images/Brownie_Hot/rightpay4.PNG");
		Pattern win_pattern1=new Pattern("Images/Brownie_Hot/win_pattern1.PNG");
		Pattern win_pattern2=new Pattern("Images/Brownie_Hot/win_pattern2.PNG");
		Pattern win_pattern3=new Pattern("Images/Brownie_Hot/win_pattern3.PNG");
		Pattern win_pattern4=new Pattern("Images/Brownie_Hot/win_pattern4.PNG");
		Pattern win_pattern5=new Pattern("Images/Brownie_Hot/win_pattern5.PNG");
		
		screen.click(payline);
		Thread.sleep(2000);
		screen.click(payline);
		Thread.sleep(2000);
		
	
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit1);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);
	}

	@Then("^Verify the payline patterns on the reels and payline buttons having functionality$")
	public void verify_the_payline_patterns_on_the_reels_and_payline_buttons_having_functionality() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
