package stepDefinition_TropicalForest;

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

public class TropicalForest_Web_Check_CreditBalance_For_Incremental_Decremental_CreditValues {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tropical Forest slot game, increment, decrement and balance, balance in credit form, creditvalues$")
	public void chrome_browser_valid_URL_valid_login_details_Tropical_Forest_slot_game_increment_decrement_and_balance_balance_in_credit_form_creditvalues() throws Throwable {
		this.driver = TropicalForest_URL_Login.getDriver();
	}

	@When("^Open the Tropical Forest slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance$")
	public void open_the_Tropical_Forest_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_inc_and_dec_credit_balance_and_verify_the_balance_in_credit_form_and_verify_the_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropical_Forest/TropicalForest.PNG", 30);
		
		Pattern balance=new Pattern("Images/Tropical_Forest/balance.PNG");
		Pattern credit1=new Pattern("Images/Tropical_Forest/credit1.PNG");
		Pattern credit4=new Pattern("Images/Tropical_Forest/credit4.PNG");
		Pattern credit2=new Pattern("Images/Tropical_Forest/credit2.PNG");
		Pattern credit_balance_1=new Pattern("Images/Tropical_Forest/credit_balance_1.PNG");
		Pattern credit_balance_4=new Pattern("Images/Tropical_Forest/credit_balance_4.PNG");
		Pattern credit_balance_2=new Pattern("Images/Tropical_Forest/credit_balance_2.PNG");
		Pattern credit_inc=new Pattern("Images/Tropical_Forest/credit_inc.PNG");
		Pattern credit_dec=new Pattern("Images/Tropical_Forest/credit_dec.PNG");

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
		String ht1 = finder1.find(credit1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Credit value comparision successful. Its 0.01");
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
		String ht2 = finder2.find(credit_balance_1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Balance in credits is 15,000.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in credits comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(3000);

		//Incremenet the credit from 0.01 to 0.5
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(2000);

		//comparing the credit value
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(credit4);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Credit value comparision successful. Its 0.5");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit value comparision: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);

		//comparing the credits in currency
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(credit_balance_4);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Balance in credits is 600.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in currency comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);

		//Decrement the credit from 0.5 to 0.02
		screen.click(credit_dec);
		Thread.sleep(1000);
		screen.click(credit_dec);
		Thread.sleep(2000);

		//comparing the credit value
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(credit2);
		double score5=20;                
		System.out.println("the value of ht5"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("Credit value comparision successful. Its 0.02");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit value comparision: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 97);

		//comparing the credits in currency
		Finder finder14 =new Finder(screen.capture().getImage());
		String ht14 = finder14.find(credit_balance_2);
		double score14=20;                
		System.out.println("the value of ht14"+" "+ht14);
		if(finder14.hasNext())
		{
			Match m14=finder14.next();
			System.out.println("Match Found with: "+(m14.getScore())*100+"%");
			score14=(m14.getScore())*100;
			System.out.println("Balance in credits is 15,000.");
			finder14.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in currency comparision: "+" "+score14 +"%");
		Assert.assertTrue(score14 > 97);

		// Clicking on amount to convert credits into amount
		screen.click(credit_balance_2);
		Thread.sleep(3000);

		//comparing the balance after converting from credits
		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(balance);
		double score7=20;                
		System.out.println("the value of ht7"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("Balance after converting from credits is 300");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance before converting into credits comparision is equals to: "+" "+score7 +"%");
		Assert.assertTrue(score7 > 97);
	}

	@Then("^Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Tropical Forest slot game$")
	public void credit_balance_for_all_credit_values_should_be_same_as_balance_multiplies_by_credit_value_are_assigned_respectively_in_Tropical_Forest_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
