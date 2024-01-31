package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//span[contains( text(),'Basic')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[contains( text(),'Basic')]")).isEnabled());
		
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).getText());
		
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Unchecked')]")).getText());
		
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click(); 	
		
		driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon ui-c')]")).click();
		
	//	driver.close();
	}
	
}
