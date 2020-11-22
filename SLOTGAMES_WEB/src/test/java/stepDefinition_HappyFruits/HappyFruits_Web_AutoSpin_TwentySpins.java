package stepDefinition_HappyFruits;

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

public class HappyFruits_Web_AutoSpin_TwentySpins {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_game_balance_spin_button_auto_spin_button_twenty_spins_option_and_number_of_spins_left_message() throws Throwable {
		this.driver = HappyFruits_URL_Login.getDriver();
	}

	@When("^Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_twenty_spin_option_under_auto_spin_drop_down_and_check_the_number_of_spins_left_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Happy_Fruits/HappyFruits.PNG", 30);
		
		Pattern autoplay=new Pattern("Images/Happy_Fruits/autoplay.PNG");
		Pattern auto_20=new Pattern("Images/Happy_Fruits/auto_20.PNG");  

		Pattern pat2=new Pattern("Images/Happy_Fruits/19spins.PNG"); 
		Pattern pat3=new Pattern("Images/Happy_Fruits/17spins.PNG"); 
		Pattern pat4=new Pattern("Images/Happy_Fruits/15spins.PNG"); 
		Pattern pat5=new Pattern("Images/Happy_Fruits/13spins.PNG"); 
		Pattern pat6=new Pattern("Images/Happy_Fruits/11spins.PNG"); 
		Pattern pat7=new Pattern("Images/Happy_Fruits/9spins.PNG");  
		Pattern pat8=new Pattern("Images/Happy_Fruits/7spins.PNG");  
		Pattern pat10=new Pattern("Images/Happy_Fruits/2spins.PNG"); 
		Pattern pat11=new Pattern("Images/Happy_Fruits/0spins.PNG");  

		//selecting 20 spins by clicking auto spin icon
		screen.click(autoplay);
		Thread.sleep(1000);
		screen.click(auto_20);
		Thread.sleep(1000);

		//comparing the number of 19spins left message
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
			System.out.println("19 Spins left. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 90);
		Thread.sleep(6000);

		//comparing the number of 17spins left message
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
			System.out.println("17 Spins left. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 90);
		Thread.sleep(6000);

		//comparing the number of 15spins left message
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
			System.out.println("15 Spins left. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);
		Thread.sleep(6000);

		//comparing the number of 13spins left message
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
			System.out.println("13 Spins left. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 90);
		Thread.sleep(6000);

		//comparing the number of 11spins left message
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
			System.out.println("11 Spins left. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 90);
		Thread.sleep(6000);

		//comparing the number of 9spins left message
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
			System.out.println("9 Spins left. Test case passed");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 90);
		Thread.sleep(6000);

		//comparing the number of 7spins left message
		screen.wait(pat8, 5);
		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(pat8);
		double score8=20;                
		System.out.println("the value of ht"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("7 Spins left. Test case passed");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score8 +"%");
		Assert.assertTrue(score8 > 90);
		Thread.sleep(16000);

		//comparing the number of 2spins left message
		screen.wait(pat10, 10);
		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(pat10);
		double score6=20;                
		System.out.println("the value of ht"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("2 Spins left. Test case passed");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score6 +"%");
		Assert.assertTrue(score6 > 90);
		Thread.sleep(6000);

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
			System.out.println("Last Spins left. Test case passed");
			finder9.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score9 +"%");
		Assert.assertTrue(score9 > 90);
	}

	@Then("^Number of spin left should start from (\\d+) to (\\d+) after clicking twenty spins option and should perform (\\d+) spins from (\\d+) to (\\d+) in Happy Fruits slot game$")
	public void number_of_spin_left_should_start_from_to_after_clicking_twenty_spins_option_and_should_perform_spins_from_to_in_Happy_Fruits_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
