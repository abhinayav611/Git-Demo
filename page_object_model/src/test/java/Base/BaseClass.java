package Base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public static ChromeDriver driver;
    @BeforeMethod
    public void preConditions(){
    ChromeOptions options = new ChromeOptions();
    options.addArguments("guest");
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
} 
@AfterMethod
public void postConditions(){
    driver.close();
}
}
