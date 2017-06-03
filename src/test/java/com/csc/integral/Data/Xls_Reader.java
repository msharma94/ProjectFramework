package com.csc.integral.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook =null;
	private XSSFSheet sheet =null;
	private XSSFRow row =null;
	private XSSFCell cell =null;
	
	public Xls_Reader(String path) throws IOException{
		
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		//sheet = workbook.getSheetAt(0);
		fis.close();
				
	}
	
	
	// Return count in the sheet
	public int getRowCount(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		if(index==-1){
			return 0;
		}
		else{
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum()+1;
			return number;
			
			}
				
	}
	
	// returns data from cell
	
	public String getCellData(String sheetName,String colName, int rowNum){
		if(rowNum<=0){
			return "";
					}
		else{
			int index = workbook.getSheetIndex(sheetName);
			int col_Num = -1;
			if(index==-1){
				return "";
			}
			else{
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)){
					col_Num = i;
				}
				if(col_Num==-1){
					return "";
				}
				else{
					sheet = workbook.getSheetAt(index);
					row = sheet.getRow(rowNum-1);
							
				}	
			}
			}
		}
	}
	
	
	
	
	
	
	
}
