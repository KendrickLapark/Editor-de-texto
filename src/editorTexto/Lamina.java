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
	
	private int estilo, tama�o;
	
	public Lamina() {
		
		JPanel laminaMenu = new JPanel();
		
		fuente = "";
		estilo = Font.PLAIN;
		tama�o = 12;
		
		textArea = new JTextPane();
		
		setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tama�o = new JMenu("Tama�o");
		
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem times = new JMenuItem("Times New Roman");
		JMenuItem calibri = new JMenuItem("Calibri");
		JMenuItem magneto = new JMenuItem("Magneto");
		
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		
		JMenuItem peque�o = new JMenuItem("Peque�o");
		JMenuItem mediano = new JMenuItem("Mediano");
		JMenuItem grande = new JMenuItem("Grande");
		JMenuItem muyGrande = new JMenuItem("Muy grande");
		
		arial.addActionListener(new ControlesMenu());
		times.addActionListener(new ControlesMenu());
		calibri.addActionListener(new ControlesMenu());
		magneto.addActionListener(new ControlesMenu());
		
		negrita.addActionListener(new ControlesMenu());
		cursiva.addActionListener(new ControlesMenu());
		
		peque�o.addActionListener(new ControlesMenu());
		mediano.addActionListener(new ControlesMenu());
		grande.addActionListener(new ControlesMenu());
		muyGrande.addActionListener(new ControlesMenu());
		
		menuBar.add(fuente);
		menuBar.add(estilo);
		menuBar.add(tama�o);

		fuente.add(arial);
		fuente.add(times);
		fuente.add(calibri);
		fuente.add(magneto);
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		tama�o.add(peque�o);
		tama�o.add(mediano);
		tama�o.add(grande);
		tama�o.add(muyGrande);
		
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
				case "Peque�o":
						tama�o = 12;					
						break;
				case "Mediano":
						tama�o = 16;				
					break;
				case "Grande":
						tama�o = 20;
					break;
				case "Muy grande":
						tama�o = 24;				
					break;		
			}
			
			textArea.setFont(new Font(fuente, estilo, tama�o));
			
		}
		
	}
	
}
