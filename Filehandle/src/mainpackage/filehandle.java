package mainpackage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.io.*;


public class filehandle {
	 public static void main(String [] args) {
		 
		 frame();
		 
	 write();
		
	        String fileName = "pass.txt";

	       
	        String line = null;

	        try {
	          
	            FileReader fileReader = 
	                new FileReader(fileName);

	           
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }   

	          
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                  
	           
	        }
	    }
	
	
	 public static void write() {
		 
		
	        String fileName = "pass.txt";

	        try {
	           
	            FileWriter fileWriter =
	                new FileWriter(fileName);

	        
	            BufferedWriter bufferedWriter =
	                new BufferedWriter(fileWriter);

	          
	            bufferedWriter.write("Hello there,");
	          

	          
	            bufferedWriter.close();
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error writing to file '"
	                + fileName + "'");
	           
	        }
		 
	 }
	 
	 
	 public static void frame() { 
		 
		 JFrame frame = new JFrame("Login");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		 JLabel emptyLabel = new JLabel("");
		 
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		 
		 frame.pack();
		 
		 frame.setVisible(true);
		 
		 
	 }
	 
}
