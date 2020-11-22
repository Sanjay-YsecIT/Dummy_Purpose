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

public class BrownieHot_Web_Balance_Credits_Calculations_4 {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, credits and denomination drop down & value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_balance_credits_and_denomination_drop_down_value_as(int arg1, int arg2) throws Throwable {
		this.driver = BrownieHot_URL_Login.getDriver();
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination (\\d+)\\.(\\d+) manually with and check the balance$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_multiply_credit_by_denomination_manually_with_and_check_the_balance(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Brownie_Hot/BrownieHot.PNG", 30);

		Pattern balance=new Pattern("Images/Brownie_Hot/balance.PNG");
		Pattern credit4=new Pattern("Images/Brownie_Hot/credit4.PNG");
		Pattern credit_balance_4=new Pattern("Images/Brownie_Hot/credit_balance_4.PNG");
		Pattern credit_inc=new Pattern("./Images/Amazon_Clash/credit_inc.PNG");

		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(2000);

		//comparing the balance before converting into credits
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(balance);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Balance before converting into credits is 300");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance before converting into credits comparision is equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//comparing the credit value
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(credit4);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Credit value comparision successful. Its 0.2");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit value comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// Clicking on amount to convert credits into amount
		screen.click(balance);
		Thread.sleep(3000);

		//comparing the balance in credit mode 
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(credit_balance_4);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Balance in credits is 1500.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in credits comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(3000);

		// Clicking on credit button to convert credits into amount
		screen.click(credit_balance_4);
		Thread.sleep(3000);

		//comparing the credits in currency
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(balance);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Balance after converting credit into currency is 300.00. Test case passed.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in currency comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);

	}

	@Then("^Balance amount should be same after multiplying denomination (\\d+)\\.(\\d+) by credit in Brownie Hot slot game$")
	public void balance_amount_should_be_same_after_multiplying_denomination_by_credit_in_Brownie_Hot_slot_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
