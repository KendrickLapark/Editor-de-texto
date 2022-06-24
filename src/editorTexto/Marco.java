package editorTexto;

import javax.swing.JFrame;

public class Marco extends JFrame{
	
	public Marco() {
		
		setBounds(500, 500, 600, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Lamina());
		
		setVisible(true);
		
	}

}
