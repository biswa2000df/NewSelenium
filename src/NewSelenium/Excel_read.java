package NewSelenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class abc
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public abc(String excelpath)
	{
		try
		{
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String get_data(int S_no,int R,int c)
	{
		sheet=wb.getSheetAt(S_no);
		String data=sheet.getRow(R).getCell(c).getStringCellValue();
		return data;
	}
	public int getrowcount(int Sheet_no) {
		// TODO Auto-generated method stub
		sheet=wb.getSheetAt(Sheet_no);
		int row=sheet.getLastRowNum();
		row+=1;
		return row;
	}
	
}

public class Excel_read {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		abc config=new abc("C:\\Users\\biswa\\Desktop\\New folder (4)\\final_assessment.xlsx");
		int a=0;
		int row=config.getrowcount(a);
		String username,password;

		for(int i=0;i<row;i++)
		{
			username=config.get_data(0, i, 0);
			password=config.get_data(0,i,1);
		
		//driver=new ChromeDriver();
			driver.get("https://mail.apmosys.com/webmail/");
		Thread.sleep(3000);
		//driver.findElement(By.)
		driver.findElement(By.name("email-address")).sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(By.name("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
//		driver.findElement(By.name("remember-me")).click();
//		Thread.sleep(5000);
		driver.findElement(By.name("next")).click();
		Thread.sleep(15000);
		System.out.println("Data rad from Excel");
//		Thread.sleep(5000);
//		driver.quit();
		}

	}

}
