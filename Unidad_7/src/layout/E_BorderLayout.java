package layout;
import javax.swing.*;
import java.awt.*;

public class E_BorderLayout extends JFrame{

	public E_BorderLayout()
	{
		setLayout(new BorderLayout(5,10));
		
		add(new JButton("Uno"),BorderLayout.CENTER);
		add(new JButton("Dos"),BorderLayout.SOUTH);
		add(new JButton("Tres"),BorderLayout.NORTH);
		add(new JButton("Cuatro"),BorderLayout.EAST);
		add(new JButton("Cinco"),BorderLayout.WEST);
	}
	public static void main(String[] args) {
		E_BorderLayout e=new E_BorderLayout();
		
		e.setTitle("Ejemplo BorderLayout");
		e.pack();
		e.setLocationRelativeTo(null);
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
