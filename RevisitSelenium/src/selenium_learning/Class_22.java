package selenium_learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class Class_22 {
	//write and read from text file
	@Test
	public void writerFunc() throws IOException {
		String filepath = System.getProperty("user.dir")+"\\sample3.txt";
		FileWriter myfile = new FileWriter(filepath);
		BufferedWriter wr = new BufferedWriter(myfile);
		
		wr.write("My name is Utsav.");
		wr.newLine();
		wr.write("Second Line: Still my name is Utsav.");
		wr.append("I'm appening the third line without newLine.");
		wr.newLine();
		wr.write("America is Great", 2, 8);
		wr.close();
		
		FileReader myRead= new FileReader(filepath);
		BufferedReader rd = new BufferedReader(myRead);
		String out= null;
		while ((out=rd.readLine())!=null) {
			System.out.println(out);
		}
		rd.close();
		
		PrintWriter pw =new PrintWriter(System.getProperty("user.dir")+"\\_sample3.txt");
		pw.println("As good as a new line");
		pw.append(" .....  This is continuation and forms secondline.");
		pw.write("This is just to check strings");
		pw.close();
	}
	
	
}
