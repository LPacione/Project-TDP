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
import javax.swing.border.EmptyBorder;

import Logica.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frame;
	private Logica l;
	
	
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
		frame.getContentPane().setLayout(null);
		
		//-----------OBJECTS
		
		l = new Logica(this);
		
		//-----------PANELS
		JPanel panelUp = new JPanel();
		panelUp.setSize(800, 20);
		panelUp.setBackground(Color.GRAY);
		frame.getContentPane().add(panelUp);
		panelUp.setLayout(null);
		
		JPanel panelDown = new JPanel();
		panelDown.setBackground(Color.DARK_GRAY);
		panelDown.setLayout(null);
		frame.getContentPane().add(panelDown);
		
		
		//-----------ACTIONS
		
		JLabel score = new JLabel("Score");
		score.setBackground(Color.WHITE);
		score.setSize(80, 20);
		score.setLocation(80, 0);
		score.setHorizontalAlignment(SwingConstants.CENTER);
		panelUp.add(score);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJugar.setEnabled(false);
				
			}
		});
		
		btnJugar.setSize(80, 20);
		panelUp.add(btnJugar);
		
		
		
	}

}
