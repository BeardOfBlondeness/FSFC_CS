package kennyOne;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class KennyMain {

	private JFrame frame;
int like = 0;
boolean yeslike;
int hello;
int roar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KennyMain window = new KennyMain();
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
	public KennyMain() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JLabel mainText = new JLabel("");
		mainText.setBounds(40, 11, 351, 61);
		frame.getContentPane().add(mainText);
		mainText.setText("<html><p>Hello, my name is kenny! if you wish to begin press the start button</p></html>");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//button yes was pressed m9
				if(yeslike== true) {
					hello = like++;
					//like1(null);
					
				}else if (yeslike== false) {
					 hello = like--;
					
				}
				System.out.println(like);
				
			}
		});
		
		btnNewButton.setBounds(40, 130, 121, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("No");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//button no was pressed m10
				if(yeslike==true){
					hello = like--;
					like1(mainText);
				}else if(yeslike==false){
					hello = like++;
				}
				
				
			}

			private void like1(JLabel mainText) {
				Random rand = new Random();
				int  i = rand.nextInt(3) + 1;
			if(hello!=like) {
				if(like<0 && like>3) {
					String likey1[] = {"<html><p>Good good, do you play the lag of legends</p></html>", "do ya like waffles?", "is like good?"};
			mainText.setText("<html><p>" + likey1[i] + "</html></p>");
			hello = like;
			yeslike = true;
				}
			}
		
				
				
			}
		});
		button.setBounds(270, 130, 121, 56);
		frame.getContentPane().add(button);
		
		
		
		JButton btnNewButton_1 = new JButton("Start");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//start
			mainText.setText("<html><p>Soooo do ya like videogames?</p></html>");	
			hello = like;
				yeslike = true;
			}
		});
		
		
	
			btnNewButton_1.setBounds(172, 83, 89, 23);
			frame.getContentPane().add(btnNewButton_1);
	}
}


