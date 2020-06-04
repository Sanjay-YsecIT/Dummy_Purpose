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

public class LadyCharm_Web_BigWin_Option {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Lady Charm slot game, bet type, denomination, balance, wild symbols,Scatter Symbols spin button, Big win window and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Charm_slot_game_bet_type_denomination_balance_wild_symbols_Scatter_Symbols_spin_button_Big_win_window_and_win_amount() throws Throwable {

		this.driver = LadyCharm_URL_Login.getDriver();
	}

	@When("^Open the Lady Charm slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild or Scatter appears on all the five reels and big win screen appears and big win amount added to the balance$")
	public void open_the_Lady_Charm_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_wild_or_Scatter_appears_on_all_the_five_reels_and_big_win_screen_appears_and_big_win_amount_added_to_the_balance() throws Throwable {

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

		Pattern Cong_msg =new Pattern("./Images/Lady_Charm/SC_Congrulation_msg.PNG");
		Pattern FreeSpin0 =new Pattern("./Images/Lady_Charm/SC_FreeSpin0.PNG");
		//	Pattern FreeSpin5 =new Pattern("./Images/Scatter/FreeSpin5.PNG");
		Pattern FreeSpin10 =new Pattern("./Images/Lady_Charm/SC_FreeSpin10.PNG");
		Pattern FreeSpin15 =new Pattern("./Images/Lady_Charm/SC_FreeSpin15.PNG");
		Pattern win_msg =new Pattern("./Images/Lady_Charm/SC_win_msg.PNG");


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

	@Then("^Big Win screen should appear when five wild or scatter symbols appears on the screen in Lady Charm game$")
	public void big_Win_screen_should_appear_when_five_wild_or_scatter_symbols_appears_on_the_screen_in_Lady_Charm_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
