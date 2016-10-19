package com.ggktech.Appium1;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects {
	
	private static WebElement element = null;
	//private static AndroidDriver driver;
	
	public static WebElement Log_in_Home(AndroidDriver driver){
	element = driver.findElement(By.xpath("//android.widget.Button[@text='Log in']"));
	return element;
	}

	public static WebElement Email(AndroidDriver driver){
	element = driver.findElement(By.xpath("//android.widget.EditText[@text='email']"));
	System.out.println("test");
	return element;
	
		}
	
	public static WebElement Password(AndroidDriver driver){
		element = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
		return element;
			}
	
	public static WebElement Log_In(AndroidDriver driver){
		element = driver.findElement(By.xpath("//android.widget.Button[@text='Log In']"));
		return element;
			}
	
	public static WebElement I_Agree(AndroidDriver driver){
		element = driver.findElement(By.xpath("//android.widget.Button[@index='5']"));
		return element;
		
	}
	
	public static WebElement menu_drop_down(AndroidDriver driver){
		element = driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
		return element;
		
	}
		
		public static WebElement Settings(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));
			return element;	
		
	}
		
		public static WebElement logout(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Log out']"));
			return element;	
	}
		
		/*locators for Community screen*/
		
		public static WebElement communities(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']"));
			return element;	
	}
		
		public static WebElement textin_communityscreen(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Harry Tasker Fans']"));
			return element;	
	}
		
		public static WebElement yours(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Yours']"));
			return element;	
	}
		
		/*locators for Challenges screen*/
		
		public static WebElement challenges(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']"));
			return element;	
	}
		
		public static WebElement Active(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Active']"));
			return element;	
	}
		
		public static WebElement Finished(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Finished']"));
			return element;	
	}
		
		/*locators for Rewards screen*/
		
		public static WebElement rewards(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Rewards']"));
			return element;	
	}
		
		public static WebElement metrics(AndroidDriver driver){
			element = driver.findElement(By.xpath("//android.widget.TextView[@text='Metrics']"));
			return element;	
	}
	
	

	
}
