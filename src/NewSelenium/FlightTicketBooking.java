package NewSelenium;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightTicketBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Flight_Exact|Expanded|544716708174&s_kwcid=AL!1631!3!544716708174!e!!g!!makemytrip%20flight&ef_id=Cj0KCQjwidSWBhDdARIsAIoTVb3c5SmhBRoGJNPaZxwp1e376g59U26W4_5rCDyOtSPSsEp7qkdzzXsaAsxHEALw_wcB:G:s&gclid=Cj0KCQjwidSWBhDdARIsAIoTVb3c5SmhBRoGJNPaZxwp1e376g59U26W4_5rCDyOtSPSsEp7qkdzzXsaAsxHEALw_wcB");
		String s=driver.getWindowHandle();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUMBAI");
		driver.findElement(By.className("calc60")).click();
		//Select s=new Select(driver.findElement(By.xpath("//div[@class='calc60'][1]")));
		WebElement w=driver.findElement(By.xpath("//input[@placeholder='To']"));
		w.sendKeys("BHUBANESWAR");
		driver.findElement(By.xpath("//div[text()='BBI']")).click();
	//	driver.findElement(By.className("font30 latoBlack")).click();
		//driver.findElement(By.xpath("//div[text()='August 2022']")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[7]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		driver.findElement(By.xpath("//span[@class='appendRight8']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();	
		Set<String> ss=driver.getWindowHandles();
		for(String a:ss)
		{
			
			if(!a.equalsIgnoreCase(s))
			{
				
				driver.switchTo().window(a);
			}
				
		}			
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.className("bnplBtn")).click();
		driver.findElement(By.id("username")).sendKeys("biswajitsahookanha11@gmail.com");
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/section/form/div[2]/button")).click();
		//System.out.println("kanha");
		driver.findElement(By.id("password")).sendKeys("Kanha@@316");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/section/form/div[2]/button")).click();
		
		
	}

}
