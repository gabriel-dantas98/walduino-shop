import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Classe que estende JFrame e implementa a classe abstrata ActionsListener
public class ViewFornecedor extends JFrame implements ActionListener{
	
//Declarando  Labels 	
	private JLabel labelId;
	private JLabel labelNome;
	private JLabel labelEndereco;
	private JLabel labelNum;
	private JLabel labelComplemento;
	private JLabel labelCEP;
	private JLabel labelCPF;
	
//Declarando TextField = Input de texto
	private JTextField textId;
	private JTextField textNome;
	private JTextField textEndereco;
	private JTextField textNum;
	private JTextField textComplemento;
	private JTextField textCEP;
	private JTextField textCPF;

//Declarando botoes
	private JButton buttonOK;
	private JButton buttonAlterar;
	private JButton buttonExcluir;
	private JButton buttonLocalizar;
	
//Criando nossos queridinhos paineis 
//que eu vo chamar de grid pq sim
	
	private JPanel gridButtons;
	private JPanel gridForm;

//Criando construtor	
public ViewFornecedor() {
	//Esse super seta o nome da telinha, tipo o titulo
	super("Fornecedores");
	//seta de que tipo será o nosso layout principal no caso um border
	//Com norte, sul e centro e taus...
	setLayout(new BorderLayout());
	
//Criando um painel apenas para os labels e dos do form
	gridForm = new JPanel();
	gridForm.setLayout(new GridLayout(7,2));
	
//Agora vamos criar os componentes 
// e adicionar ao nosso Gridform
	
	labelId = new JLabel("ID: ");
	gridForm.add(labelId);
	textId = new JTextField(10);
	gridForm.add(textId);
	
	labelNome = new JLabel("NOME: ");
	gridForm.add(labelNome);
	textNome = new JTextField(10);
	gridForm.add(textNome);
	
	labelEndereco = new JLabel("ENDEREÇO: ");
	gridForm.add(labelEndereco);
	textEndereco = new JTextField(10);
	gridForm.add(textEndereco);
	
	labelNum = new JLabel("N°: ");
	gridForm.add(labelNum);
	textNum = new JTextField(10);
	gridForm.add(textNum);
	
	labelComplemento = new JLabel("Complemento: ");
	gridForm.add(labelComplemento);
	textComplemento = new JTextField(10);
	gridForm.add(textComplemento);
	
	labelCEP= new JLabel("CEP: ");
	gridForm.add(labelCEP);
	textCEP= new JTextField(10);
	gridForm.add(textCEP);
	
	labelCPF= new JLabel("CPF: ");
	gridForm.add(labelCPF);
	textCPF= new JTextField(10);
	gridForm.add(textCPF);
	
//Criando um paniel novo e adicionando os botoes
	
	gridButtons = new JPanel();
	gridButtons.setLayout(new FlowLayout());
	
	//Instancia  um novo butaozin
	buttonOK = new JButton("Cadastrar");
	//Adiciona ele ao gridButtons
	gridButtons.add(buttonOK);
	//Adiciona um ActionListener ao buttonOK
	buttonOK.addActionListener(this);
	
	buttonAlterar = new JButton("Alterar");
	gridButtons.add(buttonAlterar);
	
	buttonLocalizar = new JButton("Localizar");
	gridButtons.add(buttonLocalizar);
	
	buttonExcluir = new JButton("Excluir");
	gridButtons.add(buttonExcluir);
	
//Incluindo os paineis dentro da janela principal
//Dando aquele tapinha no css
	
	add(gridForm, BorderLayout.CENTER);
	add(gridButtons, BorderLayout.SOUTH);
	

	
	
}
	
public static void main(String[] args) {
		ViewFornecedor myWindow  = new ViewFornecedor();
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(535,270);
		myWindow.setVisible(true);
	}
	


public void actionPerformed(ActionEvent evento) {
	// Onde a magica acontece
	
		if(evento.getSource() == buttonOK) {
				
				if (textId.getText().isEmpty()){
				    JOptionPane.showMessageDialog(null, "Existe algo errado com o campo " + "ID");
				}  
				if (textNome.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Existe algo errado com o campo " + "Nome");
				}
				if (textEndereco.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Existe algo errado com o campo " + "Endereco");
				}
				if (textNum.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Existe algo errado com o campo " + "Numero");
				}
				if (textComplemento.getText().isEmpty())  {
				    JOptionPane.showMessageDialog(null, "Existe algo errado com o campo " + "Complemento");
				}
				if (textCEP.getText().isEmpty())  {
				    JOptionPane.showMessageDialog(null, "Existe algo errado com o campo " + "CEP");
				}
				if (textCPF.getText().isEmpty()){
				    JOptionPane.showMessageDialog(null, "Existe algo errado com o campo " + "CPF");
				}else {
					JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
				}
		
			}
		}

}
