//chapter 33 locators
package NewTestPkg02;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//String myPassword = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("mytest");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademyAA");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@ssfssf.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@ddiiee.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("5518889999");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys("mytest");
		driver.findElement(By.name("inputPassword")).sendKeys("myPassword");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	
	}
	public static String getPassword(WebDriver driver) {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordTxt = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] passwordarray =  passwordTxt.split("'");
		String password = passwordarray[1].split("'")[0];
		return password;
	}

}
