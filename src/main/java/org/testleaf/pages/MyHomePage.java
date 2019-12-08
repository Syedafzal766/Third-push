package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	

	public FindLeads clickOnLeads() {
		driver.findElementByLinkText("Leads").click();
		return new FindLeads();
		
		
		
	}
}
