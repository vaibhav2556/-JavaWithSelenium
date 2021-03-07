/*package common.practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderClass {
	
	static XSSFWorkbook wbo;
	static XSSFSheet sheet;
	
	public static Object[][] getData() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\qq\\Desktop\\OrangeHrm.xlsx");
		try {
			wbo = new XSSFWorkbook(fis);

		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = wbo.getSheet("Sheet1");

		XSSFRow RowNum = sheet.getRow(0);
		System.out.println(RowNum);
		
	
		
		short ColNum=RowNum.getLastCellNum();
		
		 Object Data[][]= new Object[ RowNum ][ColNum]; 
		 for(int i=0; i< RowNum; i++) //Loop work for Rows
         {  
             XSSFRow Row= sheet.getRow(i+1);
              
             for (int j=0; j<ColNum; j++) //Loop work for colNum
             {
                 
                String data=  Row.getCell(j) .getStringCellValue();    
						
                 }
             }
         }
		
		
		 * int colnum = sheet.createRow(0).getLastCellNum(); System.out.println(colnum);
		 

		// Object[][] arrays = new Object[rownum][];
		ArrayList as = new ArrayList();

		for (int i = 0; i < rownum; i++) {

			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			String value1 = sheet.getRow(i).getCell(1).getStringCellValue();

			as.add(value);
			as.add(value1);

			
			
			// as[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			// arrays[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();

			
			 * arrays[i][0] = sheet.getce // Fetch first row password arrays[i][1] =
			 * sheet.getCellComment(i, 1).getString();
			 
			

		}

		return as;
	}

return data;
		}



}
*/