package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://demo.guru99.com/test/delete_customer.php");
    	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401");
    	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
    	driver.findElement(By.xpath(""));
    	
	}

}
