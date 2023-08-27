package NewSelenium;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.io.FileUtils;

public class just {
public static void main(String args[]) throws IOException {
	 String s40=null;
		File dir=new File("C:\\Users\\biswa\\eclipse-workspace\\TotalJavaProgram\\newfolder\\");
		 File[] files = dir.listFiles();

	        Arrays.sort(files, new Comparator<File>() {
	            public int compare(File f1, File f2) {
	                return Long.valueOf(f2.lastModified()).compareTo(f1.lastModified());
	            }
	        });

	        for (int i = 0; i < files.length; i++) {
	            
	           
	              s40 = files[0].getPath();
	              Desktop desktop=Desktop.getDesktop();
	  		
	              files[0].delete();
	              System.out.println(s40);
	             
	              break;

	        }
	
	File originalfile=new File("C:\\Users\\biswa\\eclipse-workspace\\FileOpen\\newfolder\\");
	File newPlace=new File("C:\\Users\\biswa\\eclipse-workspace\\TotalJavaProgram\\newfolder\\");
	FileUtils.copyDirectory(originalfile,newPlace);
	
	
			
	       
	      
	        
	        
	    }
}
