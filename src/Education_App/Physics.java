package Education_App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Physics extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Physics frame = new Physics();
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
	public Physics() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Physics.class.getResource("/IMG/Education.png")));
		setTitle("Education Desktop App");
		setForeground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 372);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("Select Rule:");
		lbl.setForeground(Color.BLACK);
		lbl.setFont(new Font("Shonar Bangla", Font.BOLD, 40));
		lbl.setBounds(112, 118, 190, 79);
		contentPane.add(lbl);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Potential Energy", "Kinetic Energy", "Power", "Work"}));
		comboBox.setBounds(300, 118, 195, 79);
		contentPane.add(comboBox);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home x = new Home ();
				x.main();
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(78, 236, 98, 41);
		contentPane.add(btnBack);
		
		JButton btnBack_1 = new JButton("Next");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cheak = comboBox.getSelectedItem().toString();
				if (cheak=="Potential Energy") {
					Physics_Rules.Potential_Energy PE = new Physics_Rules.Potential_Energy();
					PE.main();
					dispose();
				}else if (cheak=="Power") {
					Physics_Rules.Power P = new Physics_Rules.Power();
					P.main();
					dispose();
				}else if (cheak=="Kinetic Energy") {
					Physics_Rules.Kinetic_Energy KE = new Physics_Rules.Kinetic_Energy();
					KE.main();
					dispose();
				}else if (cheak=="Work") {
					Physics_Rules.Work W = new Physics_Rules.Work();
					W.main();
					dispose();				
					}
			}
		});
		btnBack_1.setForeground(Color.BLACK);
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(451, 237, 98, 39);
		contentPane.add(btnBack_1);
		
		JLabel lblNewLabel = new JLabel("Physics");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Daniela", Font.PLAIN, 70));
		lblNewLabel.setBounds(217, 11, 190, 96);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Physics.class.getResource("/IMG/Background S.png")));
		lblNewLabel_2.setBounds(0, 0, 636, 413);
		contentPane.add(lblNewLabel_2);
	}
}
