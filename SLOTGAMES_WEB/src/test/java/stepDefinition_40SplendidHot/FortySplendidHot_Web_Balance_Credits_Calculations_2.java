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

public class FortySplendidHot_Web_Balance_Credits_Calculations_2 {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, credits, denomination drop down and denomination as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_FortySplendidHot_slot_game_balance_credits_denomination_drop_down_and_denomination_as(int arg1, int arg2) throws Throwable {
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
		
		WebElement sub = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[32]/div[1]/div[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(4000);
	}

	@When("^Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by (\\d+)\\.(\\d+) and check the balance$")
	public void open_the_FortySplendidHot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_select_the_denomination_from_drop_down_multiply_credit_by_and_check_the_balance(int arg1, int arg2) throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/40Splendid_Hot/spin.PNG", 30);
		//	Thread.sleep(15000);

		// images from the slot games
		Pattern Ysi_bal=new Pattern("Images/40Splendid_Hot/bal_300.PNG");
		Pattern creditValue=new Pattern("Images/40Splendid_Hot/credit_0.02.PNG");
		Pattern Credit_bal=new Pattern("Images/40Splendid_Hot/cr_bal_15000.PNG");
		Pattern new_Ysi_bal=new Pattern("Images/40Splendid_Hot/bal_300.PNG");
		Pattern credit_inc=new Pattern("Images/40Splendid_Hot/credit_inc.PNG");

		screen.click(credit_inc);
		Thread.sleep(2000);

		//comparing the balance before converting into credits
		// Pattern credit1=new Pattern("E:/Sikuli Images/credits/balance1.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Ysi_bal);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Balance before converting into credits is 300");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance before converting into credits comparision is equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//comparing the credit value
		// Pattern cred=new Pattern("E:/Sikuli Images/credits/creditvalue1.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(creditValue);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Credit value comparision successful. Its 0.02");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit value comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		// Clicking on amount to convert credits into amount
		screen.click(Ysi_bal);
		Thread.sleep(1000);

		//comparing the balance in credit
		//   Pattern winA=new Pattern("E:/Sikuli Images/credits/credit1.PNG");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(Credit_bal);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Balance in credits is 15000.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in credits comparision after spin: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(2000);

		// Clicking on credit button to convert credits into amount
		screen.click(Credit_bal);
		Thread.sleep(2000);

		//comparing the credits in currency
		//  Pattern symbol=new Pattern("E:/Sikuli Images/credits/balance1.PNG");
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(new_Ysi_bal);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Balance after converting credit into currency is 300.00. Test case passed.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Balance in currency comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);
	}

	@Then("^Balance amount should be same as denomination (\\d+)\\.(\\d+) multiplies by credit in FortySplendidHot game$")
	public void balance_amount_should_be_same_as_denomination_multiplies_by_credit_in_FortySplendidHot_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
