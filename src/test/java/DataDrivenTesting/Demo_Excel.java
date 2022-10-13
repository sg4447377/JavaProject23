package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Excel {

	
	     //we declare global variable //why we declared = 
         public FileInputStream fis;           //FileInputStream is class from io package//we create reference here not object//for read the data only 
         public FileOutputStream fos;          //for update or change the data 
         public XSSFWorkbook workbook;         //XSSFWorkbook is  predefined class from jar files  poi 
         public XSSFSheet sheet;               //XSSFSheet is predefined class (sheet ke sath kya action lena hai uske liye)
	     public XSSFRow row;                   //XSSFRow is predefined class 
	     public XSSFCell cell;                 //XSSFCell is predefined class 
	     String path = "\\Excel\\Book1.xlsx";  //path of file 
	
	   @Test(dataProvider="LoginData")
		public  void login(String userValue,String pwdValue) {
	    	 
	         WebDriverManager.chromedriver().setup();
			 
			 ChromeDriver driver = new   ChromeDriver();
			 
			 driver.get("https://demo.actitime.com/login.do");
			 
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 driver.findElement(By.id("username")).sendKeys(userValue);
			 
			 driver.findElement(By.className("pwdfield")).sendKeys(pwdValue);

			 driver.findElement(By.id("loginButton")).click();
			   
	    
     }
	   @DataProvider(name = "LoginData")
	   public String[][] loginValues() throws IOException{      //this method is used for supplying data 
		   
		   //Read data from excel and store in array 
		   Demo_Excel ddt = new Demo_Excel();                   //
		   int totalrows = ddt.getRowCount("sheet1");
		   int totalcols = ddt.getCellCount("sheet1",1);
		   String[][] loginData = new String[totalrows][totalcols];
		   
		  //this is for  rows
		   for(int i=1; i<totalrows;i++ ) {
			   
			   //this is for column 
			   for(int j =0 ;j<totalcols;j++) {
			       loginData[i-1][j]= ddt.getCellData("sheet1", i, j);

			    }
		  
		   }
		   return loginData;
		   
	   }
	   
	   
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

//to find rowscount first we have to know that which sheet we used 
//so we have to pass paramters here as String sheetname 
//separate object kyu create nahi kiya kyuki bar bar banana pdta abhi global reference liya toh vo sabke ke liye apply hoga 
//lastrows kyu liya = because in future we add data then i have to change the code again so for that we take lastrows tak count 
//utilities means isme hum code code rakh skte hai jo baad main jarurt pdne par firse likhna na pde directly hum use kr ske utilities main se



