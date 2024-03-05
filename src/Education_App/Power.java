package Education_App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Power extends JFrame {

	private JPanel contentPane;
	private JTextField Wtxt;
	private JLabel lblHeight;
	private JTextField Ttxt;
	private JButton btnBack;
	private JButton btnBack_1;
	private JLabel lblResult;
	private JTextField Rtxt;
	private JButton btnBack_2;
	private JLabel lblPower;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Power frame = new Power();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Power() {
		setForeground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 401);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Wtxt = new JTextField();
		Wtxt.setForeground(Color.BLACK);
		Wtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Wtxt.setBackground(Color.WHITE);
		Wtxt.setBounds(219, 99, 341, 43);
		contentPane.add(Wtxt);
		Wtxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Work:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(97, 99, 97, 43);
		contentPane.add(lblNewLabel);
		
		lblHeight = new JLabel("Time:");
		lblHeight.setForeground(Color.BLACK);
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHeight.setBounds(97, 153, 97, 40);
		contentPane.add(lblHeight);
		
		Ttxt = new JTextField();
		Ttxt.setForeground(Color.BLACK);
		Ttxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Ttxt.setBackground(Color.WHITE);
		Ttxt.setColumns(10);
		Ttxt.setBounds(219, 156, 341, 40);
		contentPane.add(Ttxt);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Physics x = new Physics();
				x.main();
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(97, 277, 98, 41);
		contentPane.add(btnBack);
		
		btnBack_1 = new JButton("Result");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String W = Wtxt.getText().toString();
				String T = Ttxt.getText().toString();
				boolean ckW=false;
				boolean ckT=false;
				
				if (W.equals("")) {
					 JOptionPane.showMessageDialog(null,"Work is undefined"); 
				}else if (T.equals("")) {
					 JOptionPane.showMessageDialog(null,"Time is undefined"); 
			    }else {
				
			    	for (int i = 0; i < W.length(); i++){
			    		if (Character.isDigit(W.charAt(i))) {
			    			ckW=true;
			    		}else {
							ckW=false;
						}
			    	}

					for (int i2 = 0; i2 < T.length(); i2++){
						if(Character.isDigit(T.charAt(i2))) {
							ckT=true;
						}else {
							ckT=false;
						}
					}
					if (ckW==true&&ckT==true) {
					double w=Double.parseDouble(Wtxt.getText());
					double t=Double.parseDouble(Ttxt.getText());
					if (w<0) {
						 JOptionPane.showMessageDialog(null,w+": Negative Refused"); 	
					 	
					}else if (t<0) {
						 JOptionPane.showMessageDialog(null,t+": Negative Refused"); 	
					}else if(t==0) {
						 JOptionPane.showMessageDialog(null,"Zero Refused"); 	
					}else {
					double P =w/t;
						String x=String.valueOf(P);
					Rtxt.setText(x+" Watt");		
					}
							}else if (ckW==false) {
								 JOptionPane.showMessageDialog(null, W+" is undefined, Please Enter Number :)"); 	
							}else if (ckT==false) {
								 JOptionPane.showMessageDialog(null, T+" is undefined, Please Enter Number :)"); 	
							}	
			    }

			    	}  
			
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(448, 278, 112, 39);
		contentPane.add(btnBack_1);
		
		lblResult = new JLabel("Result:");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblResult.setBounds(97, 204, 112, 40);
		contentPane.add(lblResult);
		
		Rtxt = new JTextField();
		Rtxt.setForeground(Color.RED);
		Rtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Rtxt.setBackground(Color.WHITE);
		Rtxt.setEditable(false);
		Rtxt.setColumns(10);
		Rtxt.setBounds(219, 207, 341, 40);
		contentPane.add(Rtxt);
		
		btnBack_2 = new JButton("Clear");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wtxt.setText("");
				Ttxt.setText("");
				Rtxt.setText("");
			}
		});
		btnBack_2.setForeground(Color.BLACK);
		btnBack_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_2.setBackground(Color.WHITE);
		btnBack_2.setBounds(270, 278, 112, 39);
		contentPane.add(btnBack_2);
		
		lblPower = new JLabel("Power");
		lblPower.setForeground(Color.BLACK);
		lblPower.setFont(new Font("Daniela", Font.PLAIN, 50));
		lblPower.setBounds(248, 30, 120, 46);
		contentPane.add(lblPower);
	}
}
