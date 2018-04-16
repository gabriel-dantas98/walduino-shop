import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class SucoDeFruta extends JFrame {
	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	
	private JPanel painelBotoes;
	
	
	
	
	public SucoDeFruta () {
		super("Mais de um gerenciador");
		
		painelBotoes = new JPanel();
		painelBotoes.setLayout(new FlowLayout());
		
		btn1 = new JButton("AaA");
		painelBotoes.add(btn1);
		btn2 = new JButton("B");
		painelBotoes.add(btn2);
		btn3 = new JButton("C");
		painelBotoes.add(btn3);
		btn4 = new JButton("D");
		painelBotoes.add(btn4);
		
		setLayout(new BorderLayout());
		add(painelBotoes, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
	
		SucoDeFruta janela = new SucoDeFruta();
		
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setSize(400,400);
		janela.setVisible(true);
		
		
	}

}
