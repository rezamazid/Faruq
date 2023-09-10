package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularXpath {

	WebDriver driver;
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jkj");
		
		//driver.findElement(By.xpath("//*[@name='pass']")).clear();
		///driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("hkhh");
		
		WebElement passWord=driver.findElement(By.xpath("//*[@name='pass']"));
		//passWord==local variable
		passWord.clear();
		passWord.sendKeys("hkhh");
		System.out.println(passWord.getTagName());
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		
	}
}
