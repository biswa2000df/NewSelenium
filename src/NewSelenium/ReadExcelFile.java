package NewSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONException;
import org.json.JSONObject;



public class ReadExcelFile {
public static void main(String[] args) throws IOException, JSONException {
	
	
	try {
		File file=new File("C:\\Users\\biswa\\Desktop\\excel1.xlsx");

		 JSONObject f = new JSONObject();
		FileInputStream inputStream=new FileInputStream(file);
		Workbook testDataWorkBook= new XSSFWorkbook(inputStream);
		for(int k=0;k<3;k++) {
		Sheet testDataSheet= testDataWorkBook.getSheetAt(k);
		int rowcount=testDataSheet.getLastRowNum()-testDataSheet.getFirstRowNum();
		for(int i=0;i<rowcount+1;i++) {
			Row row=testDataSheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				System.out.print(row.getCell(j).getStringCellValue( )+ "\t\t\t");
				
				f.put("Name",row.getCell(j).getStringCellValue( ));				
				}
			
			System.out.println("\t\t\t");
		
	}
		}
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	}
	
	
	 //JSONObject f = new JSONObject();
	 
    
     
     
     

}
}
