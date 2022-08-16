package justdial.com.flights;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AirTickets {
	private AndroidDriver<AndroidElement> driver = null;
	
	@Test
	public void bookRoundTrip1() 
	{
		try
		{
			//RoundWayBooking
			driver.findElement(By.xpath("//android.widget.TextView[@text='Travel']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Flights']")).click();
			Thread.sleep(4000);


			driver.findElement(By.xpath("//android.widget.Button[@text='Round Trip']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/from_city']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_flight']")).sendKeys("coimb");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Coimbatore, IN - Peelamedu']")).click();
			Thread.sleep(4000);



			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/to_city']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_flight']")).sendKeys("che");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Chennai, IN - Chennai Airport']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/depature_date']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("(//android.widget.TextView[@text='19'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//android.widget.TextView[@text='20'])[1]")).click();
			Thread.sleep(4000);
			//Search flights
			driver.findElement(By.xpath("//android.widget.TextView[@text='Search']")).click();
			Thread.sleep(4000);

		}
		catch(Exception e) 
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} 	
	}
	@Test
	public void bookRoundTrip2() 
	{
		try
		{
			//RoundWayBooking
			driver.findElement(By.xpath("//android.widget.TextView[@text='Travel']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Flights']")).click();
			Thread.sleep(4000);


			driver.findElement(By.xpath("//android.widget.Button[@text='Round Trip']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/from_city']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_flight']")).sendKeys("coimb");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Coimbatore, IN - Peelamedu']")).click();
			Thread.sleep(4000);



			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/to_city']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_flight']")).sendKeys("Ban");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Bangalore, IN - Kempegowda International Airport']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/depature_date']")).click();
			Thread.sleep(7000);

			driver.findElement(By.xpath("(//android.widget.TextView[@text='20'])[1]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//android.widget.TextView[@text='21'])[1]")).click();
			Thread.sleep(8000);
			//Search flights
			driver.findElement(By.xpath("//android.widget.TextView[@text='Search']")).click();
			Thread.sleep(4000);

		}
		catch(Exception e) 
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} 	
	}
	@Test
	public void bookRoundTrip3() 
	{
		try
		{
			//RoundWayBooking
			driver.findElement(By.xpath("//android.widget.TextView[@text='Travel']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Flights']")).click();
			Thread.sleep(4000);


			driver.findElement(By.xpath("//android.widget.Button[@text='Round Trip']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/from_city']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_flight']")).sendKeys("che");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Chennai, IN - Chennai Airport']")).click();
			Thread.sleep(4000);



			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/to_city']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_flight']")).sendKeys("Mum");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Mumbai, IN - Chhatrapati Shivaji International Airport']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.justdial.search:id/depature_date']")).click();
			Thread.sleep(7000);

			driver.findElement(By.xpath("(//android.widget.TextView[@text='21'])[1]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//android.widget.TextView[@text='22'])[1]")).click();
			Thread.sleep(8000);
			//Search flights
			driver.findElement(By.xpath("//android.widget.TextView[@text='Search']")).click();
			Thread.sleep(4000);

		}
		catch(Exception e) 
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} 	
	}
	@BeforeMethod
	public void setUp() {


		try 
		{ 
			//Desired capabilities for real device-jd apk
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "11");
			cap.setCapability("deviceName", "m");
			cap.setCapability("appPackage", "com.justdial.search");
			cap.setCapability("appActivity", "com.justdial.search.SplashScreenNewActivity");
			//cap.setCapability("browserName", "chrome");
			cap.setCapability("SystemPort", 8200);
			cap.setCapability("launchTimeout", "30000");
			cap.setCapability("udid", "ZF622725HZ");
			cap.setCapability("noReset", true);



			//Connect Appium Server and launch apk

			driver = new AndroidDriver<AndroidElement> (new URL("http:127.0.0.1:4723/wd/hub"),cap);
			System.out.println("Server connected successfully");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println("App Launched successfully");
			Thread.sleep(4000);


		}
		catch(Exception e) 
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} 	  
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.closeApp();
	}

}
