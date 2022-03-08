package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage_Servicenow;

public class Servicenow_Homepage extends Basepage_Servicenow{
	
	public Servicenow_Homepage(ChromeDriver driver) {
		this.driver = driver;
	}
	public Servicenow_Homepage Enter_the_filter_as_incident(String filter) throws InterruptedException {
		Thread.sleep(10000);
		WebElement Filter = driver.findElement(By.xpath("//input[@id='filter']"));
		Filter.sendKeys(filter);
		Filter.click();
		return this;
	}
	
	public Servicenow_Incidentpage Click_on_Alltab_under_the_incident() {
		driver.findElement(By.linkText("All")).click();
		return new Servicenow_Incidentpage(driver);
	}
	

	
}
