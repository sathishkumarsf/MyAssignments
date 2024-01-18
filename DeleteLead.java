package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9994851878");
		
		driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//tbody[1]/tr[1]/td[1]/div[1]/a")).getText());
		
		driver.findElement(By.xpath("//tbody[1]/tr[1]/td[1]/div[1]/a")).click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9994851878");
		
		driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
		
		 String firtname="sathish";
		 boolean flag=false;
		
		if (driver.getTitle().equalsIgnoreCase(firtname))
		{
			flag=true;
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[1]/div[1]/a")).click();
		}
		

			else {	
		
		System.out.println(driver.findElement(By.xpath("//div[contains (text(),'No records to display')]")).getText());

	}

	}
}
