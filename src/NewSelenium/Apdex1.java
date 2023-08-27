package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apdex1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=apdex+score&rlz=1C1CHBF_enIN979IN984&oq=&aqs=chrome.0.35i39i362l8.1438253j0j7&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//*[@id=\"Odp5De\"]/div[1]/div/div[1]/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/a/h3")).click();
		
		
		int transaction_threshold=2000; 

		double final_apdex_score=1.0;
		double transaction_duration_in_millis = ctx.apdex_score_test / 1000; //convert to ms

		//logic: requests with latency lower than threshold are satisfying requests,
		//requests taking lower than 4x of threshold are tolerable
		//requests taking greater than 4x are unacceptable
		if ( transaction_duration_in_millis < transaction_threshold ) {     
		    final_apdex_score = 1.0; 
		} else if ( transaction_duration_in_millis > transaction_threshold ) {    
		    if ( transaction_duration_in_millis <= 4 * transaction_threshold ) {      
		        final_apdex_score = 0.5;     
		    } else {      
		        final_apdex_score = 0.0;     
		    }  
		}
		ctx.apdex_score_test = final_apdex_score;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String s2=s.toLowerCase();
//		int l=s2.length();
//		System.out.println(l);
//		System.out.println(s2);
//		
//		
//	char ch;
//	char ch1;
//	 
//	   String two="";
//		   
//		   for(int i=0;i<l;i++)
//		   {
//			   if(i==0)
//			   {
//			  ch=s2.charAt(i);
//			  ch1=Character.toUpperCase(ch);
//			 // System.out.print(ch1);
//			   }
//			   else
//				   ch1=s2.charAt(i);
//			   System.out.print(ch1);
//			   
//			 //break;
//		   }
//		  // System.out.print(ch1);
//		  
//	
//		==========================================================================
//		String s="JUNE";
//		String s2=s.toLowerCase();
//		
//		
//	   char c[]=s2.toCharArray();
//	   c[0]=Character.toUpperCase(c[0]);
//	   String out=new String(c);
//	   System.out.println(out);

	}
	

	
	
}
