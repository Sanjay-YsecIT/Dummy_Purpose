package stepDefinition_BrownieHot;

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

public class BrownieHot_Web_Gamble_Validations_ButtonsBehavior {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, spin, gamble link, gamble page, HUD buttons$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_spin_gamble_link_gamble_page_HUD_buttons() throws Throwable {
		this.driver = BrownieHot_URL_Login.getDriver();
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, spin the reels and access to gamble and click on HUD buttons present on the screen$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Brownie_Hot_slot_game_spin_the_reels_and_access_to_gamble_and_click_on_HUD_buttons_present_on_the_screen() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Brownie_Hot/placebet.PNG", 30);

		Pattern disable_paylineleft=new Pattern("Images/Brownie_Hot/disable_paylineleft.PNG");
		Pattern disable_paylineright=new Pattern("Images/Brownie_Hot/disable_paylineright.PNG");
		Pattern disable_maximum=new Pattern("Images/Brownie_Hot/disable_maximum.PNG");
		Pattern auto_home=new Pattern("Images/Brownie_Hot/auto_home.PNG");
		Pattern auto_info=new Pattern("Images/Brownie_Hot/auto_info.PNG");
		Pattern spin=new Pattern("Images/Brownie_Hot/spin.PNG");            
		Pattern gamble=new Pattern("Images/Brownie_Hot/gamble.PNG"); 

		Pattern symb_1_1=new Pattern("Images/Brownie_Hot/symb_1_1.PNG");
		Pattern symb_1_2=new Pattern("Images/Brownie_Hot/symb_1_2.PNG");

		// WIN PATTERN COMBINATION 
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_2);
		Thread.sleep(1000);
		screen.click(symb_1_2);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(8000);
		screen.click(gamble);
		Thread.sleep(3000);

		//comparing home disabled button and not clickable
		screen.click(auto_home);
		Thread.sleep(1000);
		screen.click(auto_home);
		Thread.sleep(1000);

		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(auto_home);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Testcase2: Disabled home is visible and not clickable during gamble. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase2 Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 90);

		//comparing info disabled button and not clickable
		screen.click(auto_info);
		Thread.sleep(1000);
		screen.click(auto_info);
		Thread.sleep(1000);

		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(auto_home);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Testcase3: Disabled info is visible and not clickable during gamble. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase3 Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 90);

		//comparing maximum disabled button and not clickable
		screen.click(disable_maximum);
		Thread.sleep(1000);
		screen.click(disable_maximum);
		Thread.sleep(1000);

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(disable_maximum);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Testcase4: Disabled maximum button is visible and not clickable during gamble. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase4 Comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		//comparing left payline disabled button and not clickable
		screen.click(disable_paylineleft);
		Thread.sleep(1000);
		screen.click(disable_paylineleft);
		Thread.sleep(1000);

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(disable_paylineleft);
		double score3=20;                
		System.out.println("the value of ht2"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Testcase5: Disabled payine button is visible and not clickable during gamble. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase5 Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);

		//comparing right payline disabled button and not clickable
		screen.click(disable_paylineright);
		Thread.sleep(1000);
		screen.click(disable_paylineright);
		Thread.sleep(1000);

		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(disable_paylineright);
		double score4=20;                
		System.out.println("the value of ht4"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Testcase6: Disabled payine button is visible and not clickable during gamble. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Testcase6 Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);
	}

	@Then("^All HUD buttons should be inactive upon click shoudn't perform any action in Brownie Hot game$")
	public void all_HUD_buttons_should_be_inactive_upon_click_shoudn_t_perform_any_action_in_Brownie_Hot_game() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
}
