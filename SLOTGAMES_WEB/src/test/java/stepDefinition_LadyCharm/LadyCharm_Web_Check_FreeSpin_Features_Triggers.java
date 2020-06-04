package stepDefinition_LadyCharm;

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

public class LadyCharm_Web_Check_FreeSpin_Features_Triggers {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Lady Charm slot game, bet type, denomination, balance, scatter symbols, spin button, free spin screen and big win animation\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Charm_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_free_spin_screen_and_big_win_animation() throws Throwable {

		this.driver = LadyCharm_URL_Login.getDriver();
	}

	@When("^Open the Lady Charm slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three or more than Three scatter symbols appears on the screen wins and Free Spin Activates and spin amount added to the win amount$")
	public void open_the_Lady_Charm_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_Three_or_more_than_Three_scatter_symbols_appears_on_the_screen_wins_and_Free_Spin_Activates_and_spin_amount_added_to_the_win_amount() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Lady_Charm/Bet_place.PNG", 10);
		//	Thread.sleep(15000);


		Pattern spin=new Pattern("./Images/Lady_Charm/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Lady_Charm/collect.PNG");


		// IMAGES IN 1st REEL
		Pattern A1 =new Pattern("./Images/Lady_Charm/1R_a.PNG");
		Pattern ten1 =new Pattern("/Images/Lady_Charm/1R_10.PNG");
		Pattern K1 =new Pattern("./Images/Lady_Charm/1R_k.PNG");
		Pattern Q1 =new Pattern("./Images/Lady_Charm/1R_q.PNG");
		Pattern wild1 =new Pattern("./Images/Lady_Charm/1R_wild.PNG");
		Pattern Coin1 =new Pattern("./Images/Lady_Charm/1R_coin.PNG");
		Pattern Leaf1 =new Pattern("/Images/Lady_Charm/1R_leaf.PNG");
		Pattern shoe1 =new Pattern("./Images/Lady_Charm/1R_shoe.PNG");
		Pattern nine1 =new Pattern("./Images/Lady_Charm/1R_9.PNG");
		Pattern J1 =new Pattern("./Images/Lady_Charm/1R_j.PNG");

		// IMAGES IN 4th REEL
		Pattern ten4 =new Pattern("./Images/Lady_Charm/4R_ten.PNG");
		Pattern leaf4 =new Pattern("./Images/Lady_Charm/4R_leaf1.PNG");
		Pattern wild4 =new Pattern("./Images/Lady_Charm/4R_wild1.PNG");
		Pattern A4 =new Pattern("./Images/Lady_Charm/4R_a1.PNG");
		Pattern shoe4 =new Pattern("./Images/Lady_Charm/4R_sc_shoe.PNG");
		Pattern nine4=new Pattern("./Images/Lady_Charm/4R_nine.PNG");		

		// IMAGES IN 5th REEL
		Pattern K5 =new Pattern("./Images/Lady_Charm/5R_k.PNG");
		Pattern nine5 =new Pattern("./Images/Lady_Charm/5R_9.PNG");
		Pattern feather5 =new Pattern("./Images/Lady_Charm/5R_feather.PNG");


		// Congrulation and Win window pop-up and free spin left 
		Pattern BigWin =new Pattern("./Images/Lady_Charm/BigWin_100.PNG");
		Pattern Cong_msg =new Pattern("./Images/Lady_Charm/SC_Congrulation_msg.PNG");
		Pattern FreeSpin0 =new Pattern("./Images/Lady_Charm/SC_FreeSpin0.PNG");
		//	Pattern FreeSpin5 =new Pattern("./Images/Scatter/FreeSpin5.PNG");
		Pattern FreeSpin10 =new Pattern("./Images/Lady_Charm/SC_FreeSpin10.PNG");
		Pattern FreeSpin15 =new Pattern("./Images/Lady_Charm/SC_FreeSpin15.PNG");
		Pattern win_msg =new Pattern("./Images/Lady_Charm/SC_win_msg.PNG");


		//Arranging the symbols to generate 3 Scatter
		// Arranging the 1st Reel
		screen.click(J1);
		Thread.sleep(1000);
		screen.click(nine1);
		Thread.sleep(1000);
		screen.click(shoe1);
		Thread.sleep(1000);
		screen.click(Leaf1);
		Thread.sleep(1000);
		screen.click(Coin1);
		Thread.sleep(1000);
		screen.click(wild1);
		Thread.sleep(1000);
		screen.click(Q1);
		Thread.sleep(1000);
		screen.click(Q1);
		Thread.sleep(1000);
		screen.click(Q1);
		Thread.sleep(1000);
		screen.click(K1);
		Thread.sleep(1000); 
		screen.click(K1);
		Thread.sleep(1000);
		screen.click(J1);
		Thread.sleep(1000);
		screen.click(J1);
		Thread.sleep(1000);
		screen.click(nine1);
		Thread.sleep(1000);
		screen.click(J1);
		Thread.sleep(1000);
		screen.click(nine1);
		Thread.sleep(1000);
		screen.click(nine1);
		Thread.sleep(1000);
		screen.click(ten1);
		Thread.sleep(1000);
		screen.click(ten1);
		Thread.sleep(1000);
		screen.click(Q1);
		Thread.sleep(1000);
		screen.click(ten1);
		Thread.sleep(1000);
		screen.click(Q1);
		Thread.sleep(1000);
		screen.click(Q1);
		Thread.sleep(1000);
		screen.click(Leaf1);
		Thread.sleep(1000);
		screen.click(A1);
		Thread.sleep(1000);
		screen.click(A1);
		Thread.sleep(1000);
		screen.click(ten1);
		Thread.sleep(1000);
		screen.click(ten1);
		Thread.sleep(1000);
		screen.click(Leaf1);
		Thread.sleep(1000);

		// CLICK ON SPIN ICON
		screen.click(spin);
		Thread.sleep(1000);

		screen.wait(Cong_msg, 10);
		Thread.sleep(1000);


		//Comparing the Free Spins once the scatter  symbol triggers

		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(FreeSpin15);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("On appearance of 3 scatters, bonus game should be triggered and Free spin attempts should be 15.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);


		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(FreeSpin10);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score1=(m11.getScore())*100;
			System.out.println("On appearance of 3 scatters, Free spin attempts should be 10.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score11 +"%");
		Assert.assertTrue(score1 > 97);

		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(FreeSpin0);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder11.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("On appearance of 3 scatters, Free spin attempts should be 0.");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score12 +"%");
		Assert.assertTrue(score1 > 97);

		//win amount from the free spin is displayed
		screen.wait(win_msg, 5);
		Thread.sleep(1000);
		//collect the amount won by the 3 scattered symbol
		screen.click(collect);
		Thread.sleep(1000);

		//Arranging the 4th Reel for scatter to appear
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(leaf4);
		Thread.sleep(1000);
		screen.click(wild4);
		Thread.sleep(1000);
		screen.click(A4);
		Thread.sleep(1000);
		screen.click(A4);
		Thread.sleep(1000);
		screen.click(shoe4);
		Thread.sleep(1000);
		screen.click(nine4);
		Thread.sleep(1000);
		screen.click(nine4);
		Thread.sleep(1000);


		//spin
		screen.click(spin);
		Thread.sleep(3000);

		// free spin window
		screen.wait(Cong_msg, 10);
		Thread.sleep(1000);


		//Comparing the Free Spins once the 4 scatter symbol triggers

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
			System.out.println("On appearance of 4 scatters, Free spin attempts must be triggered should be 15.");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score21 +"%");
		Assert.assertTrue(score1 > 97);


		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(FreeSpin10);
		double score22=20;                
		System.out.println("the value of ht22"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("On appearance of 4 scatters, Free spin attempts should be 10.");
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
			System.out.println("On appearance of 4 scatters,  Free spin attempts should be 0.");
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
		//collect the amount won by the 3 scattered symbol
		screen.click(collect);
		Thread.sleep(1000);

		//Arrange the 5th Reel for scatter symbol
		screen.click(K5);
		Thread.sleep(1000);
		screen.click(feather5);
		Thread.sleep(1000);
		screen.click(nine5);
		Thread.sleep(1000);

		//spin
		screen.click(spin);
		Thread.sleep(3000);


		// Big win window
		screen.wait(BigWin, 10);
		Thread.sleep(1000);
		// free spin window
		screen.wait(Cong_msg, 10);
		Thread.sleep(1000);



		//Comparing the Free Spins once the scatter  symbol triggers

		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder31 =new Finder(screen.capture().getImage());
		String ht31 = finder31.find(FreeSpin15);
		double score31=20;                
		System.out.println("the value of ht31"+" "+ht31);
		if(finder31.hasNext())
		{
			Match m31=finder31.next();
			System.out.println("Match Found with: "+(m31.getScore())*100+"%");
			score31=(m31.getScore())*100;
			System.out.println("On appearance of 5 scatters, Free spin attempts should be 15.");
			finder31.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score31 +"%");
		Assert.assertTrue(score31 > 97);


		Finder finder32 =new Finder(screen.capture().getImage());
		String ht32 = finder32.find(FreeSpin10);
		double score32=20;                
		System.out.println("the value of ht32"+" "+ht32);
		if(finder32.hasNext())
		{
			Match m32=finder32.next();
			System.out.println("Match Found with: "+(m32.getScore())*100+"%");
			score32=(m32.getScore())*100;
			System.out.println("On appearance of 5 scatters, Free spin attempts should be 10.");
			finder32.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score32 +"%");
		Assert.assertTrue(score32 > 97);

		Finder finder33 =new Finder(screen.capture().getImage());
		String ht33 = finder33.find(FreeSpin0);
		double score33=20;                
		System.out.println("the value of ht33"+" "+ht33);
		if(finder33.hasNext())
		{
			Match m33=finder33.next();
			System.out.println("Match Found with: "+(m33.getScore())*100+"%");
			score33=(m33.getScore())*100;
			System.out.println("On appearance of 5 scatters, Free spin attempts should be 0.");
			finder33.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score33 +"%");
		Assert.assertTrue(score33 > 97);

		//win amount from the free spin is displayed
		screen.wait(win_msg, 5);
		Thread.sleep(1000);
		//collect the amount won by the 5 scattered symbol
		screen.click(collect);
		Thread.sleep(1000);

	}

	@Then("^Fifteen Free Spin screen should appear when Three or more than Three scatter symbols appears on the screen in Lady Charm game$")
	public void fifteen_Free_Spin_screen_should_appear_when_Three_or_more_than_Three_scatter_symbols_appears_on_the_screen_in_Lady_Charm_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
