package com.ha.orangehrmlive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLive {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Components\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		String Title = driver.getTitle();
		System.out.println(Title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.findElement(By.id("welcome")).click();

		driver.findElement(By.linkText("Logout")).click();

		driver.quit();

	}

}
