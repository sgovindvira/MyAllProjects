package data;

import tests.Xls_Reader;

public class DataFile {
	

	Xls_Reader d = new Xls_Reader("C:\\QA2022\\Testing\\AllJars\\NikulTest.xlsx");
	
	public String emailwithSpecialChar ="jhfrkjn$$$%%&&";
	public	String wrongEmail ="jkfkjwnfw";
	public String WrongPass = "jndwkj";
	

	public	String specialCharErr = d.getCellData("Data1","EmailError",5);
	public	String emptyEmailErr =d.getCellData("Data1","EmailError", 4);
	public	String emptyPassErr=d.getCellData("Data1","PasswordError" , 3);
	public	String globalErrpr = d.getCellData("Data1", "Global Error", 2);


}
