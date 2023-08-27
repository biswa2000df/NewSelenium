package NewSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EODWRITE {

	public static void main(String[] args) throws Exception {
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
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("biswajit.sahoo@apmosys.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Welcome@2022");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://mail.apmosys.com/webmail/");
		Thread.sleep(1000);
		driver1.findElement(By.name("email-address")).sendKeys("biswajit.sahoo@apmosys.com");
		driver1.findElement(By.name("next")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("password")).sendKeys("Welcome@2022");
		driver1.findElement(By.name("remember-me")).click();
		Thread.sleep(1000);
		driver1.findElement(By.name("next")).click();
		Thread.sleep(5000);
		
		//mailcopy
		
		driver1.switchTo().frame(driver1.findElement(By.xpath("//iframe[@id=\"gui.frm_main.main.mailview#frame\"]")));
		Thread.sleep(5000);
		String s=driver1.findElement(By.id("iw_webmail_msg_body")).getText();
		System.out.println(s);
		Thread.sleep(3000);
		driver1.close();
		Thread.sleep(5000);
		String s2="";
		s2=s.substring(21,27);
		System.out.println(s2  +"   "+ s2.length());
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys(s2);

		
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		//act.driver.findElement(By.className("nv active")).click();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.linkText("EOD"))).build().perform();
		act.click(driver.findElement(By.linkText("EOD"))).build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.linkText("View My EOD"))).build().perform();
		driver.findElement(By.id("txtFromDate")).click();
		Thread.sleep(2000);
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
		int sum1=0;
		
		for(int i=2;i<rows.size();i++)
		{
			/*System.out.println("hello");
			data=sheet.getRow(i).getCell(6).getStringCellValue().toString();
			System.out.println("hello");
			if(data=="")
			{
				continue;
			}
			String s7="";
			s7=data.replaceAll(":", "");
			String s8="";
			s8=s7.substring(0,1);
			System.out.println("str  "+s8);
			int a=Integer.parseInt(s8);
			sum=sum + a;
			System.out.println(sum);
			
			//min
			String s9="";
			int length=s7.length();
			for(int l=0;l<length;l++)
			{
			s9=s7.substring(1,length);
			}
			int min=Integer.parseInt(s9);
			sum1=sum1+min;*/
			
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
			
		}		
		/*System.out.println(sum);
		System.out.println(sum1);
		//int kk=System.out.println("Total time is: "+sum+":"+sum1);
		//int sss=sum+sum1;
		//=sum.tos
		String s11="";
		s11=Integer.toString(sum);
		String s12=":";
		String s13="";
		s13=Integer.toString(sum1);
		String s14="";
		s14=s11.concat(s12);
		System.out.println(s14);
		String s15="";
		s15=s14.concat(s13);
		System.out.println(s15);
		Row r0=sheet.createRow(27);
		Cell c0=r0.createCell(6);
		c0.setCellValue(s15);*/
		//sheet.getRow(27).createCell(6).setCellValue(s15);

		
		System.out.println("Successfully inserted");
		file.close();
		FileOutputStream out=new FileOutputStream(f);
		ob.write(out);
		out.close();

	}

}
