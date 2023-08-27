package NewSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement link:list) {
			String url=link.getAttribute("href");
			System.out.println("-----------------------------------------");
			System.out.println("Some URL are  :-"+url);
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is Empty");
				continue;
			}
			try {
				HttpURLConnection hus=(HttpURLConnection)(new URL(url).openConnection());
			 
			hus.connect();
			int response=hus.getResponseCode();
			if(response>=400)
				System.out.println(url+" broken link");
			else
				System.out.println(url+" valid link");
			
			
			
			
			
			}
			
			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.quit();
		
		
		

	}

}
