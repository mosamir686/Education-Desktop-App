package Physics_Rules;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Position;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
import java.lang.reflect.Array;
import java.text.ParsePosition;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

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
	private JLabel lblNewLabel_1;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Kinetic_Energy.class.getResource("/IMG/Education.png")));
		setTitle("Education Desktop App");
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
				Education_App.Physics x = new Education_App.Physics();
				x.main();
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(63, 284, 98, 41);
		contentPane.add(btnBack);
		
		btnBack_1 = new JButton("Result");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				boolean ckM=false;
				boolean ckV=false;
				int Error = 0;
				int Error2 = 0;
				int ErrorNum = 0 ;
				int ErrorNum2 = 0 ;
				String M = Mtxt.getText().toString();
				String V = Vtxt.getText().toString();
			
				if (M.equals("")) {
					 JOptionPane.showMessageDialog(null,"Mass is undefined"); 
				}else if (V.equals("")) {
					 JOptionPane.showMessageDialog(null,"Velocity is undefined"); 
				}else if (M.charAt(0)=='-') {
					 JOptionPane.showMessageDialog(null,M+": Negative Refused"); 
		    	}else if (V.charAt(0)=='-') {
					 JOptionPane.showMessageDialog(null,V+": Negative Refused"); 
		    	}else{	
					
					if (M.charAt(0) =='+') {
						ErrorNum = 1;
					}
					if (V.charAt(0)=='+'){
						ErrorNum2 = 1;
					}
					
					if (M.charAt(0) =='+'||Character.isDigit(M.charAt(0))) {
			    	for (int i = 0; i < M.length(); i++){
			    			if (Character.isDigit(M.charAt(i))||M.charAt(i)=='.') {
								ckM=true;
				    		}else {
								Error++;
							}	
			    	}
					}else {
						ckM=false;
					}
					
					if (V.charAt(0)=='+'||Character.isDigit(V.charAt(0))) {
					for (int i2 = 0; i2 < V.length(); i2++){
						if(Character.isDigit(V.charAt(i2))||V.charAt(i2)=='.') {
							ckV=true;
						}else {
							Error2++;
						}	
					}	
					}else {
						ckV=false;
					}
					
		    		if (Error>ErrorNum||ckM==false) {
						 JOptionPane.showMessageDialog(null, M+" is undefined, Please Enter Number :)"); 	
					}else if (Error2>ErrorNum2||ckV==false) {
								 JOptionPane.showMessageDialog(null, V+" is undefined, Please Enter Number :)"); 	
					}else { 
						    	double m=Double.parseDouble(M);
								double v=Double.parseDouble(V);
								double KE =0.5*m*Math.pow(v, 2);
									String x=String.valueOf(KE);
								Rtxt.setText(x+" Joule");
							}
			    	}
				
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
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
		btnBack_2.setBounds(256, 285, 112, 39);
		contentPane.add(btnBack_2);
		
		lblKineticEnergy = new JLabel("Kinetic Energy");
		lblKineticEnergy.setForeground(Color.BLACK);
		lblKineticEnergy.setFont(new Font("Daniela", Font.PLAIN, 50));
		lblKineticEnergy.setBounds(181, 21, 265, 69);
		contentPane.add(lblKineticEnergy);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Kinetic_Energy.class.getResource("/IMG/Background S.png")));
		lblNewLabel_1.setBounds(0, 0, 636, 413);
		contentPane.add(lblNewLabel_1);
	}
}