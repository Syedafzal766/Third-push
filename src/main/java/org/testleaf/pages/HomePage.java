package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	
	public HomePage clickLogOut() {
		driver.findElementByClassName("decorativeSubmit").click();
		return this;
	}

	public MyHomePage clickONCRM() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
}
