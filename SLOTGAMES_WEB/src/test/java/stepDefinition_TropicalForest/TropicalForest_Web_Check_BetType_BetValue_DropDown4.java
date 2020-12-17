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

public class TropicalForest_Web_Check_BetType_BetValue_DropDown4 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tropical Forest  slot game, bet type as (\\d+)\\.(\\d+) from drop down and bet value as (\\d+),(\\d+),(\\d+),(\\d+),(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Tropical_Forest_slot_game_bet_type_as_from_drop_down_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
		this.driver = TropicalForest_URL_Login.getDriver();
	}

		@When("^Open the Tropical Forest slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) from drop down and check the bet value should be (\\d+),(\\d+),(\\d+),(\\d+),(\\d+)$")
		public void open_the_Tropical_Forest_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_from_drop_down_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
		
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropical_Forest/TropicalForest.PNG", 30);
		
		Pattern credit4=new Pattern("Images/Tropical_Forest/credit4.PNG");
		Pattern bet=new Pattern("Images/Tropical_Forest/bet4.PNG");
		Pattern bet_dropdown4=new Pattern("Images/Tropical_Forest/bet_dropdown4.PNG");
		Pattern credit_inc = new Pattern("Images/Tropical_Forest/credit_inc.PNG");

		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);

		//comparing the credit value should be 0.5
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit4);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully and value is 0.5. Test case passed");
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
			System.out.println("Comparision happened successfully. Available denominations are: 10, 20, 50, 100 & 200. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
	}
	
	@Then("^Bet value should get changed to (\\d+),(\\d+),(\\d+),(\\d+),(\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down four in Tropical Forest slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_four_in_Tropical_Forest_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
