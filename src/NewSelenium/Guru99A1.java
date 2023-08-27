package NewSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Guru99A1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		 driver.get("http://demo.guru99.com/test/ajax.html");
//		    List<WebElement> elements = driver.findElements(By.name("name"));
//		    System.out.println("Number of elements:" +elements.size());
//
//		    for (int i=0; i<elements.size();i++){
//		      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
//		    }
		System.setProperty("webdriver.edge.driver","C:\\browserdrivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys("mngr424267");
		driver.findElement(By.name("password")).sendKeys("zedAzub");
		driver.findElement(By.name("btnLogin")).click();
		String s=driver.findElement(By.xpath("//td[text()='Manger Id : mngr424267']")).getText();	
		System.out.println(s);
		System.out.println("Login Successful");
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\biswa\\Pictures\\kanha.png"));
		
		
		//System.out.println("The title are:"+driver.getTitle());
		//System.out.println(driver.findElement(By.className("layout")));
		//System.out.print("Hello");
		/*driver.findElement(By.name("uid")).sendKeys("mngr424267");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("kanha");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		System.out.println("Login UnSuccessful");*/

	}

}
