package java_Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class java_JFrame_Button extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					java_JFrame_Button frame = new java_JFrame_Button();
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
	public java_JFrame_Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 117);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnombre = new JPanel();
		contentPane.add(pnombre, BorderLayout.NORTH);
		
		JLabel lblnombre = new JLabel("Nombre");
		pnombre.add(lblnombre);
		
		txtnombre = new JTextField();
		txtnombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				pnombre.setBackground(java.awt.Color.GREEN);
			}
		});
		txtnombre.setText(" ");
		pnombre.add(txtnombre);
		txtnombre.setColumns(10);
		
		JPanel pbotones = new JPanel();
		pbotones.setBackground(java.awt.Color.BLUE);
		contentPane.add(pbotones, BorderLayout.CENTER);
		
		JButton btnok = new JButton("OK");
		JButton btncancel = new JButton("CANCEL");
		
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("tu nombre es: " + txtnombre.getText());
				pbotones.setBackground(java.awt.Color.GREEN);
			
			}
		});
		pbotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pbotones.add(btnok);
				
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has cancelado la accion");
				txtnombre.setText(" ");		
				pbotones.setBackground(java.awt.Color.black);
			}
		});
		pbotones.add(btncancel);
	}}
