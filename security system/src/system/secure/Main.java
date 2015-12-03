package system.secure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
public class Main {

	private JFrame frame;
	private JTextField usernameLogin;
	private JTextField passwordLogin;
	private JTextField emailSign;
	private JTextField usernameSign;
	private JTextField passwordSign;
	PrintStream out = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel header = new JLabel("Login");
		header.setFont(new Font("Lucida Console", Font.BOLD, 11));
		header.setBounds(23, 38, 66, 23);
		frame.getContentPane().add(header);
		
		JLabel lblGotNoAccount = new JLabel("Got no account? Sign up!");
		lblGotNoAccount.setFont(new Font("Lucida Console", Font.BOLD, 11));
		lblGotNoAccount.setBounds(216, 38, 218, 23);
		frame.getContentPane().add(lblGotNoAccount);
		
		usernameLogin = new JTextField();
		usernameLogin.setText("Username");
		usernameLogin.setBounds(23, 72, 116, 20);
		frame.getContentPane().add(usernameLogin);
		usernameLogin.setColumns(10);
		
		passwordLogin = new JTextField();
		passwordLogin.setText("Password");
		passwordLogin.setBounds(23, 103, 116, 20);
		frame.getContentPane().add(passwordLogin);
		passwordLogin.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Login Button is the pressed button today boys
				
				
				
			}
		});
		btnNewButton.setBounds(23, 134, 116, 23);
		frame.getContentPane().add(btnNewButton);
		
		emailSign = new JTextField();
		emailSign.setText("Email Address");
		emailSign.setBounds(216, 72, 180, 20);
		frame.getContentPane().add(emailSign);
		emailSign.setColumns(10);
		
		usernameSign = new JTextField();
		usernameSign.setText("Username");
		usernameSign.setColumns(10);
		usernameSign.setBounds(216, 103, 180, 20);
		frame.getContentPane().add(usernameSign);
		
		passwordSign = new JTextField();
		passwordSign.setText("Password");
		passwordSign.setColumns(10);
		passwordSign.setBounds(216, 135, 180, 20);
		frame.getContentPane().add(passwordSign);
		
		
		
		
		String passwordSignUp = passwordSign.getText();
		String emailSignUp = emailSign.getText();
		
		
		JButton btnNewButton_1 = new JButton("Create account!");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent arg0) {
				
				// sign up
				 String userFile = "output.txt";
				 String passwordFile = "pass.txt";
				 String emailFile = "email.txt";
				 String line = null;
				 String usernameSignUp = usernameSign.getText();
				  try {
			            
					 
			            FileReader fileReader = 
			                new FileReader(userFile);

			          
			            BufferedReader bufferedReader = 
			                new BufferedReader(fileReader);
			        
			            
			          //  while((line = bufferedReader.readLine()) != null) {
			            //	Catch2();
			               // System.out.println(line);
			                
			                
			           // }
			           
			            
			            if(line == null) {
			           // 	Catch2();
						//	  System.out.println(usernameSignUp);
							   
						  }
			            
			          
				  
					  //////////////////////////////////////////////////////////////////
			            
			           
						
			            
			            System.out.println(usernameSignUp);
			            FileWriter usernameWriter =
			                new FileWriter(userFile);
                        FileWriter passwordWriter = new FileWriter(passwordFile);
			            FileWriter emailWriter = new FileWriter(emailFile);
			            
			            BufferedWriter bufferedWriter =
			                new BufferedWriter(usernameWriter);
BufferedWriter passwordBuffer = new BufferedWriter(passwordWriter);
BufferedWriter emailBuffer = new BufferedWriter(emailWriter);
			         //if(line == "") {
			        //	 bufferedWriter.newLine();
			        	// bufferedWriter.write(usernameSignUp);
			//             if(line != null) {
				            //	Catch2();
				         //   	bufferedWriter.write(line);
				
				
			//}
				            	 for ( line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
				            		 bufferedWriter.write(line);
						            }
				 // }
				  if(line == null) {
			        	 bufferedWriter.write(usernameSignUp);
			         }
			         
			      
			            
			            passwordBuffer.write(passwordSignUp);
			            passwordBuffer.newLine();
			            emailBuffer.write(emailSignUp);
			            emailBuffer.newLine();
			            
			           
			            passwordBuffer.close();
			            emailBuffer.close();      
			            bufferedWriter.close();
			            bufferedReader.close();
			        } 
			        catch(IOException ex) {
			            System.out.println(
			                "Error writing to file '"
			                + userFile + "'");
			            
			        }
				
				////////////////////////////////////////////////////////////////////////////////////
				
			
			}
		});
		  
  		
	
		
		btnNewButton_1.setBounds(216, 166, 180, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
	public void Catch2(){
		
			try {
  			out = new PrintStream(new FileOutputStream("output.txt"));
  		} catch (FileNotFoundException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		System.setOut(out);
  		
		}
}
