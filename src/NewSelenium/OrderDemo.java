package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("keyboard");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
		Thread.sleep(5000);
		driver.close();*/
		
		

		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		//driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver1.findElement(By.className("_3704LK")).sendKeys("logitech wireless keyboard and mouse combo");
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		//driver1.findElement(By.xpath("//div[@class='CXW8mj'][6]")).click();
	driver1.findElement(By.className("CXW8mj")).click();
		String s=driver1.findElement(By.xpath("///html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div[2]")).getText();
		//System.out.println(s);
		
		//String name=s.toString();
	//int total=Integer.parseInt(name);
		System.out.println(s);
		
		
	}

}
