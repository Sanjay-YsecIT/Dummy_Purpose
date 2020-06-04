package stepDefinition_SkinfiriMysterious;

//import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriMysterious_Web_Balance_Deduction_AccordingToBetType1_5 {

	WebDriver driver;
	Screen screen=new Screen();
	
	
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious game, bet type as (\\d+)\\.(\\d+), bet value as FOUR, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_game_bet_type_as_bet_value_as_FOUR_balance_and_spin_button(int arg1, int arg2) throws Throwable {
	   
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
		
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value to FOUR, click on spin button and check the slot game balance$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_to_FOUR_click_on_spin_button_and_check_the_slot_game_balance(int arg1, int arg2) throws Throwable {
	    
		
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("./Images/Skinfiri_Mysterious/Bet_place.PNG", 10);
		Thread.sleep(15000);
		
//		WebElement frame = driver.findElement(By.xpath("//*[@id='iframeSlotGame']"));
//		File sct = frame.getScreenshotAs(OutputType.FILE);
//		File DestSrc = new File("./ScreenShots/scrsht/Bet0.1_0.2.png");
//		FileUtils.copyFile(sct, DestSrc);
//		Thread.sleep(15000);
	 
		
		Pattern credit=new Pattern("./Images/Skinfiri_Mysterious/0.01_credit.PNG");
		Pattern betval=new Pattern("./Images/Skinfiri_Mysterious/betvalue1_5.PNG");
		Pattern spin=new Pattern("./Images/Skinfiri_Mysterious/Spin.PNG");
		Pattern Afterspin_bal=new Pattern("./Images/Skinfiri_Mysterious/Reminingbal_296.PNG");
		

		 //String ht = finder.find(pat);
		  Thread.sleep(15000);
		  //clicking on Bet VALUE
	       screen.click(betval);
	       Thread.sleep(3000);
	      //CLICKING ON Spin button
	      screen.click(spin);
	      Thread.sleep(4000);
		
		
		
		
		 //comparing the credit value should be 0.01
	   //   Pattern credit1=new Pattern("E:/Sikuli Images/Bet Values/creditvalue1.png");
		
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value comparision happened successfully. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97); 
		  
		  
		  //comparing the balance after spinning should be deducted by 0.2 value
	    //  Pattern pat=new Pattern("E:/Sikuli Images/Bet Values/balance.png");
		  
	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(Afterspin_bal);
	      double score1=20;                
	      System.out.println("the value of ht"+" "+ht1);
	 	  if(finder1.hasNext())
	 	  {
	 	  Match m1=finder1.next();
	 	  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
	 	  score1=(m1.getScore())*100;
	 	  System.out.println("Comparision happened successfully. Test case passed");
	 	  finder1.destroy();  
	 	  }         
	 	  else    
	 	  { 
	 	  System.out.println("Comparision failed. Test case failed");         
	 	  }
	 	  System.out.println("Comparision value equals to: "+" "+score1 +"%");
	 	  //Assert.assertEquals(100.0,score );
	 	  Assert.assertTrue(score1 > 97);
	 	
	}

	@Then("^Existing Balance should get deducted by FOUR as bet type is selected as (\\d+)\\.(\\d+) and bet value as FOUR in Skinfiri Mysterious slot game$")
	public void existing_Balance_should_get_deducted_by_FOUR_as_bet_type_is_selected_as_and_bet_value_as_FOUR_in_Skinfiri_Mysterious_slot_game(int arg1, int arg2) throws Throwable {
	  

		 Thread.sleep(3000);
		    driver.quit();
		
		
	}

}
