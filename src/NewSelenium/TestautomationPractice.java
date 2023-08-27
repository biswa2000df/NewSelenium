package NewSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestautomationPractice {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.navigate().to("https://testautomationpractice.blogspot.com");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Hello World Program");
		driver.findElement(By.className("wikipedia-search-button")).click();
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("wikipedia-search-result-link")).click();
		Set<String> child=driver.getWindowHandles();
		Thread.sleep(3000);
		for(String c:child)
		{
			if(!c.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(parent);
			}
		}
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();
		driver.switchTo().alert().accept();
		String alertmessage=driver.findElement(By.xpath("//*[text()='You pressed OK!']")).getText();
		System.out.println("The alert message is "+ alertmessage);
		driver.findElement(By.id("datepicker")).click();
	String monthyear=	driver.findElement(By.className("ui-datepicker-title")).getText();
	System.out.println("yearmonth is="+monthyear);
	driver.findElement(By.xpath("//*[text()='22']")).click();
	WebElement speed=driver.findElement(By.id("speed"));
	Select s =new Select(speed);
	s.selectByIndex(1);
	WebElement file=driver.findElement(By.id("files"));
	Select s1=new Select(file);
	s1.selectByIndex(2);
	WebElement number=driver.findElement(By.id("number"));
	Select s2=new Select(number);
	s2.selectByIndex(3);
	WebElement products=driver.findElement(By.id("products"));
	Select s3=new Select(products);
	s3.selectByIndex(3);
	WebElement animals=driver.findElement(By.id("animals"));
	Select s4=new Select(animals);
	s4.selectByIndex(2);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	System.out.println("XPathAxes");
	String XPathAxes1=driver.findElement(By.id("1")).getText();
	System.out.println(XPathAxes1);
	String XPathAxes2=driver.findElement(By.id("2")).getText();
	System.out.println(XPathAxes2);
	String XPathAxes3=driver.findElement(By.id("3")).getText();
	System.out.println(XPathAxes3);
	
	js.executeScript("window.scrollBy(0,-1500)", "");
	
	WebElement e=driver.findElement(By.xpath("//*[text()='Copy Text']"));
	Actions act=new Actions(driver);
	act.doubleClick(e).build().perform();
	WebElement from=driver.findElement(By.id("draggable"));
	WebElement to=driver.findElement(By.id("droppable"));
	act.dragAndDrop(from, to).build().perform();
	js.executeScript("window.scrollBy(0,700)", "");
	WebElement from1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
	WebElement to1=driver.findElement(By.id("trash"));
	act.dragAndDrop(from1, to1).build().perform();
	WebElement from2=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
	WebElement to2=driver.findElement(By.id("trash"));
	act.dragAndDrop(from2, to2).build().perform();
	Thread.sleep(3000);
	WebElement sliderElement=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
//	act.dragAndDropBy(sliderElement,100,0).build().perform();
	act.moveToElement(sliderElement).clickAndHold().moveByOffset(100,0).release().build().perform();
	
	WebElement resizeable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//	act.dragAndDropBy(resizeable,400,0).release().build().perform();
//	Thread.sleep(3000);
	act.moveToElement(resizeable).clickAndHold().moveByOffset(400,0).release().build().perform();
	js.executeScript("window.scrollBy(0,500)", "");
//	act.dragAndDropBy(resizeable,-300,0).release().build().perform();
	
	
	
	}
	
}

