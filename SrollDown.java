package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.greenstechnologys.com/");
		//Java Script Executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Scroll down
		WebElement Porur = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		js.executeScript("arguments[0].scrollIntoView(true)", Porur);
		String text = Porur.getText();
		System.out.println(text);
		
		
		
	}

}
