package stepDefinition_HappyFruits;

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

public class HappyFruits_Web_Balance_Deduction_InCredits_AccordingToBetType1_1 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as (\\d+)\\.(\\d+), bet value as five, balance in credits and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_game_bet_type_as_bet_value_as_five_balance_in_credits_and_spin_button(int arg1, int arg2) throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as Five, click on spin button and check the balance in credits$")
	public void open_the_Happy_Fruits_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_Five_click_on_spin_button_and_check_the_balance_in_credits(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);
		
		Pattern credit=new Pattern("Images/Happy_Fruits/credit1.PNG");
		Pattern betval=new Pattern("Images/Happy_Fruits/crbet1_1.PNG");
		Pattern bet1 = new Pattern("Images/Happy_Fruits/crbet1.PNG");
		Pattern spin=new Pattern("Images/Happy_Fruits/spin.PNG");
		Pattern Afterspin_bal=new Pattern("Images/Happy_Fruits/crbalance1_1.PNG");
		Pattern balance=new Pattern("Images/Happy_Fruits/balance.PNG");

		//convert to credit balance form
		screen.click(balance);
		Thread.sleep(2000);
		//clicking on Bet VALUE
		screen.click(bet1);
		Thread.sleep(2000);
		screen.click(betval);
		Thread.sleep(2000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(3000);

		//comparing the credit value should be 0.03
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

		//comparing the balance after spinning should be deducted by 5 value
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
		Assert.assertTrue(score1 > 98);
	}

	@Then("^Balance should get deducted by Five as bet type is selected as (\\d+)\\.(\\d+) and bet value as (\\d+) in Happy Fruits slot game$")
	public void balance_should_get_deducted_by_Five_as_bet_type_is_selected_as_and_bet_value_as_in_Happy_Fruits_slot_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
