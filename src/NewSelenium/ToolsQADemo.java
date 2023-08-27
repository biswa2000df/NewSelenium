package NewSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsQADemo {

	private static final CharSequence Keys = null;
	private static final CharSequence ARROW_UP = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//span[@class='group-header'][1]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("item-0")).click();
		driver.findElement(By.id("userName")).sendKeys("Biswajit Sahoo");
		driver.findElement(By.id("userEmail")).sendKeys("biswajitsahoo11@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("GHANSOLI  Sector-4");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)","");
		driver.findElement(By.id("permanentAddress")).sendKeys("CUTTACK");
		driver.findElement(By.id("submit")).click();
	String s=	driver.findElement(By.xpath("//div[@id='output']")).getText();
	System.out.println(s);
	driver.findElement(By.id("item-1")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[1]/span/button")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]")).click();
	

	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/span/button")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[3]/span/button")).click();
	driver.findElement(By.id("item-2")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,300)","");
	Thread.sleep(3000);
	driver.findElement(By.id("item-4")).click();
	Actions actions=new Actions(driver);
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.id("doubleClickBtn"));
	actions.doubleClick(element).perform();
	Thread.sleep(3000);
	WebElement element1=driver.findElement(By.id("rightClickBtn"));
	actions.contextClick(element1).perform();
	
	
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js2.executeScript("window.scrollBy(0,200)","");
	driver.findElement(By.id("item-5")).click();
	String w=driver.getWindowHandle();
	Thread.sleep(3000);
	driver.findElement(By.id("simpleLink")).click();
	Thread.sleep(10000);
	Set<String> kl=driver.getWindowHandles();
	
	System.out.println(kl);
	for(String a:kl)
	{
		if(!a.equalsIgnoreCase(w))
		{
			driver.switchTo().window(a);
		}
	}
	driver.switchTo().window(w);
	
	
	Thread.sleep(5000);
	JavascriptExecutor js3=(JavascriptExecutor)driver;
	js3.executeScript("window.scrollBy(0,300)","");
	Thread.sleep(3000);
	driver.findElement(By.id("item-7")).click();
	driver.findElement(By.id("uploadFile")).sendKeys("C:\\\\Users\\\\biswa\\\\Documents\\\\Biswajit Sahoo CV (1).pdf");
	Thread.sleep(3000);
	driver.findElement(By.id("downloadButton")).click();
	
//	
	JavascriptExecutor js4=(JavascriptExecutor)driver;
	js4.executeScript("window.scrollBy(0,500)","");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/span")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).click();
	
	driver.findElement(By.id("firstName")).sendKeys("Biswajit");
	driver.findElement(By.id("lastName")).sendKeys("Sahoo");
	driver.findElement(By.id("userEmail")).sendKeys("biswajitsahoo11@gmail.com");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label")).click();
	driver.findElement(By.id("userNumber")).sendKeys("7978067011");
	JavascriptExecutor js5=(JavascriptExecutor)driver;
	js5.executeScript("window.scrollBy(0,500)","");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[2]/label")).click();
	//driver.findElement(By.id("subjectsContainer")).sendKeys("math");	
	//driver.findElement(By.id("hobbies-checkbox-2")).click();
	driver.findElement(By.id("dateOfBirthInput")).click();
	driver.findElement(By.className("react-datepicker__month-select")).click();
	//Thread.sleep(3000);

	Thread.sleep(10000);
	driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\biswa\\Documents\\Biswajit Sahoo CV (1).pdf");
	driver.findElement(By.id("currentAddress")).sendKeys("Navi Mumbai");

	}

}
