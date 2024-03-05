package Physics_Rules;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.lang.Math;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Work extends JFrame {

	private JPanel contentPane;
	private JTextField Ftxt;
	private JLabel lblHeight;
	private JTextField Dtxt;
	private JButton btnBack;
	private JButton btnBack_1;
	private JLabel lblResult;
	private JTextField Rtxt;
	private JButton btnBack_2;
	private JLabel lblPower;
	private JLabel lblAngle;
	private JTextField Atxt;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Work frame = new Work();
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
	public Work() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Work.class.getResource("/IMG/Education.png")));
		setTitle("Education Desktop App");
		setForeground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 436);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Ftxt = new JTextField();
		Ftxt.setForeground(Color.BLACK);
		Ftxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Ftxt.setBackground(Color.WHITE);
		Ftxt.setBounds(219, 101, 290, 43);
		contentPane.add(Ftxt);
		Ftxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Force:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(97, 99, 97, 43);
		contentPane.add(lblNewLabel);
		
		lblHeight = new JLabel("Displacement:");
		lblHeight.setForeground(Color.BLACK);
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHeight.setBounds(97, 153, 217, 40);
		contentPane.add(lblHeight);
		
		Dtxt = new JTextField();
		Dtxt.setForeground(Color.BLACK);
		Dtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Dtxt.setBackground(Color.WHITE);
		Dtxt.setColumns(10);
		Dtxt.setBounds(324, 153, 185, 40);
		contentPane.add(Dtxt);
		
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
		btnBack.setBounds(97, 317, 98, 41);
		contentPane.add(btnBack);
		
		btnBack_1 = new JButton("Result");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				int Error = 0;
				int Error2 = 0;
				int Error3 = 0;
				int ErrorNum = 0 ;
				int ErrorNum2 = 0 ;
				int ErrorNum3 = 0 ;
					String F = Ftxt.getText().toString();
					String D = Dtxt.getText().toString();
					String A = Atxt.getText().toString();
				boolean ckF=false;
				boolean ckD=false;
				boolean ckA=false;

				if (F.equals("")) {
					 JOptionPane.showMessageDialog(null,"Force is undefined"); 
				}else if (D.equals("")) {
					 JOptionPane.showMessageDialog(null,"Displacement is undefined"); 
			    }else if(A.equals("")) {
			    	
			    	if (F.charAt(0) =='+') {
						ErrorNum = 1;
					}
					if (D.charAt(0)=='+'){
						ErrorNum2 = 1;
					}
					
					if (F.charAt(0) =='+'||Character.isDigit(F.charAt(0))) {
			    	for (int i = 0; i < F.length(); i++){
			    			if (Character.isDigit(F.charAt(i))) {
								ckF=true;
				    		}else {
								Error++;
							}	
			    	}
					}else {
						ckF=false;
					}
					
					if (D.charAt(0)=='+'||Character.isDigit(D.charAt(0))) {
					for (int i2 = 0; i2 < D.length(); i2++){
						if(Character.isDigit(D.charAt(i2))) {
							ckD=true;
						}else {
							Error2++;
						}	
					}	
					}else {
						ckD=false;
					}
					
					
					if (Error>ErrorNum||ckF==false) {
						 JOptionPane.showMessageDialog(null, F+" is undefined, Please Enter Number :)"); 	
					}else if (Error2>ErrorNum2||ckD==false) {
								 JOptionPane.showMessageDialog(null, D+" is undefined, Please Enter Number :)"); 	
					}else { 
						
						double f=Double.parseDouble(Ftxt.getText());
						double d=Double.parseDouble(Dtxt.getText());
						double W =f*d;
						String x=String.valueOf(W);
					Rtxt.setText(x+" Joule");	
							}
			    	
			    	//----------------------------
			    	
			    }else if (F.charAt(0)=='-') {
					 JOptionPane.showMessageDialog(null,F+": Negative Refused"); 
		    	}else if (D.charAt(0)=='-') {
					 JOptionPane.showMessageDialog(null,D+": Negative Refused"); 
		    	}else if (A.charAt(0)=='-') {
					 JOptionPane.showMessageDialog(null,A+": Negative Refused"); 
		    	}else if(A.equals("+90")||A.equals("90")) {
		    		if (F.charAt(0) =='+') {
						ErrorNum = 1;
					}
					if (D.charAt(0)=='+'){
						ErrorNum2 = 1;
					}
					if (A.charAt(0)=='+'){
						ErrorNum3 = 1;
					}
					if (F.charAt(0) =='+'||Character.isDigit(F.charAt(0))) {
			    	for (int i = 0; i < F.length(); i++){
			    			if (Character.isDigit(F.charAt(i))||F.charAt(i)=='.') {
								ckF=true;
				    		}else {
								Error++;
							}	
			    	}
					}else {
						ckF=false;
					}
					
					if (D.charAt(0)=='+'||Character.isDigit(D.charAt(0))) {
					for (int i2 = 0; i2 < D.length(); i2++){
						if(Character.isDigit(D.charAt(i2))||D.charAt(i2)=='.') {
							ckD=true;
						}else {
							Error2++;
						}	
					}	
					}else {
						ckD=false;
					}
					if (A.charAt(0)=='+'||Character.isDigit(A.charAt(0))) {
						for (int i3 = 0; i3 < A.length(); i3++){
							if(Character.isDigit(A.charAt(i3))||A.charAt(i3)=='.') {
								ckA=true;
							}else {
								Error3++;
							}	
						}	
						}else {
							ckA=false;
						}
					

					if (Error>ErrorNum||ckF==false) {
						 JOptionPane.showMessageDialog(null, F+" is undefined, Please Enter Number :)"); 	
					}else if (Error2>ErrorNum2||ckD==false) {
								 JOptionPane.showMessageDialog(null, D+" is undefined, Please Enter Number :)"); 	
					}else if (Error3>ErrorNum3||ckA==false) {
						 JOptionPane.showMessageDialog(null, A+" is undefined, Please Enter Number :)"); 	
					}else {
						Rtxt.setText("0 Joule");			
					}
		    		//--------------------------------------
			    
				}else {
				
					if (F.charAt(0) =='+') {
						ErrorNum = 1;
					}
					if (D.charAt(0)=='+'){
						ErrorNum2 = 1;
					}
					if (A.charAt(0)=='+'){
						ErrorNum3 = 1;
					}
					if (F.charAt(0) =='+'||Character.isDigit(F.charAt(0))) {
			    	for (int i = 0; i < F.length(); i++){
			    			if (Character.isDigit(F.charAt(i))||F.charAt(i)=='.') {
								ckF=true;
				    		}else {
								Error++;
							}	
			    	}
					}else {
						ckF=false;
					}
					
					if (D.charAt(0)=='+'||Character.isDigit(D.charAt(0))) {
					for (int i2 = 0; i2 < D.length(); i2++){
						if(Character.isDigit(D.charAt(i2))||D.charAt(i2)=='.') {
							ckD=true;
						}else {
							Error2++;
						}	
					}	
					}else {
						ckD=false;
					}
					if (A.charAt(0)=='+'||Character.isDigit(A.charAt(0))) {
						for (int i3 = 0; i3 < A.length(); i3++){
							if(Character.isDigit(A.charAt(i3))||A.charAt(i3)=='.') {
								ckA=true;
							}else {
								Error3++;
							}	
						}	
						}else {
							ckA=false;
						}
					

					if (Error>ErrorNum||ckF==false) {
						 JOptionPane.showMessageDialog(null, F+" is undefined, Please Enter Number :)"); 	
					}else if (Error2>ErrorNum2||ckD==false) {
								 JOptionPane.showMessageDialog(null, D+" is undefined, Please Enter Number :)"); 	
					}else if (Error3>ErrorNum3||ckA==false) {
						 JOptionPane.showMessageDialog(null, A+" is undefined, Please Enter Number :)"); 	
					}else {
						double f=Double.parseDouble(Ftxt.getText());
						double d=Double.parseDouble(Dtxt.getText());
						double a =Double.parseDouble(Atxt.getText()) ;
						double cos= Math.toRadians(a);
						double W =f*d*Math.cos(cos);
						String x=String.valueOf(W);
						Rtxt.setText(x+" Joule");
					}
							
			    }
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Symbols Is Undefined ! Please Enter Number :)");
				}
			    	}  
			
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(448, 318, 112, 39);
		contentPane.add(btnBack_1);
		
		lblResult = new JLabel("Result:");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblResult.setBounds(97, 251, 112, 40);
		contentPane.add(lblResult);
		
		Rtxt = new JTextField();
		Rtxt.setForeground(Color.RED);
		Rtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Rtxt.setBackground(Color.WHITE);
		Rtxt.setEditable(false);
		Rtxt.setColumns(10);
		Rtxt.setBounds(219, 254, 290, 40);
		contentPane.add(Rtxt);
		
		btnBack_2 = new JButton("Clear");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ftxt.setText("");
				Dtxt.setText("");
				Atxt.setText("");
				Rtxt.setText("");
			}
		});
		btnBack_2.setForeground(Color.BLACK);
		btnBack_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_2.setBackground(Color.WHITE);
		btnBack_2.setBounds(270, 318, 112, 39);
		contentPane.add(btnBack_2);
		
		lblPower = new JLabel("Work");
		lblPower.setForeground(Color.BLACK);
		lblPower.setFont(new Font("Daniela", Font.PLAIN, 50));
		lblPower.setBounds(262, 29, 120, 46);
		contentPane.add(lblPower);
		
		lblAngle = new JLabel("Angle:");
		lblAngle.setForeground(Color.BLACK);
		lblAngle.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAngle.setBounds(97, 200, 97, 40);
		contentPane.add(lblAngle);
		
		Atxt = new JTextField();
		Atxt.setForeground(Color.BLACK);
		Atxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Atxt.setColumns(10);
		Atxt.setBackground(Color.WHITE);
		Atxt.setBounds(219, 200, 290, 40);
		contentPane.add(Atxt);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Work.class.getResource("/IMG/Background M.png")));
		lblNewLabel_1.setBounds(0, 0, 636, 413);
		contentPane.add(lblNewLabel_1);
	}
}
