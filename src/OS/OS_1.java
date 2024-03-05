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

public class OS_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS_1 frame = new OS_1();
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
	
	
	public OS_1() {
		setTitle("Education Desktop App");
		setIconImage(Toolkit.getDefaultToolkit().getImage(OS_1.class.getResource("/IMG/Education.png")));
		setResizable(false);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 621);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q-1) Operating systems is .........");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(41, 11, 511, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton a = new JRadioButton("Enables the programmer to draw a flow chart\r\n");
		a.setForeground(Color.BLACK);
		a.setBackground(Color.WHITE);
		a.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a.setBounds(41, 92, 672, 34);
		contentPane.add(a);
		
		JRadioButton b = new JRadioButton("Provides a layer, user friendly interface");
		b.setBackground(Color.WHITE);
		b.setForeground(Color.BLACK);
		b.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b.setBounds(41, 129, 672, 34);
		contentPane.add(b);
		
		JRadioButton c = new JRadioButton("Links a program with subroutine it references");
		c.setForeground(Color.BLACK);
		c.setBackground(Color.WHITE);
		c.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c.setBounds(41, 166, 672, 34);
		contentPane.add(c);
		
		JRadioButton d = new JRadioButton("All of these");
		d.setForeground(Color.BLACK);
		d.setBackground(Color.WHITE);
		d.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d.setBounds(41, 203, 672, 34);
		contentPane.add(d);
				
		ButtonGroup group = new ButtonGroup ();
		group.add(a);
		group.add(b);
		group.add(c);
		group.add(d);
		
		JLabel lblQWhichOf = new JLabel("Q-2) Which of the following Is not a part of the operating system?");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQWhichOf.setBounds(41, 244, 1007, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a2 = new JRadioButton("Input/output control program");
		a2.setForeground(Color.BLACK);
		a2.setBackground(Color.WHITE);
		a2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a2.setBounds(41, 336, 672, 34);
		contentPane.add(a2);
		
		JRadioButton b2 = new JRadioButton("Job control program");
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b2.setBounds(41, 373, 672, 34);
		contentPane.add(b2);
		
		JRadioButton c2 = new JRadioButton("Supervisor");
		c2.setForeground(Color.BLACK);
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c2.setBounds(41, 410, 672, 34);
		contentPane.add(c2);
		
		JRadioButton d2 = new JRadioButton("Performance monitor");
		d2.setForeground(Color.BLACK);
		d2.setBackground(Color.WHITE);
		d2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d2.setBounds(41, 447, 672, 34);
		contentPane.add(d2);
		
		ButtonGroup group2 = new ButtonGroup ();
		group2.add(a2);
		group2.add(b2);
		group2.add(c2);
		group2.add(d2);
		
		JButton btnBack_1 = new JButton("Next");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				IT_QBank.OS_Answer Answer = new IT_QBank.OS_Answer();
				IT_QBank.Count C = new IT_QBank.Count();
				
				if (Answer.a1==true) {
					a.setSelected(true);
				
				}else if (Answer.b1==true) {
					b.setSelected(true);
					
				}else if (Answer.c1==true) {
					c.setSelected(true);
					
				}else if (Answer.d1==true) {
					d.setSelected(true);
					
				}
				//		-----------------------------
				if (Answer.a2==true) {
					a2.setSelected(true);
					
				}else if (Answer.b2==true) {
					b2.setSelected(true);
					
				}else if (Answer.c2==true) {
					c2.setSelected(true);
					
				}else if (Answer.d2==true) {
					d2.setSelected(true);
			
				}
				
				C.setTotal();
				C.setTotal();

			if (a.isSelected()) {
				Answer.setA1();
			}else if (b.isSelected()) {
				Answer.setB1();
				C.setCount();
			}else if (c.isSelected()) {
				Answer.setC1();
			}else if (d.isSelected()) {
				Answer.setD1();
			}else {
				Answer.a1=false;
				Answer.b1=false;
				Answer.c1=false;
				Answer.d1=false;
			}
			
			if (a2.isSelected()) {
				Answer.setA2();
			}else if (b2.isSelected()) {
				Answer.setB2();
			}else if (c2.isSelected()) {
				Answer.setC2();
			}else if (d2.isSelected()) {
				Answer.setD2();
				C.setCount();
			}else {
				Answer.a2=false;
				Answer.b2=false;
				Answer.c2=false;
				Answer.d2=false;
			}
			
			OS_2 OS = new OS_2();
			OS.main();
			dispose();
			}
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(807, 501, 134, 51);
		contentPane.add(btnBack_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OS_1.class.getResource("/IMG/Background L.png")));
		lblNewLabel_1.setBounds(0, 0, 1066, 591);
		contentPane.add(lblNewLabel_1);
		IT_QBank.OS_Answer Answer = new IT_QBank.OS_Answer();	
		if (Answer.a1==true) {
			a.setSelected(true);
		
		}else if (Answer.b1==true) {
			b.setSelected(true);
			
		}else if (Answer.c1==true) {
			c.setSelected(true);
			
		}else if (Answer.d1==true) {
			d.setSelected(true);
			
		}
		//		-----------------------------
		if (Answer.a2==true) {
			a2.setSelected(true);
			
		}else if (Answer.b2==true) {
			b2.setSelected(true);
			
		}else if (Answer.c2==true) {
			c2.setSelected(true);
			
		}else if (Answer.d2==true) {
			d2.setSelected(true);
	
		}
	}
	
}
