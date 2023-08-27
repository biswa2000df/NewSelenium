package NewSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IciciPure {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.iciciprulife.com/protection-saving-plans/icici-pru-guaranteed-income-for-tomorrow.html?UID=2399");
		
		driver.findElement(By.xpath("//div[@class='txtHandle txt-middle'][1]")).click();		
		driver.findElement(By.xpath("//label[@class='col-12 form-check-label'][1]")).click();		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();	
		driver.findElement(By.name("user_dob")).sendKeys("12/07/2000");		
		Select s=new Select(driver.findElement(By.id("myDropDown")));	
		s.selectByIndex(2);
		driver.findElement(By.name("mobileno")).sendKeys("9874561235");
		driver.findElement(By.name("emailid")).sendKeys("biswajithoo111@gmail.com");
		driver.findElement(By.className("js-suitabilityText")).click();
		driver.findElement(By.xpath("//div[@class='col-12 button chk-prem-btn at-element-click-tracking']")).click();
		driver.findElement(By.xpath("//div[text()='Proceed']")).click();
		driver.findElement(By.id("frstNm")).sendKeys("Biswajit Sahoo");
		Select s1=new Select(driver.findElement(By.id("mrtlSts")));
		s1.selectByIndex(3);
		Select s2=new Select(driver.findElement(By.id("education")));
		s2.selectByIndex(1);
		Select s3=new Select(driver.findElement(By.id("occ")));
		s3.selectByIndex(14);
		driver.findElement(By.id("occDesc")).sendKeys("SOFTWARE ENGINEER");
		driver.findElement(By.id("nameOfOrg")).sendKeys("APMOSYS");
		Select s4=new Select(driver.findElement(By.id("orgType")));
		s4.selectByIndex(6);
		driver.findElement(By.id("orgTypeDesc")).sendKeys("To develope the different type of the software and publish the application an these application are very user friendly");
		driver.findElement(By.id("panNo")).sendKeys("KVHPS4238E");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(By.id("address1")).sendKeys("At-Mohanpur,Post-basudevpur");
		driver.findElement(By.id("landmark")).sendKeys("Bhubaneswar");
		driver.findElement(By.id("pinCode")).sendKeys("754204");
		driver.findElement(By.id("city")).sendKeys("Cuttack");
		Select s5=new Select(driver.findElement(By.id("state")));
		s5.selectByVisibleText("ODISHA");
		driver.findElement(By.xpath("//*[text()='Yes']")).click();
		driver.findElement(By.id("nomineefrstNm")).sendKeys("Bilasini Sahoo");
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		Select s6=new Select(driver.findElement(By.id("relationship")));
		s6.selectByIndex(3);
		driver.findElement(By.id("nomineeDob")).sendKeys("05101990");
		driver.findElement(By.id("nominee-complete")).click();
	}

}
