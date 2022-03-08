package Week7_Day1_Assignment;

import org.testng.annotations.Test;

import Week7_Day1_Page_Object_Model.Loginpage;
import Week7_Hooks.Basepage;

public class S01_1001_CreateLead extends Basepage{
	
	@Test
	public void CreateTest() {
		new Loginpage(driver)
		.typeusername("DemoSalesManager")
		.typePassword("crmsfa")
		.clicklogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.CreateLead()
		.Enter_the_Firstname("Priya")
		.Enter_the_Lastname("Dharshini")
		.Enter_the_Companyname("Aspire")
		.clickoncreatelead_button()
		.Verify_the_firstname();
		
		
	}

}
