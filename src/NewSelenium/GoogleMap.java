package NewSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GoogleMap {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps/@19.1086776,73.005094,15z");
		driver.findElement(By.id("searchboxinput")).click();
		WebElement search=driver.findElement(By.id("searchboxinput"));
				search.sendKeys("Kolkata, West Bengal");
				driver.findElement(By.id("hArJGc")).click();
				WebElement dest=driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/input"));
				dest.sendKeys("Bhubaneswar, Master Canteen Chowk, Ashok Nagar, Bhubaneswar, Odisha 751009");
				dest.click();
				Thread.sleep(4000);
				
				Actions act=new Actions(driver);
				WebElement go=driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/div[2]/button"));
				act.moveToElement(go).click().perform();
				driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/div[1]/button")).click();
			String bus=driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")).getText();
			System.out.println("BUS="+bus);
	}

}
