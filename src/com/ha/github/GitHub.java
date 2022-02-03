package com.ha.github;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Components\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://github.com");

		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();

		driver.findElement(By.id("login_field")).sendKeys("Admin");

		driver.findElement(By.id("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@name='commit']")).click();

		driver.quit();

	}

}
