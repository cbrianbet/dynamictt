package dynamicTT;

import java.io.IOException;



public class TimeTableMain {
    
    private static  final String USERNAME = "root";
    private static  final String PASSWORD = "kaka10139";
    private static  final String CONN_STRING = "jdbc:mysql://localhost:3306/ttproj";

	/**
	 * This is the main method of the main class
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Program starts................
		System.out.println("Start.......");
	        Initialization initialize = new Initialization();      
	        initialize.readInput();
	}
}
