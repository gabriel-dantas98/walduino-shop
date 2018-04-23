import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ViewCliente extends JFrame implements ActionListener {

private JLabel lblId;
private JLabel lblNome;
private JLabel lblLogradouro;
private JLabel lblNumero;
private JLabel lblComplemento;
private JLabel lblCep;
private JLabel lblef;
private JTextField txtId;
private JTextField txtNome;
private JTextField txtLogradouro;
private JTextField txtNumero;
private JTextField txtComplemento;
private JTextField txtCep;
private JTextField txtCpf;
private JButton btnOk;
private JButton btnAlterar;
private JButton btnExcluir;
private JButton btnLocalizar;

private JPanel painelBotoes;
private JPanel painelForm;

public ViewCliente() {
	super("Clientes");
	setLayout(new BorderLayout());
	
//Vou criar um painel apenas para as labels e os campos do form
//e os campos do formulário
	
	painelForm = new JPanel();
	painelForm.setLayout(new GridLayout(7,2));
	
	lblId = new JLabel("Id:");
	painelForm.add(lblId);
	
	txtId = new JTextField(10);
	painelForm.add(txtId);
	
	lblNome = new JLabel("Nome:");
	painelForm.add(lblNome);
	
	txtNome = new JTextField(10);
	painelForm.add(txtNome);
	
	lblLogradouro = new JLabel("Rua:");
	painelForm.add(lblLogradouro);
	
	txtLogradouro = new JTextField(10);
	painelForm.add(txtLogradouro);
	
	lblNumero = new JLabel("Nº:");
	painelForm.add(lblNumero);
	
	txtNumero = new JTextField(10);
	painelForm.add(txtNumero);
	
	lblComplemento = new JLabel("Complemento:");
	painelForm.add(lblComplemento);
	
	txtComplemento = new JTextField(10);
	painelForm.add(txtComplemento);
	
	lblCep = new JLabel("CEP:");
	painelForm.add(lblCep);
	
	txtCep = new JTextField(10);
	painelForm.add(txtCep);
	
	lblef = new JLabel("CPF:");
	painelForm.add(lblef);
	
	txtCpf=new JTextField(10);
	painelForm.add(txtCpf);
	
	//Aqui vou criar um painel e colocar os botoes nele
	painelBotoes = new JPanel();
	painelBotoes.setLayout(new FlowLayout());
	
	btnOk = new JButton("Cadastrar");
	painelBotoes.add(btnOk);
	btnOk.addActionListener(this);
	
	btnAlterar = new JButton("Alterar");
	painelBotoes.add(btnAlterar);

	btnLocalizar = new JButton("Localizar");
	painelBotoes.add(btnLocalizar);
	
	btnExcluir = new JButton("Remover");
	painelBotoes.add(btnExcluir);

	//Agora vou incluir os dois paineis dentro da janela
	add(painelForm, BorderLayout.CENTER);
	add(painelBotoes, BorderLayout.SOUTH);
	
	
	
}


public void actionPerformed(ActionEvent event) {
	if(event.getSource() == btnOk) {
		
		if (txtId.getText().isEmpty()){
		    JOptionPane.showMessageDialog(null, "Vc esqueceu o campo " + "ID" + " em branco");
		}  
		if (txtNome.getText().isEmpty()) {
		    JOptionPane.showMessageDialog(null, "Vc esqueceu o campo " + "Nome" + " em branco");
		}
		if (txtLogradouro.getText().isEmpty()) {
		    JOptionPane.showMessageDialog(null, "Vc esqueceu o campo " + "Endereco" + " em branco");
		}
		if (txtNumero.getText().isEmpty()) {
		    JOptionPane.showMessageDialog(null, "Vc esqueceu o campo " + "Numero" + " em branco");
		}
		if (txtComplemento.getText().isEmpty())  {
		    JOptionPane.showMessageDialog(null, "Vc esqueceu o campo " + "Complemento" + " em branco");
		}
		if (txtCep.getText().isEmpty())  {
		    JOptionPane.showMessageDialog(null, "Vc esqueceu o campo " + "CEP" + " em branco");
		}
		if (txtCpf.getText().isEmpty()){
		    JOptionPane.showMessageDialog(null, "Vc esqueceu o campo " + "CPF" + " em branco");
		}else {
			JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
		}

	}
}

public static void main(String[] args) {
	ViewCliente janelinha = new ViewCliente();
	janelinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janelinha.setSize(400,250);
	janelinha.setVisible(true);
			
}

}

