package mercuryTours.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MercuryTourExcelUtility {
	String s;
	
	public String readXL(String path, int i, int j){
		File f=new File(path);
		try {
			FileInputStream fis =new FileInputStream(f);
			XSSFWorkbook  wb= new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell=row.getCell(j);
			if(cell.getCellType() == CellType.NUMERIC) {
				s = NumberToTextConverter.toText(cell.getNumericCellValue());
			}
			else 
				s=cell.getStringCellValue();
			wb.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	public void writeXL(String path, String s, String sheetNo, int i, int j){
		File f= new File(path);
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			XSSFWorkbook  wb= new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet(sheetNo);
			XSSFRow row= sheet.getRow(i);

			XSSFCell cell=row.getCell(j);
			FileOutputStream fos =new FileOutputStream(f);
			cell.setCellValue(s);
			wb.write(fos);
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
