package com.juaracoding.seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phpTravel {
	
	public static void main(String[] args) {
		
//		pilihBrowser("Chrome");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nurba\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String url = "https://www.phptravels.net/login";
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin12");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
		
		delay(3);
		String txtInvalidLogin = driver.findElement(By.xpath("//div[@class='alert alert-danger failed']")).getText();
		System.out.println(txtInvalidLogin);
		if (txtInvalidLogin.contains("Wrong")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		
		boolean testImg = driver.findElement(By.xpath("//div[@class='logo']//img[@alt='logo']")).isDisplayed();
		System.out.println(testImg);
		if (testImg) {
			System.out.println("Test Image Pass");
		} else {
			System.out.println("Test Image Fail");
		}
		
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
	
	//pilihBrowser
//	static void pilihBrowser(String browser) {
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", browser);
//			WebDriver driver = new ChromeDriver();
//		} else {
//			System.setProperty("Webdriver.gecko.driver", browser)
//		}
	}

