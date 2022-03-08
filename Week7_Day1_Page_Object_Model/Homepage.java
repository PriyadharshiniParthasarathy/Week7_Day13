package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class Homepage extends Basepage {
	public Homepage(ChromeDriver driver) {
		this.driver = driver;
	}
	public Myhomepage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new Myhomepage(driver);
	}

}
