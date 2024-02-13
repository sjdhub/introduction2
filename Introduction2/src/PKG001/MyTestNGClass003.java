package PKG001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestNGClass003 {
    public WebDriver driver;
    @Test
    void testmethod() throws InterruptedException {
    	String username = "Admin";
    	String password = "admin123";
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	Thread.sleep(5000);
    	System.out.println(driver.findElement(By.xpath("//h5[normalize-space()='Login']")).getText());
    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
    	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
    	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    	Thread.sleep(5000);
    	System.out.println(driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText());
    	Assert.assertEquals(driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText(), "Dashboard" );

    }
    
 }

/*
@Test
public class MyTestNGClass003 {
	public static void main(String[] args) throws InterruptedException {
	String username = "Admin";
	String password = "admin123";
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.xpath("//h5[normalize-space()='Login']")).getText());
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText());
	Assert.assertEquals(driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText(), "Dashboard" );

}
}
*/