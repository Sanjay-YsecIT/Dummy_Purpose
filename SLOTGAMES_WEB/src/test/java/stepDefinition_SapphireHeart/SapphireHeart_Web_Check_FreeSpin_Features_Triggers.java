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

public class SapphireHeart_Web_Check_FreeSpin_Features_Triggers {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type, denomination, balance, scatter symbols, spin button, free spin screen$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_free_spin_screen() throws Throwable {

		this.driver = SapphireHeart_URL_Login.getDriver(); 
	}

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three scatter symbols appears on the screen wins and Free Spin Activates and spin amount added to the win amount$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_Three_scatter_symbols_appears_on_the_screen_wins_and_Free_Spin_Activates_and_spin_amount_added_to_the_win_amount() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Sapphire_Heart/Bet_place.PNG", 10);
		//	Thread.sleep(15000);

		Pattern spin=new Pattern("./Images/Sapphire_Heart/spin.PNG"); 
		Pattern collect =new Pattern("./Images/Sapphire_Heart/collect.PNG");

		// Congrulation and Win window free spin left 
		Pattern Cong_msg =new Pattern("./Images/Sapphire_Heart/SC_Congrulation_msg.PNG");
		Pattern FreeSpin0 =new Pattern("./Images/Sapphire_Heart/SC_FreeSpin0.PNG");
		Pattern FreeSpin10 =new Pattern("./Images/Sapphire_Heart/SC_FreeSpin10.PNG");
		Pattern FreeSpin5 =new Pattern("./Images/Sapphire_Heart/SC_FreeSpin5.PNG");
		Pattern win_msg =new Pattern("./Images/Sapphire_Heart/SC_win_msg.PNG");


		// IMAGES IN 2nd REELS
		Pattern Q2=new Pattern("./Images/Sapphire_Heart/2R_q.PNG");
		Pattern yellow2=new Pattern("./Images/Sapphire_Heart/2R_yellow.PNG");
		Pattern A2=new Pattern("./Images/Sapphire_Heart/2R_a.PNG");
		Pattern purple2=new Pattern("./Images/Sapphire_Heart/2R_purple.PNG");

		// IMAGES IN 3rd REELS
		Pattern diamond3=new Pattern("./Images/Sapphire_Heart/3R_diamond.PNG");
		Pattern K3=new Pattern("./Images/Sapphire_Heart/3R_k.PNG");
		Pattern lady3=new Pattern("./Images/Sapphire_Heart/3R_lady.PNG");
		Pattern J3=new Pattern("./Images/Sapphire_Heart/3R_j.PNG");

		// IMAGES IN 3rd REELS
		Pattern green4=new Pattern("./Images/Sapphire_Heart/4R_green.PNG");
		Pattern yellow4=new Pattern("./Images/Sapphire_Heart/4R_yellow.PNG");
		Pattern A4=new Pattern("./Images/Sapphire_Heart/4R_a.PNG");
		Pattern men4=new Pattern("./Images/Sapphire_Heart/4R_men.PNG");
		Pattern Q4=new Pattern("./Images/Sapphire_Heart/4R_q.PNG");


		// Arrange symbols on 2nd REELS
		screen.click(yellow2);
		Thread.sleep(1000);
		screen.click(A2);
		Thread.sleep(1000);
		screen.click(purple2);
		Thread.sleep(1000);
		screen.click(Q2);
		Thread.sleep(1000);

		// Arrange symbols on 3rd REELS
		screen.click(K3);
		Thread.sleep(1000);
		screen.click(lady3);
		Thread.sleep(1000);
		screen.click(J3);
		Thread.sleep(1000);
		screen.click(diamond3);
		Thread.sleep(1000);

		// Arrange symbols on 4th REELS
		screen.click(green4);
		Thread.sleep(1000);
		screen.click(A4);
		Thread.sleep(1000);
		screen.click(Q4);
		Thread.sleep(1000);
		screen.click(yellow4);
		Thread.sleep(1000);
		screen.click(men4);
		Thread.sleep(1000);

		// CLICK ON SPIN ICON
		screen.click(spin);
		Thread.sleep(1000);

		screen.wait(Cong_msg, 10);
		Thread.sleep(1000);


		//Comparing the Free Spins once the scatter  symbol triggers

		// Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(FreeSpin10);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("On appearance of 3 scatters, bonus game should be triggered and Free spin attempts should be 10.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);


		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(FreeSpin5);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score1=(m11.getScore())*100;
			System.out.println("On appearance of 3 scatters, Free spin attempts should be 5.");
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

	}

	@Then("^Ten Free Spin screen should appear when Three scatter symbols appears on the screen in Sapphire Heart game$")
	public void ten_Free_Spin_screen_should_appear_when_Three_scatter_symbols_appears_on_the_screen_in_Sapphire_Heart_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
