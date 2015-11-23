package java_Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class java_JFrame_JComboBox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					java_JFrame_JComboBox frame = new java_JFrame_JComboBox();
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
	public java_JFrame_JComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblmontes = new JLabel("MONTES");
		lblmontes.setForeground(Color.BLACK);
		lblmontes.setBackground(Color.BLACK);
		panel.add(lblmontes);
		
		JComboBox cmbmontes = new JComboBox<Object>();
		cmbmontes.setModel(new DefaultComboBoxModel(new String[] {"Ernio", "Aitzgorri", "Adarra", "Aiako harriak"}));
		panel.add(cmbmontes);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JButton btnok = new JButton("OK");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(cmbmontes.getSelectedItem());
			}
		});
		btnok.setForeground(Color.WHITE);
		btnok.setBackground(Color.BLACK);
		panel_1.add(btnok);
		
		JButton btncancel = new JButton("CANCELAR");
		btncancel.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				cmbmontes.setSelectedIndex(DEFAULT_CURSOR);
			}
		});
		btncancel.setForeground(Color.WHITE);
		btncancel.setBackground(Color.BLACK);
		panel_1.add(btncancel);
	}

}
