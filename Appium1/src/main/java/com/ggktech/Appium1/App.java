package com.ggktech.Appium1;
import io.appium.java_client.android.AndroidDriver;

import com.ggktech.Appium1.Functions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.maven.settings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
 
public class App {
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		/*
				File classpathRoot = new File(System.getProperty("user.dir"));
				File appDir = new File(classpathRoot, "/Apps/Amazon/");
				File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");*/
				Functions test = new Functions();
				
				//test.DesiredCapabilities();
				//test.validateSwipeon_Welcome_page();
				Scripts scr = new Scripts();
				scr.verifyLogin();
				scr.verifyCommunities();
				scr.verifyChallenges();
				scr.verifyRewards();
				scr.verifyMetrics();
				
						
				System.out.println("Test scripts are executed successfully");
				}
	}


 
