import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class AriketaWinAplication {

	private JFrame frame;
	private JTextField txtnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AriketaWinAplication window = new AriketaWinAplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AriketaWinAplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 222, 101);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnombre = new JPanel();
		frame.getContentPane().add(pnombre, BorderLayout.NORTH);
		
		JLabel lblnombre = new JLabel("Nombre");
		pnombre.add(lblnombre);
		
		txtnombre = new JTextField();
		txtnombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				pnombre.setBackground(Color.pink);
			}
		});
		pnombre.add(txtnombre);
		txtnombre.setColumns(10);
		
		JPanel pbotones = new JPanel();
		frame.getContentPane().add(pbotones, BorderLayout.CENTER);
		

		JButton btnok = new JButton("OK");
		JButton btncancel = new JButton("CANCEL");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("tu nombre es: " + txtnombre.getText());
				pnombre.setBackground(Color.green);
				lblnombre.setForeground(Color.WHITE);
				pbotones.setBackground(Color.black);
				btnok.setForeground(Color.RED);
				btncancel.setForeground(Color.RED);
			}
		});
		pbotones.add(btnok);
		
		
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has cancelado la accion");
				txtnombre.setText(null);			
			}
		});
		pbotones.add(btncancel);
	}

}
