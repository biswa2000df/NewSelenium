package NewSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemoToolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
	List<WebElement> rowcount=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
		System.out.println(rowcount.size());
		int row=rowcount.size();
		
		
		
		List<WebElement> colcount=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div"));
		System.out.println(colcount.size());
		int cell=colcount.size();
		
		System.out.println("Print the Web Table:-");
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=cell;j++)
			{
				System.out.print(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[" + i +"]/div/div["+ j +"]")).getText()+"   ");
			}
			System.out.println();
		}
		
		

	}

}
