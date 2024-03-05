package Education_App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Chemistry extends JFrame {

	private JPanel contentPane;
	private JTextField Ftxt;
	private JLabel lblHeight;
	private JTextField Stxt;
	private JButton btnBack;
	private JButton btnBack_1;
	private JLabel lblResult;
	private JTextField Rtxt;
	private JButton btnBack_2;
	private JLabel lblPower;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chemistry frame = new Chemistry();
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
	public Chemistry() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Chemistry.class.getResource("/IMG/Education.png")));
		setTitle("Education Desktop App");
		setForeground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 391);
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
		Ftxt.setBounds(281, 101, 305, 43);
		contentPane.add(Ftxt);
		Ftxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Element:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(52, 99, 219, 43);
		contentPane.add(lblNewLabel);
		
		lblHeight = new JLabel("Second Element:");
		lblHeight.setForeground(Color.BLACK);
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHeight.setBounds(52, 153, 257, 40);
		contentPane.add(lblHeight);
		
		Stxt = new JTextField();
		Stxt.setForeground(Color.BLACK);
		Stxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Stxt.setBackground(Color.WHITE);
		Stxt.setColumns(10);
		Stxt.setBounds(319, 156, 267, 40);
		contentPane.add(Stxt);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home x = new Home();
				x.main();
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(52, 277, 98, 41);
		contentPane.add(btnBack);
		
		btnBack_1 = new JButton("Result");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String F = Ftxt.getText().toLowerCase();
				String S = Stxt.getText().toLowerCase();
				
				boolean ckF=false;
				boolean ckS=false;
				
				try {
				if (F.equals("")) {
					 JOptionPane.showMessageDialog(null,"First Element is undefined"); 
				}else if (S.equals("")) {
					 JOptionPane.showMessageDialog(null,"Second Element is undefined"); 
			    }else {
			    	for (int i = 0; i < F.length(); i++){
			    		if(Character.isLetterOrDigit(F.charAt(0))) {
			    			if (Character.isLetterOrDigit(F.charAt(i))) {
				    			ckF=true;
				    		}else {
				    			ckF=false;
							}
			    		}else {
			    			ckF=false;
						}
			    		
			    	}

					for (int i2 = 0; i2 < S.length(); i2++){
						if(Character.isLetterOrDigit(S.charAt(0))) {
							if(Character.isLetterOrDigit(S.charAt(i2))) {
								ckS=true;
							}else {
								ckS=false;
							}						
							}else {
								ckS=false;
							}
					}
					
			    	if (ckF==false) {
						 JOptionPane.showMessageDialog(null,F+" is undefined ! Please enter letter or number :)");
					}else if (ckS==false){
						 JOptionPane.showMessageDialog(null,S+" is undefined ! Please enter letter or number :)");
					}else {
				Document doc = null;
				String URL = "https://chemequations.com/en/?s="+F+"%2B"+S+"&ref=input";
				try {
					 doc = Jsoup.connect(URL).get();
				} catch (IOException e1) {
					 JOptionPane.showMessageDialog(null,e1); 
				}
				Elements elements = doc.select("h1.equation.main-equation.well");
				elements.forEach((ex) -> {
					String RS = ex.select("h1.equation.main-equation.well").text();
					Rtxt.setText(RS);
				});
				if (Rtxt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Your Chemical Equation Is Wrong! Try Again :)");
				}
					}
			    	}
				} catch (Exception e2) {
					 JOptionPane.showMessageDialog(null,e2);
				}
				
			    	}  
			
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(474, 278, 112, 39);
		contentPane.add(btnBack_1);
		
		lblResult = new JLabel("Result:");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblResult.setBounds(52, 204, 112, 40);
		contentPane.add(lblResult);
		
		Rtxt = new JTextField();
		Rtxt.setForeground(Color.RED);
		Rtxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Rtxt.setBackground(Color.WHITE);
		Rtxt.setEditable(false);
		Rtxt.setColumns(10);
		Rtxt.setBounds(174, 207, 412, 40);
		contentPane.add(Rtxt);
		
		btnBack_2 = new JButton("Clear");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ftxt.setText("");
				Stxt.setText("");
				Rtxt.setText("");
			}
		});
		btnBack_2.setForeground(Color.BLACK);
		btnBack_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_2.setBackground(Color.WHITE);
		btnBack_2.setBounds(264, 278, 112, 39);
		contentPane.add(btnBack_2);
		
		lblPower = new JLabel("Chemistry");
		lblPower.setForeground(Color.BLACK);
		lblPower.setFont(new Font("Daniela", Font.PLAIN, 50));
		lblPower.setBounds(235, 11, 162, 68);
		contentPane.add(lblPower);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Chemistry.class.getResource("/IMG/Background S.png")));
		lblNewLabel_1.setBounds(0, 0, 689, 354);
		contentPane.add(lblNewLabel_1);
	}
}
