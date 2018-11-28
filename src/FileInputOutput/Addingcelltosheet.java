package FileInputOutput;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Addingcelltosheet {

	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
//int rowcount=0;
		
int c=1;	
FileInputStream  fip=new FileInputStream(new File("G:\\NESTURLredirection.xlsx"));
XSSFWorkbook wkbk=new XSSFWorkbook(fip);
XSSFSheet sheet=wkbk.getSheet("Sheet2");

List<String>al=new ArrayList<String>();
al.add("http://www.nestpensions.org.uk/schemeweb/nest/cymraeg.html");
al.add("http://www.nestpensions.org.uk/schemeweb/nest/Accessibility.html");
al.add("https://www.nestpensions.org.uk/schemeweb/nest/nestcorporation.html");
al.add("https://www.nestpensions.org.uk/schemeweb/NestWeb/public/aboutnestcorporation/contents/about-nest-corporation.html");

/*int rowcnt=sheet.getPhysicalNumberOfRows();
for(String s:al){
for(int i=0;i<rowcnt;i++)
{
	int colcnt=sheet.getRow(i).getPhysicalNumberOfCells();
	
	for(int j=0;j<colcnt;j++){
		
XSSFCell cell=sheet.getRow(i).getCell(j);
cell.setCellValue(s);
       System.out.println("URL "+c+" has been added to row");
       c++;
	}
}
}*/
int  i=0;
int j=0;
XSSFRow row=sheet.createRow(i);

XSSFCell cell1=row.createCell(j);
while(j<=1){
	for(String s:al){
cell1.setCellValue(s);
System.out.println("URL "+c+" :"+s+" has been added to row");
j++;
c++;
}
i++;

}
		
	
	
	//XSSFCellStyle style1=wkbk.createCellStyle();
	//c++;

 
FileOutputStream out=new FileOutputStream(new File("G:\\NESTURLredirection.xlsx"));
wkbk.write(out);
	//Opening file using Desktop class
	//File f=new File("mysql-connector-java-5.1.42-bin");
	//if(!Desktop.isDesktopSupported()){
		//System.out.println("Desktop is not supported");	
		//return;//checking if Desktop is supported by Platform 
	//}
	//Desktop d=Desktop.getDesktop();
	//if(f.exists()){//checking if the file exists
		Desktop.getDesktop().open(new File("G:\\NESTURLredirection.xlsx"));
	}



}

//}
