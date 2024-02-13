package NewTestPkg02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver();
		//WebDriverManager.edgedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().back();
		//driver.navigate().forward();
		
	}

}
