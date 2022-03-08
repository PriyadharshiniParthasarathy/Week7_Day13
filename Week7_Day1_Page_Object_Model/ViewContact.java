package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class ViewContact extends Basepage {

	public ViewContact(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewContact Verify_the_ContactName() {
		WebElement ContactName = driver.findElement(By.xpath("//td[@colspan='4']//span"));
		if(ContactName.getText().contains("Priya"))
		{
			System.out.println("Verified the ContactName");
}
		else
		{
			System.out.println("ContactName is not getting displayed");
		}
		return this;
		
		
}


}