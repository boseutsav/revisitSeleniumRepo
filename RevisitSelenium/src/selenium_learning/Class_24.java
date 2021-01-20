package selenium_learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.ConnectException;
import java.sql.*;
import java.util.Properties;

import org.testng.annotations.Test;

public class Class_24 {

	/* Prerequisite: ojdbc6.jar should be included in the
	 *  build path and connection string should be set properly,
	 *  jdbc:oracle:thin:@localhost:1521:UTSAV
	 */
	//Properties prop= new Properties();
	//String filePath = System.getProperty("user.dir")+"//config.properties";

	@Test
	public void databaseConnection() throws Exception {
		//FileInputStream fis = new FileInputStream(filePath);
		//prop.load(fis);
		//String url="jdbc:oracle:thin:@localhost:1521:CLRExtProc";
		String pwd="";
		String user="";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:UTSAV","hr","hr");
		/*
		 * Statement stmt=conn.createStatement(); stmt.
		 * addBatch("insert into myCityList values(81190,'Kalpesh','Mumbai',400001)");
		 * stmt.
		 * addBatch("insert into myCityList values(81191,'Suddhasree','Howrah',500001)"
		 * );
		 * 
		 * stmt.executeBatch();
		 */
		/*
		 * PreparedStatement
		 * stmt=conn.prepareStatement("insert into myCityList values(?,?,?,?)");
		 * stmt.setInt(1,83593);//1 specifies the first parameter in the query
		 * stmt.setString(2,"Rahul"); stmt.setString(3,"Bangalore");
		 * stmt.setInt(4,560064);
		 * 
		 * int i=stmt.executeUpdate(); System.out.println(i+" records inserted");
		 */  
		Statement st = conn.createStatement();
		String query = "Select Name from myCityList";
		ResultSet results = st.executeQuery(query);
		
		
		int columnCount = results.getMetaData().getColumnCount();
		System.out.println("Column Count is: "+columnCount);
		for (int idx=1;idx<=columnCount;idx++) {
			System.out.print(results.getMetaData().getColumnName(idx)+"||");
		}
		System.out.println();
		while (results.next()) {
			for (int idx=1;idx<=columnCount;idx++) {
				System.out.print(results.getString(idx)+"||");
			}
			System.out.println();
		}
		
		/*
		 * String query1 =
		 * "insert into myCityList values(83596,'Utsav','Mumbai',400101)"; Statement
		 * st1= conn.createStatement(); System.out.println(st1.executeQuery(query1));
		 * results = st.executeQuery(query); while (results.next()) { for (int
		 * idx=1;idx<=columnCount;idx++) {
		 * System.out.print(results.getString(idx)+"||"); } System.out.println("End"); }
		 */
		
		conn.close();
		
	}
	
}
