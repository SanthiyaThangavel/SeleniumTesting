package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();

	    String url="https://www.abhibus.com/bus-ticket-booking";
	    driver.get(url);   
	    driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore",Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Mayiladuthurai",Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	}

}
