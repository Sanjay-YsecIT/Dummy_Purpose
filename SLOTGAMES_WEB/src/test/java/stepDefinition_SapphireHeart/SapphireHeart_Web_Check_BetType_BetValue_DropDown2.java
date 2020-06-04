package stepDefinition_SapphireHeart;

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

public class SapphireHeart_Web_Check_BetType_BetValue_DropDown2 {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart game, bet type as (\\d+)\\.(\\d+) and bet value as (\\d+),(\\d+),(\\d+),(\\d+),(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_game_bet_type_as_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
	    
		this.driver = SapphireHeart_URL_Login.getDriver();
	}

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) and check the bet value should be (\\d+),(\\d+),(\\d+),(\\d+),(\\d+)$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
	    
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Sapphire_Heart/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern credit=new Pattern("./Images/Sapphire_Heart/credit_0.04.PNG");
		Pattern bet_val=new Pattern("./Images/Sapphire_Heart/betvalues_0.04.PNG");
		Pattern credit_inc = new Pattern("./Images/Sapphire_Heart/credit_inc.PNG");

		screen.click(credit_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.04
		// Pattern credit1=new Pattern("E:/Sikuli Images/Bet Values/creditvalue1.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully and value is 0.04. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);


		//comparing the available denomination values
		// Pattern pat=new Pattern("E:/Sikuli Images/Bet Values/dropdown1.png");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(bet_val);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Comparision happened successfully. Available denominations are: 4, 8, 12, 16 and 20. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 95);
	}

	@Then("^Bet value should get changed (\\d+),(\\d+),(\\d+),(\\d+),(\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down two in Sapphire Heart slot game$")
	public void bet_value_should_get_changed_if_the_bet_type_selected_as_from_the_drop_down_two_in_Sapphire_Heart_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
	   
		Thread.sleep(3000);
		driver.quit();
	}
}
