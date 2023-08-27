package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddEod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);
		driver.get("https://apmosys.com/");
		act.moveToElement(driver.findElement(By.linkText("Login"))).build().perform();
		act.click(driver.findElement(By.linkText("Employee"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("biswajit.sahoo@apmosys.com");
		Thread.sleep(3000);
		driver.findElement(By.id("userPassword")).sendKeys("Welcome@2022");
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://mail.apmosys.com/webmail/");
		Thread.sleep(3000);
		driver1.findElement(By.name("email-address")).sendKeys("biswajit.sahoo@apmosys.com");
		driver1.findElement(By.name("next")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("password")).sendKeys("Apmosys@2022");
		driver1.findElement(By.name("remember-me")).click();
		Thread.sleep(5000);
		driver1.findElement(By.name("next")).click();
		Thread.sleep(4000);
		
		//mailcopy
		
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
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("EOD"))).build().perform();
		act.click(driver.findElement(By.linkText("EOD"))).build().perform();
		Thread.sleep(3000);
		act.click(driver.findElement(By.linkText("Add My EOD"))).build().perform();
		driver.findElement(By.id("txtFromDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[2]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("intime")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Set']")).click();
		Thread.sleep(2000);
		
		//2nd
		driver.findElement(By.id("txtToDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("outtime")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Set']")).click();
		Thread.sleep(2000);
		
		
		Select se=new Select(driver.findElement(By.id("clientid1")));
		//se.click();
		se.selectByVisibleText("ApMoSys");  
		Thread.sleep(2000);
		Select se1=new Select(driver.findElement(By.id("projectname")));
		se1.selectByVisibleText("Inhouse Automation Testing");
		Thread.sleep(2000);
		driver.findElement(By.id("remark")).sendKeys("Training");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='EODWork']")).sendKeys("Assessment test And EOD Automatic FillUp");
		Thread.sleep(5000);
		driver.findElement(By.id("submitButton")).click();
		

	}

}
