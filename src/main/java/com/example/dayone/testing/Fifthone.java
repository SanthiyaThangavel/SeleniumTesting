package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fifthone {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.navigate().to("https://j2store.net/free/");
    	String url=driver.getCurrentUrl();
    	System.out.println();
	}
}
