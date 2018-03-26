package aulagraficos;
import javax.swing.JFrame;


public class AulaGraficos {

	public static void main(String[] args) {
		
		PainelDesenho painel = new PainelDesenho();
		JFrame aplicativo = new JFrame();
		
		aplicativo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicativo.add(painel);
		aplicativo.setSize(450,450);
		aplicativo.setVisible(true);
		
	}

}
