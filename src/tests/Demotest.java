package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demotest {
@Test
public void demotest() {
System.setProperty("webdriver.chrome.driver",
		"driver-lib\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
}
}