package com.ha.gotoo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoTo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Components\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.goto.com/meeting");

		driver.findElement(By.id("truste-consent-button")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Try Free')]")).click();

		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Cena");

		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");

		String Title = driver.getTitle();
		System.out.println(Title);

		Select sel = new Select(driver.findElement(By.id("CompanySize")));
		sel.selectByVisibleText("10 - 99");

		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();

	}

}
