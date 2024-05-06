package menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menuBar extends JFrame implements ActionListener {
	/* programa sencillo con un menu de opciones para cambiar el color del background y la resolucion de la ventana */
	
	private JMenuBar menuBar;
	private JMenu menu, color, resolucion;
	private JMenuItem rojo,azul,verde,pequena,mediana,grande;
	
	public menuBar() {
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu = new JMenu("Opciones");
		menuBar.add(menu);
		
		color = new JMenu("Color");
		menu.add(color);
		
		rojo = new JMenuItem("Rojo");
		rojo.addActionListener(this);
		color.add(rojo);
		
		azul = new JMenuItem("Azul");
		azul.addActionListener(this);
		color.add(azul);
		
		verde = new JMenuItem("Verde");
		verde.addActionListener(this);
		color.add(verde);
		
		resolucion = new JMenu("Resolucion");
		menu.add(resolucion);
		
		pequena = new JMenuItem("640x480");
		pequena.addActionListener(this);
		resolucion.add(pequena);
		
		mediana = new JMenuItem("800x600");
		mediana.addActionListener(this);
		resolucion.add(mediana);
		
		grande = new JMenuItem("1024x768");
		grande.addActionListener(this);
		resolucion.add(grande);
		
		
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		menuBar menu = new menuBar();
		menu.setTitle("Menu");;
		menu.setVisible(true);
		menu.setSize(400, 400);
		menu.setJMenuBar(menu.menuBar);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == rojo) {
			getContentPane().setBackground(java.awt.Color.RED);
		}
		if (e.getSource() == azul) {
			getContentPane().setBackground(java.awt.Color.BLUE);
		}
		if (e.getSource() == verde) {
			getContentPane().setBackground(java.awt.Color.GREEN);
		}
		if (e.getSource() == pequena) {
			setSize(640, 480);
		}
		if (e.getSource() == mediana) {
			setSize(800, 600);
		}
		if (e.getSource() == grande) {
			setSize(1024, 768);
		}
		
		
	}

}
