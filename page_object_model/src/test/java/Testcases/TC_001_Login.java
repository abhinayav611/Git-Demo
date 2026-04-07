package Testcases;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TC_001_Login  extends BaseClass{
@Test
public void login(){
    LoginPage lp = new LoginPage();
    lp.enterUsername()
    .enterPassword()
    .clickLoginButton();
}
}
