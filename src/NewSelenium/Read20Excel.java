package NewSelenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class tt
{
	XSSFWorkbook wb;
	XSSFSheet sheet;


public tt(String excelpath)
{
try
{
	File f=new File(excelpath);
	FileInputStream fs=new FileInputStream(f);
	wb=new XSSFWorkbook(fs);
}
catch(Exception e)
{
	System.out.println(e);
}
}
public int rowcount(int srow)
{
	sheet=wb.getSheetAt(srow);
	int row=sheet.getLastRowNum();
	//row+=1;
	return row;
	
}
public String getvalue(int shet,int r,int c)
{
	sheet=wb.getSheetAt(shet);
	String data=sheet.getRow(r).getCell(c).getStringCellValue();
	return data;
}
// void display(String s)
// {
//	 Row r0=sheet.createRow(2);
//		Cell c0=r0.createCell(2);
//		c0.setCellValue(s);
// }
}

public class Read20Excel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		tt an=new tt("C:\\Users\\biswa\\Desktop\\New folder (4)\\final_assessment.xlsx");
		//int a=0;
		int row=an.rowcount(0);
		String username,password;
		for(int i=0;i<=row;i++)
		{ 
			
			username=an.getvalue(0,i,0);
			password=an.getvalue(0,i,1);
			driver.get("https://mail.apmosys.com/webmail/");
			Thread.sleep(3000);
			//driver.findElement(By.)
			driver.findElement(By.name("email-address")).sendKeys(username);
			Thread.sleep(5000);
			driver.findElement(By.name("next")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("next")).click();
			//Thread.sleep(15000);
			System.out.println("Data rad from Excel");
			Thread.sleep(1000);
			//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"gui.frm_main.main.mailview#frame\"]")));
			String s=driver.findElement(By.id("iw_webmail_msg_body")).getText();
			System.out.println(s);
			
			
			
		}
		
		
		
	}

}
