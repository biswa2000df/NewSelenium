package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		try {
			WebElement el2=driver.findElement(By.name("field-words"));//field-keywords
			if(el2.isDisplayed())
			{
			
			el2.sendKeys("iphone 13");
			
			}
			 System.out.println("1nd try");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			try {
				WebElement el4=driver.findElement(By.id("tabsearchtextbox"));//twotabsearchtextbox
				 if(el4.isDisplayed())
					{
						el4.sendKeys("iphone 13");
					}
				 
				 System.out.println("2nd try");
				
			}
			catch (Exception e1) {
				// TODO: handle exception
				try {
					WebElement el5=driver.findElement(By.xpath("//*[@class='nav-input nav-progressive-attribute']"));
					if(el5.isDisplayed())
					{
						el5.sendKeys("iphone 13");
					}
					System.out.println("3rd try");
					
				}
				catch (Exception e2) {
					// TODO: handle exception
					
					System.out.println("Completed");
					
					
				}
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
//		
//		ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
//		
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 13 (128GB) - (Product) RED')]")).click();
//
//		System.out.println(driver.getTitle());
//		
////		Thread.sleep(9000);
////		
////		driver.switchTo().window(newTab.get(1));
//		
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(newTab.get(0));
//		
////		System.out.println(newTab.lastIndexOf(newTab));
//		
//		Thread.sleep(9000);
//		
//		driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 13 (128GB) - (Product) RED')]")).click();
//
//		driver.switchTo().window(newTab.get(0));
//		
//		driver.switchTo().window(newTab.get(2));
	}

}
