package Week7_Day1_Assignment;

import org.testng.annotations.Test;
import Week7_Hooks.Basepage;

public class S01_1003_EditLead extends Basepage{
	
	@Test
	public void CreateContact() throws InterruptedException {
		new Week7_Day1_Page_Object_Model.Loginpage(driver)
		.typeusername("DemoSalesManager")
		.typePassword("crmsfa")
		.clicklogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.FindLeadstab()
		.Enter_The_Firstname("Priya")
		.Click_on_the_FindLeads_button()
		.Select_the_testdata_in_the_grid()
		.Click_on_the_Edit_button()
		.Clear_the_companyname()
		.Change_the_companyname("TCS")
		.Click_on_the_update_button()
		.Verify_the_Updated_companyname();
		
		
		
		
	}

}
