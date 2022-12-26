package data;

public class ReadWriteExelFile {

	public static void main(String[] args) {
		Xls_Reader d = new Xls_Reader("C:\\QA2022\\Testing\\AllJars\\NikulTest.xlsx");
		
		
		
		//System.out.println(d.getCellData("Data1", "Name", 3));
		//Another Method
		
		System.out.println(d.getCellData("Data1", 1, 2));
		
		// another method
		
		String  browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		
		//Get rows and collumn
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		
		
		///////////////////How to write d=in exel
		
		
		d.setCellData("Data1", "Name", 11, "Testing11");
		System.out.println(d.getCellData("Data1", "Name", 11)); //Testing11
		System.out.println(d.getRowCount("Data1")); //11 
		 
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1")); //8

		
		
		

	}

}
