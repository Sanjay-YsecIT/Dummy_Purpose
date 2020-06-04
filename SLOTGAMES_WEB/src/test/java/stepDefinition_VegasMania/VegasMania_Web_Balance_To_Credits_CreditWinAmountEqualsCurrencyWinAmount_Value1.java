package stepDefinition_VegasMania;

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

public class VegasMania_Web_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value1 {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Vegas Mania slot game, balance, spin button, win amount in currency, credits and win amount in credits$")
	public void chrome_browser_valid_URL_valid_login_details_Vegas_Mania_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits() throws Throwable {

		this.driver = VegasMania_URL_Login.getDriver();
	}

	@When("^Open the Vegas Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Vegas Mania slot game, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Vegas_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Vegas_Mania_slot_game_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Vegas_Mania/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern credit=new Pattern("./Images/Vegas_Mania/credit_0.01.PNG");
	//	Pattern betval=new Pattern("./Images/Vegas_Mania/betval1_1.PNG");
		Pattern spin=new Pattern("./Images/Vegas_Mania/spin.PNG");
		Pattern balance=new Pattern("./Images/Vegas_Mania/Reminingbal_299.90.PNG");
		Pattern win_amt = new Pattern("./Images/Vegas_Mania/winamt_0.4.PNG");
	//	Pattern collect=new Pattern("./Images/Vegas_Mania/collect.PNG")

		// credit values
		Pattern win_cr = new Pattern("./Images/Vegas_Mania/cr_winamt1.PNG");
		Pattern balance_cr=new Pattern("./Images/Vegas_Mania/cr_bal1.PNG");

		//		win symbols
		Pattern cherry=new Pattern("./Images/Vegas_Mania/2R_cherry.PNG");


		//comparing the credit value should be 0.01
		// Pattern credit1=new Pattern("E:/Sikuli Images/Win/creditvalue1.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit);
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
		screen.click(cherry);
		Thread.sleep(2000);
//		screen.click(betval);
//		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(2000);

		//comparing the win amount should exists after spin
		// Pattern winA=new Pattern("E:/Sikuli Images/Win/win_2_1.PNG");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(win_amt);
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
		screen.click(balance);
		Thread.sleep(2000);


		//comparing the win amount in credits
		// Pattern balanceA=new Pattern("E:/Sikuli Images/Win/win_credit.PNG");

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(win_cr);
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
		//   Pattern symbol=new Pattern("E:/Sikuli Images/Win/balance_credits_2.PNG");

		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(balance_cr);
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
		screen.click(balance_cr);
		Thread.sleep(2000);

		//comparing the win amount in currency
		//  Pattern winB=new Pattern("E:/Sikuli Images/Win/win_1_1.PNG");

		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(win_amt);
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
		Assert.assertTrue(score6 > 80);
		Thread.sleep(2000);
		
		//screen.click(collect);
	}

	@Then("^Win amount in credit multiplied by denomination is equal to win amount in currency in Vegas Mania slot game$")
	public void win_amount_in_credit_multiplied_by_denomination_is_equal_to_win_amount_in_currency_in_Vegas_Mania_slot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
