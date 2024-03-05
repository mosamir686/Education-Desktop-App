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

public class OS_4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS_4 frame = new OS_4();
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
	
	
	public OS_4() {
		setTitle("Education Desktop App");
		setIconImage(Toolkit.getDefaultToolkit().getImage(OS_1.class.getResource("/IMG/Education.png")));
		setResizable(false);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 621);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q-7) Computer system is divided into how many numbers of components?");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(41, 11, 1156, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton a7 = new JRadioButton("1");
		a7.setForeground(Color.BLACK);
		a7.setBackground(Color.WHITE);
		a7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		a7.setBounds(41, 92, 672, 34);
		contentPane.add(a7);
		
		JRadioButton b7 = new JRadioButton("2");
		b7.setBackground(Color.WHITE);
		b7.setForeground(Color.BLACK);
		b7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		b7.setBounds(41, 129, 672, 34);
		contentPane.add(b7);
		
		JRadioButton c7 = new JRadioButton("3");
		c7.setForeground(Color.BLACK);
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c7.setBounds(41, 166, 672, 34);
		contentPane.add(c7);
		
		JRadioButton d7 = new JRadioButton("4");
		d7.setForeground(Color.BLACK);
		d7.setBackground(Color.WHITE);
		d7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		d7.setBounds(41, 203, 672, 34);
		contentPane.add(d7);
				
		ButtonGroup group = new ButtonGroup ();
		group.add(a7);
		group.add(b7);
		group.add(c7);
		group.add(d7);
		
		JLabel lblQWhichOf = new JLabel("Q-8) UNIX operating system .........");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblQWhichOf.setBounds(41, 235, 1007, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a8 = new JRadioButton("can run on PC’s and larger system");
		a8.setForeground(Color.BLACK);
		a8.setBackground(Color.WHITE);
		a8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		a8.setBounds(41, 319, 672, 34);
		contentPane.add(a8);
		
		JRadioButton b8 = new JRadioButton("is multitasking");
		b8.setBackground(Color.WHITE);
		b8.setForeground(Color.BLACK);
		b8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		b8.setBounds(41, 356, 672, 34);
		contentPane.add(b8);
		
		JRadioButton c8 = new JRadioButton("is multiuser");
		c8.setForeground(Color.BLACK);
		c8.setBackground(Color.WHITE);
		c8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c8.setBounds(41, 393, 672, 34);
		contentPane.add(c8);
		
		JRadioButton d8 = new JRadioButton("all of these");
		d8.setForeground(Color.BLACK);
		d8.setBackground(Color.WHITE);
		d8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		d8.setBounds(41, 430, 672, 34);
		contentPane.add(d8);
		
		ButtonGroup group2 = new ButtonGroup ();
		group2.add(a8);
		group2.add(b8);
		group2.add(c8);
		group2.add(d8);
		
		JButton btnBack_1 = new JButton("Next");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IT_QBank.OS_Answer Answer = new IT_QBank.OS_Answer();
				IT_QBank.Count C = new IT_QBank.Count();
				C.setTotal();
				C.setTotal();

			if (a7.isSelected()) {
				Answer.setA7();
			}else if (b7.isSelected()) {
				Answer.setB7();
			}else if (c7.isSelected()) {
				Answer.setC7();
			}else if (d7.isSelected()) {
				Answer.setD7();
				C.setCount();
			}else {
				Answer.a7=false;
				Answer.b7=false;
				Answer.c7=false;
				Answer.d7=false;
			}
			
			if (a8.isSelected()) {
				Answer.setA8();
			}else if (b8.isSelected()) {
				Answer.setB8();
			}else if (c8.isSelected()) {
				Answer.setC8();
			}else if (d8.isSelected()) {
				Answer.setD8();
				C.setCount();
			}else {
				Answer.a8=false;
				Answer.b8=false;
				Answer.c8=false;
				Answer.d8=false;
			}
			
			OS_5 OS = new OS_5();			
			OS.main();
			dispose();
			}
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(787, 497, 134, 51);
		contentPane.add(btnBack_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OS_1.class.getResource("/IMG/Background L.png")));
		lblNewLabel_1.setBounds(0, 0, 1127, 591);
		contentPane.add(lblNewLabel_1);
	
	}
}
