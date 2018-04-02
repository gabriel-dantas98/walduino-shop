package usandotext;

import java.awt.FlowLayout;//gerenciador de layout que especifica como os componentes serão exibidos na janela
import javax.swing.JFrame; //recursos básicos de janela
import javax.swing.JLabel; //para exibição de texto e/ou imagem
import javax.swing.JTextField; //campo de texto
import javax.swing.JPasswordField; //campo de password
import javax.swing.SwingConstants; 

 
public class JanelaText extends JFrame{
	//Os atributos da classe JanelaLabel serão justamente os componentes que queremos exibir na tela
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JTextField txtUsuario;
	private JPasswordField pwdSenha;

    //É no construtor que vamos definir as propriedades de cada item que será exibido no frame
    public JanelaText(){
     super("Testando varias fitas");
     setLayout(new FlowLayout());
     
     lblUsuario = new JLabel("Informe seu nome de usuario");
     lblUsuario.setToolTipText("Nome de usuario");
     add(lblUsuario);
     
     txtUsuario = new JTextField(10);
     add(txtUsuario);
     
     lblSenha = new JLabel("Informe sua senha");
     lblSenha.setToolTipText("senha");
     add(lblSenha);
     
     pwdSenha = new JPasswordField(10);
     add(pwdSenha);
     
    }
    //Na main vamos instanciar a janela e exibir na tela    
    public static void main(String[] args) {
    	JanelaText janelinha = new JanelaText();
    	janelinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	janelinha.setSize(400,180);
    	janelinha.setVisible(true);

    }
}