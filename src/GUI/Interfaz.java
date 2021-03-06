package GUI;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Interfaz extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JLabel dibujo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				mover(arg0);
			}
		});
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.agregarDibujo();
	}
	
	protected void mover(KeyEvent key){
		System.out.println(key.getKeyCode());
		int newX=0,newY=0,ancho=0,alto=0;
		Rectangle pos = dibujo.getBounds();
		if(key.getKeyCode()==39)
			newX = (int) pos.getX() + 10; //se resetea la pos
		if(key.getKeyCode()==38)
			newY = (int) pos.getY() ; //se resetea la pos
		ancho = (int) pos.getWidth();
		alto = (int) pos.getHeight();
		
		dibujo.setBounds(newX, newY, ancho, alto);
	}
	
	private void agregarDibujo(){
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Animacion/up.png"));
		dibujo = new JLabel(imagen);
		
		dibujo.setBounds(0, 0, 25, 25);
		
		this.add(dibujo);
	}
}
