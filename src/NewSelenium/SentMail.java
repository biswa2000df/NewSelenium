package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SentMail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.apmosys.com/webmail/");
		Thread.sleep(3000);
		driver.findElement(By.name("email-address")).sendKeys("biswajit.sahoo@apmosys.com");
		driver.findElement(By.name("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Welcome@2022");
		driver.findElement(By.name("remember-me")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("next")).click();
		Thread.sleep(5000);
		
		
//		String s3=driver.getTitle();
//		//int c=s3.length();
//		String s1="";
//		s1=s3.substring(9,11);
//		System.out.println("Total mail is "+s1);
		//System.out.println("Total number of mail are  "+driver.getTitle());
//		String s=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div[1]/div/ul/li/ul/li/ul/li[1]/div/u")).getText();
//		System.out.println("Unread Message  "+s);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div[1]/div/ul/li/ul/li/ul/li[2]/div/b")).click();
//		Thread.sleep(9000);
//		
//		String s4=driver.getTitle();
//		int c1=s4.length();
//		String s7="";
//		s7=s4.substring(8,10);
//		Thread.sleep(9000);
//		System.out.println("Total sent mail is "+s7);
//		//System.out.println("The  sent message are "+driver.getTitle());
		
		
		
		driver.findElement(By.id("gui.frm_main.hmenu1/0")).click();
		driver.findElement(By.id("gui.frm_compose#switch")).click();
		driver.findElement(By.id("gui.frm_compose.to.plus#main")).sendKeys("pratyush.purohit@apmosys.com");
		driver.findElement(By.id("gui.frm_compose.cc.plus#main")).sendKeys("pratyush.purohit@apmosys.com");
		driver.findElement(By.id("gui.frm_compose.bcc.plus#main")).sendKeys("pratyush.purohit@apmosys.com");
		driver.findElement(By.id("gui.frm_compose.bcc.plus#main")).click();
		driver.findElement(By.id("gui.frm_compose.subject#main")).sendKeys("This is only for testing purpose");
		
		
		Thread.sleep(9000);
	
		driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[2]/div/div/div[3]/table/tbody/tr/th[2]/form/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[7]/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div/div[2]")).click();
		driver.findElement(By.id("gui.insert_item.x_btn_ok#main")).click();
		
		
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fr-iframe']")));
		Thread.sleep(3000);
		String s11=("Dear sir I am Biswajit Sahoo from Automation department, would you like to inform that I am taking selenium training right now on my personal laptop so please connect WIFI to my laptop, that I can take the training easily.RegardsBiswajit Sahoo Automation Department Emp id=A-22169");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//body[@class='fr-element fr-view']")).sendKeys(s11);
		driver.switchTo().defaultContent();
	
		driver.findElement(By.id("gui.frm_compose.x_btn_send")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[4]/ul/li/a/span/i/b")).click();
	driver.findElement(By.xpath("/html/body/div[3]/ul/li[13]/a/span")).click();
		Thread.sleep(10000);
		
	}

}
