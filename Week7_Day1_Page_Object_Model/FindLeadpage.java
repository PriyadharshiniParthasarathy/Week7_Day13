package Week7_Day1_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Week7_Hooks.Basepage;

public class FindLeadpage extends Basepage{
		
		public FindLeadpage(ChromeDriver driver) {
			this.driver = driver;
		}
		public FindLeadpage Enter_The_Firstname(String firstname) {
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
			return this;	
	}
		public FindLeadpage Click_on_the_FindLeads_button() throws InterruptedException {
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			Thread.sleep(2000);
			return this;
			
		}
		
		public ViewLeadpage Select_the_testdata_in_the_grid() {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
			return new ViewLeadpage(driver);
			
		}
		
		public FindLeadpage Click_on_the_Phonetab(){
			driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
			return this;
			
		}
		
		public FindLeadpage Enter_the_Phonenumber(String Phonenumber){
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phonenumber);
			return this;
			
		}
		
		public FindLeadpage Click_on_the_Emailtab(){
			driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
			return this;
			
		}
		public FindLeadpage Enter_the_Emailaddress(String Emailaddress){
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(Emailaddress);
			return this;
			
		}


}
