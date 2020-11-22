package stepDefinition_TropicanaCasine;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TropicanaCasine_Web_Scatter_WheelSpin_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casine slot game, bet type, denomination, balance, scatter symbols, spin button, wheel spin banner, wheel spin screen and wheel spin win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casine_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_wheel_spin_banner_wheel_spin_screen_and_wheel_spin_win_amount() throws Throwable {
		this.driver = TropicanaCasine_URL_Login.getDriver();
	}

	@When("^Open the Tropicana Casine slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three or more than three scatter symbols appears on the screen wins and wheel spin activates and spin amount added to the win amount$")
	public void open_the_Tropicana_Casine_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_Three_or_more_than_three_scatter_symbols_appears_on_the_screen_wins_and_wheel_spin_activates_and_spin_amount_added_to_the_win_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Tropicana_Casine/TropicanaCasine.PNG", 30);

		Pattern spin=new Pattern("Images/Tropicana_Casine/spin.PNG");                         
		Pattern collect=new Pattern("Images/Tropicana_Casine/collect.PNG");            
		Pattern gamble=new Pattern("Images/Tropicana_Casine/gamble.PNG");
		Pattern take=new Pattern("Images/Tropicana_Casine/take.PNG");

		Pattern scsymb_1=new Pattern("Images/Tropicana_Casine/scsymb_1.PNG");
		Pattern scsymb_2=new Pattern("Images/Tropicana_Casine/scsymb_2.PNG");
		Pattern scsymb_3=new Pattern("Images/Tropicana_Casine/scsymb_3.PNG");

		// Congulation and Win window pop-up and free spin left 
		Pattern wheelspinbanner =new Pattern("Images/Tropicana_Casine/wheelspinbanner.PNG"); 
		Pattern wheelspinlogo =new Pattern("Images/Tropicana_Casine/wheelspinlogo.PNG");
		Pattern pointer =new Pattern("Images/Tropicana_Casine/pointer.PNG");
		Pattern wheelspin =new Pattern("Images/Tropicana_Casine/wheelspin.PNG");
		Pattern wheelspinamt1 =new Pattern("Images/Tropicana_Casine/wheelspinamt1.PNG"); 
		Pattern wheelspinamt2 =new Pattern("Images/Tropicana_Casine/wheelspinamt2.PNG"); 
		Pattern wheelspinamt3 =new Pattern("Images/Tropicana_Casine/wheelspinamt3.PNG"); 
		Pattern wheelspin_winbanner =new Pattern("Images/Tropicana_Casine/wheelspin_winbanner.PNG");
		Pattern bigwinbanner =new Pattern("Images/Tropicana_Casine/bigwinbanner.PNG");

		//Arranging the symbols to generate 3 Scatter
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(scsymb_1);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(2000);
		// free spin banner
		screen.wait(wheelspinbanner, 10);
		Thread.sleep(4000);

		// verify the wheelspin screen 
		Finder finder10 =new Finder(screen.capture().getImage());
		String ht10 = finder10.find(wheelspinlogo);
		double score10=20;                
		System.out.println("the value of ht"+" "+ht10);
		if(finder10.hasNext())
		{
			Match m10=finder10.next();
			System.out.println("Match Found with: "+(m10.getScore())*100+"%");
			score10=(m10.getScore())*100;
			System.out.println("Verify the wheelspin screen, as wheel spin is triggered from reel spin scatter win.");
			finder10.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score10 > 97);
		Thread.sleep(2000);

		//Click on the screen and verify wheel is not triggered 
		screen.click(pointer);
		Thread.sleep(1000);
		screen.click(wheelspinlogo);
		Thread.sleep(1000);

		//Wheel spin verification
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(wheelspin);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("After click on screen wheel spin is present on screen.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wheel spin comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);
		Thread.sleep(2000);

		//click on wheel spin
		screen.click(wheelspin);
		Thread.sleep(4000);

		//wheel spin win banner
		screen.exists(wheelspin_winbanner, 30);
		Thread.sleep(3000);

		//compare the win amount after the wheel spin
		screen.wait(wheelspinamt1, 30);
		Thread.sleep(4000);
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(wheelspinamt1);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);
		Thread.sleep(2000);

		//Redirect to gamble page and collect the amount from gamble page
		screen.click(gamble);
		Thread.sleep(3000);
		screen.click(collect);
		Thread.sleep(3000);

		//Arranging the symbols to generate 4 Scatter
		screen.click(scsymb_2);
		Thread.sleep(1000);
		screen.click(scsymb_2);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(3000);
		// free spin banner
		screen.wait(wheelspinbanner, 10);
		Thread.sleep(6000);

		//click on wheel spin
		screen.click(wheelspin);
		Thread.sleep(4000);

		//wheel spin win banner
		screen.exists(wheelspin_winbanner, 30);
		Thread.sleep(3000);

		//compare the win amount after the wheel spin
		screen.wait(wheelspinamt2, 30);
		Thread.sleep(4000);
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(wheelspinamt2);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(2000);

		screen.click(take);
		Thread.sleep(2000);

		//Arranging the symbols to generate 5 Scatter
		screen.click(scsymb_3);
		Thread.sleep(1000);
		screen.click(scsymb_3);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(3000);

		// bigwin and wheel spin banner
		screen.wait(bigwinbanner, 10);
		Thread.sleep(2000);
		screen.wait(wheelspinbanner, 10);
		Thread.sleep(6000);

		//click on wheel spin
		screen.click(wheelspin);
		Thread.sleep(4000);

		//wheel spin win banner
		screen.exists(wheelspin_winbanner, 30);
		Thread.sleep(3000);

		//compare the win amount after the wheel spin
		screen.wait(wheelspinamt3, 30);
		Thread.sleep(4000);
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(wheelspinamt3);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Compare the scatter win amount in win field.");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Scatter win amount comparision: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);
		Thread.sleep(2000);

		screen.click(take);
		Thread.sleep(2000);
	}

	@Then("^Wheel Spin screen should appear when Three or more scatter symbols appears on the screen in Tropicana Casine game$")
	public void wheel_Spin_screen_should_appear_when_Three_or_more_scatter_symbols_appears_on_the_screen_in_Tropicana_Casine_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
