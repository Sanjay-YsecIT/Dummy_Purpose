package stepDefinition_SapphireHeart;

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

public class SapphireHeart_Web_InfoPage_Navigation {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, settings, info icon, navigation icon, exit icon, payout, paylines, scatter, free spin,  wild, gamble and jackpot window$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_balance_settings_info_icon_navigation_icon_exit_icon_payout_paylines_scatter_free_spin_wild_gamble_and_jackpot_window() throws Throwable {

		this.driver = SapphireHeart_URL_Login.getDriver();
	}

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button\\.$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_settings_and_info_icon_and_validate_the_forward_and_backward_button() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Sapphire_Heart/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern settings=new Pattern("./Images/Sapphire_Heart/settings_icon.PNG");
		Pattern info=new Pattern("./Images/Sapphire_Heart/info_icon.PNG");
		Pattern forward=new Pattern("./Images/Sapphire_Heart/fwd_navigation.PNG");
		Pattern backward=new Pattern("./Images/Sapphire_Heart/bckwrd_navigation.PNG");
		Pattern exit=new Pattern("./Images/Sapphire_Heart/exit.PNG");
		Pattern payout=new Pattern("./Images/Sapphire_Heart/PO_info.PNG");
		Pattern paylines=new Pattern("./Images/Sapphire_Heart/paylines_info.PNG");
		Pattern paylines1=new Pattern("./Images/Sapphire_Heart/paylines1_info.PNG");
		Pattern FreeSpin=new Pattern("./Images/Sapphire_Heart/FreeSpin_info.PNG");
		Pattern gamble=new Pattern("./Images/Sapphire_Heart/gamble_info.PNG");
		Pattern jackpot=new Pattern("./Images/Sapphire_Heart/jackpot_info.PNG");
		Pattern game_window=new Pattern("./Images/Sapphire_Heart/game_window.PNG");

		//	click on setting and info icon to move to info window
		screen.click(settings);
		Thread.sleep(1000);
		screen.click(info);
		Thread.sleep(1000);

		//		validate for the info page is at payout window 
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


		//		click on forward icon available on the info page to move to paylines1 window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(paylines1);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("info page is at the paylines1 window");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 90);


		//	click on forward icon available on the info page to move to freespin window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(FreeSpin);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("info page is at the FreeSpin window");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);

		//		click on forward icon available on the info page to move to FreeSpin window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(FreeSpin);
		double score22=20;                
		System.out.println("the value of ht"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("info page is at the FreeSpin window");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 90);


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



		//		click on forward icon available on the info page to move to FreeSpin window
		screen.click(forward);
		Thread.sleep(1000);

		Finder finder23 =new Finder(screen.capture().getImage());
		String ht23 = finder23.find(FreeSpin);
		double score23=20;                
		System.out.println("the value of ht"+" "+ht23);
		if(finder23.hasNext())
		{
			Match m23=finder23.next();
			System.out.println("Match Found with: "+(m23.getScore())*100+"%");
			score23=(m23.getScore())*100;
			System.out.println("info page is at the FreeSpin window");
			finder23.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score23 +"%");
		Assert.assertTrue(score23 > 90);


		//	click on backward icon available on the info page to move to paylines1 window
		screen.click(backward);
		Thread.sleep(1000);

		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(paylines1);
		double score8=20;                
		System.out.println("the value of ht"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("info page is at paylines1 window");
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
			System.out.println("info page is at payline and rules window");
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

	@Then("^forward ,backward and exit button of info page should perform in Sapphire Heart slot game$")
	public void forward_backward_and_exit_button_of_info_page_should_perform_in_Sapphire_Heart_slot_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
