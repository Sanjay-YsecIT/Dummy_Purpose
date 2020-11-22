package stepDefinition_CircusMania;

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

public class CircusMania_Web_InfoPage_Navigation {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, balance, info icon, navigation icon, exit icon, payout, paylines, wild, scatter, wheelspin, freespin, gamble and jackpot window$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_balance_info_icon_navigation_icon_exit_icon_payout_paylines_wild_scatter_wheelspin_freespin_gamble_and_jackpot_window() throws Throwable {
		this.driver = CircusMania_URL_Login.getDriver();
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button\\.$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_settings_and_info_icon_and_validate_the_forward_and_backward_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Circus_Mania/CircusMania.PNG", 30);

		Pattern info=new Pattern("Images/Circus_Mania/info.PNG");
		Pattern forward=new Pattern("Images/Circus_Mania/forward.PNG");
		Pattern backward=new Pattern("Images/Circus_Mania/backward.PNG");
		Pattern exit=new Pattern("Images/Circus_Mania/exit.PNG");
		Pattern payout=new Pattern("Images/Circus_Mania/payout.PNG");
		Pattern paylines=new Pattern("Images/Circus_Mania/paylines.PNG");
		Pattern wild=new Pattern("Images/Circus_Mania/wild.PNG");
		Pattern scatter=new Pattern("Images/Circus_Mania/scatter.PNG");
		Pattern freespin=new Pattern("Images/Circus_Mania/infofreespin.PNG");
		Pattern gamble=new Pattern("Images/Circus_Mania/infogamble.PNG");
		Pattern jackpot=new Pattern("Images/Circus_Mania/jackpot.PNG");
		Pattern gamewindow=new Pattern("Images/Circus_Mania/gamewindow.PNG");

		//	click on setting and info icon to move to info window
		screen.click(info);
		Thread.sleep(2000);

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
		Assert.assertTrue(score > 97);

		//	click on forward icon available on the info page to move to paylines window
		screen.click(forward);
		Thread.sleep(2000);

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
		Assert.assertTrue(score1 > 97);

		//	click on forward icon available on the info page to move to wild window
		screen.click(forward);
		Thread.sleep(2000);

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
		Assert.assertTrue(score2 > 97);

		//	click on forward icon available on the wild page to move to scatter window
		screen.click(forward);
		Thread.sleep(2000);

		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(scatter);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("infp page is at the scatter window");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);

		//	click on forward icon available on the info page to move to freespin window
		screen.click(forward);
		Thread.sleep(2000);

		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(freespin);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("info page is at the freespin window");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 97);

		//	click on forward icon available on the info page to move to gamble window
		screen.click(forward);
		Thread.sleep(2000);

		Finder finder41 =new Finder(screen.capture().getImage());
		String ht41 = finder41.find(gamble);
		double score41=20;                
		System.out.println("the value of ht"+" "+ht41);
		if(finder41.hasNext())
		{
			Match m41=finder41.next();
			System.out.println("Match Found with: "+(m41.getScore())*100+"%");
			score41=(m41.getScore())*100;
			System.out.println("info page is at the gamble window");
			finder41.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score41 +"%");
		Assert.assertTrue(score41 > 97);

		//	click on forward icon available on the info page to move to jackpot window
		screen.click(forward);
		Thread.sleep(2000);

		Finder finder51 =new Finder(screen.capture().getImage());
		String ht51 = finder51.find(jackpot);
		double score51=20;                
		System.out.println("the value of ht"+" "+ht51);
		if(finder51.hasNext())
		{
			Match m51=finder51.next();
			System.out.println("Match Found with: "+(m51.getScore())*100+"%");
			score51=(m51.getScore())*100;
			System.out.println("info page is at the jackpot window");
			finder51.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score51 +"%");
		Assert.assertTrue(score51 > 97);

		//	successful forward navigation is validated, from the above will move backward using backward navigation icon 
		//	click on backward icon available on the info page to move to gamble window
		screen.click(backward);
		Thread.sleep(2000);

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
		Assert.assertTrue(score6 > 97);

		// click on backward icon available on the info page to move to freespin window
		screen.click(backward);
		Thread.sleep(2000);

		Finder finder61 =new Finder(screen.capture().getImage());
		String ht61 = finder61.find(freespin);
		double score61=20;                
		System.out.println("the value of ht"+" "+ht61);
		if(finder61.hasNext())
		{
			Match m61=finder61.next();
			System.out.println("Match Found with: "+(m61.getScore())*100+"%");
			score61=(m61.getScore())*100;
			System.out.println("info page is at the freespin window");
			finder61.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score61 +"%");
		Assert.assertTrue(score61 > 97);

		//	click on backward icon available on the info page to move to scatter window
		screen.click(backward);
		Thread.sleep(1000);

		Finder finder8 =new Finder(screen.capture().getImage());
		String ht8 = finder8.find(scatter);
		double score8=20;                
		System.out.println("the value of ht"+" "+ht8);
		if(finder8.hasNext())
		{
			Match m8=finder8.next();
			System.out.println("Match Found with: "+(m8.getScore())*100+"%");
			score8=(m8.getScore())*100;
			System.out.println("info page is at scatter window");
			finder8.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score8 +"%");
		Assert.assertTrue(score8 > 97);

		//	click on backward icon available on the info page to move to wild window
		screen.click(backward);
		Thread.sleep(2000);		

		Finder finder7 =new Finder(screen.capture().getImage());
		String ht7 = finder7.find(wild);
		double score7=20;                
		System.out.println("the value of ht"+" "+ht7);
		if(finder7.hasNext())
		{
			Match m7=finder7.next();
			System.out.println("Match Found with: "+(m7.getScore())*100+"%");
			score7=(m7.getScore())*100;
			System.out.println("info page is at the wild window");
			finder7.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score7 +"%");
		Assert.assertTrue(score7 > 97);


		//	click on backward icon available on the info page to move to paylines window
		screen.click(backward);
		Thread.sleep(2000);

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
		Assert.assertTrue(score9 > 97);

		//	click on backward icon available on the info page to move to payout window
		screen.click(backward);
		Thread.sleep(2000);

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
		Assert.assertTrue(score10 > 97);

		// validation on exit button, once its clicked it has move to game window
		screen.click(exit);
		Thread.sleep(2000);

		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(gamewindow);
		double score11=20;                
		System.out.println("the value of ht"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("control is at the game window");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score10 +"%");
		Assert.assertTrue(score11 > 97);
	}

	@Then("^forward ,backward and exit button of info page should perform in Circus Mania slot game$")
	public void forward_backward_and_exit_button_of_info_page_should_perform_in_Circus_Mania_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
