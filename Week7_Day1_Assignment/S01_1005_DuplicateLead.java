package Week7_Day1_Assignment;

import org.testng.annotations.Test;
import Week7_Hooks.Basepage;

public class S01_1005_DuplicateLead extends Basepage{
	
	@Test
	public void CreateContact() throws InterruptedException {
		new Week7_Day1_Page_Object_Model.Loginpage(driver)
		.typeusername("DemoSalesManager")
		.typePassword("crmsfa")
		.clicklogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.FindLeadstab()
		.Click_on_the_Emailtab()
		.Enter_the_Emailaddress("a")
		.Click_on_the_FindLeads_button()
		.Select_the_testdata_in_the_grid()
		.Click_on_the_DuplicateLead_button()
		.Click_on_the_CreateLeadbutton();

		System.out.println("Duplicate Lead is created successfully");
		
		
	}

}
