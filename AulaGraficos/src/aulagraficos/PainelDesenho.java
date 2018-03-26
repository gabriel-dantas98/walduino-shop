package aulagraficos;


import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelDesenho extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		Integer width = getWidth();
		Integer height = getHeight();
		
		Integer meio = width/2;
		
		g.drawLine(meio, 0, 285, 150);
		g.drawLine(meio , 0, 150, 150);
		g.drawLine(100, 100, 0, 150);
		
		
	}
	
}
