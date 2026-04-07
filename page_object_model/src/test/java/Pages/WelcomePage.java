package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class WelcomePage extends BaseClass {
public HomePage clickCrmsfa(){
    driver.findElement(By.linkText("CRM/SFA")).click();	
    return new HomePage();
}
}
