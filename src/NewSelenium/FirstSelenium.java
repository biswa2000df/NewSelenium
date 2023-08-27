package NewSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(3000);
		//driver.findElement(By.className("hero-dropdown-container")).click();;
	//	driver.navigate().to("http:\\www.apmosys.com");//another webpage ku jibaa
//		driver.navigate().back();
//		driver.navigate().forward();
//		
//		Thread.sleep(3000);
//		driver.navigate().refresh();
		driver.findElement(By.name("field-keywords")).sendKeys("mobile ");
		
	//Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,30);
	driver.findElement(By.name("field-keywords")).clear();
	driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver.findElement(By.id("nav-logo-sprites")).getText());
		driver.quit();
		

	}

}
