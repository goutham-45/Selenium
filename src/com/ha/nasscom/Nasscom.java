package com.ha.nasscom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nasscom {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Components\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://nasscom.in");

		driver.findElement(By.partialLinkText("New User")).click();
		driver.findElement(By.id("edit-field-fname-reg")).sendKeys("admin");

		driver.findElement(By.id("edit-field-lname")).sendKeys("pass");

		driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");

		driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("Google");

		Select sel = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		sel.selectByVisibleText("IT Consulting");

		driver.findElement(By.id("edit-submit--2")).click();

		driver.quit();

	}

}
