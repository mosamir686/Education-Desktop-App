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

public class OS_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS_2 frame = new OS_2();
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
	
	
	public OS_2() {
		setTitle("Education Desktop App");
		setIconImage(Toolkit.getDefaultToolkit().getImage(OS_1.class.getResource("/IMG/Education.png")));
		setResizable(false);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 621);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q-3) Dual mode of operating system has .........");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(41, 11, 705, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton a3 = new JRadioButton("1 mode");
		a3.setForeground(Color.BLACK);
		a3.setBackground(Color.WHITE);
		a3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a3.setBounds(41, 92, 672, 34);
		contentPane.add(a3);
		
		JRadioButton b3 = new JRadioButton("2 modes");
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b3.setBounds(41, 129, 672, 34);
		contentPane.add(b3);
		
		JRadioButton c3 = new JRadioButton("3 modes");
		c3.setForeground(Color.BLACK);
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c3.setBounds(41, 166, 672, 34);
		contentPane.add(c3);
		
		JRadioButton d3 = new JRadioButton("4 modes");
		d3.setForeground(Color.BLACK);
		d3.setBackground(Color.WHITE);
		d3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d3.setBounds(41, 203, 672, 34);
		contentPane.add(d3);
				
		ButtonGroup group = new ButtonGroup ();
		group.add(a3);
		group.add(b3);
		group.add(c3);
		group.add(d3);
		
		JLabel lblQWhichOf = new JLabel("Q-4) Operating system is a collection of ?");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQWhichOf.setBounds(41, 244, 1007, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a4 = new JRadioButton("Software routines");
		a4.setForeground(Color.BLACK);
		a4.setBackground(Color.WHITE);
		a4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a4.setBounds(41, 336, 672, 34);
		contentPane.add(a4);
		
		JRadioButton b4 = new JRadioButton("Input-output devices\r\n");
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b4.setBounds(41, 373, 672, 34);
		contentPane.add(b4);
		
		JRadioButton c4 = new JRadioButton("Hardware components");
		c4.setForeground(Color.BLACK);
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c4.setBounds(41, 410, 672, 34);
		contentPane.add(c4);
		
		JRadioButton d4 = new JRadioButton("All of these");
		d4.setForeground(Color.BLACK);
		d4.setBackground(Color.WHITE);
		d4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d4.setBounds(41, 447, 672, 34);
		contentPane.add(d4);
		
		ButtonGroup group2 = new ButtonGroup ();
		group2.add(a4);
		group2.add(b4);
		group2.add(c4);
		group2.add(d4);
		
		JButton btnBack_1 = new JButton("Next");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IT_QBank.OS_Answer Answer = new IT_QBank.OS_Answer();
				IT_QBank.Count C = new IT_QBank.Count();
				C.setTotal();
				C.setTotal();

			if (a3.isSelected()) {
				Answer.setA3();
			}else if (b3.isSelected()) {
				Answer.setB3();
				C.setCount();
			}else if (c3.isSelected()) {
				Answer.setC3();
			}else if (d3.isSelected()) {
				Answer.setD3();
			}else {
				Answer.a3=false;
				Answer.b3=false;
				Answer.c3=false;
				Answer.d3=false;
			}
			
			if (a4.isSelected()) {
				Answer.setA4();
			}else if (b4.isSelected()) {
				Answer.setB4();
			}else if (c4.isSelected()) {
				Answer.setC4();
			}else if (d4.isSelected()) {
				Answer.setD4();
				C.setCount();
			}else {
				Answer.a4=false;
				Answer.b4=false;
				Answer.c4=false;
				Answer.d4=false;
			}
			
			OS_3 OS = new OS_3();
			OS.main();
			dispose();
			}
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(579, 505, 134, 51);
		contentPane.add(btnBack_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OS_1.class.getResource("/IMG/Background L.png")));
		lblNewLabel_1.setBounds(0, 0, 1066, 591);
		contentPane.add(lblNewLabel_1);
	
	}
}
