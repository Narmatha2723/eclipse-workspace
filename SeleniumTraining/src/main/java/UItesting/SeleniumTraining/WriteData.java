package UItesting.SeleniumTraining;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteData {

	public static void main(String[] args) throws IOException {
		FileOutputStream os = new FileOutputStream("C:\\Users\\NARMAE\\Desktop\\ExcelData1\\seleniumData1.xlsx");
        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook();
        //creating a Sheet object using the sheet Name
        XSSFSheet sheet=wb.createSheet();
        XSSFRow row2=sheet.createRow(0);
        //create a cell object to enter value in it using cell Index
        row2.createCell(0).setCellValue("Diana");
        row2.createCell(1).setCellValue("Jane");
        row2.createCell(2).setCellValue("djanes@gmail.com");
        row2.createCell(3).setCellValue("Female");
        row2.createCell(4).setCellValue("8786858432");
        row2.createCell(5).setCellValue("Park Lane, Flat C1 , New Jersey");
        //write the data in excel using output stream
        wb.write(os);
        wb.close();
        System.out.println("done");


	}

}
