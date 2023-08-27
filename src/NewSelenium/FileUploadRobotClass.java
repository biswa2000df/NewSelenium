package NewSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://my.monsterindia.com/create_account.html");
		
		Thread.sleep(3000);
		
		 StringSelection s = new StringSelection("‪C:\\Users\\biswa\\Pictures\\kanha.png");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[text()='Choose CV']")).click();
		 
		 Thread.sleep(3000);
		 
		 Robot r = new Robot();
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      //pressing ctrl+v
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
		


	}

}
