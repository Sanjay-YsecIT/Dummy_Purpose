package stepDefinition_BrownieHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrownieHot_Web_TransferAmount_Verify {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot game, balance, text field to transfer balance and Ok button$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_game_balance_text_field_to_transfer_balance_and_Ok_button() throws Throwable {
	    
		this.driver = BrownieHot_URL_Login.getDriver();
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_Play_button_enter_the_valid_amount_to_transfer_and_click_on_Ok_button() throws Throwable {
	   
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(4000);

		//images before and after transfer
		Pattern Beforetransfer=new Pattern("Images/Brownie_Hot/t_beforetransfer.PNG");
		Pattern Aftertransfer=new Pattern("Images/Brownie_Hot/balance.PNG");

		//Comparing the amount which is transferring to the slot game
		// Pattern credit1=new Pattern("E:/Sikuli Images/others/beforetransfer.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Beforetransfer);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Transfering the amount to the slot game and transfer is successfull.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Transfering the amount to the slot game and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Brownie_Hot/BrownieHot.PNG", 30);
		Thread.sleep(4000);
		
		//Comparing the same amount is displayed on the slot game balance after loading
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(Aftertransfer);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Same amount is displayed on the balance section and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Same amount is displayed on the balance section and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
	}

	@Then("^The exact amount entered in the transfer page should transfer to Brownie Hot game and same amount should get displayed on the balance section$")
	public void the_exact_amount_entered_in_the_transfer_page_should_transfer_to_Brownie_Hot_game_and_same_amount_should_get_displayed_on_the_balance_section() throws Throwable {
	    
		Thread.sleep(3000);
		driver.quit();	
	}
}
