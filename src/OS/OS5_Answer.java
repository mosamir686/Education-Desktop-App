package OS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class OS5_Answer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS5_Answer frame = new OS5_Answer();
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
	public OS5_Answer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(OS1_Answer.class.getResource("/IMG/Education.png")));
		setTitle("Education Desktop App");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 621);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQWhichOf = new JLabel("Q-10) ... is a program that acts as an intermediary between a user of a computer");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setBounds(18, 249, 957, 74);
		contentPane.add(lblQWhichOf);
		
		JLabel lblQWhichOf_1 = new JLabel("and the computer hardware");
		lblQWhichOf_1.setForeground(Color.BLACK);
		lblQWhichOf_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblQWhichOf_1.setBackground(Color.WHITE);
		lblQWhichOf_1.setBounds(18, 299, 1007, 51);
		contentPane.add(lblQWhichOf_1);
		
		JLabel lblNewLabel = new JLabel("Q-9) The goal of an operating system is to …..");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(18, 22, 962, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton b9 = new JRadioButton("Make the computer system convenient to use");
		b9.setForeground(Color.BLACK);
		b9.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b9.setBackground(Color.WHITE);
		b9.setBounds(18, 140, 763, 34);
		contentPane.add(b9);
		
		JRadioButton a9 = new JRadioButton("Execute user programs and make solving user problems easier");
		a9.setForeground(Color.BLACK);
		a9.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a9.setBackground(Color.WHITE);
		a9.setBounds(18, 103, 763, 34);
		contentPane.add(a9);
		
		JRadioButton c9 = new JRadioButton("Use the computer hardware in an efficient manner");
		c9.setForeground(Color.BLACK);
		c9.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c9.setBackground(Color.WHITE);
		c9.setBounds(18, 177, 763, 34);
		contentPane.add(c9);
		
		JRadioButton d9 = new JRadioButton("All of them");
		d9.setForeground(Color.BLACK);
		d9.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d9.setBackground(Color.WHITE);
		d9.setBounds(18, 214, 763, 34);
		contentPane.add(d9);
		
		JRadioButton a10 =new JRadioButton("System Manager");
		a10.setForeground(Color.BLACK);
		a10.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a10.setBackground(Color.WHITE);
		a10.setBounds(18, 347, 672, 34);
		contentPane.add(a10);
		
		JRadioButton b10 = new JRadioButton("Application program");
		b10.setForeground(Color.BLACK);
		b10.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b10.setBackground(Color.WHITE);
		b10.setBounds(18, 384, 672, 34);
		contentPane.add(b10);
		
		JRadioButton c10 = new JRadioButton("Operating system");
		c10.setForeground(Color.BLACK);
		c10.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c10.setBackground(Color.WHITE);
		c10.setBounds(18, 421, 672, 34);
		contentPane.add(c10);
		
		JRadioButton d10 = new JRadioButton("Source code");
		d10.setForeground(Color.BLACK);
		d10.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d10.setBackground(Color.WHITE);
		d10.setBounds(18, 458, 672, 34);
		contentPane.add(d10);
		
		a9.setEnabled(false);
		b9.setEnabled(false);
		c9.setEnabled(false);
		d9.setEnabled(false);
		a10.setEnabled(false);
		b10.setEnabled(false);
		c10.setEnabled(false);
		d10.setEnabled(false);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OS4_Answer s = new OS4_Answer();
				s.main();
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(58, 515, 123, 51);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("Home");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Education_App.IT IT = new Education_App.IT();
				IT.main();
				dispose();
			}
		});
		btnNext.setForeground(Color.BLACK);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(852, 517, 123, 47);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OS1_Answer.class.getResource("/IMG/Background L.png")));
		lblNewLabel_1.setBounds(0, 0, 1066, 591);
		contentPane.add(lblNewLabel_1);
		
		IT_QBank.OS_Answer answer = new IT_QBank.OS_Answer();
		
		if (answer.a9==true) {
			a9.setSelected(true);
			d9.setForeground(Color.red);
			d9.setFont(new Font("Times New Roman", Font.BOLD, 30));
			
		}else if (answer.b9==true) {
			b9.setSelected(true);
			d9.setForeground(Color.red);
			d9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c9==true) {
			c9.setSelected(true);
			d9.setForeground(Color.red);
			d9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d9==true) {
			d9.setSelected(true);
			
		}else {
			d9.setForeground(Color.red);
			d9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
		
//		-----------------------------
		if (answer.a10==true) {
			a10.setSelected(true);
			c10.setForeground(Color.red);
			c10.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.b10==true) {
			b10.setSelected(true);
			c10.setForeground(Color.red);
			c10.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c10==true) {
			c10.setSelected(true);
			
		}else if (answer.d10==true) {
			d10.setSelected(true);
			c10.setForeground(Color.red);
			c10.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else {
			c10.setForeground(Color.red);
			c10.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
	}
}
