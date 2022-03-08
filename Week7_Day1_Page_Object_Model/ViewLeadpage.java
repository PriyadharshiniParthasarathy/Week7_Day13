package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class ViewLeadpage extends Basepage {

	public ViewLeadpage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadpage Verify_the_firstname() {
		WebElement Firstname1 = driver.findElement(By.id("viewLead_firstName_sp"));
		if(Firstname1.getText().contains("Priya"))
		{
			System.out.println("Verified the lead firstname");
}
		else
		{
			System.out.println("Lead firstname is not getting displayed");
		}
		return this;
		
		
}

	public EditLeadpage Click_on_the_Edit_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		return new EditLeadpage(driver);
		
	}
	
	public ViewLeadpage Verify_the_Updated_companyname() {
		WebElement Updated_companyname =driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		if(Updated_companyname.getText().contains("TCS"))
		{
			System.out.println("Verified the Updated companyname");
}
		else
		{
			System.out.println("Updated_companyname is not getting displayed");
		}
		return this;
		
	}
	
	public MyLeadspage Click_on_the_Deletebutton() {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		return new MyLeadspage(driver);
	}
	
	public DuplicateLeadpage Click_on_the_DuplicateLead_button() {
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		return new DuplicateLeadpage(driver);
	}

}