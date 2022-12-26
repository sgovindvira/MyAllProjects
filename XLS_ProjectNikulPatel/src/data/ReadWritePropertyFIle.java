package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.tools.FileObject;

public class ReadWritePropertyFIle {

	public static void main(String[] args) throws IOException {


		FileInputStream f = new FileInputStream("C:\\QA2022\\Testing\\XML\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);

		String s = prop.getProperty("browser");
		System.out.println(s);


		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("defect"));


		// Write to document




		prop.setProperty("inbox", "Gmail");
		prop.setProperty("Laptop", "Dell");

		System.out.println(prop.getProperty("inbox"));


		FileOutputStream fo = new FileOutputStream("C:\\\\QA2022\\\\Testing\\\\XML\\\\prop.properties");
		prop.store(fo, "Adding some items");

	}

}
