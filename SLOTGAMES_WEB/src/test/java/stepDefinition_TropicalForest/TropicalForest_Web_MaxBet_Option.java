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


public class TropicalForest_Web_MaxBet_Option {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tropical Forest slot game, max bet option, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Tropical_Forest_slot_game_max_bet_option_balance_and_spin_button() throws Throwable {
		this.driver = TropicalForest_URL_Login.getDriver();
	}

	@When("^Open the Tropical Forest slot game by entering the valid URL in browser, enter the valid login details, select the bet type as maxbet, click on spin button and check the balance$")
	public void open_the_Tropical_Forest_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_maxbet_click_on_spin_button_and_check_the_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropical_Forest/TropicalForest.PNG", 30);
		
		Pattern credit=new Pattern("Images/Tropical_Forest/credit4.PNG");
		Pattern maxbet4 = new Pattern("Images/Tropical_Forest/maxbet4.PNG");
		Pattern spin=new Pattern("Images/Tropical_Forest/spin.PNG");
		Pattern Afterspin_bal=new Pattern("Images/Tropical_Forest/balance4_5.PNG");
		Pattern maxbet=new Pattern("Images/Tropical_Forest/maxbet.PNG");
		Pattern balance=new Pattern("Images/Tropical_Forest/balance.PNG");

		//comparing the balance before spin
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(balance);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance comparision before spin completed successfully.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		screen.click(maxbet);
		Thread.sleep(3000);

		//comparing the credit value should be 0.5
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
		Thread.sleep(2000);

		//comparing the bet value should be 200
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(maxbet4);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("bet value comparision happened successfully. Test case passed");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("bet value comparision value equals to: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97); 

		screen.click(spin);
		Thread.sleep(4000);

		//comparing the balance after spinning should be deducted by 200 value
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(Afterspin_bal);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Comparision happened successfully. Test case passed");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);
	}

	@Then("^Balance should get deducted by max credit and betvalue combinationas per the game specification in Tropical Forest game$")
	public void balance_should_get_deducted_by_max_credit_and_betvalue_combinationas_per_the_game_specification_in_Tropical_Forest_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
