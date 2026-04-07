package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class CreateLeadPage extends BaseClass{
public CreateLeadPage enterCompanyname(){
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kumaran Systems");
return this;
}
public CreateLeadPage enterFirstname(){
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abhinaya");
return this;
}

public CreateLeadPage enterLastname(){
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
return this;
		
}
public ViewLead clickCreateLeadButton(){
driver.findElement(By.name("submitButton")).click();
return new ViewLead();
}
}
