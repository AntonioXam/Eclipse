package layout;
import javax.swing.*;
import java.awt.*;

public class E_GridLayout extends JFrame{

	public E_GridLayout()
	{
		setLayout(new GridLayout(3,4,5,5));
		
		for (int i = 1; i <=10; i++) {
			add(new JButton(""+i));
		}
	}
	public static void main(String[] args) {
		E_GridLayout g=new E_GridLayout();
		
		g.setTitle("Ejemplo GridLayout");
		g.setSize(300, 250);
		g.setLocationRelativeTo(null);
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
