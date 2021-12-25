package org.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//By ---> Abstract class
	
	//1.By using id:
	WebElement txtUserName= driver.findElement(By.id("email"));
	txtUserName.sendKeys("8056780073");
	
	//send keys used for fill and insert text into the text box
	
	WebElement txtPassword=driver.findElement(By.id("pass"));
	txtPassword.sendKeys("gangajas");
	
	//Xpath index
	//WebElement btnCreate=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	//btnCreate.click();
	
	//WebElement btnLogin=driver.findElement(By.xpath("//button[@value='1']"));
	//btnLogin.click();
	// click is used for click anything in web page 
//         like button,link,image,radio button, check box etc.,
	
	//find elements 
	List<WebElement> buttons=driver.findElements(By.xpath("//a[@role='button']"));
	WebElement create=buttons.get(1);
	create.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
