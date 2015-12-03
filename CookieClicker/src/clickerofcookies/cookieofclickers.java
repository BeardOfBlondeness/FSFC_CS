package clickerofcookies;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class cookieofclickers {

	
	
	String titleText;
 int cookieNumber;
	int i = 1;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cookieofclickers window = new cookieofclickers();
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
	public cookieofclickers() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

	
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//CLICKED ON THE COOKIE
				
	cookieNumber = cookieNumber + i;
	textField.setText("You have " + cookieNumber + " Cookies");
			}
	
		
		
	
		});
		

		textField = new JTextField();
		textField.setBounds(194, 188, 161, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		
		
		
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\CompUser\\Pictures\\thisisacookie.gif"));
		btnNewButton.setBounds(10, 11, 148, 117);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCursor = new JButton("Cursor");
		btnCursor.addActionListener(new ActionListener() {
			int increase = 0;
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e, int cookieNumber ) {
				System.out.println(cookieNumber);
				//clicked on cursor
			
				
				
				 
				
		for(int a = 0; a<100; a++) {
			
					cookieNumber = cookieNumber + increase;
					System.out.println(increase);
		}
		
			
				
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("FAke");
				increase = increase+1; 
				
			
				
				for(int a = 0; a<1; a++) {
					
							cookieNumber = cookieNumber + increase;
							System.out.println(increase);
				
			}
			}
			
			
		
			
	
		});
		btnCursor.setBounds(10, 187, 89, 23);
		frame.getContentPane().add(btnCursor);
		
		JButton btnGrandma = new JButton("Grandma");
		btnGrandma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clicked on grandma
			}
		});
		btnGrandma.setBounds(10, 219, 89, 23);
		frame.getContentPane().add(btnGrandma);
		
		JButton btnFarm = new JButton("Farm");
		btnFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clicked on farm
				
			}
		});
		btnFarm.setBounds(10, 253, 89, 23);
		frame.getContentPane().add(btnFarm);
		
		JButton btnNewButton_1 = new JButton("Factory");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clicked on factory
			}
		});
		btnNewButton_1.setBounds(10, 287, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblDefaultText = new JLabel(titleText);
		lblDefaultText.setBounds(185, 11, 200, 50);
		frame.getContentPane().add(lblDefaultText);
		
		
	}
}
