package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[2]/div/input")).sendKeys("Santhiya");
    	driver.findElement(By.id("input-lastname")).sendKeys("Thangavel");
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("santhiyasree@gmail.com");
    	driver.findElement(By.id("input-password")).sendKeys("sxnthiyx");
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        Thread.sleep(5000);
    }
}
