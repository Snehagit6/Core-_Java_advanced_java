 package Databaseconn_Poi;

//import java.awt.Desktop;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.util.HSSFColor;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFColor;
//import org.apache.poi.xssf.usermodel.XSSFFont;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DatabasewithExcel {
	//Connection URL syntax:"jdbc(main protocol):mysql(sub protocol for mySql)://localhost:3306(sub name for mysql (host:port))/database name)"
	static  String  dbURL="jdbc:mysql://localhost:3306/data?verifyServerCertificate=false&useSSL=true";/*Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.*/
	//Database Username
	private static String username="root";
	//Database Password
	private static  String password="Securepass6!";
	static String query1="SELECT * FROM employee";
//	static XSSFCellStyle style;
	//static String query2="INSERT INTO employee(id,name,dob,email) VALUES(8,'Madhumita','1964-12-03','madumita312@gmail.com');";
	public static void main(String[] args) throws ClassNotFoundException, SQLException{//, IOException {
		//Step1. Load and Register the JDBC Driver:
		try{
		Class.forName("comm.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e)
		{
            e.printStackTrace();
			System.out.println("Happy Life@");
		}
		/*For registering the Driver we Load the Driver class using forName() method.
        forName() is the static factory method which is present in predefined class called "Class".
        This method loads the class which is mentioned as parameter.
        Internally this Driver class will register the driver by using static method called registerDriver().*/

		//Step2:Establishing Connection:

		Connection con=DriverManager.getConnection(dbURL,username,password);
		/*For establishing connection with database we call static method called getConnection(...) present in
		 * DriverManager Class. This method contains three arguments of string type. i.e., url, username and
		 * password*/

		//Step3:Creating Statement Object:

	    Statement st= con.createStatement();//This method is present in the Connection interface
		/*For creating statement object we need to call a method
		 * called createStatement() which is present in Connection Interface.
         And this method returns Statement object and it is no argument method.
		 */

		//Step 4:Executing query and storing the records in ResultSet object.
		/* For executing queries there are different methods present in
		 * Statement Interface for retrieving records and for updating records*/
		ResultSet rs=st.executeQuery(query1);//This method (present in the Statement Interface)returns ResultSet object.
		//ResultSet rs2=st.executeUpdate("update employee set id='7' where name='Madhumita';");
		System.out.println(rs);
//		XSSFWorkbook wkbk=new XSSFWorkbook();
//		XSSFSheet sheet=new XSSFWorkbook().createSheet("Sheet1");
//		XSSFRow row=new XSSFWorkbook().createSheet("Sheet1").createRow(0);
//
//		/*Setting of font of the contents in the cells as "bold"*/
//		XSSFFont font=wkbk.createFont();
//		font.setBold(true);
//		font.setColor(HSSFColor.DARK_BLUE.index);
//		//Setting the font into style
//	
//		XSSFCellStyle style2;
//		style2=wkbk.createCellStyle();
//		style2.setFillBackgroundColor(HSSFColor.LAVENDER.index);
//		style2.setFillPattern(HSSFCellStyle.ALIGN_FILL);
//		style2=wkbk.createCellStyle();
//	//	style2.setFont(font);
//		//style.setFillBackgroundColor(HSSFColor.GOLD.index);
//       // hssfstyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
//		XSSFCell cell=row.createCell(0);
//		
//		cell.setCellStyle(style2);
//		cell.setCellValue("EMP_ID");
//		
//		//cell.setCellStyle(style2);
//		cell.setCellStyle(style);
//		cell=row.createCell(1);
//		
//		cell.setCellValue("EMP_NAME");
//		
//		cell.setCellStyle(style2);
//		cell.setCellStyle(style);
//		cell=row.createCell(2);
//		cell.setCellValue("DEPT");
//		cell.setCellStyle(style2);
//		//cell.setCellStyle(style);
//		cell=row.createCell(3);
//		cell.setCellStyle(style2);
//		//cell.setCellStyle(style);
//		cell.setCellValue("EMP_EMAIL");
//		cell=row.createCell(4);
//		cell.setCellValue("SALARY");
//		cell.setCellStyle(style2);
//		//cell.setCellStyle(style);
//		int i=1;
//		while(rs.next()){
//			row=sheet.createRow(i);
//			row.createCell(0).setCellValue(rs.getInt("EMP_ID"));
//			row.createCell(1).setCellValue(rs.getString("EMP_NAME"));
//			row.createCell(2).setCellValue(rs.getString("DEPT"));
//			row.createCell(3).setCellValue(rs.getString("EMP_EMAIL"));
//			row.createCell(4).setCellValue(rs.getString("SALARY"));
//
//            //System. out.println(id+"  "+name+" "+dob+" "+email);
//			i++;
//		}
//
//		//Closing DB Connection
//
//		//con.close();
//		FileOutputStream out=new FileOutputStream(new File("G:\\CoreJavaPraccy\\JavaKeyConcepts\\Employee_DB_Data\\Employee_DB_Data.xlsx"));
//		wkbk.write(out);
//		out.close();
//		System.out.println("Sheet created successfully");
//		//Opening the excel sheet
//		Desktop.getDesktop().open(new File("G:\\CoreJavaPraccy\\JavaKeyConcepts\\Employee_DB_Data\\Employee_DB_Data.xlsx"));
//		Runtime.getRuntime().exec("notepad");
//		//Shutting down the computer 
//		Runtime.getRuntime().exec("C://Windows//System32//shutdown -s -t 6");
		}

}
