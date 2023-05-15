package ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.testng.annotations.Test;

public class JenkinReadDataApachePoi {
	
	
	/*public void readExcel() throws IOException
	{
		*/
	
	public static void main(String[] args) throws Exception {
		File f=new File("D:\\EmployeeData.xlsx");

		FileInputStream inputStream = new FileInputStream(f);



		//XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		XSSFWorkbook wb=new XSSFWorkbook(inputStream);

		
	}




/*
 * XSSFSheet sheet = wb.getSheet("Sheet1");
 * 
 * 
 * int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
 * 
 * for(int i=1;i<rowCount;i++) { for(int j=1;j<rowCount;j++) { if(j==1) {
 * System.out.print((int)sheet.getRow(i).getCell(j).getNumericCellValue());
 * 
 * 
 * 
 * }
 * 
 * else {
 * 
 * 
 * System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
 * 
 * }
 * 
 * System.out.print(" "); } System.out.println("\n");
 * 
 * }
 * 
 * 
 * wb.close();
 */


	

				 
	
	}


