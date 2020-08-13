package stepDefinition_AmazonClash;

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

public class AmazonClash_Web_Balance_Deduction_AccordingToBetType4_1 {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, bet type as (\\d+)\\.(\\d+), bet value as TEN, balance and spin buttone$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_bet_type_as_bet_value_as_TEN_balance_and_spin_buttone(int arg1, int arg2) throws Throwable {

		this.driver = AmazonClash_URL_Login.getDriver();

	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) & bet value as TEN, click on spin button and check the balance$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_bet_value_as_TEN_click_on_spin_button_and_check_the_balance(int arg1, int arg2) throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Amazon_Clash/Bet_place.PNG", 30);

		Pattern credit=new Pattern("Images/Amazon_Clash/credit_0.5.PNG");
		Pattern betval=new Pattern("Images/Amazon_Clash/betval4_1.PNG");
		Pattern bet=new Pattern("Images/Amazon_Clash/bet4.PNG");
		Pattern spin=new Pattern("Images/Amazon_Clash/spin.PNG");
		Pattern Afterspin_bal=new Pattern("Images/Amazon_Clash/Reminingbal_290.PNG");
		Pattern credit_inc=new Pattern("Images/Amazon_Clash/credit_inc.PNG");

		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(credit_inc);
		Thread.sleep(1000);
		screen.click(bet);
		Thread.sleep(1000);
		screen.click(betval);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(4000);

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

		//comparing the balance after spinning should be deducted by 10 value
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
		Assert.assertTrue(score1 > 97);
	}

	@Then("^Balance should get deducted by TEN as bet type is selected as (\\d+)\\.(\\d+) in Amazon Clash game$")
	public void balance_should_get_deducted_by_TEN_as_bet_type_is_selected_as_in_Amazon_Clash_game(int arg1, int arg2) throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
