package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Components\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.openemr.io/b/openemr");

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");

		Select sel = new Select(driver.findElement(By.name("languageChoice")));
		sel.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String Title = driver.getTitle();
		System.out.println(Title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.findElement(By.xpath("//div[contains(text(),'Messages')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		// a[@class='btn btn-primary btn-add']
		Select Sel = new Select(driver.findElement(By.id("form_note_type")));
		Sel.selectByVisibleText("Insurance");

//		driver.quit();		

	}
}
