package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{

	
	public CreateLead enterCompanyName() {
    	driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
    	return this;

    }
    
    public CreateLead enterFirstName() {
    	driver.findElementById("createLeadForm_firstName").sendKeys("suheal");
    	return this;
    	
    }
    
    public CreateLead enterLastName() {
    	driver.findElementById("createLeadForm_lastName").sendKeys("Iqbal");
    	return this;
    }
    
    public ViewLead clickOnCreate() {
    	driver.findElementByClassName("smallSubmit").click();
    	return new ViewLead();
    }

}
