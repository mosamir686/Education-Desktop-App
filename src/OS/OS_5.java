package OS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import Education_App.IT;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class OS_5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS_5 frame = new OS_5();
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
	
	
	public OS_5() {
		setTitle("Education Desktop App");
		setIconImage(Toolkit.getDefaultToolkit().getImage(OS_1.class.getResource("/IMG/Education.png")));
		setResizable(false);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 621);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQWhichOf_1 = new JLabel("and the computer hardware");
		lblQWhichOf_1.setForeground(Color.BLACK);
		lblQWhichOf_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblQWhichOf_1.setBackground(Color.WHITE);
		lblQWhichOf_1.setBounds(41, 281, 1007, 51);
		contentPane.add(lblQWhichOf_1);
		
		JLabel lblNewLabel = new JLabel("Q-9) The goal of an operating system is to …..\r\n");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(41, 11, 1156, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton a9 = new JRadioButton("Execute user programs and make solving user problems easier");
		a9.setForeground(Color.BLACK);
		a9.setBackground(Color.WHITE);
		a9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		a9.setBounds(41, 92, 672, 34);
		contentPane.add(a9);
		
		JRadioButton b9 = new JRadioButton("Make the computer system convenient to use");
		b9.setBackground(Color.WHITE);
		b9.setForeground(Color.BLACK);
		b9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		b9.setBounds(41, 129, 672, 34);
		contentPane.add(b9);
		
		JRadioButton c9 = new JRadioButton("Use the computer hardware in an efficient manner");
		c9.setForeground(Color.BLACK);
		c9.setBackground(Color.WHITE);
		c9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c9.setBounds(41, 166, 672, 34);
		contentPane.add(c9);
		
		JRadioButton d9 = new JRadioButton("All of them");
		d9.setForeground(Color.BLACK);
		d9.setBackground(Color.WHITE);
		d9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		d9.setBounds(41, 203, 672, 34);
		contentPane.add(d9);
				
		ButtonGroup group = new ButtonGroup ();
		group.add(a9);
		group.add(b9);
		group.add(c9);
		group.add(d9);
		
		JLabel lblQWhichOf = new JLabel("Q-10) ... is a program that acts as an intermediary between a user of a computer");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblQWhichOf.setBounds(41, 231, 957, 74);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a10 = new JRadioButton("System Manager");
		a10.setForeground(Color.BLACK);
		a10.setBackground(Color.WHITE);
		a10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		a10.setBounds(41, 339, 672, 34);
		contentPane.add(a10);
		
		JRadioButton b10 = new JRadioButton("Application program");
		b10.setBackground(Color.WHITE);
		b10.setForeground(Color.BLACK);
		b10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		b10.setBounds(41, 376, 672, 34);
		contentPane.add(b10);
		
		JRadioButton c10 = new JRadioButton("Operating system");
		c10.setForeground(Color.BLACK);
		c10.setBackground(Color.WHITE);
		c10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c10.setBounds(41, 413, 672, 34);
		contentPane.add(c10);
		
		JRadioButton d10 = new JRadioButton("Source code");
		d10.setForeground(Color.BLACK);
		d10.setBackground(Color.WHITE);
		d10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		d10.setBounds(41, 450, 672, 34);
		contentPane.add(d10);
		
		ButtonGroup group2 = new ButtonGroup ();
		group2.add(a10);
		group2.add(b10);
		group2.add(c10);
		group2.add(d10);
		
		JButton btnBack_1 = new JButton("Next");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IT_QBank.OS_Answer Answer = new IT_QBank.OS_Answer();
				IT_QBank.Count C = new IT_QBank.Count();
				C.setTotal();
				C.setTotal();

			if (a9.isSelected()) {
				Answer.setA9();
			}else if (b9.isSelected()) {
				Answer.setB9();
			}else if (c9.isSelected()) {
				Answer.setC9();
			}else if (d9.isSelected()) {
				Answer.setD9();
				C.setCount();
			}else {
				Answer.a9=false;
				Answer.b9=false;
				Answer.c9=false;
				Answer.d9=false;
			}
			
			if (a10.isSelected()) {
				Answer.setA10();
			}else if (b10.isSelected()) {
				Answer.setB10();
			}else if (c10.isSelected()) {
				Answer.setC10();
				C.setCount();
			}else if (d10.isSelected()) {
				Answer.setD10();
			}else {
				Answer.a10=false;
				Answer.b10=false;
				Answer.c10=false;
				Answer.d10=false;
			}
			
			IT_QBank.Score s = new IT_QBank.Score ();
			s.main();
			dispose();
			}
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(814, 489, 134, 51);
		contentPane.add(btnBack_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OS_1.class.getResource("/IMG/Background L.png")));
		lblNewLabel_1.setBounds(0, 0, 1127, 591);
		contentPane.add(lblNewLabel_1);
	
	}
}
