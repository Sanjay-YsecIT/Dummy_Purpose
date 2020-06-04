package stepDefinition_AmazonClash;

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

public class AmazonClash_Web_InfoPage_Navigation {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, balance, settings, info icon, navigation icon, exit icon, payout, paylines, scatter, wild, gamble and jackpot window$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_balance_settings_info_icon_navigation_icon_exit_icon_payout_paylines_scatter_wild_gamble_and_jackpot_window() throws Throwable {

		this.driver = AmazonClash_URL_Login.getDriver();
	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button\\.$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_settings_and_info_icon_and_validate_the_forward_and_backward_button() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Amazon_Clash/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern settings=new Pattern("./Images/Amazon_Clash/settings_icon.PNG");
		Pattern info=new Pattern("./Images/Amazon_Clash/info_icon.PNG");
		Pattern forward=new Pattern("./Images/Amazon_Clash/forward.PNG");
		Pattern backward=new Pattern("./Images/Amazon_Clash/backward.PNG");
		Pattern exit=new Pattern("./Images/Amazon_Clash/exit.PNG");
		Pattern payout=new Pattern("./Images/Amazon_Clash/PO_info.PNG");
		Pattern payout1=new Pattern("./Images/Amazon_Clash/PO1_info.PNG");
		Pattern paylines=new Pattern("./Images/Amazon_Clash/paylines_info.PNG");
		Pattern wild=new Pattern("./Images/Amazon_Clash/wild_info.PNG");
		Pattern scatter=new Pattern("./Images/Amazon_Clash/scatter_info.PNG");
		Pattern gamble=new Pattern("./Images/Amazon_Clash/gamble_info.PNG");
		Pattern jackpot=new Pattern("./Images/Amazon_Clash/jackpot_info.PNG");
		Pattern game_window=new Pattern("./Images/Amazon_Clash/game_window.PNG");

		//	click on setting and info icon to move to info window
		screen.click(settings);
		Thread.sleep(1000);
		screen.click(info);
		Thread.sleep(1000);

		// validate for the info page is at payout window 
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(payout);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("info page is at the payout table window");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 95);


		//	click on forward icon available on the info page to move to payout1 window
		screen.click(forward);
		Thread.sleep(1000);
		
		// validate for the info page is at payout1 window 
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(payout1);
		double score12=20;                
		System.out.println("the value of ht"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score=(m12.getScore())*100;
			System.out.println("info page is at the payout1 table window");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 95);


		//	click on forward icon available on the info page to move to payline window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(paylines);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("info page is at the payline and rules window");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score1 +"%");
		//Assert.assertEquals(100.0,score );
		Assert.assertTrue(score1 > 95);


		//	click on forward icon available on the info page to move to wild window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(wild);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("info page is at the wild window");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);


		//	click on forward icon available on the info page to move to scatter window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(scatter);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("info page is at the scatter window");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 90);

		//	click on forward icon available on the info page to move to gamble window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(gamble);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("info page is at the gamble window");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 90);

		//	click on forward icon available on the info page to move to jackpot window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(jackpot);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("info page is at the jackpot window");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 90);

		//	successful forward navigation is validated, from the above will move backward using backward navigation icon 

		//	click on backward icon available on the info page to move to gamble window
		screen.click(backward);
		Thread.sleep(1000);

		Finder finder6 =new Finder(screen.capture().getImage());
		String ht6 = finder6.find(gamble);
		double score6=20;                
		System.out.println("the value of ht"+" "+ht6);
		if(finder6.hasNext())
		{
			Match m6=finder6.next();
			System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			score6=(m6.getScore())*100;
			System.out.println("info page is at the gamble window");
			finder6.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score6 +"%");
		Assert.assertTrue(score6 > 90);

		//	click on backward icon available on the info page to move to scatter window
		screen.click(backward);
		Thread.sleep(1000);		

		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(scatter);
		double score7=20;                
		System.out.println("the value of ht"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("info page is at the scatter window");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score7 +"%");
		Assert.assertTrue(score7 > 90);


		//	click on backward icon available on the info page to move to wild window
		screen.click(backward);
		Thread.sleep(1000);

		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(wild);
		double score8=20;                
		System.out.println("the value of ht"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("info page is at wild window");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score8 +"%");
		Assert.assertTrue(score8 > 75);


		//	click on backward icon available on the info page to move to paylines window
		screen.click(backward);
		Thread.sleep(1000);

		Finder finder9 =new Finder(screen.capture().getImage());
		String ht9 = finder9.find(paylines);
		double score9=20;                
		System.out.println("the value of ht"+" "+ht9);
		if(finder9.hasNext())
		{
			Match m9=finder9.next();
			System.out.println("Match Found with: "+(m9.getScore())*100+"%");
			score9=(m9.getScore())*100;
			System.out.println("info page is at payline and rules window");
			finder9.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score9 +"%");
		Assert.assertTrue(score9 > 75);

		//		click on backward icon available on the info page to move to payout1 window
		screen.click(backward);
		Thread.sleep(1000);

		Finder finder101 =new Finder(screen.capture().getImage());
		String ht101 = finder101.find(payout1);
		double score101=20;                
		System.out.println("the value of ht"+" "+ht101);
		if(finder101.hasNext())
		{
			Match m101=finder101.next();
			System.out.println("Match Found with: "+(m101.getScore())*100+"%");
			score101=(m101.getScore())*100;
			System.out.println("info page is at payout1  window");
			finder101.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score101 +"%");
		Assert.assertTrue(score101 > 75);

		//	click on backward icon available on the info page to move to payout window
		screen.click(backward);
		Thread.sleep(1000);

		Finder finder10 =new Finder(screen.capture().getImage());
		String ht10 = finder10.find(payout);
		double score10=20;                
		System.out.println("the value of ht"+" "+ht10);
		if(finder10.hasNext())
		{
			Match m10=finder10.next();
			System.out.println("Match Found with: "+(m10.getScore())*100+"%");
			score10=(m10.getScore())*100;
			System.out.println("info page is at payout window");
			finder10.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score10 > 75);



		// validation on exit button, once its clicked it has move to game window
		screen.click(exit);
		Thread.sleep(1000);

		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(game_window);
		double score11=20;                
		System.out.println("the value of ht"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("control is at game window");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score11 > 75);
	}

	@Then("^forward ,backward and exit button of info page should perform in Amazon Clash slot game$")
	public void forward_backward_and_exit_button_of_info_page_should_perform_in_Amazon_Clash_slot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
