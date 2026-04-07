package Testcases;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TC_002_CreateLead extends BaseClass {
@Test
public void CreateLead(){
    LoginPage lp = new LoginPage();
    lp.enterUsername()
    .enterPassword()
    .clickLoginButton()
    .clickCrmsfa()
    .clickLeadsLink()
    .clickCreateLeadLink()
    .enterCompanyname()
    .enterFirstname()
    .enterLastname()
    .clickCreateLeadButton()
    .verifyLead();
}
}
