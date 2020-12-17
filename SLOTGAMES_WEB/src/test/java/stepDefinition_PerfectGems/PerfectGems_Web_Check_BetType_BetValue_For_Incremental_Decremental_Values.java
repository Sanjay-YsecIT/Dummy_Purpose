package stepDefinition_PerfectGems;

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

public class PerfectGems_Web_Check_BetType_BetValue_For_Incremental_Decremental_Values {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, betvalues, credit increment and decremental$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_betvalues_credit_increment_and_decremental() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click credit incremental and decrement$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_credit_incremental_and_decrement() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);
		Thread.sleep(2000);
		
		Pattern credit4=new Pattern("Images/Perfect_Gems/credit4.PNG");
		Pattern bet=new Pattern("Images/Perfect_Gems/bet4.PNG");
		Pattern bet_dropdown4=new Pattern("Images/Perfect_Gems/bet_dropdown4.PNG");
		Pattern credit_inc = new Pattern("Images/Perfect_Gems/credit_inc.PNG");
		Pattern credit_dec = new Pattern("Images/Perfect_Gems/credit_dec.PNG");
		Pattern credit2=new Pattern("Images/Perfect_Gems/credit2.PNG");
		Pattern bet_dropdown2=new Pattern("Images/Perfect_Gems/bet_dropdown2.PNG");

		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);

		//comparing the credit value should be 0.4
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit4);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully and value is 0.4. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		screen.click(bet);
		Thread.sleep(3000);

		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(bet_dropdown4);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("credit incremnetal and bet values Comparision happened successfully. Available denominations are: 10, 20, 30 & 400. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
		Thread.sleep(2000);
		
		//Decremetal the the credit and verify the bet values
		screen.click(credit_dec);
		Thread.sleep(1000);
		screen.click(credit_dec);
		Thread.sleep(1000);
		
		//comparing the credit value should be 0.03
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(credit2);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("decrement Credit value and  comparision happened successfully and value is 0.03. Test case passed");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("decrement Credit value and comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);
		Thread.sleep(2000);

		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(bet_dropdown2);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("decrement Credit value and Comparision happened successfully. Available denominations are: 0.75, 1.5, 2.25 & 3. Test case passed");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("decrement Credit value and Comparision value equals to: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
	}

	@Then("^Verify the bet values are in assigned fields in ascending order in Perfect Gems slot game$")
	public void verify_the_bet_values_are_in_assigned_fields_in_ascending_order_in_Perfect_Gems_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
