

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class infoVentana2 extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	
	/**
	 * Main del Jdialog
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			infoVentana2 dialog = new infoVentana2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public infoVentana2() {
		setLocationRelativeTo(null);
		setResizable(false);
		
		//no poder pasar a la otra venta sin cerrar esta
		setModal(true);
		
		
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Examen de Programación");
		setBounds(100, 100, 379, 205);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 159, 345, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			
			/**
			 * Botón Volver para salir de la Ventana Secundaria
			 */
			JButton volver = new JButton("Volver");
			volver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
                    setVisible(false);
					
				}
			});
			volver.setBounds(147, 106, 77, 23);
			getContentPane().add(volver);
		}
		{
			JLabel textGenerar = new JLabel("Generador de números de la LOTERIA PRIMITIVA");
			textGenerar.setFont(new Font("Tahoma", Font.BOLD, 11));
			textGenerar.setBounds(46, 59, 295, 14);
			getContentPane().add(textGenerar);
		}
	}

}
