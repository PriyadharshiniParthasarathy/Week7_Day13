package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage_Servicenow;

public class Servicenow_Loginpage extends Basepage_Servicenow{
	
	public Servicenow_Loginpage(ChromeDriver driver) {
		this.driver = driver;
	}
	public Servicenow_Loginpage typeusername(String userID) {
		driver.switchTo().frame("gsft_main");
		WebElement Username = driver.findElement(By.name("user_name"));
		Username.sendKeys(userID);
		return this;
	}

	public Servicenow_Loginpage typePassword(String Password) {
		driver.findElement(By.name("user_password")).sendKeys(Password);
		return this;
	}
	
	public Servicenow_Homepage clicklogin_button(){
		driver.findElement(By.name("not_important")).click();
		return new Servicenow_Homepage(driver);
	}
}
