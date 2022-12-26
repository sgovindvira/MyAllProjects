package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
	
		//Create a new text file
		File f = new File("C:\\QA2022\\Testing\\temp.text");
		f.createNewFile();
		
		
	//	Write into text file
		
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("This is first line");
		out.newLine();  // new line
		out.write("This is first line");
		out.newLine();
		out.write("This is first line");
		out.newLine();
		out.write("This is first line");
		out.newLine();
		
		out.flush(); // transfer everything to text file
		
		
// Read text file
	 FileReader r = new FileReader(f);
	 BufferedReader rd = new BufferedReader(r);
	 
	 
	/* System.out.println(rd.readLine());// This will read and set pointer to next line
	 System.out.println(rd.readLine());
	 System.out.println(rd.readLine());
	 System.out.println(rd.readLine());
	 System.out.println(rd.readLine());
		
		*/
	 
	
	 String s;
		int i=0;
		while((s=rd.readLine())!=null) {
			System.out.println(s);
			i++;
		}
		
		System.out.println("number of lines: "+i);

		

		
		}
	 


	}


