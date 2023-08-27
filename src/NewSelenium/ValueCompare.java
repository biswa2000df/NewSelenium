package NewSelenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueCompare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9937762834");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("kanha@@316");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.className("_3704LK")).sendKeys("iphone13 pink");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
		//String s=driver.findElement(By.xpath("//div[text()='₹73,999']")).getText();
		String s=driver.findElement(By.className("_25b18c")).getText();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
		//System.out.println(s);
		String s1="";
		s1=s.substring(1,7);
		System.out.println(s1);
		String s2="";
		s2=s1.replaceAll(",","");
		System.out.println(s2);
		int a=Integer.parseInt(s2);
		System.out.println(a);
		//driver.close();
		
		/*WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13 pink");
		driver1.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		
		  Thread.sleep(5000);
		
		WebElement w=driver1.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		w.click();
		Thread.sleep(5000);
		
		 // driver1.close();
		
		String s4=driver1.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(s4);
		String s5="";
		s5=s4.replaceAll(",", "");
		System.out.println(s5);
		int b=Integer.parseInt(s5);
		
		System.out.println("Now compare Two Product :-");
		if(a>b)
		{
			ArrayList<String> altab=new ArrayList<String>(driver1.getWindowHandles());
			driver1.switchTo().window(altab.get(1));
			JavascriptExecutor js1 = (JavascriptExecutor) driver1;
			  js1.executeScript("window.scrollBy(0, window.innerHeight)");
			System.out.println("Refer to the Amazon Product "+ b);
			driver1.findElement(By.id("add-to-cart-button")).click();
		}
		else
		{
			System.out.println("Refer to the FlipKart Product "+ a);
			
		}*/
		
		
		
		
	}

}
