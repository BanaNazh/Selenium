package com.juaracoding.seleniumnew;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nurba\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.id("userName")).sendKeys("Bana");
		System.out.println("Input User Name");
		driver.findElement(By.id("userEmail")).sendKeys("bana9988@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Jalan Swargaloka");
		driver.findElement(By.id("permanentAddress")).sendKeys("Jalan Siliwangi");

		// --cara 1 : scroll berdasarkan pixel
//		js.executeScript("Window.scrollBy(0,1300");

		// --cara 2 : scroll menggunakan elemen tertentu
		WebElement btnSubmit = driver.findElement(By.id("submit"));

		js.executeScript("arguments[0].scrollIntoView()", btnSubmit);

		btnSubmit.click();
		System.out.println("Click Button Submit");
//		driver.findElement(By.id("submit")).click();

		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
