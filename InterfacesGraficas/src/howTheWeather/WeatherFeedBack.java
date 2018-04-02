package howTheWeather;

import java.awt.FlowLayout;//gerenciador de layout que especifica como os componentes serão exibidos na janela
import javax.swing.JFrame; //recursos básicos de janela
import javax.swing.JLabel; //para exibição de texto e/ou imagem
import javax.swing.JTextField; //campo de texto
import javax.swing.JPasswordField; //campo de password
import javax.swing.SwingConstants; 

public class WeatherFeedBack extends JFrame{
	 	
		private JLabel lblDigite;
		private JLabel lblTempos;
		private JTextField txtInput;

	     public WeatherFeedBack(){
	    	 super("Testando varias fitas");
	    	 setLayout(new FlowLayout());
	     
	     lblDigite = new JLabel("Informe seu nome de usuario");
	     lblTempos.setToolTipText("Nome de usuario");
	     add(lblDigite);
	     
	     txtInput = new JTextField(10);
	     add(txtInput);
	     
	    }
	     
	    //Na main vamos instanciar a janela e exibir na tela    
	    public static void main(String[] args) {
	    	WeatherFeedBack windowzin = new WeatherFeedBack();
	    	windowzin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	windowzin.setSize(400,180);
	    	windowzin.setVisible(true);

	    }
	

}
