package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class FindLeads extends ProjectSpecificMethods {

    public FindLeads clickOnFindLead() {
    	driver.findElementByLinkText("Find Leads").click();
    	return this;
    }
    	
   public FindLeads enterfindId() {
	   driver.findElementById("ext-gen246").sendKeys("11080");
	   return this;
   }
   public FindLeads clickOnfindSearch() {
	   
	   driver.findElementByXPath("//button[@id='ext-gen334']").click();
	   return this;
   }
   
   public void clickOnLineItem() {
	   driver.findElementByLinkText("11080").click();
	   
   }
	
}

