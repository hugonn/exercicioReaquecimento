package exercReaquecimento;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janelaPrincipal extends JFrame {

	private JPanel contentPane;
	private Filas gerenciadorF ;
	private janelaPrincipal jp;
	private JanelaCadastro frameCad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaPrincipal frame = new janelaPrincipal();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void retornaPessoa(Pessoa pes) {
		gerenciadorF.adicionaPessoa(pes);
	}
	/**
	 * Create the frame.
	 */
	public janelaPrincipal() {
		setTitle("Banco do Hugo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		JanelaCadastro frameCad = new JanelaCadastro();
		
		jp = this;
		
		JButton btnNewButton = new JButton("Cadastrar Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(frameCad == null) {
					gerenciadorF= new Filas();
					frameCad = new JanelaCadastro();
					frameCad.conectaJanelaPai(jp);
					frameCad.setVisible(true);
					
				}else {
				
				frameCad.conectaJanelaPai(jp);
				frameCad.setVisible(true);
				}
				dispose();

			}
		});
		btnNewButton.setBounds(80, 51, 254, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pr\u00F3ximo Cliente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				gerenciadorF.mostraPessoasFila();
				gerenciadorF.organizaFilas();
				gerenciadorF.mostraCaixas();
				gerenciadorF.limpaFila();
			}
		});
		btnNewButton_1.setBounds(80, 125, 254, 23);
		contentPane.add(btnNewButton_1);
	}
	
}
