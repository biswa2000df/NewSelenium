package NewSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BufferWriterExcelsheet {
	  WebDriver driver;

	    @BeforeTest

	    public void setUp() {

	        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

	        driver = new ChromeDriver();
	    }

	    @Test
	    public void test01()  {
//		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider");
		//WebElement element=new WebElement(driver.findElement(By.xpath("//*[@class='range-slider__wrap']")));
//		Actions act = new Actions(driver);
//		WebElement horizontal_scroll = driver.findElement(By.xpath("//*[@class='range-slider__wrap']"));
		//act.clickAndHold(horizontal_scroll).moveByOffset(80, 0).release().perform();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver; 
//		js.executeScript(
//		    "document.getElementByclassName('range-slider__wrap').scrollRight += 250", "");
		
		WebElement viewAllCoursesBtn = driver.findElement(By.xpath("//*[@class='range-slider__wrap']"));

        Point point = viewAllCoursesBtn.getLocation();

        int x_coordinate = point.getX();

        int y_coordinate = point.getY();

        scrollToElement(x_coordinate, y_coordinate);
	}
        
        public void scrollToElement(int x, int y) {

            JavascriptExecutor javScriptExecutor = (JavascriptExecutor) driver;

            javScriptExecutor.executeScript("window.scrollBy(" + y + ", " + x + ");");
            System.out.println(x+" "+y);

        }



//JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
//javaScriptExecutor.executeScript("window.scrollBy(500,0)");
//javaScriptExecutor.executeScript("window.scrollTo(0, document.body.scrollUp)");
	
}
	

			
		
	






