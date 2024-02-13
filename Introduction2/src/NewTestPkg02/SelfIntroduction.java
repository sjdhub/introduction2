package NewTestPkg02;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Invoking Broswer
		//Chrome - ChromeDriver -> Methods
		//Firefox - FirefoxDriver -> Methods
		//All Methods are same regardless of browser drivers
		//ChromeDriver driver = new ChromeDriver();
		//selenium has to invoke chromedriver.exe file to communicate with browser
		//if want to write code, write following code. If not Selenium manager will download it automatically
		//System.setProperty("webDriver.chrome.driver", "C:\\SJD_Files\\Training\\Selenium_Java_Rahul_Shetty\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver();
		//WebDriverManager.edgedriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
	}

}
