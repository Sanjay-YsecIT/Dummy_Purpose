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

public class GummyLand_Web_Multiplier_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type, denomination, balance, wild symbols, spin button and wild win amounts$")
	public void chrome_browser_valid_URL_valid_login_details_Gummy_Land_slot_game_bet_type_denomination_balance_wild_symbols_spin_button_and_wild_win_amounts() throws Throwable {
		this.driver = GummyLand_URL_Login.getDriver();
	}

	@When("^Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the wild symbol appears on all the reels and win amount added to the balance$")
	public void open_the_Gummy_Land_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_wild_symbol_appears_on_all_the_reels_and_win_amount_added_to_the_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Gummy_Land/GummyLand.PNG", 30);

		Pattern spin=new Pattern("Images/Gummy_Land/spin.PNG"); 
		Pattern take=new Pattern("Images/Gummy_Land/take.PNG");

		//win symbols set to reproduce the wild win count and win amount respectively
		Pattern symb_1_1=new Pattern("Images/Gummy_Land/symb_1_1.PNG");
		Pattern symb_1_2=new Pattern("Images/Gummy_Land/symb_1_2.PNG");
		Pattern symb_6_1=new Pattern("Images/Gummy_Land/symb_6_1.PNG");
		Pattern wildsymb_1_1=new Pattern("Images/Gummy_Land/wildsymb_1_1.PNG");

		// wild win amount
		Pattern wildwin1=new Pattern("Images/Gummy_Land/wildwin1.PNG");
		Pattern wildwin2=new Pattern("Images/Gummy_Land/wildwin2.PNG");
		Pattern wildwin3=new Pattern("Images/Gummy_Land/wildwin3.PNG");

		//Arranging the symbols to generate wild symbol as 1
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_2);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//wild win amount comparison
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(wildwin1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("1 win symbol win amount: 1.80 SRD");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("wild win amount comparision is successful and value equal to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		screen.click(take);
		Thread.sleep(3000);

		//Arranging the symbols to generate wild symbol as 2
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//wild win amount comparison
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(wildwin2);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("2 win symbol win amount: 9.40 SRD.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("wild win amount comparision is successful and value equal to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(5000);

		screen.click(take);
		Thread.sleep(3000);

		//Arranging the symbols to generate wild symbol as 3
		screen.click(wildsymb_1_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//win amount comparison
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(wildwin3);
		double score11=20;                
		System.out.println("the value of ht1"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("3 win symbol win amount: 31.60 SRD..");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("wild win amount comparision is successful and value equal to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);

		screen.click(take);
		Thread.sleep(3000);
	}

	@Then("^Reel win should multiplied by TWO as no of wild symbols equals ONE on the screen in Gummy Land slot game$")
	public void reel_win_should_multiplied_by_TWO_as_no_of_wild_symbols_equals_ONE_on_the_screen_in_Gummy_Land_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Reel win should multiplied by FOUR as no of wild symbols equals TWO on the screen in Gummy Land slot game$")
	public void reel_win_should_multiplied_by_FOUR_as_no_of_wild_symbols_equals_TWO_on_the_screen_in_Gummy_Land_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Reel win should multiplied by EIGHT as no of wild symbols equals THREE on the screen in Gummy Land slot game$")
	public void reel_win_should_multiplied_by_EIGHT_as_no_of_wild_symbols_equals_THREE_on_the_screen_in_Gummy_Land_slot_game() throws Throwable {
		Thread.sleep(1000);
	}
}
