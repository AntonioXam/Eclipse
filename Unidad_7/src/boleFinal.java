import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class boleFinal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JTextField num4;
	private JTextField num5;
	private JTextField num6;


	 
	 /**
	  * Ejecutando Main
	  * @param args
	  */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boleFinal frame = new boleFinal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creación Ventana
	 */
	public boleFinal() {
		setTitle("Lotería primitiva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 54, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menú");
		menuBar.add(mnNewMenu);
		
		/**
		 * Botón Menú para visualizar la ventana de Info en un Jdialog
		 */
		JMenuItem mntmNewMenuItem = new JMenuItem("Info");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoVentana2 ventana2 = new infoVentana2();
				ventana2.setVisible(true);
			
			}
		});
	
		mnNewMenu.add(mntmNewMenuItem);
	
		/**
		 * Botón Salir en el menu
		 */
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JLabel label1 = new JLabel("1");
		label1.setForeground(Color.LIGHT_GRAY);
		label1.setBounds(69, 64, 46, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("2");
		label2.setForeground(Color.LIGHT_GRAY);
		label2.setBounds(127, 64, 46, 14);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("3");
		label3.setForeground(Color.LIGHT_GRAY);
		label3.setBounds(173, 64, 46, 14);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("4");
		label4.setForeground(Color.LIGHT_GRAY);
		label4.setBounds(229, 64, 46, 14);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("5");
		label5.setForeground(Color.LIGHT_GRAY);
		label5.setBounds(285, 64, 46, 14);
		contentPane.add(label5);
		
		JLabel label6 = new JLabel("6");
		label6.setForeground(Color.LIGHT_GRAY);
		label6.setBounds(341, 64, 46, 14);
		contentPane.add(label6);
		
		
		
		/**
		 * Botón generar números aleatorios para la loteria con array y ordenados de menor a mayor
		 * 
		 */
		JButton generar = new JButton("Generar números");
		generar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				final int LIM=10;
				
				int[] arrayA = new int[6];
				int[] arrayB = new int[6];
				
				int conta = 0;
				
				
				
				for (int i = 0; i < arrayB.length; i++) {
					arrayB[i] = (int) (Math.random() * LIM + 1);
				}
				
				
				
					
					for (int i = 0; i < arrayA.length; i++) {
						do {
							arrayA[i] = (int) (Math.random() * LIM + 1);
							conta = 0;
							for (int j = 0; j < arrayA.length; j++) {
								for (int j2 = 0; j2 < arrayB.length; j2++) {
									if (arrayA[j] == arrayB[j2]) {
										conta++;
									}
								}
							}
						} while (arrayA[i] < 1 || arrayA[i] >= LIM || conta > 0);
					}
					
					
				
				for (int i = 0; i < arrayA.length; i++) {
					for (int j = 0; j < arrayA.length; j++) {
						if (arrayA[i] < arrayA[j]) {
							int aux = arrayA[i];
							arrayA[i] = arrayA[j];
							arrayA[j] = aux;
						}
					}
				}
				
				
				
				
				num1.setText(String.valueOf(arrayA[0]));
				num2.setText(String.valueOf(arrayA[1]));
				num3.setText(String.valueOf(arrayA[2]));
				num4.setText(String.valueOf(arrayA[3]));
				num5.setText(String.valueOf(arrayA[4]));
				num6.setText(String.valueOf(arrayA[5]));
			}
				
		
				
		});
		
		generar.setBounds(58, 144, 300, 53);
		contentPane.add(generar);
		
		num1 = new JTextField();
		num1.setBounds(58, 89, 31, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(114, 89, 31, 20);
		contentPane.add(num2);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(164, 89, 31, 20);
		contentPane.add(num3);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(217, 89, 31, 20);
		contentPane.add(num4);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(270, 89, 31, 20);
		contentPane.add(num5);
		
		num6 = new JTextField();
		num6.setColumns(10);
		num6.setBounds(327, 89, 31, 20);
		contentPane.add(num6);
	}
	
	
	
}
