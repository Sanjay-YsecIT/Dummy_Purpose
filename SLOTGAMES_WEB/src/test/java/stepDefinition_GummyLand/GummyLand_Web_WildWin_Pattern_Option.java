package stepDefinition_GummyLand;

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

public class GummyLand_Web_WildWin_Pattern_Option {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type, denomination, balance, wild symbols and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Gummy_Land_slot_game_bet_type_denomination_balance_wild_symbols_and_spin_button() throws Throwable {
		this.driver = GummyLand_URL_Login.getDriver();
	}

	@When("^Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the wild symbol appears on defined pattern$")
	public void open_the_Gummy_Land_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_the_wild_symbol_appears_on_defined_pattern() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement TransferInput =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		TransferInput.clear();
		Thread.sleep(1000);
		TransferInput.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Gummy_Land/GummyLand.PNG", 30);

		Pattern spin=new Pattern("Images/Gummy_Land/spin.PNG"); 
		Pattern take=new Pattern("Images/Gummy_Land/take.PNG");

		//win symbols set to reproduce the wild win count and win amount respectively
		Pattern symb_1_1=new Pattern("Images/Gummy_Land/symb_1_1.PNG");
		Pattern symb_1_2=new Pattern("Images/Gummy_Land/symb_1_2.PNG");
		Pattern symb_6_1=new Pattern("Images/Gummy_Land/symb_6_1.PNG");

		Pattern wildspin_before=new Pattern("Images/Gummy_Land/wildspin_before.PNG");
		Pattern wildspin_after=new Pattern("Images/Gummy_Land/wildspin_after.PNG");
		Pattern wildspin_before1=new Pattern("Images/Gummy_Land/wildspin_before1.PNG");
		Pattern wildspin_after1=new Pattern("Images/Gummy_Land/wildspin_after1.PNG");
		Pattern wildspin_before2=new Pattern("Images/Gummy_Land/wildspin_before2.PNG");
		Pattern wildspin_after2=new Pattern("Images/Gummy_Land/wildspin_after2.PNG");

		Pattern wildsymb_1_1=new Pattern("Images/Gummy_Land/wildsymb_1_1.PNG");

		Pattern wildsymb_2_1=new Pattern("Images/Gummy_Land/wildsymb_2_1.PNG");
		Pattern wildsymb_2_2=new Pattern("Images/Gummy_Land/wildsymb_2_2.PNG");
		Pattern wildsymb_2_3=new Pattern("Images/Gummy_Land/wildsymb_2_3.PNG");
		Pattern wildsymb_2_4=new Pattern("Images/Gummy_Land/wildsymb_2_4.PNG");
		Pattern wildsymb_2_5=new Pattern("Images/Gummy_Land/wildsymb_2_5.PNG");
		Pattern wildsymb_2_6=new Pattern("Images/Gummy_Land/wildsymb_2_6.PNG");

		//Arranging the symbols to generate wild symbol in 1,2 and 4th reels
		screen.click(wildsymb_1_1);
		Thread.sleep(1000);

		//comparing the wild win reels for 1,2 and 4th wild combinations
		//reels before wild spin
		Finder finder2 =new Finder(screen.capture().getImage());
		String ht2 = finder2.find(wildspin_before1);
		double score2=20;                
		System.out.println("the value of ht2"+" "+ht2);
		if(finder2.hasNext())
		{
			Match m2=finder2.next();
			System.out.println("Match Found with: "+(m2.getScore())*100+"%");
			score2=(m2.getScore())*100;
			System.out.println("Wild reels set on 1,2 and 4th reels before wheel spin");
			finder2.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild reels set on  on 1,2 and 4th reels before wheel spin and comarision is: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 97);

		screen.click(spin);
		Thread.sleep(8000);
		screen.click(take);
		Thread.sleep(3000);

		//comparing the wild win reels for 1,2 and 4th wild combinations
		//reels before wild spin
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(wildspin_after1);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("Wild reels set on 1,2 and 4th reels after wheel spin");
			finder12.destroy();   
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild reels set on 1,2 and 4th reels after wheel spin and comarision is: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);


		//Arranging the symbols to generate wild symbol in 2,3 and 4th reels
		screen.click(symb_1_1);
		Thread.sleep(1000);
		screen.click(symb_1_2);
		Thread.sleep(1000);
		screen.click(wildsymb_2_1);
		Thread.sleep(1000);
		screen.click(wildsymb_2_2);
		Thread.sleep(1000);
		screen.click(wildsymb_2_3);
		Thread.sleep(1000);
		screen.click(wildsymb_2_4);
		Thread.sleep(1000);
		screen.click(wildsymb_2_5);
		Thread.sleep(1000);
		screen.click(wildsymb_2_2);
		Thread.sleep(1000);
		screen.click(wildsymb_2_4);
		Thread.sleep(1000);
		screen.click(wildsymb_2_2);
		Thread.sleep(1000);
		screen.click(wildsymb_2_4);
		Thread.sleep(1000);
		screen.click(wildsymb_2_3);
		Thread.sleep(1000);
		screen.click(wildsymb_2_2);
		Thread.sleep(1000);
		screen.click(wildsymb_2_6);
		Thread.sleep(1000);
		screen.click(wildsymb_2_4);
		Thread.sleep(1000);
		screen.click(wildsymb_2_2);
		Thread.sleep(1000);
		screen.click(wildsymb_2_3);
		Thread.sleep(1000);
		screen.click(wildsymb_2_4);
		Thread.sleep(1000);

		//comparing the wild win reels for 2,3 and 4th wild combinations
		//reels before wild spin
		Finder finder3 =new Finder(screen.capture().getImage());
		String ht3 = finder3.find(wildspin_before2);
		double score3=20;                
		System.out.println("the value of ht3"+" "+ht3);
		if(finder3.hasNext())
		{
			Match m3=finder3.next();
			System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			score3=(m3.getScore())*100;
			System.out.println("Wild reels set on 2,3 and 4th reels before spin");
			finder3.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild reels set on 2,3 and 4th reels before spin and comarision is: "+" "+score3 +"%");
		Assert.assertTrue(score3 > 97);

		screen.click(spin);
		Thread.sleep(8000);
		screen.click(take);
		Thread.sleep(3000);

		//comparing the wild win reels for 2,3 and 4th wild combinations
		//reels before wild spin
		Finder finder13 =new Finder(screen.capture().getImage());
		String ht13 = finder13.find(wildspin_after2);
		double score13=20;                
		System.out.println("the value of ht13"+" "+ht13);
		if(finder13.hasNext())
		{
			Match m13=finder13.next();
			System.out.println("Match Found with: "+(m13.getScore())*100+"%");
			score13=(m13.getScore())*100;
			System.out.println("Wild reels set on 2,3 and 4th reels after wheel spin");
			finder13.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild reels set on 2,3 and 4th reels after wheel spin and comarision is: "+" "+score13 +"%");
		Assert.assertTrue(score13 > 97);


		//Arranging the symbols to generate wild symbol on all reels
		screen.click(symb_6_1);
		Thread.sleep(1000);
		
		//comparing the wild win symbols on all reels wild combinations
		//reels before wild spin
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(wildspin_before);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Wild reels set on all reels before spin");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild reels set on all reels before spin and comarision is: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		screen.click(spin);
		Thread.sleep(8000);
		screen.click(take);
		Thread.sleep(3000);

		//comparing the wild win symbols on all reels wild combinations
		//reels before wild spin
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(wildspin_after);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("Wild symbol disappering on 3rd reel after wheel spin");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Wild symbol disappering on 3rd reel after wheel spin and comarision is: "+" "+score1 +"%");
		Assert.assertFalse(score1 > 97);
	}

	@Then("^Wild win combination verified for (\\d+),(\\d+) and (\\d+)th reel combinations in Gummy Land slot game$")
	public void wild_win_combination_verified_for_and_th_reel_combinations_in_Gummy_Land_slot_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Wild win combination verified for (\\d+),(\\d+),(\\d+) and (\\d+)th reel combinations and verify for the (\\d+)rd reel wild disappearing in Gummy Land slot game$")
	public void wild_win_combination_verified_for_and_th_reel_combinations_and_verify_for_the_rd_reel_wild_disappearing_in_Gummy_Land_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
