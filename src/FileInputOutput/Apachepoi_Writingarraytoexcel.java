package FileInputOutput;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachepoi_Writingarraytoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet=workbook.createSheet("Sheet1");
int[] arr={9,0,8,7};
int rowcnt=0;
int colcnt=0;
Row row=sheet.createRow(rowcnt);
for(int i:arr){
	Cell cell=row.createCell(colcnt++);
	cell.setCellValue(i);
	}
FileOutputStream out=new FileOutputStream("G:\\Array_Names.xlsx");
workbook.write(out);
Desktop.getDesktop().open(new File("G:\\Array_Names.xlsx"));
workbook.close();
}
}
