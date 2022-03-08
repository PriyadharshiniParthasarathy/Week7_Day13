package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class Loginpage extends Basepage{
	
	public Loginpage(ChromeDriver driver) {
		this.driver = driver;
	}
	public Loginpage typeusername(String userID) {
		driver.findElement(By.id("username")).sendKeys(userID);
		return this;
	}

	public Loginpage typePassword(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
	}
	
	public Homepage clicklogin(){
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Homepage(driver);
	}
}
