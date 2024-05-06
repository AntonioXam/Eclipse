package menubar;


	import javax.swing.*;
	import java.awt.event.*;

	public class menuEjemplo extends JFrame implements ActionListener {

		        private JMenuBar menuBar;
		        private JMenu menu,archivo,editar,ayuda,opciones,separator;
		        private JMenuItem nuevo,abrir,guardar,salir,cortar,pegar,ayudaItem,acercaDe,preferencias,configuracion,configuracionAvanzada;
		        
	    public menuEjemplo() {
	      
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);

			archivo = new JMenu("Archivo");
			menuBar.add(archivo);

			nuevo = new JMenuItem("Nuevo");
			nuevo.addActionListener(this);
			archivo.add(nuevo);

			abrir = new JMenuItem("Abrir");
			abrir.addActionListener(this);
			archivo.add(abrir);

			guardar = new JMenuItem("Guardar");
			guardar.addActionListener(this);
			archivo.add(guardar);

			salir = new JMenuItem("Salir");
			salir.addActionListener(this);
			archivo.add(salir);

			editar = new JMenu("Editar");
			menuBar.add(editar);

			cortar = new JMenuItem("Cortar");
			cortar.addActionListener(this);
			editar.add(cortar);

			pegar = new JMenuItem("Pegar");
			pegar.addActionListener(this);
			editar.add(pegar);
			

			opciones = new JMenu("Opciones");
			menuBar.add(opciones);

			preferencias = new JMenuItem("Preferencias");
			opciones.add(preferencias);

			configuracion = new JMenuItem("Configuracion");
			opciones.add(configuracion);

			configuracionAvanzada = new JMenuItem("Configuracion Avanzada");
			opciones.add(configuracionAvanzada);

			//separacion
			separator = new JMenu("             ");
			menuBar.add(separator);
			
			
			ayuda = new JMenu("Ayuda");
			menuBar.add(ayuda);

			ayudaItem = new JMenuItem("Ayuda");
			ayudaItem.addActionListener(this);
			ayuda.add(ayudaItem);

			acercaDe = new JMenuItem("Acerca de");
			acercaDe.addActionListener(this);
			ayuda.add(acercaDe);

	    }

	    public static void main(String[] args) {
			
            menuEjemplo frame = new menuEjemplo();
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400,400);
                        frame.setVisible(true);
                        frame.setTitle("Menu Ejemplo");
                        frame.setLocationRelativeTo(null);
                        
                        
			
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource() == nuevo) {
				JOptionPane.showMessageDialog(null, "Nuevo");
			}
			if (e.getSource() == abrir) {
				JOptionPane.showMessageDialog(null, "Abrir");
			}
			if (e.getSource() == guardar) {
				JOptionPane.showMessageDialog(null, "Guardar");
			}
			if (e.getSource() == salir) {
				System.exit(0);
			}
			if (e.getSource() == cortar) {
				JOptionPane.showMessageDialog(null, "Cortar");
			}
			if (e.getSource() == pegar) {
				JOptionPane.showMessageDialog(null, "Pegar");
			}
			if (e.getSource() == ayudaItem) {
				JOptionPane.showMessageDialog(null, "Ayuda");
			}
			if (e.getSource() == acercaDe) {
				JOptionPane.showMessageDialog(null, "Acerca de");
			}
			
	
		
			
			
			
		}
	}
