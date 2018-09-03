package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(5, 5));
		
		JPanel panelIzq = new JPanel();
		panelIzq.setBackground(Color.GRAY);
		frame.getContentPane().add(panelIzq, BorderLayout.NORTH);
		panelIzq.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJugar.setHorizontalAlignment(SwingConstants.RIGHT);
		panelIzq.add(btnJugar);
		
		JPanel panelDer = new JPanel();
		panelDer.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panelDer, BorderLayout.CENTER);
		panelDer.setLayout(new BorderLayout(0, 0));
	}

}
