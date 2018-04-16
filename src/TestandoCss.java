import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;


public class TestandoCss extends JFrame{
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	
	
	public TestandoCss() {
		super("Janelona Zika");
	//	setLayout(new BorderLayout(15,15));
		setLayout(new GridLayout(3,2));
		
		btn1 = new JButton("CINA");
		//add(btn1, BorderLayout.NORTH);
		add(btn1);
	
		btn2 = new JButton("BAIXO");
		//add(btn2, BorderLayout.SOUTH);
		add(btn2);
		
		btn3 = new JButton("CENTRO");
		//add(btn3, BorderLayout.CENTER);
		add(btn3);
		
		btn4 = new JButton("OESTE");
		//add(btn4, BorderLayout.WEST);
		add(btn4);
		
		btn5 = new JButton("CIMA");
		//add(btn1, BorderLayout.EAST);
		add(btn5);
	}
	
	
	public static void main(String[] args) {
		
		TestandoCss janela = new TestandoCss();
		
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setSize(400,400);
		janela.setVisible(true);
		
		
	}

}
