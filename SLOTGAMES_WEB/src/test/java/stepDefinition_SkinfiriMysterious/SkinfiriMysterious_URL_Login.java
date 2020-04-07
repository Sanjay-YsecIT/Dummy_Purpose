package stepDefinition_SkinfiriMysterious;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.Before;
import cucumber.api.Scenario;


public class SkinfiriMysterious_URL_Login {
	
	private static WebDriver driver;
	
	@Before
	public static void main(String[] args) throws InterruptedException, MalformedURLException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(3000);


		driver.findElement(By.id("txtUserName")).sendKeys("5273290266");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Password / Card Pin']")).sendKeys("mans@123");
		Thread.sleep(2000);

		driver.findElement(By.className("loginActive")).click();
		Thread.sleep(20000);
		System.out.println("Login to the game with valid credentials");


		Screen screen=new Screen();
		Pattern image1=new Pattern("./Images/Skinfiri_Mysterious/SM_logo.PNG");
		screen.click(image1);
		Thread.sleep(5000);

	}
	public static WebDriver getDriver()
	{
		return driver;

	}
}
