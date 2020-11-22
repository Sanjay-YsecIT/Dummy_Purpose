package stepDefinition_SkinfiriMysterious;

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

public class SkinfiriMysterious_Web_Check_FreeSpin_Features_Triggers {

	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, bet type, denomination, balance, scatter symbols, spin button, free spin screen and reveal all button$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_free_spin_screen_and_reveal_all_button() throws Throwable {

		this.driver = SkinfiriMysterious_URL_Login.getDriver();

	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three or more than Three scatter symbols appears on the screen wins and Free Spin Activates and spin amount added to the win amount$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_Three_or_more_than_Three_scatter_symbols_appears_on_the_screen_wins_and_Free_Spin_Activates_and_spin_amount_added_to_the_win_amount() throws Throwable {

		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);

		Pattern spin=new Pattern("Images/Skinfiri_Mysterious/Spin.PNG"); 
		Pattern collect =new Pattern("Images/Skinfiri_Mysterious/collect_image.PNG");

		// IMAGES IN 1st REEL
		Pattern cross =new Pattern("Images/Skinfiri_Mysterious/SC_R1_cross.PNG");
		Pattern crow =new Pattern("/Images/Skinfiri_Mysterious/SC_R1_crow.PNG");
		Pattern eye =new Pattern("Images/Skinfiri_Mysterious/SC_R1_eye.PNG");
		Pattern seven =new Pattern("Images/Skinfiri_Mysterious/SC_R1_seven.PNG");
		Pattern skull =new Pattern("Images/Skinfiri_Mysterious/SC_R1_skull.PNG");
		Pattern ten =new Pattern("Images/Skinfiri_Mysterious/SC_R1_ten.PNG");

		// IMAGES IN 2nd REEL
		Pattern cross2=new Pattern("Images/Skinfiri_Mysterious/SC_R2_cross.PNG");
		Pattern owl2=new Pattern("Images/Skinfiri_Mysterious/SC_R2_owl.PNG");

		// IMAGES IN 3rd REEL
		Pattern cross3=new Pattern("Images/Skinfiri_Mysterious/SC_R3_cross.PNG");
		Pattern crow3=new Pattern("Images/Skinfiri_Mysterious/SC_R3_crow.PNG");
		Pattern owl3=new Pattern("Images/Skinfiri_Mysterious/SC_R3_owl.PNG");

		// IMAGES IN 4th REEL
		Pattern cross4 =new Pattern("Images/Skinfiri_Mysterious/SC_R4_cross.PNG");
		Pattern crow4 =new Pattern("Images/Skinfiri_Mysterious/SC_R4_crow.PNG");
		Pattern owl4 =new Pattern("Images/Skinfiri_Mysterious/SC_R4_owl.PNG");
		Pattern seven4 =new Pattern("Images/Skinfiri_Mysterious/SC_R4_seven.PNG");
		Pattern skull4 =new Pattern("Images/Skinfiri_Mysterious/SC_R4_skull.PNG");
		Pattern ten4=new Pattern("Images/Skinfiri_Mysterious/SC_R4_ten.PNG");		
		Pattern wild4=new Pattern("Images/Skinfiri_Mysterious/SC_R4_wild.PNG");	

		// IMAGES IN 5th REEL
		Pattern owl5 =new Pattern("Images/Skinfiri_Mysterious/SC_R5_owl.PNG");
		Pattern eye5 =new Pattern("Images/Skinfiri_Mysterious/SC_R5_eye.PNG");
		Pattern skull5 =new Pattern("Images/Skinfiri_Mysterious/SC_R5_skull.PNG");

		// Congrulation and Win window pop-up and free spin left 
		Pattern Cong_msg =new Pattern("Images/Skinfiri_Mysterious/SC_Congrulation_msg.PNG");
		Pattern FreeSpin15 =new Pattern("Images/Skinfiri_Mysterious/SC_FreeSpin15.PNG");

		//Arranging the symbols to generate 3 Scatter
		// Arranging the 1st Reel
		screen.click(eye);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);
		screen.click(cross);
		Thread.sleep(1000);
		screen.click(ten);
		Thread.sleep(1000);
		screen.click(seven);
		Thread.sleep(1000); 
		screen.click(eye);
		Thread.sleep(1000);
		screen.click(crow);
		Thread.sleep(1000);
		screen.click(crow);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);
		screen.click(skull);
		Thread.sleep(1000);

		//Arranging 2nd Reel 
		screen.click(owl2);
		Thread.sleep(1000);
		screen.click(owl2);
		Thread.sleep(1000);
		screen.click(cross2);
		Thread.sleep(1000);

		//Arranging 3rd Reel
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(crow3);
		Thread.sleep(1000);
		screen.click(owl3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);
		screen.click(cross3);
		Thread.sleep(1000);

		// CLICK ON SPIN ICON
		screen.click(spin);
		Thread.sleep(4000);

		screen.wait(Cong_msg, 30);
		Thread.sleep(1000);

		//Comparing the Free Spins once the scatter  symbol triggers
		screen.wait(FreeSpin15, 30);
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
		Assert.assertTrue(score1 > 70);
		Thread.sleep(60000);

		//collect the amount won by the 3 scattered symbol
		screen.wait(collect, 240);
		screen.click(collect);
		Thread.sleep(2000);

		//Arranging the 4th Reel for scatter to appear
		screen.click(cross4);
		Thread.sleep(1000);
		screen.click(cross4);
		Thread.sleep(1000);
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(seven4);
		Thread.sleep(1000);
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(owl4);
		Thread.sleep(1000);
		screen.click(cross4);
		Thread.sleep(1000);
		screen.click(crow4);
		Thread.sleep(1000);
		screen.click(skull4);
		Thread.sleep(1000);
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(ten4);
		Thread.sleep(1000);
		screen.click(cross4);
		Thread.sleep(1000);
		screen.click(cross4);
		Thread.sleep(1000);
		screen.click(seven4);
		Thread.sleep(1000);
		screen.click(owl4);
		Thread.sleep(1000);
		screen.click(wild4);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(5000);

		// free spin window
		screen.wait(Cong_msg, 30);
		Thread.sleep(2000);

		//Comparing the Free Spins once the 4 scatter symbol triggers
		screen.wait(FreeSpin15, 30);
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
		Assert.assertTrue(score21 > 70);
		Thread.sleep(60000);
		
		//collect the amount won by the 4 scattered symbol
		screen.wait(collect, 240);
		screen.click(collect);
		Thread.sleep(2000);

		//Arrange the 5th Reel for scatter symbol
		screen.click(owl5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(eye5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(skull5);
		Thread.sleep(1000);
		screen.click(owl5);
		Thread.sleep(1000);
		screen.click(spin);
		Thread.sleep(5000);

		// free spin window
		screen.wait(Cong_msg, 30);
		Thread.sleep(1000);

		//Comparing the Free Spins once the scatter  symbol triggers
		screen.wait(FreeSpin15, 30);
		Finder finder31 =new Finder(screen.capture().getImage());
		String ht31 = finder31.find(FreeSpin15);
		double score31=20;                
		System.out.println("the value of ht31"+" "+ht31);
		if(finder31.hasNext())
		{
			Match m31=finder31.next();
			System.out.println("Match Found with: "+(m31.getScore())*100+"%");
			score31=(m31.getScore())*100;
			System.out.println("On appearance of 5 scatters, bonus game should be triggered and Free spin attempts should be 15.");
			finder31.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Free spin attempts comparision: "+" "+score31 +"%");
		Assert.assertTrue(score31 > 70);
		Thread.sleep(60000);
		
		//collect the amount won by the 5 scattered symbol
		screen.wait(collect, 240);
		screen.click(collect);
		Thread.sleep(2000);
	}

	@Then("^Fifteen Free Spin screen should appear when Three or more than Three scatter symbols appears on the screen in Skinfiri Mysterious game$")
	public void fifteen_Free_Spin_screen_should_appear_when_Three_or_more_than_Three_scatter_symbols_appears_on_the_screen_in_Skinfiri_Mysterious_game() throws Throwable {

		Thread.sleep(3000);
		driver.quit();
	}
}
