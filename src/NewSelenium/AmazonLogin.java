package NewSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9937762834");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("kanha@@316");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("_3704LK"))).click();
		driver.findElement(By.className("_3704LK")).sendKeys("laptops i5 10th gen");
	
		String w=driver.getWindowHandle();
		driver.findElement(By.className("L0Z3Pu")).click();
	
	//	driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]")).click();
		Set<String> wh=driver.getWindowHandles();
		for(String a:wh)
		{
			if(!a.equalsIgnoreCase(w))
			{
				driver.switchTo().window(a);
			}
		}
	
		String value1=driver.findElement(By.className("_25b18c")).getText();
		System.out.println("Value are="+value1);
		String price="";
		price=value1.substring(1,7);
		System.out.println("The price is:"+price);
		String price1="";
		price1=price.replaceAll(",","");
		System.out.println("The price is:"+price1);
		driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]")).sendKeys("400701");
		driver.findElement(By.xpath("//*[text()='Check']")).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.className("_3XINqE")).getText();
		System.out.println(s);
		String Time="";
		Time=s.substring(0,25);
		System.out.println("Approximately date is:-"+Time);
	}

}
