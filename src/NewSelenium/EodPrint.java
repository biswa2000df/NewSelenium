package NewSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EodPrint {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\biswa\\Desktop\\Book1.xlsx");
		FileInputStream file=new FileInputStream(f);
		XSSFWorkbook ob=new XSSFWorkbook(file);
		XSSFSheet sheet=ob.getSheet("Sheet1");
		
		
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
		driver.findElement(By.id("password")).sendKeys("Apmosys@123");
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
		Thread.sleep(3000);
		driver1.findElement(By.name("next")).click();
		//Thread.sleep(3000);
		
		//mailcopy
		
		driver1.switchTo().frame(driver1.findElement(By.xpath("//iframe[@id=\"gui.frm_main.main.mailview#frame\"]")));
		//Thread.sleep(5000);
		String s=driver1.findElement(By.id("iw_webmail_msg_body")).getText();
		System.out.println(s);
		//Thread.sleep(5000);
		driver1.close();
		Thread.sleep(5000);
		String s2="";
		s2=s.substring(21,27);
		System.out.println(s2  +"   "+ s2.length());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys(s2);

		
		Thread.sleep(2000);
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
		String data="";
		//int a=0;
		int sum=0;
		for(int i=0;i<rows.size();i++)
		{
			data=sheet.getRow(i).getCell(6).getStringCellValue();
			String s7="";
			s7=data.replaceAll(":", "");
			String s8="";
			s8=s7.substring(0,1);
			System.out.println(s8);
			int a=Integer.parseInt(s8);
			sum=sum + a;

		//	a=Integer.parseInt(data);	 
			Row R=sheet.createRow(i);
			List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
			int cnum=columns.size();
			//System.out.println("Total num of columns= "+cnum);
			for(int j=0;j<columns.size();j++) 
			{
				String columndata=columns.get(j).getText();
				Cell cell=R.createCell(j);
				cell.setCellValue(columndata);
				//System.out.print("     "   +columndata);
			}
			//System.out.println(data); 	
		}
		//
		//System.out.println(data);
		//System.out.println(a);

		System.out.println(sum);
		System.out.println("Successfully inserted");
		file.close();
		FileOutputStream out=new FileOutputStream(f);
		ob.write(out);
		out.close();

	}

}
