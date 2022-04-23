package org.goo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			String title= driver.getTitle();
			System.out.println(title);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			WebElement txtq =  driver.findElement(By.name("q"));
			txtq.sendKeys("GreensTechnology");
	}

}
