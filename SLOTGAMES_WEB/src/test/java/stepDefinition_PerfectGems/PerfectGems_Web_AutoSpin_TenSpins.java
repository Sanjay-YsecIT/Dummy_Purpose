package stepDefinition_PerfectGems;

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

public class PerfectGems_Web_AutoSpin_TenSpins {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_balance_spin_button_auto_spin_button_ten_spins_option_and_number_of_spins_left_message() throws Throwable {
		this.driver = PerfectGems_URL_Login.getDriver();
	}

	@When("^Open the Perfect Gems  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_ten_spin_option_under_auto_spin_drop_down_and_check_the_number_of_spins_left_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Perfect_Gems/PerfectGems.PNG", 30);
		
		Pattern autoplay=new Pattern("Images/Perfect_Gems/autoplay.PNG");
		Pattern auto_10=new Pattern("Images/Perfect_Gems/auto_10.PNG");
		Pattern auto_list=new Pattern("Images/Perfect_Gems/auto_list.PNG");

		Pattern pat2=new Pattern("Images/Perfect_Gems/9spins.PNG");
		Pattern pat3=new Pattern("Images/Perfect_Gems/8spins.PNG");
		Pattern pat4=new Pattern("Images/Perfect_Gems/7spins.PNG");
		Pattern pat5=new Pattern("Images/Perfect_Gems/6spins.PNG");
		Pattern pat6=new Pattern("Images/Perfect_Gems/5spins.PNG");
		Pattern pat7=new Pattern("Images/Perfect_Gems/4spins.PNG");
		Pattern pat8=new Pattern("Images/Perfect_Gems/3spins.PNG");
		Pattern pat9=new Pattern("Images/Perfect_Gems/2spins.PNG");
		Pattern pat10=new Pattern("Images/Perfect_Gems/1spins.PNG");
		Pattern pat11=new Pattern("Images/Perfect_Gems/0spins.PNG");

		screen.click(autoplay);
		Thread.sleep(1000);

		// verify the autolist font, alignment and color of the text
		Finder finder10 =new Finder(screen.capture().getImage());
		String ht10 = finder10.find(auto_list);
		double score10=20;                
		System.out.println("the value of ht"+" "+ht10);
		if(finder10.hasNext())
		{
			Match m10=finder10.next();
			System.out.println("Match Found with: "+(m10.getScore())*100+"%");
			score10=(m10.getScore())*100;
			System.out.println("autolist font text and color are verified. Test case passed");
			finder10.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score10 > 97);
		Thread.sleep(2000);

		//selecting 10 spins by clicking auto spin icon
		screen.click(auto_10);
		Thread.sleep(1000);

		//comparing the number of 9spins left message
		screen.wait(pat2, 10);
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(pat2);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("9 Spins left. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 96);
		Thread.sleep(4000);

		//comparing the number of 8spins left message
		screen.wait(pat3, 10);
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(pat3);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("8 Spins left. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 96);
		Thread.sleep(5000);

		//comparing the number of 7spins left message
		screen.wait(pat4, 10);
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(pat4);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("7 Spins left. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);
		Thread.sleep(5000);

		//comparing the number of 6spins left message
		screen.wait(pat5, 10);
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(pat5);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("6 Spins left. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);
		Thread.sleep(000);

		//comparing the number of 5spins left message
		screen.wait(pat6, 10);
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(pat6);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("5 Spins left. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 97);
		Thread.sleep(5000);

		//comparing the number of 4spins left message
		screen.wait(pat7, 10);
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(pat7);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("4 Spins left. Test case passed");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 97);
		Thread.sleep(5000);

		//comparing the number of 3spins left message
		screen.wait(pat8, 10);
		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(pat8);
		double score6=20;                
		System.out.println("the value of ht"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("3 Spins left. Test case passed");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score6 +"%");
		Assert.assertTrue(score6 > 97);
		Thread.sleep(5000);

		//comparing the number of 2spins left message
		screen.wait(pat9, 10);
		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(pat9);
		double score7=20;                
		System.out.println("the value of ht"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("2 Spins left. Test case passed");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score7 +"%");
		Assert.assertTrue(score7 > 97);
		Thread.sleep(5000);

		//comparing the number of 1spins left message
		screen.wait(pat10, 10);
		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(pat10);
		double score8=20;                
		System.out.println("the value of ht"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("1 Spin left. Test case passed");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score8 +"%");
		Assert.assertTrue(score8 > 97);
		Thread.sleep(5000);

		//comparing the number of Last spins left message
		screen.wait(pat11, 10);
		Finder finder9 =new Finder(screen.capture().getImage());
		String ht9 = finder9.find(pat11);
		double score9=20;                
		System.out.println("the value of ht"+" "+ht9);
		if(finder9.hasNext())
		{
			Match m9=finder9.next();
			System.out.println("Match Found with: "+(m9.getScore())*100+"%");
			score9=(m9.getScore())*100;
			System.out.println("Last Spin left. Test case passed");
			finder9.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score9 +"%");
		Assert.assertTrue(score9 > 97);
	}

	@Then("^Number of spin left should start from (\\d+) to (\\d+) after clicking ten spins option and should perform (\\d+) spins from (\\d+) to (\\d+) Perfect Gems slot game$")
	public void number_of_spin_left_should_start_from_to_after_clicking_ten_spins_option_and_should_perform_spins_from_to_Perfect_Gems_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
