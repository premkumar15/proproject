package org.Parameters;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	WebDriver driver;
	@BeforeClass
	private void beforeclass() {
WebDriverManager.chromedriver().setup();
driver.get("url");
	}
	
private void entertext() {
            WebElement findElement = driver.findElement(By.id("username"));
            findElement.sendKeys("prem");
            WebElement findElement2 = driver.findElement(By.id("pass"));
            findElement2.sendKeys("123456");
            
}
}
