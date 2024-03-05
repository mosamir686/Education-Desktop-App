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

public class OS_3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS_3 frame = new OS_3();
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
	
	
	public OS_3() {
		setTitle("Education Desktop App");
		setIconImage(Toolkit.getDefaultToolkit().getImage(OS_1.class.getResource("/IMG/Education.png")));
		setResizable(false);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 621);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q-5) Which of the following is not an operating system?");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(41, 11, 834, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton a5 = new JRadioButton("UNIX");
		a5.setForeground(Color.BLACK);
		a5.setBackground(Color.WHITE);
		a5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a5.setBounds(41, 92, 672, 34);
		contentPane.add(a5);
		
		JRadioButton b5 = new JRadioButton("MS-DOS");
		b5.setBackground(Color.WHITE);
		b5.setForeground(Color.BLACK);
		b5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b5.setBounds(41, 129, 672, 34);
		contentPane.add(b5);
		
		JRadioButton c5 = new JRadioButton("CP/M");
		c5.setForeground(Color.BLACK);
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c5.setBounds(41, 166, 672, 34);
		contentPane.add(c5);
		
		JRadioButton d5 = new JRadioButton("PASCAL");
		d5.setForeground(Color.BLACK);
		d5.setBackground(Color.WHITE);
		d5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d5.setBounds(41, 203, 672, 34);
		contentPane.add(d5);
				
		ButtonGroup group = new ButtonGroup ();
		group.add(a5);
		group.add(b5);
		group.add(c5);
		group.add(d5);
		
		JLabel lblQWhichOf = new JLabel("Q-6) Example of open source operating system is ........");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQWhichOf.setBounds(41, 244, 1007, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a6 = new JRadioButton("UNIX");
		a6.setForeground(Color.BLACK);
		a6.setBackground(Color.WHITE);
		a6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a6.setBounds(41, 336, 672, 34);
		contentPane.add(a6);
		
		JRadioButton b6 = new JRadioButton("Linux");
		b6.setBackground(Color.WHITE);
		b6.setForeground(Color.BLACK);
		b6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b6.setBounds(41, 373, 672, 34);
		contentPane.add(b6);
		
		JRadioButton c6 = new JRadioButton("Windows");
		c6.setForeground(Color.BLACK);
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c6.setBounds(41, 410, 672, 34);
		contentPane.add(c6);
		
		JRadioButton d6 = new JRadioButton("Both a and b ");
		d6.setForeground(Color.BLACK);
		d6.setBackground(Color.WHITE);
		d6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d6.setBounds(41, 447, 672, 34);
		contentPane.add(d6);
		
		ButtonGroup group2 = new ButtonGroup ();
		group2.add(a6);
		group2.add(b6);
		group2.add(c6);
		group2.add(d6);
		
		JButton btnBack_1 = new JButton("Next");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IT_QBank.OS_Answer Answer = new IT_QBank.OS_Answer();
				IT_QBank.Count C = new IT_QBank.Count();
				C.setTotal();
				C.setTotal();

			if (a5.isSelected()) {
				Answer.setA5();
			}else if (b5.isSelected()) {
				Answer.setB5();
			}else if (c5.isSelected()) {
				Answer.setC5();
			}else if (d5.isSelected()) {
				Answer.setD5();
				C.setCount();
			}else {
				Answer.a5=false;
				Answer.b5=false;
				Answer.c5=false;
				Answer.d5=false;
			}
			
			if (a6.isSelected()) {
				Answer.setA6();
			}else if (b6.isSelected()) {
				Answer.setB6();
			}else if (c6.isSelected()) {
				Answer.setC6();
			}else if (d6.isSelected()) {
				Answer.setD6();
				C.setCount();
			}else {
				Answer.a6=false;
				Answer.b6=false;
				Answer.c6=false;
				Answer.d6=false;
			}
			
			OS_4 OS = new OS_4();
			OS.main();
			dispose();
			}
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(730, 506, 134, 51);
		contentPane.add(btnBack_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OS_1.class.getResource("/IMG/Background L.png")));
		lblNewLabel_1.setBounds(0, 0, 1066, 591);
		contentPane.add(lblNewLabel_1);
	
	}
}
