package com.table;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTable;

public class tableTestTwo {

	public static void main(String[] args) {
gettbl("2", "1");
gettbl("3", "3");
}
	

		
		public static String gettbl (String row, String col){
			WebDriver driver;
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 		driver.get(System.getProperty("user.dir")+"\\src\\test\\resources\\test.html");
	  		driver.manage().window().maximize();
	  		WebElement tab = driver.findElement(By.xpath("//*/table//*/tr["+ row +"]//td["+col+"]"));
	  		System.out.println(tab.getText());
		 return null;
			
		}


}
