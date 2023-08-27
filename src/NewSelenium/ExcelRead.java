package NewSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\biswa\\Desktop\\kanhaecxle.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
//		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(data0);
//		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(data1);
//		String data2=sheet1.getRow(1).getCell(0).getStringCellValue();
//		System.out.println(data2);
//		String data3=sheet1.getRow(1).getCell(1).getStringCellValue();
//		System.out.println(data3);
		int rowcount=sheet1.getLastRowNum();
		//int colcount=sheet1.getLastCellNum()
		System.out.println("Total row is "+(rowcount+1));
		for(int i=0;i<rowcount+1;i++)
		{
			Row row=sheet1.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+" ");
			}
			//for(int j=0;j<coll)
//			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
//			System.out.println(data0);
			System.out.println();
		}
		
		
	}

}
