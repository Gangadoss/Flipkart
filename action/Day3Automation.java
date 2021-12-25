package org.test.action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day3Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		//url lauch
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement txtfstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtfstname.sendKeys("Dinesh");

		
		WebElement txtlastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtlastname.sendKeys("karthick");
		
		WebElement txtadd = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtadd.sendKeys("kamarajar west,sivagiri");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtmail.sendKeys("dkarthicksdk555");
		
		WebElement txtph = driver.findElement(By.xpath("//input[@type='tel']"));
		txtph.sendKeys("8012862686");
		
		WebElement btnclick = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		btnclick.click();
		
		WebElement hobbyclick = driver.findElement(By.id("checkbox1"));
		 hobbyclick.click();
		 
		 WebElement skills = driver.findElement(By.id("Skills"));
		 Select s=new Select(skills);
		 s.selectByIndex(4);
		
		 WebElement lan = driver.findElement(By.id("msdd"));
		 lan.click();
		 
		 WebElement eng = driver.findElement(By.xpath("//a[text()='English']"));
		 eng.click();
		 
		 WebElement Urdu = driver.findElement(By.xpath("//a[text()='Urdu']"));
		 Urdu.click();
		 
		 WebElement Ukrainian = driver.findElement(By.xpath("//a[text()='Ukrainian']"));
		 Ukrainian.click();
		 
//	     WebElement scrolldwon = driver.findElement(By.id("Button1"));
//     	 JavascriptExecutor js=(JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollIntoView(true)", scrolldwon);
	 
		 WebElement link = driver.findElement(By.xpath("//b[@role='presentation']"));
   	     link.click();
		 
		 WebElement india = driver.findElement(By.xpath("//li[text()='India']"));
		 india.click();
		 
		 Select s1=new Select(india);
		 WebElement year = driver.findElement(By.id("yearbox"));
		 Select s11=new Select(year);
		s11.selectByVisibleText("2000");
		
		
		
	}	

}
