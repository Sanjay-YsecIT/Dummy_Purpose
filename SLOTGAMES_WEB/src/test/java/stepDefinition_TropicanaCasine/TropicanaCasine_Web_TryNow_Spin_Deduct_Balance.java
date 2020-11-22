package stepDefinition_TropicanaCasine;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TropicanaCasine_Web_TryNow_Spin_Deduct_Balance {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, try now button, balance to play and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_try_now_button_balance_to_play_and_spin_button() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[10]/div[2]/div[2]")).click();
		screen.wait("Images/Tropicana_Casine/TryNow_spin.PNG", 90);
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, click on try now button and click on spin button$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button_and_click_on_spin_button() throws Throwable {
		Pattern TryNow_bal=new Pattern("Images/Tropicana_Casine/TryNow_balance.PNG");
		Pattern BalAfterSpin=new Pattern("Images/Tropicana_Casine/TN_balance1_1.PNG");
		Pattern spin=new Pattern("Images/Tropicana_Casine/TryNow_spin.PNG");
		Thread.sleep(3000);
		
		// Balance before spin
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(TryNow_bal);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Balance should be 5000 in try now screen and comparision successfull");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance of 5000 is not available and comparision is not successful: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		screen.click(spin);
		Thread.sleep(6000);

		//Comparing the balance after spin
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(BalAfterSpin);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Balance should be 4999.80 in try now screen and comparision successfull");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance should be 4999.80 in try now screen and comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
	}

	@Then("^Amount should get deducted from balance on click on spin button in try now page of Tropicana Casine slot game$")
	public void amount_should_get_deducted_from_balance_on_click_on_spin_button_in_try_now_page_of_Tropicana_Casine_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
