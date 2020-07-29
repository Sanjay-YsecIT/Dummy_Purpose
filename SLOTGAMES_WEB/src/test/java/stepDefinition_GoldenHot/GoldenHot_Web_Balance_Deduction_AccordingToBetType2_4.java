package stepDefinition_GoldenHot;

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

public class GoldenHot_Web_Balance_Deduction_AccordingToBetType2_4 {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Golden Hot slot game, bet type as (\\d+)\\.(\\d+), bet value as (\\d+)\\.(\\d+), bet type & bet values drop down, balance, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Hot_slot_game_bet_type_as_bet_value_as_bet_type_bet_values_drop_down_balance_spin_button_and_win_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {

		this.driver = GoldenHot_URL_Login.getDriver();
	}

	@When("^Open the Golden Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value to (\\d+)\\.(\\d+), click on spin button, check the win amount and check the balance$")
	public void open_the_Golden_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_to_click_on_spin_button_check_the_win_amount_and_check_the_balance(int arg1, int arg2, int arg3, int arg4) throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Golden_Hot/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern credit=new Pattern("./Images/Golden_Hot/credit_0.05.PNG");
		Pattern betval=new Pattern("./Images/Golden_Hot/betval2_4.PNG");
		Pattern bet2=new Pattern("./Images/Golden_Hot/bet2.PNG"); 
		Pattern spin=new Pattern("./Images/Golden_Hot/spin.PNG");
		Pattern Afterspin_bal=new Pattern("./Images/Golden_Hot/Reminingbal_297.50.PNG");
		Pattern credit_inc=new Pattern("./Images/Golden_Hot/credit_inc.PNG");

		screen.click(credit_inc);
		Thread.sleep(3000);
		//clicking on Bet VALUE
		screen.click(bet2);
		Thread.sleep(2000);
		screen.click(betval);
		Thread.sleep(3000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(4000);

		//comparing the credit value should be 0.05
		//   Pattern credit1=new Pattern("E:/Sikuli Images/Bet Values/creditvalue1.png");
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

		//comparing the balance after spinning should be deducted by 2.5 value
		//  Pattern pat=new Pattern("E:/Sikuli Images/Bet Values/balance.png");
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
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score1 > 97);
	}

	@Then("^Current Balance should get deducted by (\\d+)\\.(\\d+), as bet type is selected as (\\d+)\\.(\\d+) & bet type as (\\d+)\\.(\\d+), in Golden Hot game$")
	public void current_Balance_should_get_deducted_by_as_bet_type_is_selected_as_bet_type_as_in_Golden_Hot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
