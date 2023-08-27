package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoshreya {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    //	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
   		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		Thread.sleep(1000);  
   		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo laptop",Keys.ENTER);
   	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   		driver.findElement(By.id("a-autoid-0-announce")).click();
   		
   	 	System.out.println("Heloo" + driver.findElement(By.id("s-result-sort-select_1")).toString());
   
   		driver.findElement(By.id("s-result-sort-select_1")).click();
   		
   		String amazon = driver.findElement(By.xpath("(//*[@class=\"a-price-whole\"])[5]")).getText();
   		
   		
   		System.out.println("amazon "+amazon);           
   		
   		int amazonFinal = Integer.parseInt(amazon.replaceAll(",", ""));
      		
   		System.out.println("Converted " + amazonFinal); 


   	
   		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		Thread.sleep(1000);
   		driver.get("https://www.flipkart.com/");
   		Thread.sleep(5000);
   		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
   		     
   		driver.findElement(By.name("q")).sendKeys("Lenovo laptop d330 ", Keys.ENTER );
   		
   		Thread.sleep(5000);
   		String filfcart=  driver.findElement(By.xpath("//*[text()='33,499']")).getText();
   		System.out.println("Filfcart "+filfcart );

   		//Thread.sleep(5000);
   

   		String Comma = filfcart.replaceAll(",", "");
   		
   		String qs = Comma.replaceFirst("\\₹", "");
   		
   		int flickartFinal = Integer.parseInt(qs);
   		
   		System.out.println("Converted : " +flickartFinal);
   		
   		
   		if(amazonFinal < flickartFinal)
   		{
   			//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
   	   		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   			driver.get("https://www.amazon.in/");
   			System.out.println("Amazon Has low price : " +amazonFinal);
   			Thread.sleep(1000); 
   	   		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo laptop d330",Keys.ENTER);
   	   		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	   		
   	   	Thread.sleep(5000);
   	   	driver.findElement(By.xpath("(//*[@class=\"a-price-whole\"])[7]")).click();
   	 driver.close();
   	   		
   			
   			
   		}
   		else  {
   			//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
   	   		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   			driver.get("https://www.flipkart.com/");
   			System.out.println("Flifkart Has low price : " +flickartFinal);
   			driver.close();
		}

	}

}
