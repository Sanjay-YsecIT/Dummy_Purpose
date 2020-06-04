package stepDefinition_SkinfiriMysterious;


//import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;

//import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriMysterious_Web_AutoSpin_AutoSpinOption {
	WebDriver driver;
	Screen screen=new Screen();
	//String user_dir="D:\\Github_downloads\\Dummy_Purpose\\SLOTGAMES_WEB";


	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, auto spin button, auto spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_number_of_spins_left_message() throws Throwable {
		this.driver =  SkinfiriMysterious_URL_Login.getDriver();
		


	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_the_player_instruction_message() throws Throwable {
	
		
//	//	new Screen();
//		Pattern image1=new Pattern("./mages/SKI_MYS/Auto_Spin.PNG");
//		screen.click(image1);
//		Thread.sleep(5000);
//		System.out.println("working till here on click");
		
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(4000);
		balT.sendKeys("300");
		Thread.sleep(4000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Skinfiri_Mysterious/Bet_place.PNG", 10);
	//	Thread.sleep(20000);
		



//		TakesScreenshot tsc=((TakesScreenshot)driver);
//		WebElement frame = driver.findElement(By.xpath("//*[@id='iframeSlotGame']"));
//		File sct = frame.getScreenshotAs(OutputType.FILE);
//		File DestSrc = new File("./ScreenShots/scrsht/game.png");
//		FileUtils.copyFile(sct, DestSrc);
		

		//String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\AutoSpins.PNG";
		//Screen screen=new Screen();
		//Pattern autoicon=new Pattern("E:/Sikuli Images/SkinfiriJungle/autospin.png");
	//	new Screen();
		Pattern autospin=new Pattern("./Images/Skinfiri_Mysterious/Autospin.PNG");
		//Pattern pat2=new Pattern("user_dir\\GoodLuck.PNG");
        //screen.click(autoicon);
		//Thread.sleep(2000);
		screen.click(autospin);
		Thread.sleep(1000);
		

		//comparing the good luck message after clicking on auto button
		Pattern credit1=new Pattern("./Images/Skinfiri_Mysterious/GoodLuck.PNG");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit1);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Good Luck message is displayed after clicking on auto button. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 95);
		
		

		Thread.sleep(1000);

		Pattern pat=new Pattern("./Images/Skinfiri_Mysterious/GoodLuck.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(pat);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Good Luck message is displayed after clicking on auto button. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score1 > 95);
		
	}


	@Then("^System should keep performing the spins in Skinfiri Mysterious slot game$")
	public void system_should_keep_performing_the_spins_in_Skinfiri_Mysterious_slot_game() throws Throwable {
		//Screen screen=new Screen();
		//new Screen();
		Pattern autospin_cancel=new Pattern("./Images/Skinfiri_Mysterious/Autospin.PNG");
		screen.click(autospin_cancel);

		Thread.sleep(3000);
		driver.quit();
	}

}
