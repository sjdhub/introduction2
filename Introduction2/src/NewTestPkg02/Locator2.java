package NewTestPkg02;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Locator2 {


public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

String name = "QATester";

String password = getPassword(driver);

driver.get("https://rahulshettyacademy.com/locatorspractice");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);

driver.findElement(By.name("inputPassword")).sendKeys(password);

driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

String actual = driver.findElement(By.xpath("//*[@id='root']/div/div/div/p")).getText();

String expected = "You are successfully logged in.";

//Assert.assertEquals("You are successfully logged in.", driver.findElement(By.tagName("p")).getText());

Assert.assertEquals(actual, expected);

driver.findElement(By.xpath("//*[text()='Log Out']")).click();

}

public static String getPassword(WebDriver driver) throws InterruptedException {

driver.get("https://rahulshettyacademy.com/locatorspractice");

Thread.sleep(2000);

driver.findElement(By.linkText("Forgot your password?")).click();

Thread.sleep(2000);

driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();

String passwordText = driver.findElement(By.cssSelector("form p")).getText();

//Please use temporary password 'rahulshettyacademy' to Login.

String[] passwordArray = passwordText.split("'");

//passwordArray[0] - Please use temporary password '

//passwordArray[1] - rahulshettyacademy' to Login.

String[] passwordArray2 = passwordArray[1].split("'");

//passwordArray2[0] - rahulshettyacademy

//passwordArray2[1] - ' to Login.

String password = passwordArray2[0];

return password;

}

}
