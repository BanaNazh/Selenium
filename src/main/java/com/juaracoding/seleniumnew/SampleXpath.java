package com.juaracoding.seleniumnew;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nurba\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin12");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

//		WebElement txtInvalidLogin = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
//		System.out.println(txtInvalidLogin.getText());

		String txtInvalidLogin = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
		System.out.println(txtInvalidLogin);
		if (txtInvalidLogin.contains("Invalid credential")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		
		boolean testImg = driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
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
}
