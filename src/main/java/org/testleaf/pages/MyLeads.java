package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods {
	
	public FindLeads clickOnMyLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		return new FindLeads();
	}
	
    }



