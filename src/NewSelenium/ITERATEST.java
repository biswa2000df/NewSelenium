package NewSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ITERATEST {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.id("name")).sendKeys("Biswajit Sahoo");
		driver.findElement(By.id("phone")).sendKeys("7978067010");
		driver.findElement(By.id("email")).sendKeys("kanhabiswaji11@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Kanha@@316");
		driver.findElement(By.id("address")).sendKeys("At-Mohanpur,Po-Basudevpur,Dist-Cuttack");
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		driver.findElement(By.id("male")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)", "");
		int i=5;
		WebElement radio=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[5]/label/input"));
		radio.click();
		WebElement dropdown=driver.findElement(By.className("custom-select"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Turkey");
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[4]/label")).click();
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label")).click();
		js.executeScript("window.scrollBy(0,450)", "");
	//	driver.findElement(By.xpath("/html/body/div/div[6]/div[2]/div/div")).sendKeys("C:\\Users\\biswa\\Documents\\PIC.jpg");
		driver.findElement(By.xpath("//*[text()='Upload']")).click();
	}

}
