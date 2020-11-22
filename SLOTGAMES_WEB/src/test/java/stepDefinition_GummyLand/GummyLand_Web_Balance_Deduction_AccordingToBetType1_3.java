package stepDefinition_GummyLand;

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

public class GummyLand_Web_Balance_Deduction_AccordingToBetType1_3 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as (\\d+)\\.(\\d+), bet value as ONE, balance, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Gummy_Land_slot_game_bet_type_as_bet_value_as_ONE_balance_spin_button_and_win_amount(int arg1, int arg2) throws Throwable {
		this.driver = GummyLand_URL_Login.getDriver();
	}

	@When("^Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as ONE, click on spin button, check the win amount and check the balance$")
	public void open_the_Gummy_Land_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_ONE_click_on_spin_button_check_the_win_amount_and_check_the_balance(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Gummy_Land/GummyLand.PNG", 30);
		
		Pattern credit=new Pattern("Images/Gummy_Land/credit1.PNG");
		Pattern betval=new Pattern("Images/Gummy_Land/bet1_3.PNG");
		Pattern bet1 = new Pattern("Images/Gummy_Land/bet1.PNG");
		Pattern spin=new Pattern("Images/Gummy_Land/spin.PNG");
		Pattern Afterspin_bal=new Pattern("Images/Gummy_Land/balance1_3.PNG");

		//clicking on Bet VALUE
		screen.click(bet1);
		Thread.sleep(2000);
		screen.click(betval);
		Thread.sleep(2000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(2000);

		//comparing the credit value should be 0.02
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97); 

		//comparing the balance after spinning should be deducted by 1 value
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(Afterspin_bal);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Comparision happened successfully. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
	}

	@Then("^Current Balance should get deducted by ONE as bet type is selected as (\\d+)\\.(\\d+) and bet value as ONE in Gummy Land  game$")
	public void current_Balance_should_get_deducted_by_ONE_as_bet_type_is_selected_as_and_bet_value_as_ONE_in_Gummy_Land_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
