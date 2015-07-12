package com.table;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableTest {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
 		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 		driver.get(System.getProperty("user.dir")+"\\src\\test\\resources\\test.html");
// 		driver.navigate().to("http://www.google.com");
  		driver.manage().window().maximize();
 
//  		List<WebElement> rows = driver.findElements(By.xpath("//table//*/tr"));
//  		for (WebElement row : rows){
//  			System.out.println(row.getText());
//  		}

  		List<WebElement> links = driver.findElements(By.xpath("//a"));
  		for (WebElement link : links){
  			System.out.println(link.getText());
  			link.click();
  		}
  		
	
	
}}
