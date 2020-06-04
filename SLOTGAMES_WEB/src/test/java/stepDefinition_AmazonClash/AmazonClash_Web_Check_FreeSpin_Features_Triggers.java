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

public class AmazonClash_Web_Check_FreeSpin_Features_Triggers {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Amazon Clash slot game, bet type, denomination, balance, scatter symbols, spin button and free spin screen$")
	public void chrome_browser_valid_URL_valid_login_details_Amazon_Clash_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_and_free_spin_screen() throws Throwable {

		this.driver = AmazonClash_URL_Login.getDriver();		
	}

	@When("^Open the Amazon Clash slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Seven or more than Seven scatter symbols appears on the screen wins and Free Spin Activates and spin amount added to the win amount$")
	public void open_the_Amazon_Clash_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_Seven_or_more_than_Seven_scatter_symbols_appears_on_the_screen_wins_and_Free_Spin_Activates_and_spin_amount_added_to_the_win_amount() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Amazon_Clash/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Amazon_Clash/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Amazon_Clash/collect.PNG");

		// IMAGES IN 2nd REEL
		Pattern clove2=new Pattern("./Images/Amazon_Clash/2R_leaf1.PNG");
		Pattern wild2=new Pattern("./Images/Amazon_Clash/2R_wild.PNG");
		Pattern blue2=new Pattern("./Images/Amazon_Clash/2R_blue.PNG");
		Pattern lady21=new Pattern("./Images/Amazon_Clash/2R_lady1.PNG");

		// IMAGES IN 4th REEL
		Pattern lady41=new Pattern("./Images/Amazon_Clash/4R_lady11.PNG");
		Pattern lady42=new Pattern("./Images/Amazon_Clash/4R_lady21.PNG");
		Pattern leaf4=new Pattern("./Images/Amazon_Clash/4R_leaf1.PNG");
		Pattern blue4=new Pattern("./Images/Amazon_Clash/4R_blue1.PNG");
		Pattern lady43=new Pattern("./Images/Amazon_Clash/4R_lady31.PNG");


		// Congrulation and Win window pop-up and free spin left 
		Pattern Cong_msg_7 =new Pattern("./Images/Amazon_Clash/free_spin_7.PNG");
		Pattern Cong_msg_15 =new Pattern("./Images/Amazon_Clash/free_spin_15.PNG");
		Pattern Cong_msg_30 =new Pattern("./Images/Amazon_Clash/free_spin_30.PNG");
		Pattern win_msg =new Pattern("./Images/Amazon_Clash/win_msg.PNG");
		Pattern FreeSpin0 =new Pattern("./Images/Amazon_Clash/FreeSpin0.PNG");
		Pattern FreeSpin7 =new Pattern("./Images/Amazon_Clash/FreeSpin7.PNG");
		Pattern FreeSpin15 =new Pattern("./Images/Amazon_Clash/FreeSpin15.PNG");
		Pattern FreeSpin30 =new Pattern("./Images/Amazon_Clash/FreeSpin30.PNG");

		//Arranging the symbols to generate 7 Scatter
		// Arranging the 2nd Reel
		screen.click(clove2);
		Thread.sleep(1000);
		screen.click(wild2);
		Thread.sleep(1000);
		screen.click(wild2);
		Thread.sleep(1000);
		screen.click(wild2);
		Thread.sleep(1000);
		screen.click(blue2);
		Thread.sleep(1000);
		screen.click(blue2);
		Thread.sleep(1000);
		screen.click(lady21);
		Thread.sleep(1000);

		// Arranging the 4th Reel
		screen.click(lady41);
		Thread.sleep(1000);
		screen.click(lady42);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(blue4);
		Thread.sleep(1000);
		screen.click(blue4);
		Thread.sleep(1000); 
		screen.click(lady43);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000); 

		// Spin the reels
		screen.click(spin);
		Thread.sleep(1000);

		// Congrulation message displays on the 7 scatters and 7 free spin triggers
		screen.wait(Cong_msg_7, 10);
		Thread.sleep(1000);

		//Comparing the Free Spins once the scatter  symbol triggers

		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(FreeSpin7);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("On appearance of 7 scatters, bonus game should be triggered and Free spin attempts should be 7");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);


		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(FreeSpin0);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score1=(m11.getScore())*100;
			System.out.println("On appearance of 7 scatters, bonus game should be triggered and Free spin attempts should be 0.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score11 +"%");
		Assert.assertTrue(score1 > 97);


		//win amount from the free spin is displayed
		screen.wait(win_msg, 5);
		Thread.sleep(1000);
		//collect the amount won by the 7 scattered symbol
		screen.click(collect);
		Thread.sleep(1000);


		//Arranging the 4th Reel for scatter to appear
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(1000);

		// free spin window
		screen.wait(Cong_msg_15, 10);
		Thread.sleep(1000);


		//Comparing the Free Spins once the 8 scatter symbol triggers

		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(FreeSpin15);
		double score21=20;                
		System.out.println("the value of ht21"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("On appearance of 8 scatters, Free spin attempts must be triggered should be 15.");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score21 +"%");
		Assert.assertTrue(score1 > 97);


		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(FreeSpin7);
		double score22=20;                
		System.out.println("the value of ht22"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("On appearance of 8 scatters, bonus game should be triggered and Free spin attempts should be 7.");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score22 +"%");
		Assert.assertTrue(score1 > 97);

		Finder finder23 =new Finder(screen.capture().getImage());
		String ht23 = finder23.find(FreeSpin0);
		double score23=20;                
		System.out.println("the value of ht23"+" "+ht23);
		if(finder23.hasNext())
		{
			Match m23=finder23.next();
			System.out.println("Match Found with: "+(m23.getScore())*100+"%");
			score23=(m23.getScore())*100;
			System.out.println("On appearance of 8 scatters, bonus game should be triggered and Free spin attempts should be 0.");
			finder23.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score23 +"%");
		Assert.assertTrue(score1 > 97);

		//win amount from the free spin is displayed
		screen.wait(win_msg, 5);
		Thread.sleep(1000);
		//collect the amount won by the 8 scattered symbol
		screen.click(collect);
		Thread.sleep(1000);


		//Arrange the 4th Reel for 9 scatter symbol to appear on the screen
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(1000);

		// free spin window
		screen.wait(Cong_msg_30, 10);
		Thread.sleep(1000);

		//Comparing the Free Spins once the 9 scatter  symbol triggers

		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder31 =new Finder(screen.capture().getImage());
		String ht31 = finder31.find(FreeSpin30);
		double score31=20;                
		System.out.println("the value of ht31"+" "+ht31);
		if(finder31.hasNext())
		{
			Match m31=finder31.next();
			System.out.println("Match Found with: "+(m31.getScore())*100+"%");
			score31=(m31.getScore())*100;
			System.out.println("On appearance of 9 scatters, bonus game should be triggered and Free spin attempts should be 30.");
			finder31.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score31 +"%");
		Assert.assertTrue(score1 > 97);


		Finder finder32 =new Finder(screen.capture().getImage());
		String ht32 = finder32.find(FreeSpin15);
		double score32=20;                
		System.out.println("the value of ht32"+" "+ht32);
		if(finder32.hasNext())
		{
			Match m32=finder32.next();
			System.out.println("Match Found with: "+(m32.getScore())*100+"%");
			score32=(m32.getScore())*100;
			System.out.println("On appearance of 9 scatters, bonus game should be triggered and Free spin attempts should be 15.");
			finder32.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score32 +"%");
		Assert.assertTrue(score1 > 97);

		Finder finder33 =new Finder(screen.capture().getImage());
		String ht33 = finder33.find(FreeSpin7);
		double score33=20;                
		System.out.println("the value of ht33"+" "+ht33);
		if(finder33.hasNext())
		{
			Match m33=finder33.next();
			System.out.println("Match Found with: "+(m33.getScore())*100+"%");
			score33=(m33.getScore())*100;
			System.out.println("On appearance of 9 scatters, bonus game should be triggered and Free spin attempts should be 7.");
			finder33.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score33 +"%");
		Assert.assertTrue(score1 > 97);

		Finder finder34 =new Finder(screen.capture().getImage());
		String ht34 = finder34.find(FreeSpin0);
		double score34=20;                
		System.out.println("the value of ht34"+" "+ht34);
		if(finder34.hasNext())
		{
			Match m34=finder34.next();
			System.out.println("Match Found with: "+(m34.getScore())*100+"%");
			score34=(m34.getScore())*100;
			System.out.println("On appearance of 9 scatters, bonus game should be triggered and Free spin attempts should be 0.");
			finder34.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score34 +"%");
		Assert.assertTrue(score1 > 97);

		//win amount from the free spin is displayed
		screen.wait(win_msg, 5);
		Thread.sleep(1000);
		//collect the amount won by the 5 scattered symbol
		screen.click(collect);
		Thread.sleep(1000);

	}

	@Then("^Seven, Fifteen and Thirty Free Spin screen should appear when Seven or more than Seven scatter symbols appears on the screen in Amazon Clash game$")
	public void seven_Fifteen_and_Thirty_Free_Spin_screen_should_appear_when_Seven_or_more_than_Seven_scatter_symbols_appears_on_the_screen_in_Amazon_Clash_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
