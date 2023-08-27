package NewSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuiziLogin {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://quizizz.com/join?");
		Thread.sleep(3000);
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='auth-input'][1]")).sendKeys("7978067010");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='auth-input'][2]")).sendKeys("Kanha@@316");
		Thread.sleep(3000);
		driver.findElement(By.className("login-submit-btn")).click();
		
		File filePath= new File("C:\\Users\\biswa\\Desktop\\New folder (4)\\final_assessment.xlsx");
		FileInputStream file=new FileInputStream(filePath);
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheetAt(0);
		
		
		String quiz=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Quiz  is : "+quiz);
		
		String Code=sheet.getRow(0).getCell(1).toString();
		System.out.println(" password is : "+Code);
		Thread.sleep(3000);
		String s5="";
		s5=Code.substring(0,6);
		driver.findElement(By.className("check-room-input")).sendKeys(s5);
		Thread.sleep(3000);
		driver.findElement(By.className("visible")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div[2]/div[1]/div/form/div/button")).click();
		
		

	}

}
