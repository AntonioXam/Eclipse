package changeListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Resoluciones extends JFrame implements ChangeListener{

	private JRadioButton jRadioButton1,jRadioButton2,jRadioButton3;
	private ButtonGroup gButtonGroup;
	
	
	public Resoluciones() {
		
		setLayout(null);
		
		gButtonGroup= new ButtonGroup();
		
		jRadioButton1= new JRadioButton("640x480");
		jRadioButton1.setBounds(50, 50, 100, 25);
		gButtonGroup.add(jRadioButton1);
		add(jRadioButton1);
		jRadioButton1.addChangeListener(this);
		
		jRadioButton2= new JRadioButton("800x600");
		jRadioButton2.setBounds(50, 100, 100, 25);
		gButtonGroup.add(jRadioButton2);
		add(jRadioButton2);
		jRadioButton2.addChangeListener(this);
		
		jRadioButton3= new JRadioButton("1024x768");
		jRadioButton3.setBounds(50, 150, 100, 25);
		gButtonGroup.add(jRadioButton3);
		add(jRadioButton3);
		jRadioButton3.addChangeListener(this);
	}
	
	public static void main(String[] args) {
		Resoluciones ventana= new Resoluciones();
		ventana.setTitle("Elige una resolución ");
		ventana.setBounds(0, 0, 300, 250);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(jRadioButton1.isSelected())
			setSize(640,480);
		if(jRadioButton2.isSelected())
			setSize(800, 600);
		if(jRadioButton3.isSelected())
			setSize(1024, 768);
		
	}

}
