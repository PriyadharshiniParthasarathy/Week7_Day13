package Week7_Day1_Assignment;

import org.testng.annotations.Test;
import Week7_Hooks.Basepage_Servicenow;

public class S01_1006_ServiceNow extends Basepage_Servicenow{
	
	@Test
	public void Servicenow() throws InterruptedException {
		new Week7_Day1_Page_Object_Model.Servicenow_Loginpage(driver)
		
.typeusername("admin")
.typePassword("HrvPD2fgSfL5")
.clicklogin_button()
		.Enter_the_filter_as_incident("Incident")
		.Click_on_Alltab_under_the_incident()
		.Click_on_Newbutton()
		.Select_a_value_for_Caller("Sam Sorokin")
		.Enter_the_Short_description("Servicenow Application")
		.Click_on_Submitbutton();
				

		
	}

}
