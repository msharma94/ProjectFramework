package com.csc.integral.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.csc.integral.Data.Xls_Reader;

public class Resources {
	
	public static EventFiringWebDriver driver;
	public static Properties Repository = new Properties();
	public static Properties Config = new Properties();
	public static Properties AppText = new Properties();
	public static Xls_Reader SuiteData;
	public static Xls_Reader TestStepData;
	
	public static String keyword;
	public static String webElement;
	public static String TestDataField;
	public static String TestData;
	public static String ProceedonFail;
	public static String TSID;
	public static String Description;
	public static File f;
	public static FileInputStream FI;
	
	
	public static void Initialize() throws IOException {
		
		SuiteData = new Xls_Reader(System.getProperty("user.dir")+"//src//test//java//com//csc//integral//data//TestSuite1.xlsx");
		TestStepData = new Xls_Reader(System.getProperty("user.dir")+"//src//test//java//com//csc//integral//data//TestSuite1Data.xlsx");
		
		f = new File(System.getProperty("user.dir")+"//src//test//java//com//csc//integral//repository//login.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
	}
	
}
