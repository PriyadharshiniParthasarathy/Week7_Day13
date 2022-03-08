package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage_Servicenow;

public class Servicenow_Incident_newrecordpage extends Basepage_Servicenow{
	
	public Servicenow_Incident_newrecordpage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public Servicenow_Incident_newrecordpage Select_a_value_for_Caller(String Name) {
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys(Name);
		return this;
	}
	public Servicenow_Incident_newrecordpage Enter_the_Short_description(String description) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("incident.short_description")).sendKeys(description);
		return this;
	}
	
	public Servicenow_Incidentpage Click_on_Submitbutton() {
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		return new Servicenow_Incidentpage(driver);
	}
	
}
