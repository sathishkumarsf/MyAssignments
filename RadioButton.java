package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).isEnabled());
		
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).getText());
		
		driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).isEnabled();
		
		System.out.println(driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).isEnabled());
		
		
		
		

	}

}
