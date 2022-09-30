package com.juaracoding.TestHello;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHello {
	
	//membuat penampung drivernya
	public WebDriver driver;
	
	
	@BeforeTest
	public void createDriver() {
		//menginstance driver
//		System.setProperty("url", "https://www.detik.com/");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
//		driver.get(System.getProperty("url"));
		driver.get("https://randompokemon.com/");
		driver.manage().window().maximize();
			
	}
	
	@Test
	public void test() {
		//contoh penggunaan single element
//		WebElement button = driver.findElement(By.cssSelector("input[value='Generate']"));
//		button.click();
		
		//contoh penggunaan multiple elements
		List<WebElement> listCheckbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
	
		for (WebElement webElement : listCheckbox) {
			webElement.click();
			Reporter.log(webElement.getAttribute("name"),true);
		}
		
		}
		
	}
	


