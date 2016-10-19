package com.ggktech.Appium1;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Verify;

public class Scripts {
	private static AndroidDriver driver;
	private Object wait;
	
	public void verifyLogin() throws MalformedURLException, InterruptedException{
		Functions.login();
		Functions.logout();
	}
	
	public void verifyCommunities() throws MalformedURLException, InterruptedException{
		Functions.login();
		Functions.community();
		System.out.println("Able to tap on Communities");
		Functions.logout();
	}
	
	public void verifyChallenges() throws MalformedURLException, InterruptedException{
		Functions.login();
		Functions.challenge();
		System.out.println("Able to tap on Challenges");
		Functions.logout();
	}
	
	public void verifyRewards(){
		try{
		Functions.login();
		Functions.rewards();
		System.out.println("Tapped on Rewards");
		Functions.logout();
		}
		catch(Exception e){
			System.out.println("Exception is" +e);
		}
	}
	
	public void verifyMetrics(){
		try{
		Functions.login();
		Functions.metrics();
		System.out.println("Tapped on Metrics");
		Functions.logout();
		}
		catch(Exception e){
			System.out.println("Exception is" +e);
		}
	}

}
