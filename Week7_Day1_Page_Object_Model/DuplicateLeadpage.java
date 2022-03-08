package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class DuplicateLeadpage extends Basepage {

	public DuplicateLeadpage(ChromeDriver driver) {
		this.driver = driver;
	}
	public ViewLeadpage Click_on_the_CreateLeadbutton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		return new ViewLeadpage(driver);
		
	}


}