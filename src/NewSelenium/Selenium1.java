package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.apmosys.com/webmail/");
		Thread.sleep(3000);
		driver.findElement(By.name("email-address")).sendKeys("biswajit.sahoo@apmosys.com");
		driver.findElement(By.name("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Welcome@2022");
		driver.findElement(By.name("next")).click();
		Thread.sleep(50000);
		driver.switchTo().frame("gui.frm_main.main.mailview#frame");
		//driver.close();
		 driver.findElement(By.id("iw_webmail_msg_body")).getText();
		//System.out.println(s);
	}

}
