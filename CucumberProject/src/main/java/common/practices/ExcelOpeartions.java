/*package common.practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Baseclass.Base;

public class ExcelOpeartions extends Base {

	static String openUrl = "https://opensource-demo.orangehrmlive.com/";
	

	@BeforeTest
	public static void setUP() {
		Base.init(openUrl);

	}

	@DataProvider(name = "testdata")
	public arr provideData() throws FileNotFoundException
	{
	Object[][] arr =	DataProviderClass.getData();
	
//	Iterator<Object[][]> arr1= arr.length;
	return arr;
	
	}
	
	
	
	@Test(dataProvider = "testdata")
	public void enterCredentials(String username, String password) {

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
*/