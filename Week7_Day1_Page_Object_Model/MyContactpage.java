package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class MyContactpage extends Basepage {

	public MyContactpage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyContactpage Enter_the_Firstname(String firstname) {
		driver.findElement(By.id("firstNameField")).sendKeys(firstname);
		return this;
}
	public MyContactpage Enter_the_Lastname(String Lastname) {
		driver.findElement(By.id("lastNameField")).sendKeys(Lastname);
		return this;
}
	
	public ViewContact Click_on_createcontactbutton() {
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		return new ViewContact(driver);
}	
}


