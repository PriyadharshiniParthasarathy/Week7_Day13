package Week7_Day1_Assignment;

import org.testng.annotations.Test;
import Week7_Hooks.Basepage;

public class S01_1002_CreateContact extends Basepage{
	
	@Test
	public void CreateContact() {
		new Week7_Day1_Page_Object_Model.Loginpage(driver)
		.typeusername("DemoSalesManager")
		.typePassword("crmsfa")
		.clicklogin()
		.clickCRMSFA()
		.Click_on_CreateContact()
		.Enter_the_Firstname("Priya")
		.Enter_the_Lastname("Dharshini")
		.Click_on_createcontactbutton()
		.Verify_the_ContactName();
		
		
		
		
	}

}
