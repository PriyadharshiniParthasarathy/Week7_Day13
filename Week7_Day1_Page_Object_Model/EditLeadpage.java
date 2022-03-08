package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class EditLeadpage extends Basepage{
	public EditLeadpage(ChromeDriver driver) {
		this.driver = driver;
	}

	public EditLeadpage Clear_the_companyname() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		Thread.sleep(2000);
		return this;
}
	
	public EditLeadpage Change_the_companyname(String companyName) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyName);
		return this;
}
	public ViewLeadpage Click_on_the_update_button() {
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		return new ViewLeadpage(driver);
}

	public EditLeadpage Enter_the_Lastname(String Lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		return this;
}
	

	public EditLeadpage Enter_the_Companyname(String Companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Companyname);
		return this;
}
	
	public ViewLeadpage clickoncreatelead_button() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadpage(driver);
}


}
