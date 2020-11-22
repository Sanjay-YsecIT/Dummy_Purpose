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

public class HappyFruits_Web_Balance_Deduction_AccordingToBetType4_2 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as (\\d+), bet value as TEN, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_game_bet_type_as_bet_value_as_TEN_balance_and_spin_button(int arg1) throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+) & bet value as TEN, click on spin button and check the balance$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_bet_value_as_TEN_click_on_spin_button_and_check_the_balance(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);
		
		Pattern credit=new Pattern("Images/Happy_Fruits/credit4.PNG");
		Pattern betval=new Pattern("Images/Happy_Fruits/bet4_2.PNG");
		Pattern bet4 = new Pattern("Images/Happy_Fruits/bet4.PNG");
		Pattern creditinc = new Pattern("Images/Happy_Fruits/credit_inc.PNG");
		Pattern spin=new Pattern("Images/Happy_Fruits/spin.PNG");
		Pattern Afterspin_bal=new Pattern("Images/Happy_Fruits/balance4_2.PNG");

		//credit incremental to 4th credit value
		screen.click(creditinc);
		Thread.sleep(2000);
		screen.click(creditinc);
		Thread.sleep(2000);
		screen.click(creditinc);
		Thread.sleep(2000);

		//clicking on Bet VALUE
		screen.click(bet4);
		Thread.sleep(2000);
		screen.click(betval);
		Thread.sleep(2000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(2000);

		//comparing the credit value should be 1
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

		//comparing the balance after spinning should be deducted by 10 value
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

	@Then("^Balance should get deducted by TEN as bet type is selected as (\\d+) in Happy Fruits game$")
	public void balance_should_get_deducted_by_TEN_as_bet_type_is_selected_as_in_Happy_Fruits_game(int arg1) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
