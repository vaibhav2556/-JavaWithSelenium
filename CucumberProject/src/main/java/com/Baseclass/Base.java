package com.Baseclass;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Base {
	
	static String url = "F:\\Jars\\Chrome driver 88 version\\chromedriver.exe";
	public static WebDriver driver;
	static String openUrl = "https://opensource-demo.orangehrmlive.com/";

	public static void init(String openUrl)

	{

		System.setProperty("webdriver.chrome.driver", url);
		driver = new ChromeDriver();
		driver.get(openUrl);

	}
}
