package NewSelenium;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmailPortalLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("https://apmosys.com/");
		//WebElement e=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[5]"));
		//act.moveToElement(e).build().perform();
		act.moveToElement(driver.findElement(By.linkText("Login"))).build().perform();
		act.click(driver.findElement(By.linkText("Employee"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("biswajit.sahoo@apmosys.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Welcome@2022");
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://mail.apmosys.com/webmail/");
		Thread.sleep(3000);
		driver1.findElement(By.name("email-address")).sendKeys("biswajit.sahoo@apmosys.com");
		driver1.findElement(By.name("next")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("password")).sendKeys("Welcome@2022");
		driver1.findElement(By.name("remember-me")).click();
		Thread.sleep(5000);
		driver1.findElement(By.name("next")).click();
		//Thread.sleep(000);
		
		//mailcopy
		Thread.sleep(3000);
		driver1.switchTo().frame(driver1.findElement(By.xpath("//iframe[@id=\"gui.frm_main.main.mailview#frame\"]")));
		String s=driver1.findElement(By.id("iw_webmail_msg_body")).getText();
		System.out.println(s);
		Thread.sleep(3000);
		driver1.close();
		Thread.sleep(3000);
		String s2="";
		s2=s.substring(21,27 );
		System.out.println(s2  +"   "+ s2.length());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys(s2);

		
		Thread.sleep(4000);
		driver.findElement(By.className("btn")).click();
		//act.driver.findElement(By.className("nv active")).click();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("EOD"))).build().perform();
		act.click(driver.findElement(By.linkText("EOD"))).build().perform();
		Thread.sleep(3000);
		act.click(driver.findElement(By.linkText("View My EOD"))).build().perform();
		driver.findElement(By.id("txtFromDate")).click();
		Thread.sleep(3000);


		
		driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[2]/td[3]")).click();
		
		driver.findElement(By.name("viewEodDataTable_length")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/label/select/option[3]")).click();
		
		
		WebElement tb=driver.findElement(By.id("viewEodDataTable"));
		List<WebElement> rows=tb.findElements(By.tagName("tr"));
		int rnum=rows.size();
		System.out.println("Toatal num of rows= " + rnum);
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
			int cnum=columns.size();
			System.out.println("Total num of columns= "+cnum);
			for(int j=1;j<columns.size();j++) 
			{
				String columndata=columns.get(j).getText();
				System.out.print("     "   +columndata);
			
			}

		}
//		driver.findElement(By.id("myhome")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/span/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/span/ul/li[2]/a")).click();
		//driver.close();
		
		
		//ALERT OPTION
		
		
		
	/*	driver.get("https://demoqa.com/alerts");
		List<WebElement> l=driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
		l.get(0).click();
		Thread.sleep(5000);
		String s=driver.switchTo().alert().getText();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println(s);
		
//		l.get(1).click();
//		Thread.sleep(7000);
//		s=driver.switchTo().alert().getText();
//		Thread.sleep(9000);
//		driver.switchTo().alert().accept();
//		System.out.println(s);
		
		l.get(2).click();
		Thread.sleep(5000);
		 s=driver.switchTo().alert().getText();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		System.out.println(s);
		
		
		l.get(3).click();
		Thread.sleep(5000);
		 s=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Kanha");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(s);*/
		
//		
		
	}

}
