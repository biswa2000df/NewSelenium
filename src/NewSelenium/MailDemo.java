package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		for(int i=1;i<=5;i++)
		{
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://mail.apmosys.com/webmail/");
		Thread.sleep(3000);
		driver.findElement(By.name("email-address")).sendKeys("biswajit.sahoo@apmosys.com");
		driver.findElement(By.name("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Welcome@2022");
		driver.findElement(By.name("remember-me")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("next")).click();
//		Thread.sleep(10000);
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"gui.frm_main.main.mailview#frame\"]")));
//		String s=driver.findElement(By.id("iw_webmail_msg_body")).getText();
//		System.out.println(s);
		driver.close();
		//Thread.sleep(3000);
		}
		
	}

}
