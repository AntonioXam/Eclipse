package boletinContraseña;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class requisitos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					requisitos frame = new requisitos();
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
	public requisitos() {
		setTitle("Requisitos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("La CONTRASEÑA:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(44, 38, 119, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("- Debe tener al menos 8 caracteres de longitud");
		lblNewLabel_1.setBounds(40, 63, 293, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("- No puede tener más de 24 caracteres de longitud");
		lblNewLabel_1_1.setBounds(40, 88, 293, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("- No puede contener el login del usuario");
		lblNewLabel_1_2.setBounds(40, 113, 293, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("- Debe contener al menos una letra mayúscula");
		lblNewLabel_1_3.setBounds(40, 136, 293, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("- Debe contener al menos una letra minúscula");
		lblNewLabel_1_4.setBounds(40, 161, 282, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("- Debe contener al menos un número");
		lblNewLabel_1_5.setBounds(40, 186, 282, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton) {
					setVisible(false);
				}
			}
		});
		btnNewButton.setBounds(136, 225, 74, 23);
		contentPane.add(btnNewButton);
	}

}
