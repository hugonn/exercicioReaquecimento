package exercReaquecimento;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField idadeField;
	private janelaPrincipal jp;
	
	public void conectaJanelaPai(janelaPrincipal jp) {
		this.jp = jp;
	}
	/**
	 * Create the frame.
	 */
	public  JanelaCadastro() {
		setTitle("Cadastro Banco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(45, 49, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(45, 101, 46, 14);
		contentPane.add(lblIdade);
		
		nomeField = new JTextField();
		nomeField.setBounds(45, 70, 192, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		idadeField = new JTextField();
		idadeField.setBounds(45, 120, 192, 20);
		contentPane.add(idadeField);
		idadeField.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa pes = new Pessoa(nomeField.getText(),Integer.parseInt(idadeField.getText()));
				
				if(jp != null) {
					jp.retornaPessoa(pes);
				}
				
				nomeField.setText("");
				idadeField.setText("");
				jp.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setBounds(261, 202, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				nomeField.setText("");
				idadeField.setText("");
				jp.setVisible(true);
			}
		});
		btnVoltar.setBounds(20, 202, 89, 23);
		contentPane.add(btnVoltar);
		
	}
	
}
