package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	 //we declare global variable //why we declared = 
    public FileInputStream fis;           //FileInputStream is class from io package//we create reference here not object//for read the data only 
    public FileOutputStream fos;          //for update or change the data 
    public XSSFWorkbook workbook;         //XSSFWorkbook is  predefined class from jar files  poi 
    public XSSFSheet sheet;               //XSSFSheet is predefined class (sheet ke sath kya action lena hai uske liye)
    public XSSFRow row;                   //XSSFRow is predefined class 
    public XSSFCell cell;                 //XSSFCell is predefined class 
    String path = "\\Excel\\Book1.xlsx";  //path of file 

  
    public int getRowCount(String sheetName) throws IOException {    //this method is for find number of rows in files 
		   
		   fis = new FileInputStream(path);            //this code tells us which excel file we used for taking data so we take FileInputStream class object and pass path of that file as parameter //this is object of FileInpurStream class//file ke sath krna kya hai ye isko pta hai 
		   workbook = new XSSFWorkbook(fis);           //this code means which workbook we used so we pass fis as parameter because fis main path hai excel file ka // jo location mili usme se file ka nam find krega usko open krega 
		   sheet = workbook.getSheet(sheetName);       //abhi workbook main multiple sheet hai toh konsi sheet used kre ye batayega ye code .
		   int rowCount = sheet.getLastRowNum();       //how many rows are present in sheet which  we chose ye find krenge this code se ......lastrows tr nikalna hai  //getsheet method workbook ke under aati hai 
		   workbook.close();                           //close kiya kyuki dusri method use open kr sake 
		   fis.close();
		   return rowCount;
		   
	   }
	   
	   public int getCellCount(String sheetName,int rownum) throws IOException {      //this method is used for find number of cell present in sheet 
		   
		   fis = new FileInputStream(path);            //file location nikala   
		   workbook = new XSSFWorkbook(fis);           //workbook nikala 
		   sheet = workbook.getSheet(sheetName);       //sheet chose ki
		   row = sheet.getRow(rownum);                 //rows aur column se cell bnte hai .....for that purpose sheet main se perticular rows ko select krne ke liye by our choise  
		   int cellCount = row.getLastCellNum();       //how many cell are present in sheet we find  here by using this code 
		   workbook.close();
		   fis.close();
		   return cellCount;                           
		   
		 }
	   
	   public String getCellData(String sheetName, int rownum,int cellnum) throws IOException {    //this method is used to read the cell data present in sheet 
		  
		   fis = new FileInputStream(path);             
		   workbook = new XSSFWorkbook(fis);
		   sheet = workbook.getSheet(sheetName);             //sheet dalo yaha pe 
		   row = sheet.getRow(rownum);                       //row select krna hai 
		   cell = row.getCell(cellnum);                      //column select krna hai //in this way select cell 
		   String data;
		    
		   DataFormatter formatter = new DataFormatter();     //actual data k e sath krna kya hai isake liye ye dataformatter class ka object  from poi //
		    
		   try {
			   data= formatter.formatCellValue(cell);         //data main admin value store ho gyi //formatter ka kam hai data read krna //formatCellValue ke method cell ke value ko read krta hai string  main
		   }                                                  //try catch use kiya hai kyuki agar cell blan raha toh exception dega toh handle krne ke liye  try catch 
		   catch(Exception ex) {
			   data = " ";
		   }
		   workbook.close();
		   fis.close();
		   return data;
	     }


}
