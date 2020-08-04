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

public class FortySplendidHot_Web_TransferAmount_Verify {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Splendid Hot slot game, try now button and balance to play$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_slot_game_try_now_button_and_balance_to_play(int arg1) throws Throwable {
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

	@When("^Open the (\\d+) Splendid Hot slot game by entering the valid URL in browser, click on try now button$")
	public void open_the_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button(int arg1) throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);

		//	images before and after transfer
		Pattern Beforetransfer=new Pattern("Images/40Splendid_Hot/beforetransfer_300.PNG");
		Pattern Aftertransfer=new Pattern("Images/40Splendid_Hot/aftertransfer_300.PNG");

		//Comparing the amount which is transferring to the slot game
		// Pattern credit1=new Pattern("E:/Sikuli Images/others/beforetransfer.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(Beforetransfer);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Transfering the amount to the slot game and transfer is successfull.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Transfering the amount to the slot game and comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 90);

		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/40Splendid_Hot/spin.PNG", 30);
		//	Thread.sleep(15000); 

		//Comparing the same amount is displayed on the slot game balance after loading
		// Pattern winA=new Pattern("E:/Sikuli Images/others/aftertransfer.PNG");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(Aftertransfer);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Same amount is displayed on the balance section and comparision successfull.");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Same amount is displayed on the balance section and comparision value is equal to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);
	}

	@Then("^System should provide five thousand as balance on click on try now button in (\\d+) Splendid Hot slot game$")
	public void system_should_provide_five_thousand_as_balance_on_click_on_try_now_button_in_Splendid_Hot_slot_game(int arg1) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
