package Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelXYZ {
		
		 XSSFCell cell;
		 XSSFSheet sh;
		 XSSFWorkbook wb;
		 XSSFRow row;
		 FileOutputStream fos;
		 FileInputStream fis;
		 String filepath = "C:\\Users\\NARMAE\\Desktop\\ExcelData\\xyzdetails.xlsx";
		 
		
		public void fileInputPrecondition() throws IOException {
			File src = new File(filepath);
			fis= new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheetAt(0);
		}
		public String firstname() throws IOException {
			fileInputPrecondition();
			String customerFname= sh.getRow(1).getCell(0).getStringCellValue();
			return customerFname;
		}
		public String laststname() throws IOException {
			fileInputPrecondition();
			String customerLname= sh.getRow(1).getCell(1).getStringCellValue();
			return customerLname;
		}
		public String postcode() throws IOException {
			fileInputPrecondition();
			 int customerPostcode= (int) sh.getRow(1).getCell(2).getNumericCellValue();
			return Integer.toString(customerPostcode);
		}
		public String currency() throws IOException {
			fileInputPrecondition();
			String curr = sh.getRow(1).getCell(5).getStringCellValue();
			return curr;
		}
		public String depositAmount() throws IOException {
			fileInputPrecondition();
			int Amt = (int) sh.getRow(1).getCell(6).getNumericCellValue();
			return Integer.toString(Amt);
		}
		public String withdrawlAmount() throws IOException {
			fileInputPrecondition();
			int Amt = (int) sh.getRow(1).getCell(7).getNumericCellValue();
			return Integer.toString(Amt);
		}
		public void writeDataCusId(int cusid) throws IOException {
			fileInputPrecondition();
	        cell =sh.getRow(0).createCell(3);
	    	XSSFCell cellvalue =sh.getRow(1).createCell(3);
	    	cell.setCellValue("CutomerID");
	    	cellvalue.setCellValue(cusid);
			fos= new FileOutputStream(filepath);
			wb.write(fos);
		}
		
	    public void writeDataAccNo(int accNo) throws IOException {
	    	fileInputPrecondition();
	    	cell =sh.getRow(0).createCell(4);
	    	XSSFCell cellvalue =sh.getRow(1).createCell(4);
	    	cell.setCellValue("AccountNo");
	    	cellvalue.setCellValue(accNo);
			fos= new FileOutputStream(filepath);
			wb.write(fos);
		}

	}


