package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage_Servicenow;

public class Servicenow_Incidentpage extends Basepage_Servicenow{
	
	public Servicenow_Incidentpage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public Servicenow_Incident_newrecordpage Click_on_Newbutton() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		return new Servicenow_Incident_newrecordpage(driver);
	}

	
}
