package NewSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDFCBankLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		long start=System.currentTimeMillis();
		driver.get("https://my.idfcfirstbank.com/login");
		driver.findElement(By.name("mobileNumber")).sendKeys("7978067010");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[(text()='Proceed to login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-password-input")).sendKeys("Kanha@@@316");
		Thread.sleep(3000);
		long finish=System.currentTimeMillis();
		long totaltime =(finish-start)/1000;
		driver.findElement(By.xpath("//span[(text()='Login securely')]")).click();
		System.out.println("Total Login time is "+totaltime);
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//*[@id=\"RASDashboard\"]/aside/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/div/div[2]/div[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/div/div[2]/div/div/div/a[2]/span")).click();

		
	System.out.println(driver.findElement(By.xpath("//*[@id=\"MainContentWrapper\"]/section/section/section/div[1]/div[2]/div/div[2]/div/div[2]/div/div/h2/span")).getText());
		
		
//		//long acc=System.currentTimeMillis();
//		driver.findElement(By.xpath("//a[@data-component='NavigationTabItemWrapper'][2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.className("//span[text()='Platinum Corporate Salary'][1]")).click();
//		long acc1=System.currentTimeMillis();
//		long totaltime1 =(acc1-acc)/1000;
//		System.out.println("Total Account Loadtime  is "+totaltime1);
		
	}

}
