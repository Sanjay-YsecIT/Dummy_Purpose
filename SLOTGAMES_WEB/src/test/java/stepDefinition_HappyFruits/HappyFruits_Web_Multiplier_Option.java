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

public class HappyFruits_Web_Multiplier_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, same kind of symbols on all screens$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_game_balance_same_kind_of_symbols_on_all_screens() throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, spin the reel till all reels are triggered with same symbols like pear, melon, orange and strawberry$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_spin_the_reel_till_all_reels_are_triggered_with_same_symbols_like_pear_melon_orange_and_strawberry() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);

		Pattern spin=new Pattern("Images/Happy_Fruits/spin.PNG");
		Pattern multiplier_balance = new Pattern("Images/Happy_Fruits/multiplier_balance.PNG");
		Pattern take=new Pattern("Images/Happy_Fruits/take.PNG");
		Pattern balance=new Pattern("Images/Happy_Fruits/balance.PNG");
		Pattern multiplier_winamount=new Pattern("Images/Happy_Fruits/multiplier_winamount.PNG");
		Pattern multiplierwin_pattern=new Pattern("Images/Happy_Fruits/multiplierwin_pattern.PNG");
		Pattern multiplierwin=new Pattern("Images/Happy_Fruits/multiplierwin.PNG");

		Pattern symb_1_1=new Pattern("Images/Happy_Fruits/symb_1_1.PNG");
		Pattern symb_2_1=new Pattern("Images/Happy_Fruits/symb_2_1.PNG");
		Pattern symb_3_1=new Pattern("Images/Happy_Fruits/symb_3_1.PNG");
		Pattern symb_4_1=new Pattern("Images/Happy_Fruits/symb_4_1.PNG");
		Pattern symb_5_1=new Pattern("Images/Happy_Fruits/symb_5_1.PNG");
		Pattern symb_6_1=new Pattern("Images/Happy_Fruits/symb_6_1.PNG");

		Pattern symb_4=new Pattern("Images/Happy_Fruits/symb_4.PNG");
		Pattern symb_5=new Pattern("Images/Happy_Fruits/symb_5.PNG");
		Pattern symb_6=new Pattern("Images/Happy_Fruits/symb_6.PNG");

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

		// WIN PATTERN COMBINATION 
		screen.click(symb_3_1);
		Thread.sleep(1000);
		screen.click(symb_4_1);
		Thread.sleep(1000);
		screen.click(symb_5_1);
		Thread.sleep(1000);
		screen.click(symb_6_1);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(symb_4);
		Thread.sleep(1000);
		screen.click(symb_5);
		Thread.sleep(1000);
		screen.click(symb_5);
		Thread.sleep(1000);
		screen.click(symb_4);
		Thread.sleep(1000);
		screen.click(symb_4);
		Thread.sleep(1000);
		screen.click(symb_4);
		Thread.sleep(1000);
		screen.click(symb_4);
		Thread.sleep(1000);
		screen.click(symb_4);
		Thread.sleep(1000);
		screen.click(symb_5);
		Thread.sleep(1000);
		screen.click(symb_5);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_6);
		Thread.sleep(1000);
		screen.click(symb_2_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(3000);

		//Multipler animation once the win is triggered
		screen.exists(multiplierwin, 10);
		Thread.sleep(3000);

		//comparing the win amount should exists after spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(multiplier_winamount);
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

		screen.click(take);
		Thread.sleep(2000);

		//comparing the balance amount after spin
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(multiplier_balance);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Balance comparision after spin & win completed successfully.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance amount comparision after spin & win: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);

		//comparing the Winning wild with heart and clove symbols pattern
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(multiplierwin_pattern);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Winning symbols comparision completed successfully.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Winning symbols comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 95);
	}

	@Then("^multiplier win should triiger and win amount is added to main balance in Happy Fruits slot game$")
	public void multiplier_win_should_triiger_and_win_amount_is_added_to_main_balance_in_Happy_Fruits_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
