package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		WebElement  dropdown1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select drop1=new Select(dropdown1);
		
		drop1.selectByIndex(1);
		
		WebElement dropdown2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select drop2=new Select(dropdown2);
		
		drop2.selectByValue("CATRQ_AUTOMOBILE");
		
	WebElement dropdown3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	
	Select drop3=new Select(dropdown3);
	
	drop3.selectByVisibleText("Sole Proprietorship");
	
	System.out.println(drop1.getFirstSelectedOption().getText());
	System.out.println(drop2.getFirstSelectedOption().getText());
	System.out.println(drop3.getFirstSelectedOption().getText());
	
	Thread.sleep(5000);
	

	}

	}


	
