package editorTexto;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Lamina extends JPanel{

	private JTextPane textArea;
	
	private String fuente;
	
	private int estilo, tamaño;
	
	public Lamina() {
		
		JPanel laminaMenu = new JPanel();
		
		fuente = "";
		estilo = Font.PLAIN;
		tamaño = 12;
		
		textArea = new JTextPane();
		
		setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamaño = new JMenu("Tamaño");
		
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem times = new JMenuItem("Times New Roman");
		JMenuItem calibri = new JMenuItem("Calibri");
		JMenuItem magneto = new JMenuItem("Magneto");
		
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		
		JMenuItem pequeño = new JMenuItem("Pequeño");
		JMenuItem mediano = new JMenuItem("Mediano");
		JMenuItem grande = new JMenuItem("Grande");
		JMenuItem muyGrande = new JMenuItem("Muy grande");
		
		arial.addActionListener(new ControlesMenu());
		times.addActionListener(new ControlesMenu());
		calibri.addActionListener(new ControlesMenu());
		magneto.addActionListener(new ControlesMenu());
		
		negrita.addActionListener(new ControlesMenu());
		cursiva.addActionListener(new ControlesMenu());
		
		pequeño.addActionListener(new ControlesMenu());
		mediano.addActionListener(new ControlesMenu());
		grande.addActionListener(new ControlesMenu());
		muyGrande.addActionListener(new ControlesMenu());
		
		menuBar.add(fuente);
		menuBar.add(estilo);
		menuBar.add(tamaño);

		fuente.add(arial);
		fuente.add(times);
		fuente.add(calibri);
		fuente.add(magneto);
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		tamaño.add(pequeño);
		tamaño.add(mediano);
		tamaño.add(grande);
		tamaño.add(muyGrande);
		
		laminaMenu.add(menuBar);
		
		add(textArea, BorderLayout.CENTER);
		add(laminaMenu, BorderLayout.NORTH);
	}
		
	private class ControlesMenu implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
					
			JMenuItem menuItem = (JMenuItem) e.getSource();
			
			String opcion = menuItem.getText();
							
			switch(opcion) {
			
				case "Arial":
						fuente = opcion;
					break;
				case "Times New Roman":
						fuente = opcion;					
					break;
				case "Calibri":
						fuente = opcion;				
					break;
				case "Magneto":
						fuente = opcion;					
					break;
				case "Negrita":
						estilo = Font.BOLD;
					break;
				case "Cursiva":
						estilo = Font.ITALIC;
					break;
				case "Pequeño":
						tamaño = 12;					
						break;
				case "Mediano":
						tamaño = 16;				
					break;
				case "Grande":
						tamaño = 20;
					break;
				case "Muy grande":
						tamaño = 24;				
					break;		
			}
			
			textArea.setFont(new Font(fuente, estilo, tamaño));
			
		}
		
	}
	
}
