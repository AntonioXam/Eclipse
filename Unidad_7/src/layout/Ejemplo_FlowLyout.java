package layout;
import javax.swing.*;
import java.awt.*;

public class Ejemplo_FlowLyout extends JFrame{

	public Ejemplo_FlowLyout()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		for (int i = 1; i < 10; i++) {
			add(new JButton("Botón "+i));
		}
	}
		
	public static void main(String[] args) {
		Ejemplo_FlowLyout f=new Ejemplo_FlowLyout();
		
		f.setTitle("Ejemplo FlowLyout");
		f.setSize(300, 250);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
