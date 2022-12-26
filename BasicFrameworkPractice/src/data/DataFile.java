 package data;

import tests.Xls_Reader;

public class DataFile {
	
	
	Xls_Reader d = new Xls_Reader("C:\\QA2022\\Selenium_Workspace\\BasicFrameworkPractice\\NikulTest.xlsx");

	public String emailWithSpecialCharecter = d.getCellData("Data1", "Username", 2);
	public String wrongEmail =d.getCellData("Data1", "Username", 3);
	public String wrongPassword = d.getCellData("Data1", "Password", 2);

	public String SpecialCharecterError = d.getCellData("Data1", "EmailError", 5);
	public String emptyEmailError = d.getCellData("Data1", "EmailError", 4);
	public String emptyPasswordError = d.getCellData("Data1", "EmailError", 3);
	public String globalError = d.getCellData("Data1", "EmailError", 2);


	

}
