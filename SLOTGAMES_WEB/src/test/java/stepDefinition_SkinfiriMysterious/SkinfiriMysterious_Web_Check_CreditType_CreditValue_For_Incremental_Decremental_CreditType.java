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

public class SkinfiriMysterious_Web_Check_CreditType_CreditValue_For_Incremental_Decremental_CreditType {

	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, credit type as (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)  and credit balance generated respectively to credit types$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_credit_type_as_and_credit_balance_generated_respectively_to_credit_types(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) and increment and decrement the credit types and check the credit balance respectively$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_and_increment_and_decrement_the_credit_types_and_check_the_credit_balance_respectively(int arg1, int arg2) throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		screen.wait("Images/Skinfiri_Mysterious/Bet_place.PNG", 30);

		Pattern credit1=new Pattern("Images/Skinfiri_Mysterious/0.01_credit.PNG");
		Pattern credit2=new Pattern("Images/Skinfiri_Mysterious/0.02_credit.PNG");
		Pattern credit3=new Pattern("Images/Skinfiri_Mysterious/0.05_credit.PNG");
		Pattern credit4=new Pattern("Images/Skinfiri_Mysterious/0.5_credit.PNG");
		Pattern balance=new Pattern("Images/Skinfiri_Mysterious/bal_300.PNG");
		Pattern cr_bal1=new Pattern("Images/Skinfiri_Mysterious/cr_bal.PNG");
		Pattern cr_bal2=new Pattern("Images/Skinfiri_Mysterious/cr_bal_15000.PNG");
		Pattern cr_bal3=new Pattern("Images/Skinfiri_Mysterious/cr_bal_6000.PNG");
		Pattern cr_bal4=new Pattern("Images/Skinfiri_Mysterious/cr_bal_600.PNG");
		Pattern cr_inc=new Pattern("Images/Skinfiri_Mysterious/credit_inc.PNG");
		Pattern cr_dec=new Pattern("Images/Skinfiri_Mysterious/credit_dec.PNG");

		screen.click(balance);
		Thread.sleep(2000);

		//comparing the credit value should be 0.01
		Finder finder =new Finder(screen.capture().getImage());
		String ht = finder.find(credit1);
		double score=20;                
		System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
			Match m=finder.next();
			System.out.println("Match Found with: "+(m.getScore())*100+"%");
			score=(m.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 97);

		//comparing the credit balance
		Finder finder1 =new Finder(screen.capture().getImage());
		String ht1 = finder1.find(cr_bal1);
		double score1=20;                
		System.out.println("the value of ht1"+" "+ht1);
		if(finder1.hasNext())
		{
			Match m1=finder1.next();
			System.out.println("Match Found with: "+(m1.getScore())*100+"%");
			score1=(m1.getScore())*100;
			System.out.println("credit balance comparision completed successfully.");
			finder1.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit balance comparision: "+" "+score1 +"%");
		Assert.assertTrue(score1 > 97);

		screen.click(cr_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.02
		Finder finder11 =new Finder(screen.capture().getImage());
		String ht11 = finder11.find(credit2);
		double score11=20;                
		System.out.println("the value of ht11"+" "+ht11);
		if(finder11.hasNext())
		{
			Match m11=finder11.next();
			System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			score11=(m11.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder11.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 97);

		//comparing the credit balance
		Finder finder12 =new Finder(screen.capture().getImage());
		String ht12 = finder12.find(cr_bal2);
		double score12=20;                
		System.out.println("the value of ht12"+" "+ht12);
		if(finder12.hasNext())
		{
			Match m12=finder12.next();
			System.out.println("Match Found with: "+(m12.getScore())*100+"%");
			score12=(m12.getScore())*100;
			System.out.println("credit balance comparision completed successfully. ");
			finder12.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit balance comparision: "+" "+score12 +"%");
		Assert.assertTrue(score12 > 97);

		screen.click(cr_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.05
		Finder finder21 =new Finder(screen.capture().getImage());
		String ht21 = finder21.find(credit3);
		double score21=20;                
		System.out.println("the value of ht21"+" "+ht21);
		if(finder21.hasNext())
		{
			Match m21=finder21.next();
			System.out.println("Match Found with: "+(m21.getScore())*100+"%");
			score21=(m21.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder21.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score21 +"%");
		Assert.assertTrue(score21 > 97);

		//comparing the credit balance
		Finder finder22 =new Finder(screen.capture().getImage());
		String ht22 = finder22.find(cr_bal3);
		double score22=20;                
		System.out.println("the value of ht22"+" "+ht22);
		if(finder22.hasNext())
		{
			Match m22=finder22.next();
			System.out.println("Match Found with: "+(m22.getScore())*100+"%");
			score22=(m22.getScore())*100;
			System.out.println("credit balance comparision completed successfully. ");
			finder22.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit balance comparision: "+" "+score22 +"%");
		Assert.assertTrue(score22 > 97);

		screen.click(cr_inc);
		Thread.sleep(2000);

		//comparing the credit value should be 0.5
		Finder finder31 =new Finder(screen.capture().getImage());
		String ht31 = finder31.find(credit4);
		double score31=20;                
		System.out.println("the value of ht31"+" "+ht31);
		if(finder31.hasNext())
		{
			Match m31=finder31.next();
			System.out.println("Match Found with: "+(m31.getScore())*100+"%");
			score31=(m31.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder31.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score31 +"%");
		Assert.assertTrue(score31 > 95);
		Thread.sleep(2000);
		
		//comparing the credit balance
		Finder finder32 =new Finder(screen.capture().getImage());
		String ht32 = finder32.find(cr_bal4);
		double score32=20;                
		System.out.println("the value of ht32"+" "+ht32);
		if(finder32.hasNext())
		{
			Match m32=finder32.next();
			System.out.println("Match Found with: "+(m32.getScore())*100+"%");
			score32=(m32.getScore())*100;
			System.out.println("credit balance comparision completed successfully. ");
			finder32.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit balance comparision: "+" "+score32 +"%");
		Assert.assertTrue(score32 > 92);

		screen.click(cr_dec);
		Thread.sleep(2000);

		//comparing the credit value should be 0.05
		Finder finder41 =new Finder(screen.capture().getImage());
		String ht41 = finder41.find(credit3);
		double score41=20;                
		System.out.println("the value of ht41"+" "+ht41);
		if(finder41.hasNext())
		{
			Match m41=finder41.next();
			System.out.println("Match Found with: "+(m41.getScore())*100+"%");
			score41=(m41.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder41.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score41 +"%");
		Assert.assertTrue(score41 > 97);
		Thread.sleep(2000);
		
		//comparing the credit balance
		Finder finder42 =new Finder(screen.capture().getImage());
		String ht42 = finder42.find(cr_bal3);
		double score42=20;                
		System.out.println("the value of ht42"+" "+ht42);
		if(finder42.hasNext())
		{
			Match m42=finder42.next();
			System.out.println("Match Found with: "+(m42.getScore())*100+"%");
			score42=(m42.getScore())*100;
			System.out.println("credit balance comparision completed successfully. ");
			finder42.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit balance comparision: "+" "+score42 +"%");
		Assert.assertTrue(score42 > 97);
		Thread.sleep(2000);
		
		screen.click(cr_dec);
		Thread.sleep(2000);

		//comparing the credit value should be 0.02
		Finder finder51 =new Finder(screen.capture().getImage());
		String ht51 = finder51.find(credit2);
		double score51=20;                
		System.out.println("the value of ht51"+" "+ht51);
		if(finder51.hasNext())
		{
			Match m51=finder51.next();
			System.out.println("Match Found with: "+(m51.getScore())*100+"%");
			score51=(m51.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder51.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score51 +"%");
		Assert.assertTrue(score51 > 97);
		Thread.sleep(2000);
		
		//comparing the credit balance
		Finder finder52 =new Finder(screen.capture().getImage());
		String ht52 = finder52.find(cr_bal2);
		double score52=20;                
		System.out.println("the value of ht52"+" "+ht52);
		if(finder52.hasNext())
		{
			Match m52=finder52.next();
			System.out.println("Match Found with: "+(m52.getScore())*100+"%");
			score52=(m52.getScore())*100;
			System.out.println("credit balance comparision completed successfully. ");
			finder52.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit balance comparision: "+" "+score52 +"%");
		Assert.assertTrue(score52 > 97);
		Thread.sleep(2000);
		
		screen.click(cr_dec);
		Thread.sleep(2000);

		//comparing the credit value should be 0.01
		Finder finder61 =new Finder(screen.capture().getImage());
		String ht61 = finder61.find(credit1);
		double score61=20;                
		System.out.println("the value of ht61"+" "+ht61);
		if(finder61.hasNext())
		{
			Match m61=finder61.next();
			System.out.println("Match Found with: "+(m61.getScore())*100+"%");
			score61=(m61.getScore())*100;
			System.out.println("Credit value comparision happened successfully.");
			finder61.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Credit comparision value equals to: "+" "+score61 +"%");
		Assert.assertTrue(score61 > 97);
		Thread.sleep(2000);
		
		//comparing the credit balance
		Finder finder62 =new Finder(screen.capture().getImage());
		String ht62 = finder62.find(cr_bal1);
		double score62=20;                
		System.out.println("the value of ht62"+" "+ht62);
		if(finder62.hasNext())
		{
			Match m62=finder62.next();
			System.out.println("Match Found with: "+(m62.getScore())*100+"%");
			score62=(m62.getScore())*100;
			System.out.println("credit balance comparision completed successfully.");
			finder62.destroy();  
		}         
		else    
		{ 
			System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("credit balance comparision: "+" "+score62 +"%");
		Assert.assertTrue(score62 > 97);
	}

	@Then("^credit balance value should get changed according to credit type from the drop down in Skinfiri Mysterious slot game$")
	public void credit_balance_value_should_get_changed_according_to_credit_type_from_the_drop_down_in_Skinfiri_Mysterious_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
