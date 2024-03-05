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
import java.lang.Math;

public class Kinetic_Energy extends JFrame {

	private JPanel contentPane;
	private JTextField Mtxt;
	private JLabel lblHeight;
	private JTextField Vtxt;
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
					Kinetic_Energy frame = new Kinetic_Energy();
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
	public Kinetic_Energy() {
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
		
		Mtxt = new JTextField();
		Mtxt.setForeground(Color.BLACK);
		Mtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Mtxt.setBackground(Color.WHITE);
		Mtxt.setBounds(220, 106, 341, 43);
		contentPane.add(Mtxt);
		Mtxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mass:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(63, 106, 132, 43);
		contentPane.add(lblNewLabel);
		
		lblHeight = new JLabel("Velocity:");
		lblHeight.setForeground(Color.BLACK);
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHeight.setBounds(63, 160, 132, 40);
		contentPane.add(lblHeight);
		
		Vtxt = new JTextField();
		Vtxt.setForeground(Color.BLACK);
		Vtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Vtxt.setBackground(Color.WHITE);
		Vtxt.setColumns(10);
		Vtxt.setBounds(220, 163, 341, 40);
		contentPane.add(Vtxt);
		
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
		btnBack.setBounds(98, 284, 98, 41);
		contentPane.add(btnBack);
		
		btnBack_1 = new JButton("Result");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String M = Mtxt.getText().toString();
				String V = Vtxt.getText().toString();
				boolean ckM=false;
				boolean ckV=false;
				
				if (M.equals("")) {
					 JOptionPane.showMessageDialog(null,"Mass is undefined"); 
				}else if (V.equals("")) {
					 JOptionPane.showMessageDialog(null,"Velocity is undefined"); 
			    }else {
				
			    	for (int i = 0; i < M.length(); i++){
			    		if (Character.isDigit(M.charAt(i))) {
			    			ckM=true;
			    		}else {
							ckM=false;
						}
			    	}

					for (int i2 = 0; i2 < V.length(); i2++){
						if(Character.isDigit(V.charAt(i2))) {
							ckV=true;
						}else {
							ckV=false;
						}
					}
					if (ckM==true&&ckV==true) {
					double m=Double.parseDouble(Mtxt.getText());
					double v=Double.parseDouble(Vtxt.getText());
					if (m<0) {
						 JOptionPane.showMessageDialog(null,m+": Negative Refused"); 	
					 	
					}else if (v<0) {
						 JOptionPane.showMessageDialog(null,v+": Negative Refused"); 	
					}else {
					double KE =0.5*m*Math.pow(v, 2);
						String x=String.valueOf(KE);
					Rtxt.setText(x+" Joule");		
					}
							}else if (ckM==false) {
								 JOptionPane.showMessageDialog(null, M+" is undefined, Please Enter Number :)"); 	
							}else if (ckV==false) {
								 JOptionPane.showMessageDialog(null, V+" is undefined, Please Enter Number :)"); 	
							}	
			    }

			    	}  
			
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(449, 285, 112, 39);
		contentPane.add(btnBack_1);
		
		lblResult = new JLabel("Result:");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblResult.setBounds(63, 211, 147, 40);
		contentPane.add(lblResult);
		
		Rtxt = new JTextField();
		Rtxt.setForeground(Color.RED);
		Rtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Rtxt.setBackground(Color.WHITE);
		Rtxt.setEditable(false);
		Rtxt.setColumns(10);
		Rtxt.setBounds(220, 214, 341, 40);
		contentPane.add(Rtxt);
		
		btnBack_2 = new JButton("Clear");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mtxt.setText("");
				Vtxt.setText("");
				Rtxt.setText("");
			}
		});
		btnBack_2.setForeground(Color.BLACK);
		btnBack_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_2.setBackground(Color.WHITE);
		btnBack_2.setBounds(271, 285, 112, 39);
		contentPane.add(btnBack_2);
		
		lblKineticEnergy = new JLabel("Kinetic Energy");
		lblKineticEnergy.setForeground(Color.BLACK);
		lblKineticEnergy.setFont(new Font("Daniela", Font.PLAIN, 50));
		lblKineticEnergy.setBounds(181, 21, 265, 69);
		contentPane.add(lblKineticEnergy);
	}
}