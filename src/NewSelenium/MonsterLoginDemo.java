package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class MonsterLoginDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\biswa\\Documents\\Biswajit Sahoo CV (1).pdf");
		driver.findElement(By.name("fullname")).sendKeys("Biswajit Sahoo");
		driver.findElement(By.xpath("//input[@class='input email-autocomplete-input']")).sendKeys("kaniwjitsaoo@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Kanhaa@@316");
		driver.findElement(By.xpath("//input[@class='input pass']")).sendKeys("Kanhaa@@316");
		driver.findElement(By.xpath("//input[@name='Mobile Number'][1]")).sendKeys("7578077960");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		//Thread.sleep(5000);
	//	driver.findElement(By.xpath("//span[@class='multiselect__input modal-ref-class']")).sendKeys("Bhubaneswar");
//		driver.findElement(By.xpath("//input[@class='multiselect__input modal-ref-class']")).sendKeys("Bhubaneswar");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[1]/span")).sendKeys("cuttack");
		//Thread.sleep(5000);
		//driver.findElement(By.id("skillInput")).sendKeys("Java,Selenium");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//div[@class='multiselect modal-ref-class multiBox']"));
		e.click();
		e.sendKeys("cuttack");
//		e.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(5000);
		//e.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		//e.click();
		//e.sendKeys(Keys.ENTER);
	
		WebElement e1=driver.findElement(By.xpath("//div[@class='multiselect modal-ref-class']"));
		e1.click();
//		e1.sendKeys(Keys.ARROW_DOWN);
//		e1.sendKeys(Keys.ARROW_DOWN);
//		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		e1.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/form/div[3]/div[1]/div[1]/div/div")).sendKeys("Java");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/form/div[3]/div[3]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/form/div[3]/div[4]/div/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("registerSubmit")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.className("multiselect modal-ref-class multiBox")).click();
		
		
		
		
}

}
