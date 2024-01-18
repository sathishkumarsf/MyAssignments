package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Company");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sathish");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("sathish");
		
		
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("sathish");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("automation");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("create the lead source");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathishboss63@gmail.com");
		
		WebElement dropdown= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select drop=new Select(dropdown);
		
		drop.selectByValue("IN");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Details as been update");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
