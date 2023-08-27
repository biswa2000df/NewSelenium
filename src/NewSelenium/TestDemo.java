package NewSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Biswajit sahoo");
		driver.findElement(By.id("ap_phone_number")).sendKeys("7978067011");
		driver.findElement(By.id("ap_email")).sendKeys("jakjajkj@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Kanha@@316");
		driver.findElement(By.id("continue")).click();

}
}
