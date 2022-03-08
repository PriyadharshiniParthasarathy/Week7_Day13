package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import Week7_Hooks.Basepage;

public class Myhomepage extends Basepage{

	public Myhomepage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyLeadspage clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadspage(driver);
}
	public MyContactpage Click_on_CreateContact() {
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')][1]")).click();
		return new MyContactpage(driver);
		
}
}
