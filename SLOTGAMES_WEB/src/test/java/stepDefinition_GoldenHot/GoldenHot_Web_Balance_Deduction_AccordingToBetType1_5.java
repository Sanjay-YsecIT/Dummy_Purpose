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

public class GoldenHot_Web_Balance_Deduction_AccordingToBetType1_5 {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Golden Hot game, bet type as (\\d+)\\.(\\d+), bet value as THREE, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Hot_game_bet_type_as_bet_value_as_THREE_balance_and_spin_button(int arg1, int arg2) throws Throwable {

		this.driver = GoldenHot_URL_Login.getDriver();
	}

	@When("^Open the Golden Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value to THREE, click on spin button and check the slot game balance$")
	public void open_the_Golden_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_to_THREE_click_on_spin_button_and_check_the_slot_game_balance(int arg1, int arg2) throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Golden_Hot/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern credit=new Pattern("./Images/Golden_Hot/credit_0.03.PNG");
		Pattern betval=new Pattern("./Images/Golden_Hot/betval1_5.PNG"); 
		Pattern bet1=new Pattern("./Images/Golden_Hot/bet1.PNG"); 
		Pattern spin=new Pattern("./Images/Golden_Hot/spin.PNG");
		Pattern Afterspin_bal=new Pattern("./Images/Golden_Hot/Reminingbal_297.PNG");

		//clicking on Bet VALUE
		screen.click(bet1);
		Thread.sleep(2000);
		screen.click(betval);
		Thread.sleep(2000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(1000);

		//comparing the credit value should be 0.03
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

		//comparing the balance after spinning should be deducted by 3 value
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

	@Then("^Existing Balance should get deducted by THREE, as bet type is selected as (\\d+)\\.(\\d+) and bet value as THREE, in Golden Hot slot game$")
	public void existing_Balance_should_get_deducted_by_THREE_as_bet_type_is_selected_as_and_bet_value_as_THREE_in_Golden_Hot_slot_game(int arg1, int arg2) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}

}
