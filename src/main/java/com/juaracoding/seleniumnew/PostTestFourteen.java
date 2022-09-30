package com.juaracoding.seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTestFourteen {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nurba\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String url = "https://formy-project.herokuapp.com/form";
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Bana");
		System.out.println("Keren, kamu sudah input First Name!");

		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("QA");
		System.out.println("Oke Banget! kamu sudah input Last Name!");

		driver.findElement(By.xpath("//input[@id='job-title']")).sendKeys("QA Engineer");
		System.out.println("Masyaallah, kamu sudah input Job Title!");

		driver.findElement(By.xpath("//input[@id='radio-button-2']")).click();
		System.out.println("Luar Biasa! kamu sudah input Highest Education!");

		driver.findElement(By.xpath("//input[@id='checkbox-2']")).click();
		System.out.println("Hebat! kamu sudah input Gender!");

		WebElement experience = driver.findElement(By.xpath("//select[@id='select-menu']"));
		Select selectExp = new Select(experience);
		selectExp.selectByValue("3");
		System.out.println("Fabulous! kamu sudah input Experience!");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.findElement(By.xpath("//td[normalize-space()='18']")).click();
		System.out.println("Mantap! kamu sudah input Tanggal!");

		driver.findElement(By.xpath("//a[@role='button']")).click();
		System.out.println("Okeloh! kamu selesai Submit Form ini!");

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
