package usandolabels;

import java.awt.FlowLayout;//gerenciador de layout que especifica como os componentes serão exibidos na janela
import javax.swing.JFrame; //recursos básicos de janela
import javax.swing.JLabel; //para exibição de texto e/ou imagem
import javax.swing.SwingConstants; 
import javax.swing.Icon; //usado para manipular imagens
import javax.swing.ImageIcon; //usado para carregar iamgens
 
public class JanelaLabel extends JFrame{
	//Os atributos da classe JanelaLabel serão justamente os componentes que queremos exibir na tela
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

    //É no construtor que vamos definir as propriedades de cada item que será exibido no frame
    public JanelaLabel(){
    	super("Testando várias fitas");
    	setLayout(new FlowLayout());
    	
    	label1 = new JLabel("Texto sendo exibido");
    	label1.setToolTipText("Dica: essa é a Label1");
    	
    	add(label1);
    	
    	Icon fritas = new ImageIcon(getClass().getResource("fritas.png"));
    	label2 = new JLabel("Texto sendo exibido com um ícone", fritas, SwingConstants.LEFT);
    	add(label2);
        
    	label3 = new JLabel("Sei la lek, as coisa é tudo brisa memo"); 
    	
    	add(label3); 	
    }
    //Na main vamos instanciar a janela e exibir na tela    
    public static void main(String[] args) {
    	
    	JanelaLabel janelinha = new JanelaLabel();
    	janelinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	janelinha.setSize(260,180);
    	janelinha.setVisible(true);
   	}
}