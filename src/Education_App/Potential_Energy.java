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

public class Potential_Energy extends JFrame {

	private JPanel contentPane;
	private JTextField Mtxt;
	private JTextField Gtxt;
	private JLabel lblHeight;
	private JTextField Htxt;
	private JButton btnBack;
	private JButton btnBack_1;
	private JLabel lblResult;
	private JTextField Rtxt;
	private JButton btnBack_2;
	private JLabel lblKineticEnergy;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Potential_Energy frame = new Potential_Energy();
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
	public Potential_Energy() {
		setForeground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Mtxt = new JTextField();
		Mtxt.setForeground(Color.BLACK);
		Mtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Mtxt.setBackground(Color.WHITE);
		Mtxt.setBounds(221, 102, 380, 43);
		contentPane.add(Mtxt);
		Mtxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mass:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(108, 102, 97, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblGravitationalField = new JLabel("Gravitational Field:");
		lblGravitationalField.setForeground(Color.BLACK);
		lblGravitationalField.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblGravitationalField.setBounds(108, 165, 291, 49);
		contentPane.add(lblGravitationalField);
		
		Gtxt = new JTextField();
		Gtxt.setForeground(Color.BLACK);
		Gtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Gtxt.setBackground(Color.WHITE);
		Gtxt.setColumns(10);
		Gtxt.setBounds(416, 167, 185, 49);
		contentPane.add(Gtxt);
		
		lblHeight = new JLabel("Height:");
		lblHeight.setForeground(Color.BLACK);
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHeight.setBounds(108, 239, 112, 40);
		contentPane.add(lblHeight);
		
		Htxt = new JTextField();
		Htxt.setForeground(Color.BLACK);
		Htxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Htxt.setBackground(Color.WHITE);
		Htxt.setColumns(10);
		Htxt.setBounds(242, 239, 359, 40);
		contentPane.add(Htxt);
		
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
		btnBack.setBounds(108, 389, 98, 41);
		contentPane.add(btnBack);
		
		btnBack_1 = new JButton("Result");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String M = Mtxt.getText().toString();
				String G = Gtxt.getText().toString();
				String H = Htxt.getText().toString();
				boolean ckM=false;
				boolean ckG=false;
				boolean ckH=false;
				
				if (M.equals("")) {
					 JOptionPane.showMessageDialog(null,"Mass is undefined"); 
				}else if (G.equals("")) {
					 JOptionPane.showMessageDialog(null,"Gravitational Field is undefined"); 
			    }else if (H.equals("")) {
					 JOptionPane.showMessageDialog(null,"Height is undefined"); 
			    }else {
				
			    	for (int i = 0; i < M.length(); i++){
			    		if (Character.isDigit(M.charAt(i))) {
			    			ckM=true;
			    		}else {
							ckM=false;
						}
			    	}
					for (int i2 = 0; i2 < G.length(); i2++){
						if (Character.isDigit(G.charAt(i2))){
							ckG=true; 
						}else {
							ckG=false;
						}
					}
					for (int i3 = 0; i3 < H.length(); i3++){
						if(Character.isDigit(H.charAt(i3))) {
							ckH=true;
						}else {
							ckH=false;
						}
					}
					if (ckM==true&&ckG==true&&ckH==true) {
					double m=Double.parseDouble(Mtxt.getText());
					double g=Double.parseDouble(Gtxt.getText());
					double h=Double.parseDouble(Htxt.getText());
					if (m<0) {
						 JOptionPane.showMessageDialog(null,m+": Negative Refused"); 	
					}else if (g<0) {
						 JOptionPane.showMessageDialog(null,g+": Negative Refused"); 	
					}else if (h<0) {
						 JOptionPane.showMessageDialog(null,h+": Negative Refused"); 	
					}else {
					double PE =m*g*h;
						String x=String.valueOf(PE);
					Rtxt.setText(x+" Joule");		
					}
							}else if (ckM==false) {
								 JOptionPane.showMessageDialog(null, M+" is undefined, Please Enter Number :)"); 	
							}else if (ckG==false) {
								 JOptionPane.showMessageDialog(null, G+" is undefined, Please Enter Number :)"); 	
							}else if (ckH==false) {
								 JOptionPane.showMessageDialog(null, H+" is undefined, Please Enter Number :)"); 	
							}	
			    }

			    	}  
			
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(604, 391, 112, 39);
		contentPane.add(btnBack_1);
		
		lblResult = new JLabel("Result:");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblResult.setBounds(108, 311, 124, 40);
		contentPane.add(lblResult);
		
		Rtxt = new JTextField();
		Rtxt.setForeground(Color.RED);
		Rtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Rtxt.setBackground(Color.WHITE);
		Rtxt.setEditable(false);
		Rtxt.setColumns(10);
		Rtxt.setBounds(242, 311, 359, 40);
		contentPane.add(Rtxt);
		
		btnBack_2 = new JButton("Clear");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mtxt.setText("");
				Gtxt.setText("");
				Htxt.setText("");
				Rtxt.setText("");
			}
		});
		btnBack_2.setForeground(Color.BLACK);
		btnBack_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_2.setBackground(Color.WHITE);
		btnBack_2.setBounds(339, 390, 112, 39);
		contentPane.add(btnBack_2);
		
		lblKineticEnergy = new JLabel("Potential Energy");
		lblKineticEnergy.setForeground(Color.BLACK);
		lblKineticEnergy.setFont(new Font("Daniela", Font.PLAIN, 50));
		lblKineticEnergy.setBounds(298, 11, 265, 69);
		contentPane.add(lblKineticEnergy);
	}
}
