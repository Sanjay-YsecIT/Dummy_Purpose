package stepDefinition_40SplendidHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FortySplendidHot_Web_Balance_Deduction_AccordingToBetType1_2 {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, FortySplendidHot game, bet type as (\\d+)\\.(\\d+), bet value as (\\d+)\\.(\\d+), balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_FortySplendidHot_game_bet_type_as_bet_value_as_balance_and_spin_button(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtUserName")).sendKeys("5273290266");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Password / Card Pin']")).sendKeys("mans@123");
		Thread.sleep(2000);

		driver.findElement(By.className("loginActive")).click();
		Thread.sleep(2000);
		System.out.println("Login to the game with valid credentials");
		
		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[31]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(4000);
	}

	@When("^Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), click on spin button and check the balance$")
	public void open_the_FortySplendidHot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_click_on_spin_button_and_check_the_balance(int arg1, int arg2) throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/40Splendid_Hot/spin.PNG", 10);
		//	Thread.sleep(15000);

		Pattern credit=new Pattern("./Images/40Splendid_Hot/credit_0.01.PNG");
		Pattern bet1=new Pattern("./Images/40Splendid_Hot/bet1.PNG");
		Pattern betval=new Pattern("./Images/40Splendid_Hot/betval1_2.PNG");
		Pattern spin=new Pattern("./Images/40Splendid_Hot/spin.PNG");
		Pattern Afterspin_bal=new Pattern("./Images/40Splendid_Hot/Reminingbal_299.20.PNG");

		//clicking on Bet VALUE
		screen.click(bet1);
		Thread.sleep(1000);
		screen.click(betval);
		Thread.sleep(1000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(3000);

		//comparing the credit value should be 0.01
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

		//comparing the balance after spinning should be deducted by 0.8 value
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

	@Then("^Balance should get deducted by (\\d+)\\.(\\d+) as bet type is selected as (\\d+)\\.(\\d+) in FortySplendidHot game$")
	public void balance_should_get_deducted_by_as_bet_type_is_selected_as_in_FortySplendidHot_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
