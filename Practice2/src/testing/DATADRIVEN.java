package testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DATADRIVEN 
{
	public static void main(String args[]) throws Exception
	{
		
	FileInputStream fis = new FileInputStream("C:/Users/Sharu/Desktop/testing.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	//get sheet
	Sheet s = wb.getSheet("Sheet1");
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//Now in application i have given my Username and Password input in following way
	String data = s.getRow(0).getCell(0).getStringCellValue();
	System.out.println(s.getRow(0).getCell(0).getStringCellValue());
	driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys(data);
	//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Sheet.getCell(1, i).getContents());
	//driver.findElement(By.xpath("//input[@name='Login']")).click();
}
}
