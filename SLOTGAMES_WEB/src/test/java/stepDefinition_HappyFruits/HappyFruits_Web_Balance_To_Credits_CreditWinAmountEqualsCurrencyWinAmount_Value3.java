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

public class HappyFruits_Web_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value3 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits_for_denomination_drop_down_value_three() throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_the_denomination_drop_down_value_three_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);
		
		Pattern credit3=new Pattern("Images/Happy_Fruits/credit3.PNG");
		Pattern credit_inc=new Pattern("Images/Happy_Fruits/credit_inc.PNG");
		Pattern spin=new Pattern("Images/Happy_Fruits/spin.PNG");
		Pattern win_3 = new Pattern("Images/Happy_Fruits/win_3.PNG");
		Pattern win_31 = new Pattern("Images/Happy_Fruits/win_31.PNG");
		Pattern balance3_1=new Pattern("Images/Happy_Fruits/balance3_1.PNG");

		// credit values
		Pattern credit3_CR = new Pattern("Images/Happy_Fruits/credit3_CR.PNG");
		Pattern win_credits_1 = new Pattern("Images/Happy_Fruits/win_credits_1.PNG");

		//win pattern symbols
		Pattern symb_1=new Pattern("Images/Happy_Fruits/symb_1.PNG");

		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);

		//comparing the credit value should be 0.1
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit3);
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

		// WIN PATTERN COMBINATION 
		screen.click(symb_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_3);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Win amount comparision after spin completed successfully.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(2000);

		//clicking on balance button to convert amount into to credits
		screen.click(balance3_1);
		Thread.sleep(3000);

		//comparing the win amount in credits
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(win_credits_1);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Win amount in credits comparision successfull.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount in credits comparision value equal to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);

		//Balance in credits 
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(credit3_CR);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Balance in credits comparision successfull. ");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in credits comparision value equal to	: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);

		//clicking on balance button to convert credits into to amount in currency
		screen.click(credit3_CR);
		Thread.sleep(3000);

		//comparing the win amount in currency
		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(win_31);
		double score6=20;                
		System.out.println("the value of ht6"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("Win amount in currnecy comparision successfull.");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Win amount comparision in currency value equal to: "+" "+score6 +"%");
		Assert.assertTrue(score6 > 97);
		Thread.sleep(2000);
	}

	@Then("^Win amount in credits multiplied by denomination drop down value three is equal to win amount in currency in Happy Fruits slot game$")
	public void win_amount_in_credits_multiplied_by_denomination_drop_down_value_three_is_equal_to_win_amount_in_currency_in_Happy_Fruits_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
