package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
	public  static void main( String[] args ) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
    	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Santhiya");
    	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("Sxndy@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Sree");
    	driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Sree@gmail.com");
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Greetings");
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	}
}
