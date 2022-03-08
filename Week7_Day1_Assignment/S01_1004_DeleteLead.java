package Week7_Day1_Assignment;

import org.testng.annotations.Test;

import Week7_Day1_Page_Object_Model.Loginpage;
import Week7_Hooks.Basepage;

public class S01_1004_DeleteLead extends Basepage{
	
	@Test
	public void CreateContact() throws InterruptedException {
		new Loginpage(driver)
		.typeusername("DemoSalesManager")
		.typePassword("crmsfa")
		.clicklogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.FindLeadstab()
		.Click_on_the_Phonetab()
		.Enter_the_Phonenumber("1")
		.Click_on_the_FindLeads_button()
		.Select_the_testdata_in_the_grid()
		.Click_on_the_Deletebutton();
		System.out.println("Deleted Successfully");
		
		
	}

}
