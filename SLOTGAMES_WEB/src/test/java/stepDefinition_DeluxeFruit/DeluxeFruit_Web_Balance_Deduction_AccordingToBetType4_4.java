package stepDefinition_DeluxeFruit;

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

public class DeluxeFruit_Web_Balance_Deduction_AccordingToBetType4_4 {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruit slot game, bet type as (\\d+)\\.(\\d+), bet value as hundred, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruit_slot_game_bet_type_as_bet_value_as_hundred_balance_and_spin_button(int arg1, int arg2) throws Throwable {
	   
		this.driver = DeluxeFruit_URL_Login.getDriver();
	}

	@When("^Open the Deluxe Fruit slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) & bet value as hundred, click on spin button and check the balance$")
	public void open_the_Deluxe_Fruit_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_bet_value_as_hundred_click_on_spin_button_and_check_the_balance(int arg1, int arg2) throws Throwable {
	  
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Deluxe_Fruit/Bet_place.PNG", 10);
		//	Thread.sleep(15000);
		
		Pattern credit=new Pattern("./Images/Deluxe_Fruit/credit_0.5.PNG");
		Pattern bet4 = new Pattern("./Images/Deluxe_Fruit/bet4");
		Pattern betval=new Pattern("./Images/Deluxe_Fruit/betval4_4.PNG");
		Pattern spin=new Pattern("./Images/Deluxe_Fruit/spin.PNG");
		Pattern Afterspin_bal=new Pattern("./Images/Deluxe_Fruit/Reminingbal_200.PNG");
		Pattern credit_inc=new Pattern("./Images/Deluxe_Fruit/credit_inc.PNG");

		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);
		screen.click(credit_inc);
		Thread.sleep(3000);
		//clicking on Bet VALUE
		screen.click(bet4);
		Thread.sleep(3000);
		screen.click(betval);
		Thread.sleep(3000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(4000);

		//comparing the credit value should be 0.5
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


		//comparing the balance after spinning should be deducted by 100 value
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

	@Then("^Balance should get deducted by hundred, as bet type is selected as (\\d+)\\.(\\d+) in Deluxe Fruit game$")
	public void balance_should_get_deducted_by_hundred_as_bet_type_is_selected_as_in_Deluxe_Fruit_game(int arg1, int arg2) throws Throwable {
	    
		Thread.sleep(3000);
		driver.quit();
	}
}
