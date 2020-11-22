package stepDefinition_SkinfiriMysterious;

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

public class SkinfiriMysterious_Web_Balance_Check_WinAmount_AddedToBalance_InCredits {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, transfer button, credit balance form, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_transfer_button_credit_balance_form_spin_button_and_win_amount() throws Throwable {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_balance_window_to_change_to_credit_form_click_on_spin_button_till_user_win_and_check_the_balance_after_win_in_credits() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);

		Pattern credit=new Pattern("Images/Skinfiri_Mysterious/0.01_credit.PNG");
		Pattern spin=new Pattern("Images/Skinfiri_Mysterious/spin.PNG");
		Pattern win_amt = new Pattern("Images/Skinfiri_Mysterious/cr_winamt.PNG");
		Pattern collect=new Pattern("Images/Skinfiri_Mysterious/collect_image.PNG");
		Pattern balance=new Pattern("Images/Skinfiri_Mysterious/bal_300.PNG");
		Pattern cr_balance=new Pattern("Images/Skinfiri_Mysterious/cr_bal.PNG");
		Pattern cr_deductbal=new Pattern("Images/Skinfiri_Mysterious/cr_deductbal.PNG");
		Pattern cr_winbal=new Pattern("Images/Skinfiri_Mysterious/cr_winbal.PNG");
		Pattern win_pattern=new Pattern("Images/Skinfiri_Mysterious/WIN_PAT_ANIMATION.PNG");

		screen.click(balance);
		Thread.sleep(2000);

		Pattern EYE=new Pattern("Images/Skinfiri_Mysterious/EYE.PNG");
		Pattern SKULL=new Pattern("Images/Skinfiri_Mysterious/SKULL.PNG");
		Pattern CROW=new Pattern("Images/Skinfiri_Mysterious/CROW.PNG");

		//comparing the credit value should be 0.01
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

		//comparing the balance before spin
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(cr_balance);
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
		screen.click(EYE);
		Thread.sleep(1000);
		screen.click(SKULL);
		Thread.sleep(1000);
		screen.click(CROW);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);

		//comparing the balance before spin
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(cr_deductbal);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Balance comparision after spin completed successfully.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance comparision after spin: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);

		//comparing the win amount should exists after spin
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

		//clicking on collect button
		screen.click(collect);
		Thread.sleep(2000);

		//comparing the balance amount after spin
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(cr_winbal);
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

		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(win_pattern);
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
		Assert.assertTrue(score4 > 80);
	}

	@Then("^Win amount should get added to the credit field after win and credit should get increased with win amount$")
	public void win_amount_should_get_added_to_the_credit_field_after_win_and_credit_should_get_increased_with_win_amount() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
