package saucelabs.logpage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class testdemo {
public static void main(String[] args)throws IOException {
                File file = new File("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\logpage\\Exceldata\\test.xlsx");

 

                FileOutputStream fos = new FileOutputStream(file);

 

                XSSFWorkbook w = new XSSFWorkbook();

 

                Sheet sheet =  w.createSheet("TestSheet");
                sheet.createRow(0);
                sheet.getRow(0).createCell(0).setCellValue("Priya");
                sheet.getRow(0).createCell(1).setCellValue("576462");

 

                Sheet sheet1 =  w.createSheet("TestSheet1");
                sheet1.createRow(1);
                sheet1.getRow(1).createCell(0).setCellValue("rahul");
                sheet1.getRow(1).createCell(1).setCellValue("576472");

 

                w.write(fos);
                w.close();

 

            }

    }