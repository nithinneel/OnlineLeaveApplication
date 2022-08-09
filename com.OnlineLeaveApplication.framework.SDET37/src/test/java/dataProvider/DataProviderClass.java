package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass  {

	@DataProvider
	public Object[][] mobileAccesseries(){
		
		Object[][] objArr = new Object[3][3];
		objArr[0][0]="Charger";
		objArr[0][1]="650";
		objArr[0][2]="C-Type";
		objArr[1][0]="BackCover";
		objArr[1][1]="480";
		objArr[1][2]="Plastic Cover";
		objArr[2][0]="ScreenGuard";
		objArr[2][1]="250";
		objArr[2][2]="Gorilla Guard";
		return objArr;
	}
	
	@Test(dataProvider ="mobileAccesseries" )
	public void buyAccesseries(String charger,String price,String type) {
		System.out.println("   Product Mobile :- "+charger+"   Product Price :- "+price+"   Product Type :- "+type);
	}
}
