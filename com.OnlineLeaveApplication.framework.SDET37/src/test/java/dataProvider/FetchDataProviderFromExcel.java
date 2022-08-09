package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.genericUtilities.ExcelUtility;

public class FetchDataProviderFromExcel{
	
	@Test(dataProvider = "emploeeData")
	public void print(String empName1,String empCode1 ) {
		System.out.println("name  :- "+empName1+ "   value :- "+empCode1);
	}
     @DataProvider
	public Object[][] emploeeData(){
		ExcelUtility elib = new ExcelUtility();
		String empName1 = elib.readDataFromExcel("DataProviderExcel", 1, 1).toString();
		String empCode1 = elib.readDataFromExcel("DataProviderExcel", 1, 2).toString();
		String empName2 = elib.readDataFromExcel("DataProviderExcel", 2, 1).toString();
		String empCode2 = elib.readDataFromExcel("DataProviderExcel", 2, 2).toString();
		String empName3 = elib.readDataFromExcel("DataProviderExcel", 3, 1).toString();
		String empCode3= elib.readDataFromExcel("DataProviderExcel", 3, 2).toString();
		Object[][] objArr = new Object[3][2];
		objArr[0][0]=empName1;
		objArr[1][0]=empName2;
		objArr[2][0]=empName3;
		objArr[0][1]=empCode1;
		objArr[1][1]=empCode2;
		objArr[2][1]=empCode3;
		return objArr;
	}
     
}
