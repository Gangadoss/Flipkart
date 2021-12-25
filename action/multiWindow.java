package org.test.action;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindow {
	public static void main(String[] args) {
		
		//urllauch
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//url lanch
		driver.get("https://www.amazon.in/");
		
		WebElement checkbx = driver.findElement(By.id("twotabsearchtextbox"));
		checkbx.sendKeys("sumsung f12");
		
		WebElement chckclk = driver.findElement(By.id("nav-search-submit-button"));
		chckclk.click();
		
		WebElement subclk = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		subclk.click();
		
		//parent id
		String oneid=driver.getWindowHandle(); //partent id start 10
		System.out.println(oneid);
		
		//all window id
		Set<String> allid = driver.getWindowHandles(); //all window id 1=10 2=20 3=30
		System.out.println(allid);
		
		//1 st way(condition depent) ----> enhance for loop
		                             //refnme=refvalue
//	for(String eachid:allid) {//eachid=allid
//		if(!oneid.equals(eachid)) { //condition 10 ! is for the loop(true--break)
//		    driver.switchTo().window(eachid);	
//				
//				
//			}
//		}
		
		
		//2nd way(count) no of tab it can assign 1, 2, 3
		
//		int count=1;
//		for(String eachid:allid) {
//			if(count==2) {
//				driver.switchTo().window(eachid);
//			}
//			count++;     //1+1=2 the count 2==2 then condition is true
//		}
		
		//3rd way
		
		List<String> li=new ArrayList<>();
		li.addAll(allid);
		System.out.println(li);
		
		driver.switchTo().window(li.get(1));
		
		WebElement linkclick = driver.findElement(By.id("buy-now-button"));
		linkclick.click();
		
		
		
		
		
	}
	

}
