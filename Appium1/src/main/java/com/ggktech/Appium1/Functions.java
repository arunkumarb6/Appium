package com.ggktech.Appium1;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Functions {
	private static AndroidDriver driver;
	private static final Logger LOGGER = Logger.getLogger(Functions.class);
	
	@BeforeTest
	 public static void DesiredCapabilities() throws MalformedURLException, InterruptedException{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "Google Nexus 6 ");
			capabilities.setCapability("platformVersion", "4.2.2");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", Constants.appPackage);
			capabilities.setCapability("appActivity", Constants.appActivity);
			driver = new AndroidDriver(new URL(Constants.URL), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			System.out.println("higi App is successfully launched");
			Thread.sleep(10000);
		//	driver.quit();
		}
	
	/**
	 * Login function for higi app
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	
	@Test
	public static void login() throws MalformedURLException, InterruptedException{
		DesiredCapabilities();
		Objects.Log_in_Home(driver).click();
		Objects.Email(driver).sendKeys(Constants.sUsername);
		Objects.Password(driver).sendKeys(Constants.sPassword);
		Objects.Log_In(driver).click();
		//Objects.I_Agree(driver).click();
		System.out.println("Login is successfull");
		}
	
	/**
	 * Validating logout of higi App
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	
	@Test
	public static void logout() throws MalformedURLException, InterruptedException{
		Objects.menu_drop_down(driver).click();
		Objects.Settings(driver).click();
		swiping_TopToBottom();
		Objects.logout(driver).click();
		driver.quit();
		System.out.println("App is closed");
	}
	
	public static void community(){
		Objects.communities(driver).click();
		//Objects.textin_communityscreen(driver).isDisplayed();
		Objects.yours(driver).isDisplayed();
	}
	
	public static void challenge(){
		Objects.challenges(driver).click();
		Objects.Active(driver).isDisplayed();
		Objects.Finished(driver).isDisplayed();
	}
	
	public static void rewards(){
		Objects.rewards(driver).click();
	}
	
	public static void metrics(){
		Objects.metrics(driver).click();
	}
		
	
	/**
	 * Method for swipe horizontally from right to left and vice versa
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void validateSwipeon_Welcome_page() throws MalformedURLException, InterruptedException{
		 Dimension size = driver.manage().window().getSize();
		// System.out.println(size);
		 int startx = (int) (size.width * 0.70);
		 int endx = (int) (size.width * 0.30);
		 int starty = size.height / 2;
		 //System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
		 for(int i=0;i<=4;i++){
		 driver.swipe(startx, starty, endx, starty, 2000);
		 } 
		 for(int i=0;i<=4;i++){
			 driver.swipe(endx, starty, startx, starty, 2000);
			 }
		 //Thread.sleep(2000);
		 
	}
	
	/**
	 * Method to swipe from top to bottom
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	
	public static void swiping_TopToBottom() throws MalformedURLException, InterruptedException{
		 Dimension size = driver.manage().window().getSize();
		 //System.out.println(size);
		 int starty = (int) (size.height * 0.80);
		 int endy = (int) (size.width * 0.20);
		 int startx = size.width / 2;
		  driver.swipe(startx, starty, startx, endy, 3000);
	}
	
	/**
	 * Method to swipe from bottom to top
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	
	public void swiping_BottomToTop() throws MalformedURLException, InterruptedException{
		 Dimension size = driver.manage().window().getSize();
		 System.out.println(size);
		 int starty = (int) (size.height * 0.80);
		 int endy = (int) (size.width * 0.20);
		 int startx = size.width / 2;
		  driver.swipe(startx, endy, startx, starty, 3000);
	}
	
	public void tearDown(){
		driver.closeApp();
		}
		
	
}
