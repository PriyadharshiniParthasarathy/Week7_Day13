package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class CreateLeadpage extends Basepage{
	public CreateLeadpage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadpage Enter_the_Firstname(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
}
	

	public CreateLeadpage Enter_the_Lastname(String Lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		return this;
}
	

	public CreateLeadpage Enter_the_Companyname(String Companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Companyname);
		return this;
}
	
	public ViewLeadpage clickoncreatelead_button() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadpage(driver);
}


}
