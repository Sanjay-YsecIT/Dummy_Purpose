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

public class AmazonClash_Web_PayOut_BetType_4_And_Denomination_All {

	WebDriver driver;
	Screen screen = new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, icon to open payout table, all symbols, max amount on each symbol like blue diamond, heart n etc, back button, bet type (\\d+)\\.(\\d+) and denomination values like (\\d+), (\\d+), (\\d+), (\\d+) & (\\d+) on web$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_blue_diamond_heart_n_etc_back_button_bet_type_and_denomination_values_like_on_web(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
	    
		this.driver = AmazonClash_URL_Login.getDriver();
	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like blue diamond, heart n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values like (\\d+), (\\d+), (\\d+), (\\d+) & (\\d+) and check payout amount on web$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_blue_diamond_heart_n_etc_click_on_back_button_select_bet_type_as_denomination_values_like_and_check_payout_amount_on_web(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
	   
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Amazon_Clash/Bet_place.PNG", 10);
		//	Thread.sleep(15000);
		
		
		Pattern credit1=new Pattern("./Images/Amazon_Clash/credit_0.5.PNG");
		Pattern settings=new Pattern("./Images/Amazon_Clash/settings_icon.PNG");
		Pattern info=new Pattern("./Images/Amazon_Clash/info_icon.PNG");
		Pattern forward = new Pattern("./Images/Amazon_Clash/forward.PNG");
		Pattern backward = new Pattern("./Images/Amazon_Clash/backward.PNG");
		Pattern exit = new Pattern("./Images/Amazon_Clash/exit.PNG");

		Pattern deno1=new Pattern("./Images/Amazon_Clash/betval4_1.PNG");
		Pattern deno2=new Pattern("./Images/Amazon_Clash/betval4_2.PNG");
		Pattern deno3=new Pattern("./Images/Amazon_Clash/betval4_3.PNG");
		Pattern deno4=new Pattern("./Images/Amazon_Clash/betval4_4.PNG");
		Pattern deno5=new Pattern("./Images/Amazon_Clash/betval4_5.PNG");

		Pattern pat1=new Pattern("./Images/Amazon_Clash/PO4_1.PNG");
		Pattern pat11=new Pattern("./Images/Amazon_Clash/PO4_11.PNG");
		Pattern pat2=new Pattern("./Images/Amazon_Clash/PO4_2.PNG");
		Pattern pat22=new Pattern("./Images/Amazon_Clash/PO4_22.PNG");
		Pattern pat3=new Pattern("./Images/Amazon_Clash/PO4_3.PNG");
		Pattern pat33=new Pattern("./Images/Amazon_Clash/PO4_33.PNG");
		Pattern pat4=new Pattern("./Images/Amazon_Clash/PO4_4.PNG");
		Pattern pat44=new Pattern("./Images/Amazon_Clash/PO4_44.PNG");
		Pattern pat5=new Pattern("./Images/Amazon_Clash/PO4_5.PNG");
		Pattern pat55=new Pattern("./Images/Amazon_Clash/PO4_55.PNG");

		//comparing the credit value should be 0.5
		// Pattern credit1=new Pattern("E:/Sikuli Images/payout/creditvalue1.png");
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit1);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Comparing the credit value should be 0.5. Test case passed");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);


		//Clicking on settings link and navigating to payout screen
		screen.click(settings);
		Thread.sleep(2000);
		screen.click(info);
		Thread.sleep(2000);


		//Selecting the denomination as 0.5
		screen.click(deno1);
		Thread.sleep(2000);

		//Comparing the max payout1 value for denomination 10
		//   Pattern pat1=new Pattern("E:/Sikuli Images/payout/payout1_1.png");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(pat1);
		double score1=20;                
		System.out.println("the value of ht"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Comparing the max payout value for 10 denomination. Test case passed");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 10 denomination and comparision value equals to: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 95);
		Thread.sleep(2000);

		// click on forward button to move to next payout table and validate	
		screen.click(forward);
		Thread.sleep(2000);

		//Comparing the max payout2 value for denomination 10
		//   Pattern pat1=new Pattern("E:/Sikuli Images/payout/payout1_1.png");
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(pat11);
		double score11=20;                
		System.out.println("the value of ht"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Comparing the max payout value for 10 denomination. Test case passed");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 10 denomination and comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 95);
		Thread.sleep(2000);

		// click on backward button to move to previous payout table and validate	
		screen.click(backward);
		Thread.sleep(2000);


		//Selecting the denomination as 20
		screen.click(deno2);
		Thread.sleep(2000);

		//Comparing the max payout1 value for denomination 20
		//   Pattern pat2=new Pattern("E:/Sikuli Images/payout/payout1_2.png");
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(pat2);
		double score2=20;                
		System.out.println("the value of ht"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Comparing the max payout value for 20 denomination. Test case passed");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 20 denomination and comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 95);
		Thread.sleep(2000);

		// click on forward button to move to next payout table and validate	
		screen.click(forward);
		Thread.sleep(2000);

		//Comparing the max payout2 value for denomination 20
		//   Pattern pat2=new Pattern("E:/Sikuli Images/payout/payout1_2.png");
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(pat22);
		double score22=20;                
		System.out.println("the value of ht"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("Comparing the max payout value for 20 denomination. Test case passed");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 20 denomination and comparision value equals to: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 95);
		Thread.sleep(2000);

		// click on backward button to move to previous payout table and validate	
		screen.click(backward);
		Thread.sleep(2000);


		//Selecting the denomination as 50
		screen.click(deno3);
		Thread.sleep(2000);


		//Comparing the max payout1 value for denomination 50
		//  Pattern pat3=new Pattern("E:/Sikuli Images/payout/payout1_3.png");
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(pat3);
		double score3=20;                
		System.out.println("the value of ht"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Comparing the max payout value for 50 denomination. Test case passed");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 50 denomination and comparision value equals to: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 95);
		Thread.sleep(2000);

		// click on forward button to move to next payout table and validate	
		screen.click(forward);
		Thread.sleep(2000);

		//Comparing the max payout2 value for denomination 50
		//  Pattern pat3=new Pattern("E:/Sikuli Images/payout/payout1_3.png");
		Finder finder33 =new Finder(screen.capture().getImage());
		String ht33 = finder33.find(pat33);
		double score33=20;                
		System.out.println("the value of ht"+" "+ht33);
		if(finder33.hasNext())
		{
			Match m33=finder33.next();
			System.out.println("Match Found with: "+(m33.getScore())*100+"%");
			score33=(m33.getScore())*100;
			System.out.println("Comparing the max payout value for 50 denomination. Test case passed");
			finder33.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 50 denomination and comparision value equals to: "+" "+score33 +"%");
		Assert.assertTrue(score33 > 95);
		Thread.sleep(2000);

		// click on backward button to move to previous payout table and validate	
		screen.click(backward);
		Thread.sleep(2000);


		//Selecting the denomination as 100
		screen.click(deno4);
		Thread.sleep(2000);

		//Comparing the max payout1 value for denomination 100
		//   Pattern pat4=new Pattern("E:/Sikuli Images/payout/payout1_4.png");
		Finder finder4 =new Finder(screen.capture().getImage());
		String ht4 = finder4.find(pat4);
		double score4=20;                
		System.out.println("the value of ht"+" "+ht4);
		if(finder4.hasNext())
		{
			Match m4=finder4.next();
			System.out.println("Match Found with: "+(m4.getScore())*100+"%");
			score4=(m4.getScore())*100;
			System.out.println("Comparing the max payout value for 100 denomination. Test case passed");
			finder4.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 100 denomination and comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 95);
		Thread.sleep(2000);


		// click on forward button to move to next payout table and validate	
		screen.click(forward);
		Thread.sleep(2000);

		//Comparing the max payout2 value for denomination 100
		//   Pattern pat4=new Pattern("E:/Sikuli Images/payout/payout1_4.png");
		Finder finder44 =new Finder(screen.capture().getImage());
		String ht44 = finder44.find(pat44);
		double score44=20;                
		System.out.println("the value of ht"+" "+ht44);
		if(finder44.hasNext())
		{
			Match m44=finder44.next();
			System.out.println("Match Found with: "+(m44.getScore())*100+"%");
			score44=(m44.getScore())*100;
			System.out.println("Comparing the max payout value for 100 denomination. Test case passed");
			finder44.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 100 denomination and comparision value equals to: "+" "+score44 +"%");
		Assert.assertTrue(score44 > 95);
		Thread.sleep(2000);

		// click on backward button to move to previous payout table and validate	
		screen.click(backward);
		Thread.sleep(2000);

		//Selecting the denomination as 200
		screen.click(deno5);
		Thread.sleep(2000);

		//Comparing the max payout1 value for denomination 200
		//   Pattern pat5=new Pattern("E:/Sikuli Images/payout/payout1_5.png");
		Finder finder5 =new Finder(screen.capture().getImage());
		String ht5 = finder5.find(pat5);
		double score5=20;                
		System.out.println("the value of ht"+" "+ht5);
		if(finder5.hasNext())
		{
			Match m5=finder5.next();
			System.out.println("Match Found with: "+(m5.getScore())*100+"%");
			score5=(m5.getScore())*100;
			System.out.println("Comparing the max payout value for 200 denomination. Test case passed");
			finder5.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 200 denomination and comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 95);
		Thread.sleep(2000);

		//		 click on forward button to move to next payout table and validate	
		screen.click(forward);
		Thread.sleep(2000);

		//Comparing the max payout2 value for denomination 200
		//   Pattern pat5=new Pattern("E:/Sikuli Images/payout/payout1_5.png");
		Finder finder55 =new Finder(screen.capture().getImage());
		String ht55 = finder55.find(pat55);
		double score55=20;                
		System.out.println("the value of ht"+" "+ht55);
		if(finder55.hasNext())
		{
			Match m55=finder55.next();
			System.out.println("Match Found with: "+(m55.getScore())*100+"%");
			score55=(m55.getScore())*100;
			System.out.println("Comparing the max payout value for 200 denomination. Test case passed");
			finder55.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 200 denomination and comparision value equals to: "+" "+score55 +"%");
		Assert.assertTrue(score55 > 95);
		Thread.sleep(2000);


		// click on exit button to move to gaming window	
		screen.click(exit);
		Thread.sleep(2000);
	}

	@Then("^System should display the Payout max amount on each symbol like blue diamond, heart n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination values like (\\d+), (\\d+), (\\d+), (\\d+) & (\\d+) in Amazon Clash slot game on web$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_blue_diamond_heart_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_values_like_in_Amazon_Clash_slot_game_on_web(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
	   
		Thread.sleep(3000);
		driver.quit();
	}
}
