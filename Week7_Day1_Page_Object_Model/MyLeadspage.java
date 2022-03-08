package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class MyLeadspage extends Basepage{
	
	public MyLeadspage(ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLeadpage CreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadpage(driver);	
}
	public FindLeadpage FindLeadstab() {
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		return new FindLeadpage(driver);
		
	}
	
	
	
}

