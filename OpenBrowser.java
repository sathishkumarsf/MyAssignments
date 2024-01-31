package week2.day1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text' and @ id='email']")).click();

	}

}
